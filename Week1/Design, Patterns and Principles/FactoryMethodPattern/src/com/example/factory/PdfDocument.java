package com.example.factory;

public class PdfDocument implements Document {
    @Override
    public String getType() {
        return "PDF Document created";
    }
}
