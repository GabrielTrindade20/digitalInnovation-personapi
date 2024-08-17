package one.digitalInnovation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/v1/people")
@RestController
public class PersonController {

	@GetMapping
	public String getdBook() {
		return "API Test";
	}
	
}
