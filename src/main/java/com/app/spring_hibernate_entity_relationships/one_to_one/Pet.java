package com.app.spring_hibernate_entity_relationships.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pet")
public class Pet {

	@Id

	@Column(name = "owner_id")
	private long id;

	private String name;

	@OneToOne
	@MapsId
	@JoinColumn(name = "owner_id")
	private Owner owner;

	public Pet() {
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
		this.id = owner.getId();
	}

}
