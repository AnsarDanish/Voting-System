package com.jforce.voting.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.voting.dao.VotingDao;
import com.jforce.voting.model.DoVoting;

@Service
public class VotingService {
	
	@Autowired
	private VotingDao votingdao;
	
 
	public String createVoting (DoVoting  dv)
	{
	    String result = null;
		try {
			result = votingdao.createVoting(dv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return result;
	}

}
