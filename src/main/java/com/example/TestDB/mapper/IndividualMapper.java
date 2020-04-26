package com.example.TestDB.mapper;

	import com.example.TestDB.dto.IndividualDTO;
	import com.example.TestDB.model.Individual;


	public interface IndividualMapper {


		Individual dtoToDomain(final IndividualDTO individual );

		IndividualDTO domainToDto(final Individual individual );





	}

