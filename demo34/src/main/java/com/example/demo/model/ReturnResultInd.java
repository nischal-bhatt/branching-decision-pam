package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReturnResultInd implements Serializable {

    private String name;

    @JsonProperty("old-value")
    private String oldValue;

    @JsonProperty("value")
    private String value;

    @JsonProperty("process-instance-id")
    private String processInstanceId;

    @JsonProperty("modification-date")
    private ModificationDate modificationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public ModificationDate getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(ModificationDate modificationDate) {
        this.modificationDate = modificationDate;
    }
}
