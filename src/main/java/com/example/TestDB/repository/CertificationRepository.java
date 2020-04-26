package com.example.TestDB.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.TestDB.model.Certification;

@Repository
@Transactional
public interface CertificationRepository extends CrudRepository<Certification, String> {

	@Modifying
	@Query("UPDATE Certification certification SET certification.EDU_NAME =:EDU_NAME WHERE certification.CERT_id = :CERT_id ")
	void updateUNI_NAME(@Param("CERT_id") String CERT_id, @Param("EDU_NAME") String EDU_NAME);

	@Modifying
	@Query("UPDATE Certification certification SET certification.ADDBY =:ADDBY WHERE certification.CERT_id = :CERT_id ")
	void updateADDBY(@Param("CERT_id") String CERT_id, @Param("ADDBY") String ADDBY);

	@Modifying
	@Query("UPDATE Certification certification SET certification.CERT_DATE =:CERT_DATE WHERE certification.CERT_id = :CERT_id ")
	void updateCERT_DATE(@Param("CERT_id") String CERT_id, @Param("CERT_DATE") String CERT_DATE);

	@Modifying
	@Query("UPDATE Certification certification SET certification.GPA =:GPA WHERE certification.CERT_id = :CERT_id ")
	void updateGPA(@Param("CERT_id") String CERT_id, @Param("GPA") Double GPA);

	@Modifying
	@Query("UPDATE Certification certification SET certification.DEGREE =:DEGREE WHERE certification.CERT_id =:CERT_id ")
	void updateDEGREE(@Param("CERT_id") String CERT_id, @Param("DEGREE") String DEGREE);

	@Modifying
	@Query("UPDATE Certification certification SET certification.MAJOR =:MAJOR WHERE certification.CERT_id = :CERT_id ")
	void updateMAJOR(@Param("CERT_id") String CERT_id, @Param("MAJOR") String MAJOR);

	@Modifying
	@Query("UPDATE Certification certification SET certification.ATTACH =:ATTACH WHERE certification.CERT_id = :CERT_id ")
	void updateATTACH(@Param("CERT_id") String CERT_id, @Param("ATTACH") String ATTACH);

	@Modifying
	@Query("UPDATE Certification certification SET certification.StartDate =:StartDate WHERE certification.CERT_id = :CERT_id ")
	void updateStartDate(@Param("CERT_id") String CERT_id, @Param("StartDate") String startDate);

	@Modifying
	@Query("UPDATE Certification certification SET certification.EndDate =:EndDate WHERE certification.CERT_id = :CERT_id ")
	void updateEndDate(@Param("CERT_id") String CERT_id, @Param("EndDate") String endDate);

	@Query("from Certification certification where certification.NationalID.NationalID = :id")
	List<Certification> findByIndividualId(@Param("id") String id);
}
