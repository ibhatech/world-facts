package com.ibhatech.opendata.worldfacts.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Countriesrepo extends JpaRepository<Countries, String> {

}
