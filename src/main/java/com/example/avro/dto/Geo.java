package com.example.avro.dto;

import lombok.Data;

@Data
public class Geo {
    private String lat;

    private String lng;

    public Geo() {
    }
}
