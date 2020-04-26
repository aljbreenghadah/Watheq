package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.ExperienceDTO;
import com.example.TestDB.mapper.ExperienceMapper;
import com.example.TestDB.model.Experience;



public class ExperienceMapperImp implements ExperienceMapper{


		ModelMapper modelMapper;

		public ExperienceMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Experience dtoToDomain(ExperienceDTO experience) {
			return modelMapper.map(experience,Experience.class );

		}


		@Override
		public  ExperienceDTO domainToDto(Experience experience) {
			return modelMapper.map(experience,ExperienceDTO.class );


	}

}
