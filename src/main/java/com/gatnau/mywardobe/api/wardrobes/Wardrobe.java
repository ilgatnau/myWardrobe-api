package com.gatnau.mywardobe.api.wardrobes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.gatnau.mywardobe.api.brands.Brand;

@Entity
public class Wardrobe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String description;
	
	@ManyToMany
	private List<Brand> brands;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
}
