package com.example.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document word = factory.createDocument();
        System.out.println(word.getType());

        factory = new PdfDocumentFactory();
        Document pdf = factory.createDocument();
        System.out.println(pdf.getType());

        factory = new ExcelDocumentFactory();
        Document excel = factory.createDocument();
        System.out.println(excel.getType());
    }
}
