package com.example.TestDB.repository;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import  com.example.TestDB.model.Individual;
@Repository
@Transactional
public interface IndividualRepository extends CrudRepository <Individual, String>
{
	@Modifying
	@Query("UPDATE Individual individual SET individual.Status =:Status WHERE individual.NationalID = :NationalID ")
	void updateStatus(@Param("NationalID") String NationalID,@Param("Status") String Status );
	@Modifying
	@Query("UPDATE Individual individual SET individual.FirstName =:FirstName WHERE individual.NationalID = :NationalID ")
	void updateFirstName(@Param("NationalID") String NationalID,@Param("FirstName") String FirstName );
	@Modifying
	@Query("UPDATE Individual individual SET individual.Skills =:Skills WHERE individual.NationalID = :NationalID ")
	void updateSkills(@Param("NationalID") String NationalID,@Param("Skills") String Skills );
	@Modifying
	@Query("UPDATE Individual individual SET individual.MName =:MName WHERE individual.NationalID = :NationalID ")
	void updateMName(@Param("NationalID") String NationalID,@Param("MName") String MName );
	@Modifying
	@Query("UPDATE Individual individual SET individual.lastName =:lastName WHERE individual.NationalID = :NationalID ")
	void updatelastname(@Param("NationalID") String NationalID,@Param("lastName") String lastName );
	@Modifying
	@Query("UPDATE Individual individual SET individual.DOB =:DOB WHERE individual.NationalID = :NationalID ")
	void updateDOB(@Param("NationalID") String NationalID,@Param("DOB") Date DOB );
	@Modifying
	@Query("UPDATE Individual individual SET individual.MAJOR =:MAJOR WHERE individual.NationalID = :NationalID ")
	void updateMAJOR(@Param("NationalID") String NationalID,@Param("MAJOR") String MAJOR );
	@Modifying
	@Query("UPDATE Individual individual SET individual.Attachments =:Attachments WHERE individual.NationalID = :NationalID ")
	void updateAttachments(@Param("NationalID") String NationalID,@Param("Attachments") String Attachments );
	@Modifying
	@Query("UPDATE Individual individual SET individual.JOP =:JOP WHERE individual.NationalID = :NationalID ")
	void updateJOP(@Param("NationalID") String NationalID,@Param("JOP") String JOP );
	@Modifying
	@Query("UPDATE Individual individual SET individual.Email =:Email WHERE individual.NationalID = :NationalID ")
	void updateEmail(@Param("NationalID") String NationalID,@Param("Email") String Email );
	@Modifying
	@Query("UPDATE Individual individual SET individual.PhoneNumber =:PhoneNumber WHERE individual.NationalID = :NationalID ")
	void updatePhoneNumber(@Param("NationalID") String NationalID,@Param("PhoneNumber") String PhoneNumber );
	@Modifying
	@Query("UPDATE Individual individual SET individual.Address =:Address WHERE individual.NationalID = :NationalID ")
	void updateAddress(@Param("NationalID") String NationalID,@Param("Address") String Address );
	@Modifying
	@Query("UPDATE Individual individual SET individual.Password =:Password WHERE individual.NationalID = :NationalID ")
	void updatePassword(@Param("NationalID") String NationalID,@Param("Password") String Password );



	

}