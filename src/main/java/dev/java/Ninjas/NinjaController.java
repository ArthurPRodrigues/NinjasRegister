package dev.java.Ninjas;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

	@GetMapping("/Welcome")
	public String home() {
		return "Hello, World!";
	}

	@GetMapping("/Ninjas")
	public String ninjas() {
		return "These are the Ninjas!";
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
