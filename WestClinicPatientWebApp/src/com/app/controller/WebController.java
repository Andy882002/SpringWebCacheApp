package com.app.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.portlet.ModelAndView;

import com.app.domain.Patient;
import com.app.services.PatientService;



@Controller
@RequestMapping("/")
public class WebController {

private Logger logger = LoggerFactory.getLogger(WebController.class);
	
	@Autowired  
	PatientService patientService; 
	Patient patient;
	@RequestMapping(value="/view", method = RequestMethod.GET,headers="Accept=application/json")
	 public @ResponseBody List<Patient> getEmployees(Locale locale){
	 logger.info("Checking Student in student table using Spring Jdbc Template {}.", locale);
       List<Patient> slist=new ArrayList<Patient>();
       slist=patientService.getPatientList();
       return slist;
	}
	
	@RequestMapping(value="/myupdate/{pid}/{fname}", method =RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody Patient updatePatient(Locale locale, @PathVariable("pid") int pid, @PathVariable("fname") String fname) {
		 logger.info("Checking Student in student table using Spring Jdbc Template {}.", locale);
		 //patientService.updateData();
		 patientService.editFname(pid, fname);
		 Patient patient =patientService.gePatient(pid);
		 return patient;
		
		
	}
	
	@RequestMapping(value = "/newpatient", method = RequestMethod.GET) 
	public ModelAndView MyPtient() { 
	return new ModelAndView("patient", "command", new Patient()); 
	} 
 
	
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public @ResponseBody Patient insertPatient(@ModelAttribute Patient patient) throws ParseException {
		if (patient !=null)
		patientService.insertData(patient);
		int pid=patient.getUserId();
		Patient apsn= patientService.gePatient(pid);
		return apsn;
	}
	
	@RequestMapping(value="/createOne/{uid}/{fname}/{lname}/{gender}/{city}", method = RequestMethod.GET)
	public @ResponseBody Patient createPatient(@PathVariable("uid") int uid, @PathVariable("fname") String fname, @PathVariable("lname")  String lname,
			@PathVariable("gender") String gender, @PathVariable("city") String city) throws ParseException {
		if (uid >=0 && fname !=null && lname !=null && gender !=null && city !=null)
			patient =new Patient(uid, fname, lname, gender, city);
			patientService.insertData(patient);
		
		
		return patient;
	}
	
	@RequestMapping(value="/deleteone/{uid}", method=RequestMethod.GET)
	public @ResponseBody Patient deleteOne(@PathVariable("uid") int uid) throws ParseException {
	   
		if (uid >=0 )
		patient =patientService.gePatient(uid);
		patientService.deleteData(uid);
		
		return patient;
		
		
	}
}
