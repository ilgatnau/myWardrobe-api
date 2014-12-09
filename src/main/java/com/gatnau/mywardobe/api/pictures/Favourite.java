package com.gatnau.mywardobe.api.pictures;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.gatnau.mywardobe.api.brands.Brand;

@Entity
public class Favourite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String uri;
	
	@ManyToMany
	private List<Brand> brands;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
