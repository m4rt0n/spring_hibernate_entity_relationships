package com.app.spring_hibernate_entity_relationships.one_to_one;

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
		Owner o = new Owner("o1");
		Pet p = new Pet("p");
		p.setOwner(o);
		ownerRepo.save(o);
		petRepo.save(p);
	}
}
