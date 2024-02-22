package com.example.SpringjapPerson.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringjapPerson.Model.Person;
import com.example.SpringjapPerson.Repo.Repo;
import com.example.SpringjapPerson.Service.Services;
@Service
public class Serviceimpl implements Services{
	Repo rp;
	public Serviceimpl(Repo rp) {
		super();
		this.rp = rp;
	}
	//create person
	public Person createPerson(Person person) {
		return rp.save(person);
	}
	//-----save all Person
	public List<Person> createPersons(List<Person>person) {
		return rp.saveAll(person);
	}
	//-----get all Person
	public List<Person> getPersons() {
		return rp.findAll();
	}		
	//-----update Person
	public Person updatePerson(Person person, int id) {
		Person updatedPerson=  rp.findById(id).get();
		if(updatedPerson != null) {
//			updatedPerson.setName(person.getName());
//			updatedPerson.setAge(person.getAge());
			updatedPerson.setName(person.getName());
			updatedPerson.setAge(person.getAge());
			return rp.save(updatedPerson);
		}
		else return updatedPerson;
	}
	//-----Delete Person
	public String deletePerson(int id) {
		rp.deleteById(id);
		return 	"Student Record Deleted !! (id: "+id+")";
	}



	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return rp.findById(id).get();
	}

}
