package com.jforce.voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.voting.dao.AdminRepo;
import com.jforce.voting.exception.ResourceNotFoundException;
import com.jforce.voting.model.Admin;


@Service
public class AdminService {
	
	
	@Autowired
	private AdminRepo adminRepo;
	
	public Admin getAdmin(Admin admin)
	{
		Admin adminn =adminRepo.findById(admin.getEmail()).orElseThrow(()-> new ResourceNotFoundException("Invalid Admin"));
		
		return admin;
	}

}
