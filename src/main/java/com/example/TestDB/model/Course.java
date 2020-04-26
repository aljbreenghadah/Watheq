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
@Table(name = "course")
public class Course implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	// user_id
	@Id
	@Column(name = "courseID")
	private String courseID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "NationalID", nullable = false)
	private Individual NationalID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "Eduid", nullable = false)
	private Education Eduid;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "cr", nullable = false)
	private Company cr;

	@Column(name = "nameCourse", nullable = false)
	@NotNull(message = "nameCourse cannot be Empty ")
	private String nameCourse;

	@Column(name = "addedBy", nullable = false)
	private String addedBy;

	@Column(name = "nameInstittion")
	@NotNull(message = "nameInstittion cannot be Empty ")
	private String nameInstittion;

	@Column(name = "courseAttch")
	private String courseAttch;

	@Column(name = "StartDate")
	@NotNull(message = "StartDate cannot be Empty ")
	private Date StartDate;

	@Column(name = "EndDate")
	private Date EndDate;

	@Builder

	public Course(String courseID, Individual NationalID, Education Eduid, Company cr, String nameCourse,
			String addedBy, String nameInstittion, String courseAttch, Date StartDate, Date EndDate) {
		super();
		this.courseID = courseID;
		this.NationalID = NationalID;
		this.Eduid = Eduid;
		this.cr = cr;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.nameInstittion = nameInstittion;
		this.courseAttch = courseAttch;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	public String getNameInstittion() {
		return nameInstittion;
	}

	public void setNameInstittion(String nameInstittion) {
		this.nameInstittion = nameInstittion;
	}

	public String getCourseAttch() {
		return courseAttch;
	}

	public void setCourseAttch(String courseAttch) {
		this.courseAttch = courseAttch;
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

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		this.StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}

}
