package com.example.TestDB.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.IndividualDTO;
import com.example.TestDB.error.NotFoundException;
import com.example.TestDB.mapperImp.IndividualMapperImp;
import com.example.TestDB.model.Individual;
import com.example.TestDB.repository.IndividualRepository;

import lombok.AllArgsConstructor;

@Service

@AllArgsConstructor

public class IndividualService {

	@Autowired
	IndividualRepository individualRepository;
	private static final IndividualMapperImp individualMapperImp = new IndividualMapperImp();

	public Individual getById(String id) {
		try {
            return individualRepository.findById(id).get();
		} catch (Exception ex) {
			return null;
		}
	}

	// public IndividualDTO createIndividualDTO(IndividualDTO individualDTO)
	// {
	// 	Individual individual = Individual.builder().Email(individualDTO.getEmail())
	// 			.Phonenumber(individualDTO.getPhoneNumber()).Address(individualDTO.getAddress())
	// 			.Password(individualDTO.getPassword()).NationalID(individualDTO.getNationalID())
	// 			.FirstName(individualDTO.getFirstname()).MName(individualDTO.getMName())
	// 			.lastName(individualDTO.getLastname()).Gender(individualDTO.getGender())
	// 			.Status(individualDTO.getStatus()).Skills(individualDTO.getSkills()).DOB(individualDTO.getDOB())
	// 			.Attachments(individualDTO.getAttachments()).JOP(individualDTO.getJOP()).MAJOR(individualDTO.getMAJOR())

	// 			.build();
	// 	Individual saveIndividual = individualRepository.save(individual);
	// 	return individualMapperImp.domainToDto(saveIndividual);

	// }

	public IndividualDTO updateAddressIndividualDTO(String NationalID, String Address) {
		try {
			individualRepository.updateAddress(NationalID, Address);
			return individualRepository.findById(NationalID).map(individualMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(
					String.format("No Record with the id [%s] was found in our database", NationalID));
		}
	}

	public void deleteIndividual(String NationalID) {
		try {
			Individual individual = individualRepository.findById(NationalID).get();
			individualRepository.delete(individual);
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(
					String.format("No Record with the nationalID [%s] was found in our database", NationalID));
		}
	}

	public IndividualDTO updateAttachmentsIndividualDTO(String NationalID, String Attachments) {
		try {
			individualRepository.updateAttachments(NationalID, Attachments);
			return individualRepository.findById(NationalID).map(individualMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(
					String.format("No Record with the id [%s] was found in our database", NationalID));
		}
	}

	public IndividualDTO updateJOPIndividualDTO(String NationalID, String JOP) {
		try {
			individualRepository.updateAttachments(NationalID, JOP);
			return individualRepository.findById(NationalID).map(individualMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(
					String.format("No Record with the id [%s] was found in our database", NationalID));
		}

	}

	public IndividualDTO updateStatusIndividualDTO(String NationalID, String Status) {
		try {
			individualRepository.updateStatus(NationalID, Status);
			return individualRepository.findById(NationalID).map(individualMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(
					String.format("No Record with the id [%s] was found in our database", NationalID));
		}
	}

	public IndividualDTO updatePasswordIndividualDTO(String NationalID, String Password) {
		try {
			individualRepository.updatePassword(NationalID, Password);
			return individualRepository.findById(NationalID).map(individualMapperImp::domainToDto).get();
		} catch (NoSuchElementException ex) {
			throw new NotFoundException(
					String.format("No Record with the id [%s] was found in our database", NationalID));
		}

	}
}
