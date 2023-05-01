package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ModificationDate implements Serializable {

    @JsonProperty("java.util.Date")
    private String date;
}
