package com.example.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        System.out.println(l1 == l2
            ? "Same Logger instance"
            : "Different instances");
        l1.log("Via l1");
        l2.log("Via l2");
    }
}
