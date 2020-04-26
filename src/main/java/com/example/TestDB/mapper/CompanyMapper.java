package com.example.TestDB.mapper;

import com.example.TestDB.dto.CompanyDTO;
import com.example.TestDB.model.Company;


public interface CompanyMapper {
	 Company dtoToDomain(final CompanyDTO  company );

	 CompanyDTO domainToDto(final Company  company  );
}
