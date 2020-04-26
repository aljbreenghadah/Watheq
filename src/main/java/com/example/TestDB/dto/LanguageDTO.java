package com.example.TestDB.dto;

import java.util.Date;

import com.example.TestDB.model.Individual;

public class LanguageDTO {
	 private long id;
	 private String languge_id;
	 private Individual NationalID; 
	 private String languge_name;
	 private Date languge_date;
	// private long languge_refrence_no;
	 private String languge_attach;
	 
	 
	 
	public LanguageDTO() {
		super();
	}
	public LanguageDTO(long id, String languge_id, Individual NationalID, String languge_name, Date languge_date,
			String languge_attach) {
		super();
		this.id = id;
		this.languge_id = languge_id;
	       this.NationalID = NationalID;
		this.languge_name = languge_name;
		this.languge_date = languge_date;
		this.languge_attach = languge_attach;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLanguge_id() {
		return languge_id;
	}
	public void setLanguge_id(String languge_id) {
		this.languge_id = languge_id;
	}
	public Individual getNationalID() {
		return NationalID;
	}
	public void setNationalID(Individual nationalID) {
		NationalID = nationalID;
	}
	public String getLanguge_name() {
		return languge_name;
	}
	public void setLanguge_name(String languge_name) {
		this.languge_name = languge_name;
	}
	public Date getLanguge_date() {
		return languge_date;
	}
	public void setLanguge_date(Date languge_date) {
		this.languge_date = languge_date;
	}
	//public long getLanguge_refrence_no() {
	//	return languge_refrence_no;
	//}
	//public void setLanguge_refrence_no(long languge_refrence_no) {
	//	this.languge_refrence_no = languge_refrence_no;
	//}
	public String getLanguge_attach() {
		return languge_attach;
	}
	public void setLanguge_attach(String languge_attach) {
		this.languge_attach = languge_attach;
	}
	 
	 
}
