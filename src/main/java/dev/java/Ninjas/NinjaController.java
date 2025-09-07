package dev.java.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

	@GetMapping("/Welcome")
	public String home() {
		return "Hello, World!";
	}
}
