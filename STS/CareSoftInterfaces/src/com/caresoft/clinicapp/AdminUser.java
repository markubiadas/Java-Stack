package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin  {
	
	// Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
	
	
    
    // TO DO: Implement a constructor that takes an ID and a role
   public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
	}
   
   
    // TO DO: Implement HIPAACompliantUser!
   // In the AdminUser class, implement the assignPin(int) method.
   public boolean assignPin(int pin) {
	   int pinLength = String.valueOf(pin).length();
	   if (pinLength >= 6) {
//		   this.pin = pin;
		   return true;
	   } 
	   return false;
   }
   
   // In the AdminUser class, implement the accessAuthorized(Integer) method.
   public boolean accessAuthorized(Integer authorizedId) {
	   if(this.id == authorizedId) {
		   return true;
	   } else {
		   this.authIncident();
		   return false;
	   }
   }
   
   // In the AdminUser class, implement the ArrayList reportSecurityIncidents() method.
   public ArrayList<String> reportSecurityIncidents(){
	  return getSecurityIncidents();
   }
   
   
   
   
   
    // TO DO: Implement HIPAACompliantAdmin!
   public void newIncident(String notes) {
       String report = String.format(
           "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
           new Date(), this.id, notes
       );
       securityIncidents.add(report);
   }
   public void authIncident() {
       String report = String.format(
           "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
           new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
       );
       securityIncidents.add(report);
   }



   
   // TO DO: Setters & Getters
	public ArrayList<String> getSecurityIncidents() {
	return securityIncidents;
	}


	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
	this.securityIncidents = securityIncidents;
	}




}
