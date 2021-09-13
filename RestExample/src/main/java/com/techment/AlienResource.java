package com.techment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@GetMapping("/aliens")
	public List<Alien> getAlien()
	{
		List<Alien> aliens = new ArrayList<>();
		Alien a1 = new Alien();
		a1.setId(1);
		a1.setName("nishita");
		a1.setPoints(80);
		
		Alien a2 = new Alien();
		a2.setId(2);
		a2.setName("sam");
		a2.setPoints(70);
		
		aliens.add(a1);
		aliens.add(a2);
		
		return aliens;
	}

}
