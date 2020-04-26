package com.example.TestDB.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.TestDB.dto.CompanyDTO;
import com.example.TestDB.error.NotFoundException;
import com.example.TestDB.mapperImp.CompanyMapperImp;
import com.example.TestDB.model.Company;
import com.example.TestDB.repository.CompanyRepository;

import lombok.AllArgsConstructor;

@Service

@AllArgsConstructor

public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	private static final CompanyMapperImp companyMapperImp = new CompanyMapperImp();

	// public ResponseEntity<Company> createCompanyDTO(CompanyDTO CompanyDTO) {
	// 	Company company = Company.builder().Email(CompanyDTO.getEmail()).cr(CompanyDTO.getCr())
	// 			.Phonenumber(CompanyDTO.getPhoneNumber()).Address(CompanyDTO.getAddress())
	// 			.Password(CompanyDTO.getPassword()).companyName(CompanyDTO.getCompanyName())

	// 			.build();
	// 	Company saveCompany = companyRepository.save(company);
	// 	companyMapperImp.domainToDto(saveCompany);
	// 	return new ResponseEntity<>(saveCompany, HttpStatus.CREATED);
	// }

	public ResponseEntity<List<Company>> getCompanis() {
		List<Company> com = new ArrayList<Company>();
		companyRepository.findAll().forEach(com::add);
		return new ResponseEntity<>(com, HttpStatus.OK);

		// return (List<Company>) comRepository.findAll();
	}

	public CompanyDTO getByCR(String cr) {
		try {
			return companyRepository.findById(cr).map(companyMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}
	}

	public List<Company> findAll() {

		return (List<Company>) companyRepository.findAll();
	}

	public CompanyDTO updateCompanyNameCompanyDTO(String cr, String companyName) {
		try {
			companyRepository.updateCompanyName(cr, companyName);
			return companyRepository.findById(cr).map(companyMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the cr [%s] was found in our database", cr));
		}
	}

	public void deleteCompany(String cr) {
		try {
			Company company = companyRepository.findById(cr).get();
			companyRepository.delete(company);
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the cr [%s] was found in our database", cr));
		}
	}
}

//// public CompanyDTO updateStartDateCompanyDTO (String cr, String startDate) {
//// try {
//// companyRepository.updateStartDate(cr, startDate);
//// return companyRepository.findById(cr)
//// .map(companyMapper::domainToDto).get();
//// }catch (NoSuchElementException ex) {
//// throw new NotFoundException(String.format("No Record with the cr [%s] was
//// found in our database", cr));
//// }}
////
//// public CompanyDTO updateEndDateCompanyDTO (String cr, String EndDate) {
//// try {
//// companyRepository.updateEndDate(cr, EndDate);
//// return companyRepository.findById(cr)
//// .map(companyMapper::domainToDto).get();
//// }catch (NoSuchElementException ex) {
//// throw new NotFoundException(String.format("No Record with the cr [%s] was
//// found in our database", cr));
//// }
// }
