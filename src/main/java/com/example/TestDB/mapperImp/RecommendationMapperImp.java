package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.RecommendationDTO;
import com.example.TestDB.mapper.RecommendationMapper;
import com.example.TestDB.model.Recommendation;
public class RecommendationMapperImp  implements RecommendationMapper{



	ModelMapper modelMapper;

	public RecommendationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Recommendation dtoToDomain(RecommendationDTO recommendation) {
		return modelMapper.map(recommendation,Recommendation.class );

	}


	@Override
	public  RecommendationDTO domainToDto(Recommendation recommendation) {
		return modelMapper.map(recommendation,RecommendationDTO.class );
 
	

}}
