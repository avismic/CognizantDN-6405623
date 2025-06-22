package com.example.dependencyinjection;

public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer getCustomerById(String id) {
        return repository.findCustomerById(id);
    }
}
