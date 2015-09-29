package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.domain.Patient;
import com.app.jdbc.PatientRowMapper;

public class PatientDaoImpl implements PatientDao{
	
	@Autowired  
	 DataSource dataSource;  
	 /*Spring obtains a connection to the database through a DataSource. 
	  * A DataSource is part of the JDBC specification and is a generalized connection factory. 
	  * It allows a container or a framework to hide connection pooling and transaction management issues 
	  * from the application code. The Datasource is defined in configuration Metadata xml file
	  * 
	  */
	 @Autowired
	 JdbcTemplate jdbcTemplate;// = new JdbcTemplate(dataSource); 

	 public void insertData(Patient patient) {
		
			  String sql = "INSERT INTO user "  
			    + "(userId, firstName,lastName, gender, city) VALUES (?, ?, ?, ?,?)";  
			  
			  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
			  
			  jdbcTemplate.update(  
			    sql,  
			    new Object[] {  patient.getUserId(), patient.getFirstName(), patient.getLastName(),  
			      patient.getGender(), patient.getCity() });  
			  
			   
		 
	 };  
	 @Override
	 public List<Patient> getPatientList(){
		 
		 List patientList = new ArrayList();  
		  
		  String sql = "select * from user";  
		  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  patientList = jdbcTemplate.query(sql, new PatientRowMapper());  
		  return patientList;  
		 
	 };  
	 @Override
	 public void updateData(Patient patient){
		 String sql = "UPDATE user set firstName = ?,lastName = ?, gender = ?, city = ? where userId = ?";  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  
		  jdbcTemplate.update(  
		    sql,  
		    new Object[] { patient.getFirstName(), patient.getLastName(),  
		      patient.getGender(), patient.getCity(), patient.getUserId() });  
	 };  
	 
	 public void editFname(int id, String fname){
		String sql="update user set firstName = ? where userId = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
		        sql,
		        fname, id);
	 };
	 
	 
	 @Override
	 public void deleteData(int id){
		 String sql = "delete from user where userId=" + id;  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  jdbcTemplate.update(sql);  
	 };  
	 @Override
	 public Patient getPatient(int id){
		  List<Patient> patientList = new ArrayList<Patient>();  
		  String sql = "select * from user where userId= " + id;  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  patientList = jdbcTemplate.query(sql, new PatientRowMapper());  
		  return patientList.get(0);  
	 };  
	
	
}
