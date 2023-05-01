package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class ReturnResult implements Serializable {

    @JsonProperty("variable-instance")
    private List<ReturnResultInd> returnResultIndList;

    public List<ReturnResultInd> getReturnResultIndList() {
        return returnResultIndList;
    }

    public void setReturnResultIndList(List<ReturnResultInd> returnResultIndList) {
        this.returnResultIndList = returnResultIndList;
    }
}
