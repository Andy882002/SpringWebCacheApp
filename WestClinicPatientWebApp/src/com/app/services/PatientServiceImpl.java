package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.PatientDao;
import com.app.domain.Patient;

public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientDao patientdao;
	
	public void insertData(Patient patient){
		patientdao.insertData(patient);
	};  
	
	@Override
	 public List<Patient> getPatientList() {
		 return patientdao.getPatientList();
	 };  
	 @Override
	 public void deleteData(int id) {
		 patientdao.deleteData(id);
	 };  
	 @Override
	 public Patient gePatient(int id){
		 return patientdao.getPatient(id);
	 };  
	 @Override
	 public void updateData(Patient patient){
		 patientdao.updateData(patient);
	 };  
	 @Override
	 public void editFname(int id, String fname){
		patientdao.editFname(id, fname); 
	 };
}
