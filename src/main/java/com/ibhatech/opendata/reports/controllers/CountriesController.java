package com.ibhatech.opendata.reports.controllers;

import com.ibhatech.opendata.reports.models.Countries;
import com.ibhatech.opendata.reports.models.Countriesrepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CountriesController {
    @Autowired
    private Countriesrepo repo;
    @GetMapping("/countries")
    public ResponseEntity<List> getCountries (){
//        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
        System.out.println(repo.findAll());
        return ResponseEntity.ok(repo.findAll());
    }
}