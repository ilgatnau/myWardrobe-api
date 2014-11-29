package com.gatnau.mywardobe.api.wardrobes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/users/{idUser}/wardrobes")
public class Wardrobe {
	
	private static List<Wardrobe> wardrobes = new ArrayList<Wardrobe>();

	@RequestMapping(method= RequestMethod.GET)
	public List<Wardrobe> wardrobes() {
		return wardrobes;
	}
}
