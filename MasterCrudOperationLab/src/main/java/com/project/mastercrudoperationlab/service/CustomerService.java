package com.project.mastercrudoperationlab.service;

import com.project.mastercrudoperationlab.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();
    public Customer createCustomer(Customer customer);
    public Customer getCustomerById(Long id);
    public Customer updateCustomer(Customer customer, Long id);
    public String deleteCustomer(Long id);
}
