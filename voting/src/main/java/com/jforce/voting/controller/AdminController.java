package com.jforce.voting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.voting.model.Admin;
import com.jforce.voting.service.AdminService;
import com.jforce.voting.utility.Candidate;

@CrossOrigin(origins="*")  
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/")
	public  ResponseEntity <Admin> getAdmin( @RequestBody Admin admin)
	{
		System.out.println(admin);
		Admin add =adminService.getAdmin(admin);
		
		 return new ResponseEntity<>(add, HttpStatus.OK);
		
	}

}
