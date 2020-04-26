package com.example.TestDB.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import javax.validation.constraints.Email;

/*@Entity
@Table(name = "W_user")*/

@MappedSuperclass
public class W_User implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Column(name = "Email", nullable = false, unique = true)
	@NotNull(message = "Email cannot be Empty ")
	@Email(message = "email should be a valid email")
	private String Email;

	@Column(name = "PhoneNumber", nullable = false, unique = true)
	@NotNull(message = "PhoneNumber cannot be Empty ")
	@Pattern(regexp = "(\\+966|0)[0-9]{9}")
	private String PhoneNumber;

	@Column(name = "Address")
	@NotNull(message = " the address cannot be Empty ")
	private String Address;

	@Column(name = "Password", nullable = false)
	@NotNull(message = " Password cannot be Empty ")
	private String Password;

	public W_User(String Email, String PhoneNumber, String Address, String Password) {
		super();
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
		this.Password = Password;
	}

	public W_User() {
		super();
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
	}// end toString()

	@Override
	public String toString() {
		return "W_User [Email=" + Email + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + ", Password="
				+ Password + ", toString()=" + super.toString() + "]";
	}

}
