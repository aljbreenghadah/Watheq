package com.example.TestDB.mapper;

import com.example.TestDB.dto.ExperienceDTO;
import com.example.TestDB.model.Experience;

public interface ExperienceMapper {

	Experience dtoToDomain(final ExperienceDTO experience );

	ExperienceDTO domainToDto(final Experience experience  );





}
