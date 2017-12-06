package com.example.bootogm;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class PersonDao {
	@PersistenceContext EntityManager em;

	public void createPerson(String name){
		System.out.println("test");
		em.persist( new Person(name) );
	}
}
