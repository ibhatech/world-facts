package com.ibhatech.opendata.reports.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="countries")
@Data
public class Countries {
    @Column
    @Id
    private String countryCode;
    private String name;

}
