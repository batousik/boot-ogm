package com.example.bootogm;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Transactional
@Service
public class PersonDao {
	@PersistenceContext EntityManager em;

	public void createPerson(String name){
		System.out.println("test");
		em.persist( new Person(name) );
	}
}
