package pe.edu.upeu.ejemplogithub.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String mnesaje() {
		return "Hola";
	}
}
