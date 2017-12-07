package com.example.bootogm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Autowired PersonRepository personRepository;

	@RequestMapping("/person")
	public String person(@RequestParam(value = "name", defaultValue = "World") String name) {
		personRepository.save( new Person( name ) );
		return "person";
	}
}
