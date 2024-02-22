package com.example.SpringjapPerson.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringjapPerson.Model.Person;
import com.example.SpringjapPerson.Service.Services;

@RestController
public class PersonController {
	Services ser;

	public PersonController(Services ser) {
		super();
		this.ser = ser;
	}
	@PostMapping("person/created")    //--- localhost:8080/person/created
	public ResponseEntity<Person> createPerson(@RequestBody Person pd){
			return new ResponseEntity<>(ser.createPerson(pd),HttpStatus.CREATED);
	}
	
	
	//============= GET MAPPING =============
	@GetMapping("/person/getall")			//--- localhost:8080/person/getall
	public List<Person> getPersons(){
			return ser.getPersons();
	}
	@GetMapping("/person/get/{id}")		//--- localhost:8080/person/get/1
	public Person getPersonById(@PathVariable int id){
			return ser.getPersonById(id);
	}
	
	
	
	
	
	//============= PUT MAPPING =============
	@PutMapping("/person/update/{id}")			//--- localhost:8080/person/update/5
	public Person updatePerson(@RequestBody Person person,@PathVariable int id) {
		return ser.updatePerson(person,id);
	}
	
	
	
	//============= DELETE MAPPING =============
	@DeleteMapping("/person/delete/{id}")	//--- localhost:8080/person/delete/2
	public String deletePerson(@PathVariable int id) {
		return ser.deletePerson(id);
	}

}

