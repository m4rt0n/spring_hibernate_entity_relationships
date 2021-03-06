package com.app.spring_hibernate_entity_relationships.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPetService implements IService {
	@Autowired
	IOwnerRepository ownerRepo;
	@Autowired
	IPetRepository petRepo;

	@Override
	public String hello() {
		return "Hello!";
	}

	@Override
	public void doStuff() {
		Owner o1 = new Owner("o1");
		Pet p1 = new Pet("p1");
		Pet p2 = new Pet("p2");

		List<Pet> pets = new ArrayList<>();
		pets.add(p1);
		pets.add(p2);

		o1.setPets(pets);

		ownerRepo.save(o1);
		pets.forEach(p -> p.setOwner(o1));
		pets.forEach(p -> petRepo.save(p));

	}
}
