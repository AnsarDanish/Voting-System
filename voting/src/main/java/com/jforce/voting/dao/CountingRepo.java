package com.jforce.voting.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jforce.voting.model.Registeration;
import com.jforce.voting.utility.Candidate;

@Repository
public class CountingRepo {
	
	@Autowired
	private DataSource mySQLDataSource;
	
	
	public Candidate Count()
	{
		 Candidate cd = new Candidate();
		try(Connection connection = mySQLDataSource.getConnection();
				
					){
				
				
			
				PreparedStatement pstmt = connection.prepareStatement("select count(*) from do_voting where sselect= 'Jill'");
				ResultSet rs	=	pstmt.executeQuery();
				while(rs.next())
				 cd.setC1(rs.getInt(1));
				
				 pstmt = connection.prepareStatement("select count(*) from do_voting where sselect= 'Jess'");
				 rs	=	pstmt.executeQuery();
				 while(rs.next())
				cd.setC2(rs.getInt(1));
				  
				
				 pstmt = connection.prepareStatement("select count(*) from do_voting where sselect= 'John'");
				 rs	=	pstmt.executeQuery();
				 while(rs.next())
				cd.setC3(rs.getInt(1));
				  
				
				 pstmt = connection.prepareStatement("select count(*) from do_voting where sselect= 'Jack'");
				 rs	=	pstmt.executeQuery();
				 while(rs.next())
				 cd.setC4(rs.getInt(1));
				  
				  
//				 while(rs.next())
//			        {
//					 if(i==0)
//						 cd.setC1(rs.getInt(1));
//					 if(i==1)
//						 cd.setC2(rs.getInt(1));
//					 if(i==2)
//						 cd.setC3(rs.getInt(1));
//					 if(i==3)
//						 cd.setC4(rs.getInt(1));
//			        	
//			       }
				 System.out.println(cd);
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
				
				
				
	   return cd;     
		     
			
		
	}
	
	
	

}
