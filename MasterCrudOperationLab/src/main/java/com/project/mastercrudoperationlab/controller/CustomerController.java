package com.project.mastercrudoperationlab.controller;

import com.project.mastercrudoperationlab.model.Customer;
import com.project.mastercrudoperationlab.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/public/customers", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/public/create-customer", method = RequestMethod.POST)
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        try {
            return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, e.getMessage());
        }
    }

    @RequestMapping("/public/get-customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id) {
        try {
            return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
        } catch (ResponseStatusException e) {
            return new ResponseEntity<>(new Customer(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/admin/update-customer/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable long id) {
        try {
            return new ResponseEntity<>(customerService.updateCustomer(customer, id), HttpStatus.OK);
        } catch (ResponseStatusException e) {
            return new ResponseEntity<>(new Customer(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/admin/delete-customer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteCustomer(@PathVariable long id) {

        try {
            new ResponseEntity<>(customerService.deleteCustomer(id), HttpStatus.OK);
        } catch (ResponseStatusException e) {
            new ResponseEntity<>(new Customer(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("customer with id: " + id + " delete successfully", HttpStatus.OK);
    }
}

