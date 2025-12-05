package dev.java.ninjas;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

	private final NinjaService ninjaService;

	public NinjaController(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}

	@GetMapping("/Welcome/Ninjas")
	public String home() {
		return "Hello, World!";
	}

	@GetMapping("/Ninjas")
	public ResponseEntity<List<NinjaDTO>> listarTodosNinjas() {
		List<NinjaDTO> allNinjas = this.ninjaService.listNinja();
		return ResponseEntity.ok(allNinjas);
	}

	@GetMapping("/Ninjas/id")
	public ResponseEntity<String> ninjasById() {
		return ResponseEntity.ok("This is the Ninja!");
	}

	@PutMapping("/Ninjas/update")
	public ResponseEntity<String> updateNinja() {
		return ResponseEntity.ok("This is the Update Ninja!");
	}

	@PostMapping("/Ninjas/new")
	public ResponseEntity<String> createNinja() {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body("Ninja created successfully.");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteNinja(@PathVariable Long id) {
		if (ninjaService.listNinjaPerId(id) != null) {
			ninjaService.deleteNinja(id);
			return ResponseEntity.ok( "Ninja with ID: " + id + " deleted successfully.");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("Ninja with ID: " + id + " not found.");
		}
	}
}
