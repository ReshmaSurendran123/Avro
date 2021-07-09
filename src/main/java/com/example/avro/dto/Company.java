package com.example.avro.dto;

import lombok.Data;

@Data
public class Company {
    private String name;

    private String catchPhrase;

    private String bs;

    public Company() {
    }
}
