package com.example.TestDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Company")
public class Company extends W_User {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "cr", unique = true, nullable = false)
	@NotNull(message = "cr cannot be Empty ")
	private String cr;

	@Column(name = "CompanyName", unique = true, nullable = false)
	@NotNull(message = "CompanyName cannot be Empty ")
	private String CompanyName;

	public Company() {
		super();
	}

	public Company(String companyName) {
		super();
		this.CompanyName = companyName;
	}

	@Builder
	public Company(String Email, String Phonenumber, String Address, String Password, String cr, String companyName) {
		super(Email, Phonenumber, Address, Password);
		this.cr = cr;
		CompanyName = companyName;
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

	@Override
	public String toString() {
		return "Company [cr=" + cr + ", CompanyName=" + CompanyName + "]";
	}
}
