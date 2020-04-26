package com.example.TestDB.dto;

public class EducationDTO extends W_UserDTO {
	private String Edu_iD;
	private String EDU_NAME;

	public EducationDTO() {
		super();
	}

	public EducationDTO(String Email, String PhoneNumber, String Address, String Password, String Edu_iD, String EDU_NAME) {
		super(Email, PhoneNumber, Address, Password);
		this.Edu_iD = Edu_iD;
		this.EDU_NAME = EDU_NAME;
	}

	public String getEdu_iD() {
		return Edu_iD;
	}

	public void setEdu_iD(String edu_iD) {
		Edu_iD = edu_iD;
	}

	public String getEDU_NAME() {
		return EDU_NAME;
	}

	public void setEDU_NAME(String eDU_NAME) {
		EDU_NAME = eDU_NAME;
	}

}
