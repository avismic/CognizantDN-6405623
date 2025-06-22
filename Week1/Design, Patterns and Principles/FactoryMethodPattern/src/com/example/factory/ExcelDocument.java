package com.example.factory;

public class ExcelDocument implements Document {
    @Override
    public String getType() {
        return "Excel Document created";
    }
}
