package com.example.TestDB.mapper;
import com.example.TestDB.dto.RecommendationDTO;
import com.example.TestDB.model.Recommendation;
public interface RecommendationMapper {

	Recommendation dtoToDomain(final RecommendationDTO recommendation );

	RecommendationDTO domainToDto(final Recommendation recommendation );


}
