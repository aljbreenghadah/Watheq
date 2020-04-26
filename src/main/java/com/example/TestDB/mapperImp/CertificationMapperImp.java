package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.CertificationDTO;
import com.example.TestDB.mapper.CertificationMapper;
import com.example.TestDB.model.Certification;

public class CertificationMapperImp implements CertificationMapper {

	ModelMapper modelMapper;

	public CertificationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Certification dtoToDomain(CertificationDTO certification) {
		return modelMapper.map(certification, Certification.class);
	}

	@Override
	public CertificationDTO domainToDto(Certification certification) {
		return modelMapper.map(certification, CertificationDTO.class);
	}

}
