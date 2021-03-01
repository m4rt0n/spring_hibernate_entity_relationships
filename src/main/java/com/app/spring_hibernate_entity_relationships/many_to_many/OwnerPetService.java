package com.app.spring_hibernate_entity_relationships.many_to_many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPetService implements IService {
	@Autowired
	IOwnerRepository ownerRepo;
	@Autowired
	IPetRepository petRepo;

	@Override
	public Pet saveOrUpdatePet(Pet pet) {
		return petRepo.save(pet);
	}

	@Override
	public Owner saveOrUpdateOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	@Override
	public String hello() {
		return "Hello!";
	}
}
