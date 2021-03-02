package com.app.spring_hibernate_entity_relationships.many_to_many;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends CrudRepository<Pet, Long> {

}
