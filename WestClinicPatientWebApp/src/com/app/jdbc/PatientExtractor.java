package com.app.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.app.domain.Insurancecp;
import com.app.domain.Patient;
//import com.temp.domain.Student;


public class PatientExtractor implements ResultSetExtractor<Patient>{
	
	public Patient extractData(ResultSet resultSet) throws SQLException, DataAccessException {
		
     Patient patient = new Patient();  
	    
	  patient.setUserId(resultSet.getInt(1));  
	  patient.setFirstName(resultSet.getString(2));  
	  patient.setLastName(resultSet.getString(3));  
	  patient.setGender(resultSet.getString(4));  
	  patient.setCity(resultSet.getString(5));  
	    
	  return patient;
		
	}
	
	
}
