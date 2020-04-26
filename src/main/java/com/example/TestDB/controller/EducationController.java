package com.example.TestDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.example.TestDB.dto.EducationDTO;
import com.example.TestDB.model.Education;
import com.example.TestDB.service.EducationService;

@CrossOrigin()
@RestController
@RequestMapping("/api/educations")
public class EducationController {

	@Autowired
	EducationService educationService;

	EducationDTO educationDTO = new EducationDTO("albreegadh@gmail.com", "051528821", "jes", "15", "48", "op");

	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> login(@RequestBody Map<String, String> body) {
		String email = body.get("email");
		String password = body.get("password");

		HashMap<String, String> map = new HashMap<>();

		Education education = educationService.login(email, password);

		if (education != null) {
			map.put("id", String.valueOf(education.getEdu_iD()));
			map.put("name", education.getEDU_NAME());
		} else {
			map.put("error", "Wrong login credentials");
		}
		
		return map;
	}

	@RequestMapping("/creEducation")
	public String create() {
		educationService.createEducationDTO(educationDTO);
		return "Create Done";
	}

	@RequestMapping("/updateEDU_NAMEEducation")
	public EducationDTO updateEDU_NAME() throws Exception {
		return educationService.updateEDU_NAMEEducationDTO(1, "uyt");
	}

}