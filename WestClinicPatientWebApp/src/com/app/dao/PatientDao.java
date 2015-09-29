package com.app.dao;

import java.util.List;
import com.app.domain.*;

public interface PatientDao {

	 public void insertData(Patient patient);  
	 public List<Patient> getPatientList();  
	 public void updateData(Patient patient);  
	 public void deleteData(int id);  
	 public Patient getPatient(int id);  
     public void editFname(int id, String fname);
}
