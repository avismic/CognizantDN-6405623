package com.example.dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private final Map<String, Customer> dataStore = new HashMap<>();

    public CustomerRepositoryImpl() {
        dataStore.put("C001", new Customer("C001", "Abhishek"));
        dataStore.put("C002", new Customer("C002", "Avi"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return dataStore.get(id);
    }
}
