package com.app.spring_hibernate_entity_relationships.one_to_many;

public interface IService {

	public Pet saveOrUpdatePet(Pet pet);

	public Owner saveOrUpdateOwner(Owner owner);

	public String hello();
}
