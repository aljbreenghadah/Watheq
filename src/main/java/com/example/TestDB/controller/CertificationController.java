package com.example.TestDB.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.TestDB.model.Certification;
import com.example.TestDB.model.Education;
import com.example.TestDB.model.Individual;
import com.example.TestDB.service.CertificationService;
import com.example.TestDB.service.EducationService;
import com.example.TestDB.service.IndividualService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.TestDB.dto.CertificationDTO;
//import com.example.TestDB.model.Education;
//import com.example.TestDB.model.Individual;
//import com.example.TestDB.service.CertificationService;

@CrossOrigin()
@RestController
@RequestMapping("/api/certifications")
public class CertificationController {
	@Autowired
	CertificationService certificationService;

	@Autowired
	IndividualService individualService;

	@Autowired
	EducationService educationService;

	@GetMapping(path = { "/users/{userid}" })
	public List<Certification> getUserCertificates(@PathVariable("userid") String id) {
		return (List<Certification>) certificationService.getByIndividualId(id);
	}

	@PostMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> create(@RequestBody Map<String, String> body) {
		String gpa = body.get("gpa");
		String major = body.get("major");
		String degree = body.get("degree");
		String startDate = body.get("startDate");
		String endDate = body.get("endDate");
		String nationalId = body.get("nationalId");
		String educationId = body.get("educationId");

		HashMap<String, String> map = new HashMap<>();

		Education education = educationService.getById(educationId);
		Individual individual = individualService.getById(nationalId);

		if (education == null) {
			map.put("error", "Education ID is not correct");
			return map;
		} else if (individual == null) {
			map.put("error", "National ID is not correct");
			return map;
		} else if (major == null) {
			map.put("error", "Major is empty");
			return map;
		} else if (degree == null) {
			map.put("error", "Degree is empty");
			return map;
		} else if (startDate == null) {
			map.put("error", "Start Date is empty");
			return map;
		} else if (endDate == null) {
			map.put("error", "End Date is empty");
			return map;
		}

		double dGpa = 0;

		try {
			dGpa = Double.parseDouble(gpa);
		} catch (Exception e) {
			map.put("error", "GPA is not a valid number");
			return map;
		}

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  

		Certification certification = new Certification(
			individual, education, education, education.getEdu_iD(),
			formatter.format(new Date()), dGpa, degree, major,
			"No", startDate, endDate
		);

		certificationService.create(certification);

		map.put("success", "Certification has been saved successfully");

		return map;
	}

	// public List<Certification> findOne(@PathVariable("userid") int id){
	// return (List<Certification>) companyservice.findAll();
	// }

	/*
	 * CertificationService certificateService;
	 * 
	 * Individual individual = new Individual("102222");
	 * 
	 * Education education = new Education("019","University1");
	 * 
	 * 
	 * @RequestMapping("/insertCertificate") public String insertCertificate(){
	 * 
	 * certificateService.createCertificationDTO(CertificationDTO);
	 * 
	 * return "Done for Certificate"; }
	 */
}
