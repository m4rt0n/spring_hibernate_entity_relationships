package com.app.spring_hibernate_entity_relationships.many_to_many;

import java.util.ArrayList;
import java.util.List;

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
		Owner o1 = new Owner("o1");
		Owner o2 = new Owner("o2");
		Pet p1 = new Pet("p1");
		Pet p2 = new Pet("p2");

		List<Pet> pets = new ArrayList<>();
		pets.add(p1);
		pets.add(p2);

		o1.setPets(pets);

		service.saveOrUpdateOwner(o1);
		pets.forEach(p -> service.saveOrUpdatePet(p));
		// service.saveOrUpdatePet(p1);
		// service.saveOrUpdatePet(p2);
	}
}
