package com.gatnau.mywardobe.api.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gatnau.mywardobe.api.wardrobes.Wardrobe;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private boolean publicUser;
	private String firstName;
	private String lastName;
	private String token;
	private List<Wardrobe> wardrobes;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Wardrobe> getWardrobes() {
		return wardrobes;
	}

	public void setWardrobes(List<Wardrobe> wardrobes) {
		this.wardrobes = wardrobes;
	}
	
	public boolean isPublicUser() {
		return publicUser;
	}

	public void setPublicUser(boolean publicUser) {
		this.publicUser = publicUser;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
