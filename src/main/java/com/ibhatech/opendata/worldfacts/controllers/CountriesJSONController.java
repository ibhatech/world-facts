package com.ibhatech.opendata.worldfacts.controllers;

import com.ibhatech.opendata.worldfacts.models.Countriesrepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CountriesJSONController {
    @Autowired
    private Countriesrepo repo;
    @GetMapping("/countries-json")
    public ResponseEntity<List> getCountriesAsJson (){
        log.info( "List of countries = {} ",repo.findAll());
        return ResponseEntity.ok(repo.findAll());
    }
}