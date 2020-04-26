package com.example.TestDB.mapper;
import com.example.TestDB.dto.LanguageDTO;
import com.example.TestDB.model.Language;

public interface LanguageMapper {


	Language dtoToDomain(final LanguageDTO language);

	LanguageDTO domainToDto(final Language language );


}
