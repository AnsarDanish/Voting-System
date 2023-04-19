package com.jforce.voting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.voting.model.Registeration;
import com.jforce.voting.service.CountingService;
import com.jforce.voting.utility.Candidate;

@CrossOrigin(origins="*")  
@RestController
@RequestMapping("/count")
public class CountingController {
	
	
	@Autowired
	private CountingService countingService;
	
	
	@PostMapping("/")
	public  ResponseEntity <Candidate> Count()
	{
		Candidate cd =countingService.Count();
		
		 return new ResponseEntity<>(cd, HttpStatus.OK);
		
	}
	

}
