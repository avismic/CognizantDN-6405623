package com.example.dependencyinjection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repo    = new CustomerRepositoryImpl();
        CustomerService    service = new CustomerService(repo);

        Customer c1 = service.getCustomerById("C001");
        System.out.println("Found: " + c1);

        Customer c2 = service.getCustomerById("C002");
        System.out.println("Found: " + c2);

        Customer c3 = service.getCustomerById("C999");
        System.out.println("Found: " + c3);
    }
}
