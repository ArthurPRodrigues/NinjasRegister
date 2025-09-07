package dev.java.Missions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissionController {

	@GetMapping("/Missions")
	public String home() {
		return "Missions";
	}
}
