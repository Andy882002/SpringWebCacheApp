package com.app.services;
import java.util.List;

import com.app.domain.*;

public interface PatientService {

	 public void insertData(Patient patient);  
	 public List<Patient> getPatientList();  
	 public void deleteData(int id);  
	 public Patient gePatient(int id);  
	 public void updateData(Patient patient); 
	 public void editFname(int id, String fname);
	  
}
