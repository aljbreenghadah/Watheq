package com.example.TestDB.dto;

import java.util.Date;

import com.example.TestDB.model.Company;
import com.example.TestDB.model.Education;
import com.example.TestDB.model.Individual;

public class ExperienceDTO {
	        private String Exp_id;
	        private Individual NationalID;
	        private Education Eduid; 
		    private Company cr ;
		    private String e_position;
		    private String name_company;
		    private Date s_date;
		    private Date e_date;
		    private String add_by;
		    private String ref_name;
		    private String ref_email;
		    
		    
		    
			public ExperienceDTO() {
				super();
			
			}
			public ExperienceDTO(String Exp_id, Individual NationalID, Education Eduid, Company cr, String e_position,
					String name_company, Date s_date, Date e_date, String add_by, String ref_name,
					String ref_email) {
				super();
				this.Exp_id = Exp_id;
				this.NationalID = NationalID;
				this.Eduid = Eduid;
				this.cr = cr;
				this.e_position = e_position;
				this.name_company = name_company;
				this.s_date = s_date;
				this.e_date = e_date;
				this.add_by = add_by;
				this.ref_name = ref_name;
				this.ref_email = ref_email;
			}
			public String getExp_id() {
				return Exp_id;
			}
			public void setExp_id(String exp_id) {
				Exp_id = exp_id;
			}
			public Individual getNationalID() {
				return NationalID;
			}
			public void setNationalID(Individual nationalID) {
				NationalID = nationalID;
			}
			public Education getEduid() {
				return Eduid;
			}
			public void setEduid(Education eduid) {
				Eduid = eduid;
			}
			public Company getCr() {
				return cr;
			}
			public void setCr(Company cr) {
				this.cr = cr;
			}
			public String getE_position() {
				return e_position;
			}
			public void setE_position(String e_position) {
				this.e_position = e_position;
			}
			public String getName_company() {
				return name_company;
			}
			public void setName_company(String name_company) {
				this.name_company = name_company;
			}
			public Date getS_date() {
				return s_date;
			}
			public void setS_date(Date s_date) {
				this.s_date = s_date;
			}
			public Date getE_date() {
				return e_date;
			}
			public void setE_date(Date e_date) {
				this.e_date = e_date;
			}
			public String getAdd_by() {
				return add_by;
			}
			public void setAdd_by(String add_by) {
				this.add_by = add_by;
			}
			public String getRef_name() {
				return ref_name;
			}
			public void setRef_name(String ref_name) {
				this.ref_name = ref_name;
			}
			public String getRef_email() {
				return ref_email;
			}
			public void setRef_email(String ref_email) {
				this.ref_email = ref_email;
			}
		    
		    
	
}
