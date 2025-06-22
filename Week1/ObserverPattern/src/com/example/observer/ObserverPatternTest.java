package com.example.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket appleStock = new StockMarket("AAPL");

        Observer mobileClient = new MobileApp("iPhoneUser");
        Observer webClient    = new WebApp("ChromeUser");

        appleStock.registerObserver(mobileClient);
        appleStock.registerObserver(webClient);

        appleStock.setPrice(150.00);
        System.out.println("---");

        appleStock.removeObserver(webClient);
        appleStock.setPrice(155.50);
    }
}
