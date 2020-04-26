package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.EducationDTO;
import com.example.TestDB.mapper.EducationMapper;
import com.example.TestDB.model.Education;


public class EducationMapperImp  implements EducationMapper{


	ModelMapper modelMapper;

	public EducationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Education dtoToDomain(EducationDTO education) {
		return modelMapper.map(education,Education.class );

	}


	@Override
	public  EducationDTO domainToDto(Education education) {
		return modelMapper.map(education,EducationDTO.class );


}}
