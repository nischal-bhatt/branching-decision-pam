package com.example.demo.model;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String ariyal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAriyal() {
        return ariyal;
    }

    public void setAriyal(String ariyal) {
        this.ariyal = ariyal;
    }
}
