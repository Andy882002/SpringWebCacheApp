package com.app.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.app.domain.Insurancecp;

public class InsuranceExtractor implements ResultSetExtractor<Insurancecp>{

public Insurancecp extractData(ResultSet resultSet) throws SQLException, DataAccessException {
		
		Insurancecp insurance =new Insurancecp();
		
		 insurance.setSid(resultSet.getInt(1));  
	  insurance.setName(resultSet.getString(2));  
	  insurance.setGrup(resultSet.getString(3));  
	  insurance.setMid(resultSet.getString(4));  
	  insurance.setExp(resultSet.getString(5));  
	    
	  return insurance;
		 
	}


}
