package com.app.dao;

import java.util.List;

import com.app.domain.*;

public interface InsuranceDao {

	public void insertData(Insurancecp insurance);  
	 public List<Insurancecp> getPatientList();  
	 public void updateData(Insurancecp insurance);  
	 public void deleteData(String id);  
	 public Insurancecp getUser(String id);  
}
