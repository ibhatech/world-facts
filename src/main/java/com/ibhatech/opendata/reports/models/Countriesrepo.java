package com.ibhatech.opendata.reports.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Countriesrepo extends JpaRepository<Countries, String> {

}
