package com.app.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.domain.Insurancecp;
import com.app.domain.Patient;

public class InsuranceRowMapper implements RowMapper<Insurancecp>{

	@Override  
	 public Insurancecp mapRow(ResultSet resultSet, int line) throws SQLException {  
	  InsuranceExtractor insuranceExtractor = new InsuranceExtractor();  
	  return insuranceExtractor.extractData(resultSet);  
	 } 
}
