package com.example.proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo1.jpg");

        image.display();
        System.out.println("---");

        image.display();
    }
}
