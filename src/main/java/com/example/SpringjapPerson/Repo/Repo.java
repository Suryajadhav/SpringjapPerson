package com.example.SpringjapPerson.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringjapPerson.Model.Person;

public interface Repo extends JpaRepository<Person, Integer>{
	
}
