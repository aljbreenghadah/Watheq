package com.example.TestDB.mapper;

import com.example.TestDB.dto.EducationDTO;
import com.example.TestDB.model.Education;


public interface EducationMapper {

	Education dtoToDomain(final EducationDTO education );

	EducationDTO domainToDto(final Education education );



}
