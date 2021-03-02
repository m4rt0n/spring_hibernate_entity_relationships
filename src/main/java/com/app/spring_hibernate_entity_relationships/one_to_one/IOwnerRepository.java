package com.app.spring_hibernate_entity_relationships.one_to_one;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepository extends CrudRepository<Owner, Long> {

}
