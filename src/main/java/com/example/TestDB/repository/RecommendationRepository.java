package com.example.TestDB.repository;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import  com.example.TestDB.model.Recommendation;

@Repository
@Transactional
public interface RecommendationRepository extends CrudRepository<Recommendation, String>{
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.Reco_From =:Reco_From WHERE  recommendation.Reco_id = :Reco_id ")
	void updateReco_From(@Param("Reco_id") String  Reco_id,@Param("Reco_From") String Reco_From );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.Reco_Date =:Reco_Date WHERE  recommendation.Reco_id = :Reco_id ")
	void updateReco_Date(@Param("Reco_id") String  Reco_id,@Param("Reco_Date") Date Reco_Date );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.Reco_AddBy =:Reco_AddBy WHERE  recommendation.Reco_id = :Reco_id ")
	void updateReco_AddBy(@Param("Reco_id") String  Reco_id,@Param("Reco_AddBy") String Reco_AddBy );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.Reco_Attach =:Reco_Attach WHERE  recommendation.Reco_id = :Reco_id ")
	void updateReco_Attach(@Param("Reco_id") String  Reco_id,@Param("Reco_Attach") String Reco_Attach );
	
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.Reco_Institute_Name =:Reco_Institute_Name WHERE  recommendation.Reco_id = :Reco_id ")
	void updateReco_Institute_Name(@Param("Reco_id") String  Reco_id,@Param("Reco_Institute_Name") String Reco_Institute_Name );
	
	
	
}