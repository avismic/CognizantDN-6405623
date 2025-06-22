package com.example.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basic = new Computer.Builder("Intel i5", 8)
                                .build();
        System.out.println(basic);

        Computer gaming = new Computer.Builder("AMD Ryzen 9", 32)
                                 .storage(1024)
                                 .withGPU(true)
                                 .OS("Windows 11")
                                 .build();
        System.out.println(gaming);

        Computer dev = new Computer.Builder("Intel i7", 16)
                              .storage(512)
                              .OS("Ubuntu 22.04")
                              .build();
        System.out.println(dev);
    }
}
