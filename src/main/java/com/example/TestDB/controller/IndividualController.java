package com.example.TestDB.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.TestDB.dto.IndividualDTO;
//      import com.example.TestDB.model.Individual;
//import com.example.TestDB.repository.IndividualRepository;
import com.example.TestDB.service.IndividualService;

// @SpringBootApplication
//  @EnableAutoConfiguration
@RestController

public class IndividualController {

  @Autowired
  IndividualService individualService;
  IndividualDTO individualDTO = new IndividualDTO("aljbreenadah@gmail.com", "0551223426", "ssa", "0999", "108527437",
      "Gadah", "Dkhhil", "Ghahab", true, "io", "go", null, "orl", "oy", "po");

  // @RequestMapping("/creind")
  // public String create() {

  //   individualService.createIndividualDTO(individualDTO);
  //   return "Create Done";
  // }

  @RequestMapping("/updateAddressIndividual")
  public IndividualDTO updateIndividual() throws Exception {
    return individualService.updateAddressIndividualDTO("1", "P");
  }

  @RequestMapping("/deleteIndividual")
  public String deleteIndividual() throws Exception {
    individualService.deleteIndividual("1095027437");
    return "Deleted";

  }

  @RequestMapping("/updateAttachmentsIndividual")
  public IndividualDTO updateAttachmentsIndividual() throws Exception {
    return individualService.updateAttachmentsIndividualDTO("1", "url");
  }

  @RequestMapping("/updateJOPIndividual")
  public IndividualDTO updateJOPIndividual() throws Exception {
    return individualService.updateJOPIndividualDTO("1", "grammer");
  }

  @RequestMapping("/updatePasswordIndividual")
  public IndividualDTO updatePasswordIndividual() throws Exception {
    return individualService.updatePasswordIndividualDTO("1", "6");
  }

}

//
// @RequestMapping("/find IndividualDTO")
// public String FindbyID() throws Exception {
//
// individualService.FindbyID("109090");
//
// return"Find IndividualDTO";
// }
//
//
// }

// @Autowired
// IndividualRepository IndividualRepository;
//
// @RequestMapping("/insertIndividual")
// public String process() {
// //Indrepository.deleteAll();
// IndividualRepository.save(new Individual
// ("aljbreengha","05225926","arjes","55","1095037","hada","Dhail","aljreen",true,"sigle","rad",
// Timestamp.valueOf("1985-06-18 00:00:00.12989"),"S","RL","pogrammer"));
//
// return "Individual Done";
//
// }
// @RequestMapping("/updateIndividual")
// public String update() {
// IndividualRepository.updateStatus("1095927437","mmmired");
// return "Done";
// }
// }
//
//