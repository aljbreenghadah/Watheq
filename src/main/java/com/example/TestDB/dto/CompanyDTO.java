package com.example.TestDB.dto;

public class CompanyDTO extends W_UserDTO {
	private String cr;
	private String CompanyName;

	public CompanyDTO() {
		super();
	}

	public CompanyDTO(String Email, String PhoneNumber, String Address, String Password, String cr, String CompanyName) {
		super(Email, PhoneNumber, Address, Password);
		this.cr = cr;
		this.CompanyName = CompanyName;
	}

	public String getCr() {
		return cr;
	}

	public void setCr(String cr) {
		this.cr = cr;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

}
