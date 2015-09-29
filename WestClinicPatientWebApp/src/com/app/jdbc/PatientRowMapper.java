package com.app.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.domain.Patient;


public class PatientRowMapper implements RowMapper<Patient>{

	@Override  
	 public Patient mapRow(ResultSet resultSet, int line) throws SQLException {  
	  PatientExtractor userExtractor = new PatientExtractor();  
	  return userExtractor.extractData(resultSet);  
	 } 
}
