package com.example.jani;

public class DDL_item {
    private String name;
    private String detail;
    private int ddlId;
    public DDL_item(String name, String detail, int ddlId) {
        this.name = name;
        this.detail= detail;
        this.ddlId = ddlId;
    }
    public String getName() {
        return name;
    }
    public String getDetail() {
        return detail;
    }
    public int getDdlId() {
        return ddlId;
    }
}
