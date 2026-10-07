package com.codegym.customermanagement.service;

import com.codegym.customermanagement.model.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
}