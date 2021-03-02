package com.app.spring_hibernate_entity_relationships.one_to_one;

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

	@PostMapping("/add")
	public void doStuff() {
		Owner o = new Owner("o1");
		Pet p = new Pet("p");
		p.setOwner(o);
		service.saveOrUpdateOwner(o);
		service.saveOrUpdatePet(p);
	}
}
