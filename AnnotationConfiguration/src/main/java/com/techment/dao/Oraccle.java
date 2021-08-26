package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oraccle implements IDao {

	@Override
	public void dataBaseName() {

		System.out.println("connecting to oracle database");
	}

}
