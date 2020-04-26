package com.example.TestDB.mapperImp;


	import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.IndividualDTO;
	import com.example.TestDB.mapper.IndividualMapper;
	import com.example.TestDB.model.Individual;



	public class IndividualMapperImp implements IndividualMapper{



		ModelMapper modelMapper;

		public IndividualMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Individual dtoToDomain(IndividualDTO individual) {
			return modelMapper.map(individual,Individual.class );

		}


		@Override
		public  IndividualDTO domainToDto(Individual individual) {
			return modelMapper.map(individual,IndividualDTO.class );


		}


	}

