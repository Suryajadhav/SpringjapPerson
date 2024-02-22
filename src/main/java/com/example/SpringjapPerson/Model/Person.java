package com.example.SpringjapPerson.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Person {
	@Id
	//@Column(name="pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	//@Column(nullable=false)
	String name;
	int age;
}
