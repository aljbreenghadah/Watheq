package com.example.TestDB.mapper;

import com.example.TestDB.dto.CertificationDTO;
import com.example.TestDB.model.Certification;

public interface CertificationMapper {

	Certification dtoToDomain(final CertificationDTO certification);

	CertificationDTO domainToDto(final Certification certification);

}
