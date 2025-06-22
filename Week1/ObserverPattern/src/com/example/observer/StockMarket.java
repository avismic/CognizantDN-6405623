package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private final String stockSymbol;
    private double price;
    private final List<Observer> observers = new ArrayList<>();

    public StockMarket(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockSymbol, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
