package com.example.bootogm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
