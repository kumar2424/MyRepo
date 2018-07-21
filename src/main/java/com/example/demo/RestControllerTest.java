package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
	
	 @Autowired 
	 private PersonRepository personRepository;
	 
	    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
	    public ResponseEntity<String> persistPerson(@RequestBody String array) {
	       /* if (personService.isValid(person)) {
	            personRepository.persist(person);
	            return ResponseEntity.status(HttpStatus.CREATED).build();
	        }*/
	    	String arrays=array;
	    	System.out.println("Inside Controller and arrays value is "+arrays);
	        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	    }
	    @RequestMapping(value = "/persistPerson/getrequest", method = RequestMethod.GET)
	    public ResponseEntity<String> persistPerson2(@RequestBody String array) {
	       /* if (personService.isValid(person)) {
	            personRepository.persist(person);
	            return ResponseEntity.status(HttpStatus.CREATED).build();
	        }*/
	    	String arrays=array;
	    	System.out.println("Inside Controller GET request and arrays value is "+arrays);
	        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build().ok(arrays);
	    }
}
