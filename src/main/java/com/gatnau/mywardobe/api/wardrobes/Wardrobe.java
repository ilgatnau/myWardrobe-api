package com.gatnau.mywardobe.api.wardrobes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wardrobe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
