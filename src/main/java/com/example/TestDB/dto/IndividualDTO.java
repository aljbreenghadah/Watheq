package com.example.TestDB.dto;

import java.util.Date;

//import javax.persistence.Column;

public class IndividualDTO extends  W_UserDTO {
	 
	  private String NationalID;
	  private String firstname;
	  private String MName;
	  private String lastname;
	  private Boolean Gender;
	  private String Status;
	  private String Skills;
	  private Date DOB;
	  private String MAJOR;
	  private String Attachments;
	  private String JOP;
	  
	  
	  
	public IndividualDTO() {
		super();
		
		
	}
	
	


	public IndividualDTO(String Email, String PhoneNumber, String Address, String Password, String NationalID,
			String Firstname, String MName, String lastname, Boolean Gender, String Status, String Skills,
			Date DOB, String MAJOR, String Attachments, String JOP) {
		super(Email, PhoneNumber, Address, Password);
		this.NationalID = NationalID;
		this.firstname = Firstname;
		this.MName = MName;
		this.lastname = lastname;
		this.Gender = Gender;
		this.Status = Status;
		this.Skills = Skills;
		this.DOB =DOB;
		this.MAJOR = MAJOR;
		this.Attachments = Attachments;
		this.JOP = JOP;
	}




	public String getNationalID() {
		return NationalID;
	}




	public void setNationalID(String nationalID) {
		NationalID = nationalID;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getMName() {
		return MName;
	}




	public void setMName(String mName) {
		MName = mName;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public Boolean getGender() {
		return Gender;
	}




	public void setGender(Boolean gender) {
		Gender = gender;
	}




	public String getStatus() {
		return Status;
	}




	public void setStatus(String status) {
		Status = status;
	}




	public String getSkills() {
		return Skills;
	}




	public void setSkills(String skills) {
		Skills = skills;
	}




	public Date getDOB() {
		return DOB;
	}




	public void setDOB(Date dOB) {
		DOB = dOB;
	}




	public String getMAJOR() {
		return MAJOR;
	}




	public void setMAJOR(String mAJOR) {
		MAJOR = mAJOR;
	}




	public String getAttachments() {
		return Attachments;
	}




	public void setAttachments(String attachments) {
		Attachments = attachments;
	}




	public String getJOP() {
		return JOP;
	}




	public void setJOP(String jOP) {
		JOP = jOP;
	}



}

