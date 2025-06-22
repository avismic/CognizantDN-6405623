package com.example.factory;

public class WordDocument implements Document {
    @Override
    public String getType() {
        return "Word Document created";
    }
}
