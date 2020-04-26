package com.example.TestDB.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import  com.example.TestDB.model.Company;


@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company,String>{

	@Modifying
	@Query("UPDATE Company company SET company.CompanyName =:CompanyName WHERE company.cr = :cr ")
	void updateCompanyName(@Param("cr") String cr,@Param("CompanyName") String CompanyName );
		
	@Modifying
	@Query("UPDATE Company company SET company.Email =:Email WHERE company.cr = :cr ")
	void updateEmail(@Param("cr") String cr,@Param("Email") String Email );
	
	@Modifying
	@Query("UPDATE Company company SET company.PhoneNumber =:PhoneNumber WHERE company.cr = :cr ")
	void updatePhoneNumber(@Param("cr") String cr,@Param("PhoneNumber") String PhoneNumber);
	
	@Modifying
	@Query("UPDATE Company company SET company.Address =:Address WHERE company.cr = :cr ")
	void updateAddress(@Param("cr") String cr,@Param("Address") String Address);
	
	@Modifying
	@Query("UPDATE Company company SET company.Password =:Password WHERE company.cr = :cr ")
	void updatePassword(@Param("cr") String cr,@Param("Password") String Password);
	
}