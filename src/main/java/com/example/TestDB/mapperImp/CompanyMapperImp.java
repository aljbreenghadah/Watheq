package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;
import com.example.TestDB.dto.CompanyDTO;
import com.example.TestDB.mapper.CompanyMapper;
import com.example.TestDB.model.Company;


public class CompanyMapperImp implements CompanyMapper{



	ModelMapper modelMapper;

	public CompanyMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Company dtoToDomain(CompanyDTO company) {
		return modelMapper.map(company,Company.class );

	}


	@Override
	public  CompanyDTO domainToDto(Company company) {
		return modelMapper.map(company,CompanyDTO.class );

 

}}
