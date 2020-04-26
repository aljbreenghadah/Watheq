package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.TestDB.error.NotFoundException;
import com.example.TestDB.mapperImp.CertificationMapperImp;
import com.example.TestDB.model.Certification;
import com.example.TestDB.repository.CertificationRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CertificationService {
    @Autowired
    CertificationRepository certificationRepository;
    private static final CertificationMapperImp CertificationMapperImp = new CertificationMapperImp();
    
	public List<Certification> getByIndividualId(String id) {
		try {
            return certificationRepository.findByIndividualId(id);
		} catch (Exception ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
		}
	}

    public boolean create(Certification certification) {
        Certification saveCertification = certificationRepository.save(certification);
        CertificationMapperImp.domainToDto(saveCertification);
        return true;
    }

    // public ResponseEntity<Certification> createCertificationDTO(CertificationDTO certificationDTO) {
    //     Certification certification = Certification.builder()
    //             .cERT_id(certificationDTO.getCERT_id())
    //             .dEGREE(certificationDTO.getDEGREE()).nationalID(certificationDTO.getNationalID())
    //             .eDU_NAME(certificationDTO.getEDU_NAME()).aDDBY(certificationDTO.getADDBY())
    //             .cERT_DATE(certificationDTO.getCERT_DATE()).gPA(certificationDTO.getGPA())
    //             .mAJOR(certificationDTO.getMAJOR()).aTTACH(certificationDTO.getATTACH())
    //             .StartDate(certificationDTO.getStartDate())
    //             .EndDate(certificationDTO.getEndDate()).build();

    //     Certification saveCertification = certificationRepository.save(certification);
    //     CertificationMapperImp.domainToDto(saveCertification);
    //     return new ResponseEntity<>(saveCertification, HttpStatus.CREATED);
    // }
}
