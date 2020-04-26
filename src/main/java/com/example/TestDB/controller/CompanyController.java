package com.example.TestDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestDB.dto.CompanyDTO;
import com.example.TestDB.model.Company;
import com.example.TestDB.repository.CompanyRepository;
import com.example.TestDB.service.CompanyService;

@CrossOrigin()
@RestController
@RequestMapping("/api")
public class CompanyController {

  @Autowired
  CompanyService companyservice;
  @Autowired
  CompanyRepository companyrepository;

  @RequestMapping("/updateCompanyName")
  public CompanyDTO updateCompany() throws Exception {
    return companyservice.updateCompanyNameCompanyDTO("90", "P");
  }

  @RequestMapping("/deleteCompany")
  public String deleteCompany() throws Exception {
    companyservice.deleteCompany("10950277");
    return "Deleted";
  }

  // @PostMapping(value="/companysave")
  // public String create(@RequestBody CompanyDTO companydto)
  // {
  //   System.out.println("company Create");
  //   companyservice.createCompanyDTO(companydto);
  //   return "done";
  // }

  // @PostMapping(value = "/companysave")
  // public ResponseEntity<Company> save(@RequestBody CompanyDTO companyDTO) {
  //   System.out.println("company save call");
  //   return companyservice.createCompanyDTO(companyDTO);
  // }

  @RequestMapping("/FindCompany")
  public String FindbyID() throws Exception {
    companyservice.getByCR("11");
    return "Find Comppany";
  }

  @RequestMapping("/test")
  public String test() throws Exception {
    return "Test";
  }

  @GetMapping("/companies")
  public List<Company> Compannies() {
    return (List<Company>) companyservice.findAll();
  }
}
