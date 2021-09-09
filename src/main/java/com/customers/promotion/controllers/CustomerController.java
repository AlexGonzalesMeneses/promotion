/**
 * @author: Alex Gonzales
 */

package com.customers.promotion.controllers;

import com.customers.promotion.dto.CustomerDto;
import com.customers.promotion.models.Customer;
import com.customers.promotion.services.CustomerService;
import com.customers.promotion.services.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController extends GenericController<Customer, CustomerDto> {
    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
