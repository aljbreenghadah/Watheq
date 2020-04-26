package com.example.TestDB.dto;

public class W_UserDTO {
	   private String Email;
	   private String PhoneNumber;
	   private String Address;
	   private String Password;

	
	
	
	public W_UserDTO() {
		super();
	}
	
	




	public W_UserDTO(String Email, String PhoneNumber, String Address, String Password) {
		super();
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
		this.Password = Password;
	}






	public String getEmail() {
		return Email;
	}






	public void setEmail(String email) {
		Email = email;
	}






	public String getPhoneNumber() {
		return PhoneNumber;
	}






	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}






	public String getAddress() {
		return Address;
	}






	public void setAddress(String address) {
		Address = address;
	}






	public String getPassword() {
		return Password;
	}






	public void setPassword(String password) {
		Password = password;
	}





}
