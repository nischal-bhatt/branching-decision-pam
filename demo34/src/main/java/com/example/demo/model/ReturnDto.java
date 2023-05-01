package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReturnDto implements Serializable {
    @JsonProperty("food-coma")
    private String favFoood;

    public String getFavFoood() {
        return favFoood;
    }

    public void setFavFoood(String favFoood) {
        this.favFoood = favFoood;
    }
}
