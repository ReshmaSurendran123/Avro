package com.example.avro.dto;

import lombok.Data;

@Data
public class Address {
    private String street;

    private String suite;

    private String city;

    private String zipcode;

    private Geo geoDTO;

    public Address() {
    }
}
