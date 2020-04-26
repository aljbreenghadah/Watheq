package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.LanguageDTO;
import com.example.TestDB.mapper.LanguageMapper;
import com.example.TestDB.model.Language;

public class LanguageMapperImp implements LanguageMapper {


	ModelMapper modelMapper;

	public LanguageMapperImp () {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Language dtoToDomain(LanguageDTO  language) {
		return modelMapper.map(language,Language.class );

	}


	@Override
	public  LanguageDTO domainToDto(Language language) {
		return modelMapper.map(language,LanguageDTO.class );



}}
