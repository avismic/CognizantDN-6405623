package com.example.observer;

public class WebApp implements Observer {
    private final String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("WebApp [" + name + "]: " 
            + stockSymbol + " price updated to " + price);
    }
}
