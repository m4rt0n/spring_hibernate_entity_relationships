package com.app.spring_hibernate_entity_relationships.many_to_many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/x")
public class Controller {
	@Autowired
	IService service;

	@GetMapping("/hello")
	public @ResponseBody String hello() {
		return service.hello();
	}

	@PostMapping("/dostuff")
	public void doStuff() {
		service.doStuff();
	}
}
