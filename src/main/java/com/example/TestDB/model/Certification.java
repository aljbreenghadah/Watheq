package com.example.TestDB.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "Certification")
public class Certification implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CERT_id", unique = true, nullable = false)
	private int CERT_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.MERGE)
	@JoinColumn(name = "NationalID")
	private Individual NationalID;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "Edu_iD")
	private Education Edu_iD;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.MERGE)
	@JoinColumn(name = "EDU_NAME")
	private Education EDU_NAME;

	@Column(name = "ADDBY", nullable = false)
	@NotNull(message = "Should insert who add the certificate ")
	private int ADDBY;

	@Column(name = "CERT_DATE", nullable = false)
	@NotNull(message = "the date of certificate cannot be Empty")
	private String CERT_DATE;

	@Column(name = "GPA", nullable = false)
	@NotNull(message = "GPA cannot be Empty ")
	private Double GPA;

	@Column(name = "DEGREE", nullable = false)
	@NotNull(message = "DEGREE cannot be Empty ")
	private String DEGREE;

	@Column(name = "MAJOR", nullable = false)
	@NotNull(message = "MAJOR cannot be Empty ")
	private String MAJOR;

	@Column(name = "ATTACH", nullable = false)
	@NotNull(message = "ATTACH cannot be Empty ")
	private String ATTACH;

	@Column(name = "StartDate", nullable = false)
	private String StartDate;

	@Column(name = "EndDate", nullable = false)
	private String EndDate;

	public Certification() {
		super();
	}

	@Builder
	public Certification(final Individual nationalID, final Education edu_iD,
			final Education eDU_NAME, @NotNull(message = "Should insert who add the certificate ") final int aDDBY,
			@NotNull(message = "the date of certificate cannot be Empty") final String cERT_DATE,
			@NotNull(message = "GPA cannot be Empty ") final Double gPA,
			@NotNull(message = "DEGREE cannot be Empty ") final String dEGREE,
			@NotNull(message = "MAJOR cannot be Empty ") final String mAJOR,
			@NotNull(message = "ATTACH cannot be Empty ") final String aTTACH,
			@NotNull(message = "Date StartDate cannot be Empty ") final String StartDate,
			@NotNull(message = "Date EndDate cannot be Empty ") final String EndDate) {
		super();
		// CERT_id = cERT_id;
		NationalID = nationalID;
		Edu_iD = edu_iD;
		EDU_NAME = eDU_NAME;
		ADDBY = aDDBY;
		CERT_DATE = cERT_DATE;
		GPA = gPA;
		DEGREE = dEGREE;
		MAJOR = mAJOR;
		ATTACH = aTTACH;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	public int getCERT_id() {
		return CERT_id;
	}

	// public void setCERT_id(final int cERT_id) {
	// 	CERT_id = cERT_id;
	// }

	public Individual getNationalID() {
		return NationalID;
	}

	public void setNationalID(final Individual nationalID) {
		NationalID = nationalID;
	}

	public int getADDBY() {
		return ADDBY;
	}

	public void setADDBY(final int aDDBY) {
		ADDBY = aDDBY;
	}

	public String getCERT_DATE() {
		return CERT_DATE;
	}

	public void setCERT_DATE(final String cERT_DATE) {
		CERT_DATE = cERT_DATE;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(final Double gPA) {
		GPA = gPA;
	}

	public String getDEGREE() {
		return DEGREE;
	}

	public void setDEGREE(final String dEGREE) {
		DEGREE = dEGREE;
	}

	public String getMAJOR() {
		return MAJOR;
	}

	public void setMAJOR(final String mAJOR) {
		MAJOR = mAJOR;
	}

	public String getATTACH() {
		return ATTACH;
	}

	public void setATTACH(final String aTTACH) {
		ATTACH = aTTACH;
	}

	@Override
	public String toString() {
		return "Certification [CERT_id=" + CERT_id + ", NationalID=" + NationalID + ", ADDBY=" + ADDBY + ", CERT_DATE="
				+ CERT_DATE + ", GPA=" + GPA + ", DEGREE=" + DEGREE + ", MAJOR=" + MAJOR + ", ATTACH=" + ATTACH
				+ ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", toString()=" + super.toString() + "]";
	}

	public Education getEdu_iD() {
		return Edu_iD;
	}

	public void setEdu_iD(final Education edu_iD) {
		Edu_iD = edu_iD;
	}

	public Education getEDU_NAME() {
		return EDU_NAME;
	}

	public void setEDU_NAME(final Education eDU_NAME) {
		EDU_NAME = eDU_NAME;
	}

	public void setGPA(final double gPA) {
		GPA = gPA;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(final String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(final String endDate) {
		EndDate = endDate;
	}

}
