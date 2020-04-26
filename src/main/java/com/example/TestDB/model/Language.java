package com.example.TestDB.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "language")
public class Language implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// private long id;

	@Column(name = "languge_ID", nullable = false, unique = true)
	private String languge_ID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "NationalID", nullable = false)
	private Individual NationalID;

	@Column(name = "languge_name", nullable = false)
	@NotNull(message = "please specifie the kind of the languge ")
	private String languge_name;

	@Column(name = "languge_date", nullable = false)
	@NotNull(message = " the passing date cannot be Empty ")
	private Date languge_date;

	@Column(name = "languge_attach", nullable = false)
	@NotNull(message = " the certivicate for the languge test cannot be Empty ")
	private String languge_attach;

	@Builder

	public Language(String languge_ID, Individual NationalID, String languge_name, Date languge_date,
			String languge_attach) {
		super();
		this.languge_ID = languge_ID;
		this.NationalID = NationalID;
		this.languge_name = languge_name;
		this.languge_date = languge_date;
		this.languge_attach = languge_attach;
	}

	public String getLanguge_ID() {
		return languge_ID;
	}

	public void setLanguge_ID(String languge_ID) {
		this.languge_ID = languge_ID;
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

	public String getLanguge_attach() {
		return languge_attach;
	}

	public void setLanguge_attach(String languge_attach) {
		this.languge_attach = languge_attach;
	}

	@Override
	public String toString() {
		return "Language [ languge_ID=" + languge_ID + ", NationalID=" + NationalID + ", languge_name=" + languge_name
				+ ", languge_date=" + languge_date + ", languge_attach=" + languge_attach + ", toString()="
				+ super.toString() + "]";
	}

}
