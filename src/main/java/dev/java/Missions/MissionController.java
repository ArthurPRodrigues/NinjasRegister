package dev.java.Missions;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissionController {

	@GetMapping("/Welcome")
	public String home() {
		return "Hello, World!";
	}

	@GetMapping("/Missions")
	public String ninjas() {
		return "These are the Missions!";
	}
	@GetMapping("/Missions/id")
	public String ninjasById() {
		return "This is the Missions by ID!";
	}

	@PutMapping("/Missions/update")
	public String updateNinja() {
		return "This is the Update Missions!";
	}

	@PostMapping("/Missions/new")
	public String newNinja() {
		return "This is the New Missions!";
	}

	@DeleteMapping("/Missions/delete")
	public String deleteNinja() {
		return "This is the Delete Missions!";
	}
}
