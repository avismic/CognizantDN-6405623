package com.example.observer;

public class MobileApp implements Observer {
    private final String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("MobileApp [" + name + "]: " 
            + stockSymbol + " price updated to " + price);
    }
}
