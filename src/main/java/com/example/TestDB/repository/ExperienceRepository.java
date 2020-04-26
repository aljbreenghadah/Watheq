package com.example.TestDB.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import  com.example.TestDB.model.Experience;

@Repository
@Transactional
public interface ExperienceRepository extends CrudRepository<Experience, String>{
	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.e_position =:e_position WHERE  experience.Exp_id = :Exp_id ")
	void updatee_position(@Param("Exp_id") String Exp_id,@Param("e_position") String e_position );
	
	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.name_company =:name_company WHERE  experience.Exp_id = :Exp_id ")
	void updatename_company(@Param("Exp_id") String Exp_id,@Param("name_company") String name_company );
	
	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.s_date =:s_date WHERE  experience.Exp_id = :Exp_id ")
	void updates_date(@Param("Exp_id") String Exp_id,@Param("s_date") String s_date );
	
	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.e_date =:e_date WHERE  experience.Exp_id = :Exp_id ")
	void updatee_date(@Param("Exp_id") String Exp_id,@Param("e_date") String e_date );
	
	
	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.add_by =:add_by WHERE  experience.Exp_id = :Exp_id ")
	void updateadd_by(@Param("Exp_id") String Exp_id,@Param("add_by") String add_by );
	

	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.ref_name =:ref_name WHERE  experience.Exp_id = :Exp_id ")
	void updateref_name(@Param("Exp_id") String Exp_id,@Param("ref_name") String ref_name );
	

	@Modifying
	@Query("UPDATE  Experience  experience SET  experience.ref_email =:ref_email WHERE  experience.Exp_id = :Exp_id ")
	void updateref_email(@Param("Exp_id") String Exp_id,@Param("ref_email") String ref_email );
	
}