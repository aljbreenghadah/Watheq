package com.example.TestDB;

import java.util.Date;

import com.example.TestDB.model.Certification;
import com.example.TestDB.model.Company;
import com.example.TestDB.model.Education;
import com.example.TestDB.model.Individual;
import com.example.TestDB.repository.CertificationRepository;
import com.example.TestDB.repository.CompanyRepository;
import com.example.TestDB.repository.EducationRepository;
import com.example.TestDB.repository.IndividualRepository;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class TestDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDbApplication.class, args);//run application
	}


	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private EducationRepository educationRepository;

	@Autowired
	private IndividualRepository individualRepository;

	@Autowired
	private CertificationRepository certificationRepository;

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			Education education = new Education(
				"aljbreenghadah@gmail.com", "0502225926", "Riyadh", "111111", "Princess Nourah Bint Abdul Rahman University"
			); 

			Company company = new Company(
				"company@gmail.com", "0502225926", "Makkah", "111111", "1", "Google, LLC"
			);

			Individual ghada = new Individual(
				"demo@gmail.com", "0502225926", "Makkah", "111111", "0123456789",
				"Ghada", "Dakhil", "Aljbreen", true, "approved", "Pro", new Date(2323223232L),
				"Programming", "No Attachments", "Student"
			);

			Individual bayan = new Individual(
				"bayan@gmail.com", "0545482999", "Jeddah", "111111", "0123456700",
				"Bayan", "Ali", "Ghanim", true, "approved", "Pro", new Date(2323223232L),
				"Programming", "No Attachments", "Student"
			);

			try {
				educationRepository.save(education);
				companyRepository.save(company);
				
				individualRepository.save(ghada);
				individualRepository.save(bayan);

				certificationRepository.save(new Certification(
					ghada, education, education, education.getEdu_iD(),
					"2009-04-29", 3.8, "Computer Science", "Software Engineering",
					"No", "2008-12-01", "2009-04-29"
				));

				certificationRepository.save(new Certification(
					ghada, education, education, education.getEdu_iD(),
					"2014-06-20", 3.6, "Business Management", "Social Marketing",
					"No", "2013-06-20", "2014-06-20"
				));

				certificationRepository.save(new Certification(
					bayan, education, education, education.getEdu_iD(),
					"2020-03-20", 3.75, "Computer Science", "Software Engineering",
					"No", "2019-01-01", "2020-03-20"
				));
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}

}
