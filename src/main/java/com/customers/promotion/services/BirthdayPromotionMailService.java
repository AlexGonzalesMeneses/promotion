package com.customers.promotion.services;

import com.customers.promotion.models.Customer;

import java.util.List;

public interface BirthdayPromotionMailService {
    List<Customer> getBirthdayList();
    void sendMail();
}
