package com.example.TestDB.dto;





import java.util.Date;

import com.example.TestDB.model.Company;
import com.example.TestDB.model.Education;
import com.example.TestDB.model.Individual;

public class RecommendationDTO {
	  private long Reco_id;
	  private Individual NationalID; 
		private Education Eduid; 
		private Company cr ;
		 private String Reco_From;
		  private Date Reco_Date;
		  private String Reco_AddBy;
		  private String Reco_Attach;
		  private String Reco_Institute_Name;
		  
		  
		  
		  
		  
		  
		  
		public RecommendationDTO() {
			super();
			
			
			
			
		}
		public RecommendationDTO(long Reco_id, Individual NationalID, Education Eduid, Company cr, String Reco_From,
				Date Reco_Date, String Reco_AddBy, String Reco_Attach, String Reco_Institute_Name) {
			super();
			this.Reco_id = Reco_id;
			this.NationalID = NationalID;
			this.Eduid = Eduid;
			this.cr = cr;
			this.Reco_From = Reco_From;
			this.Reco_Date = Reco_Date;
			this.Reco_AddBy = Reco_AddBy;
			this.Reco_Attach = Reco_Attach;
			this.Reco_Institute_Name = Reco_Institute_Name;
		}
		public long getReco_id() {
			return Reco_id;
		}
		public void setReco_id(long reco_id) {
			Reco_id = reco_id;
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
		public String getReco_From() {
			return Reco_From;
		}
		public void setReco_From(String reco_From) {
			Reco_From = reco_From;
		}
		public Date getReco_Date() {
			return Reco_Date;
		}
		public void setReco_Date(Date reco_Date) {
			Reco_Date = reco_Date;
		}
		public String getReco_AddBy() {
			return Reco_AddBy;
		}
		public void setReco_AddBy(String reco_AddBy) {
			Reco_AddBy = reco_AddBy;
		}
		public String getReco_Attach() {
			return Reco_Attach;
		}
		public void setReco_Attach(String reco_Attach) {
			Reco_Attach = reco_Attach;
		}
		public String getReco_Institute_Name() {
			return Reco_Institute_Name;
		}
		public void setReco_Institute_Name(String reco_Institute_Name) {
			Reco_Institute_Name = reco_Institute_Name;
		}
		  
		  
}
