package com.ibhatech.opendata.reports.controllers;

import com.ibhatech.opendata.reports.models.Countriesrepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class CountriesController {
  @Autowired
  private Countriesrepo repo;
  @GetMapping("/countries")
  public String getCountries (Model model){
    log.info("Fetching countries");
    model.addAttribute("countries",repo.findAll());
    return "all-countries";
  }
}
