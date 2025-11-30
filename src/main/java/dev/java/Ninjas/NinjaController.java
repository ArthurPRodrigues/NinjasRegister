package dev.java.Ninjas;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<NinjaDTO> ninjas() {
		return ninjaService.listNinja();
	}

	@GetMapping("/Ninjas/id")
	public String ninjasById() {
		return "This is the Ninja by ID!";
	}

	@PutMapping("/Ninjas/update")
	public String updateNinja() {
		return "This is the Update Ninja!";
	}

	@PostMapping("/Ninjas/new")
	public String newNinja() {
		return "This is the New Ninja!";
	}

	@DeleteMapping("/Ninjas/delete")
	public String deleteNinja() {
		return "This is the Delete Ninja!";
	}
}
