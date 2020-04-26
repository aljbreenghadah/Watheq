package com.example.TestDB.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.TestDB.model.Education;

@Repository
@Transactional
public interface EducationRepository extends CrudRepository<Education, Integer> {
	@Modifying
	@Query("UPDATE  Education education SET  education.EDU_NAME =:EDU_NAME WHERE  education.Edu_iD = :Edu_iD ")
	void updateEDU_NAME(@Param("Edu_iD") int Edu_iD, @Param("EDU_NAME") String EDU_NAME);

	@Modifying
	@Query("UPDATE  Education education SET  education.Email =:Email WHERE  education.Edu_iD = :Edu_iD ")
	void updateEmail(@Param("Edu_iD") String Edu_iD, @Param("Email") String Email);

	@Modifying
	@Query("UPDATE  Education education SET  education.PhoneNumber =:PhoneNumber WHERE  education.Edu_iD = :Edu_iD ")
	void updatePhoneNumber(@Param("Edu_iD") String Edu_iD, @Param("PhoneNumber") String PhoneNumber);

	@Modifying
	@Query("UPDATE  Education education SET  education.Address =:Address WHERE  education.Edu_iD = :Edu_iD ")
	void updateAddress(@Param("Edu_iD") String Edu_iD, @Param("Address") String Address);

	@Modifying
	@Query("UPDATE  Education education SET  education.Password =:Password WHERE  education.Edu_iD = :Edu_iD ")
	void updatePassword(@Param("Edu_iD") String Edu_iD, @Param("Password") String Password);

	@Query("from Education education where education.Email = :email and education.Password = :password")
	Education getByEmailPassword(@Param("email") String email, @Param("password") String password);
}