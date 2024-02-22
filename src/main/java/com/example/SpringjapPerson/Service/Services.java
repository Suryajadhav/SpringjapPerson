package com.example.SpringjapPerson.Service;

import java.util.List;


import com.example.SpringjapPerson.Model.Person;


public interface Services {
	Person createPerson(Person person);
	List<Person> createPersons(List<Person> person);
	List<Person> getPersons();
	Person getPersonById(int id);
	Person updatePerson(Person person, int id);
	String deletePerson(int id);
}
