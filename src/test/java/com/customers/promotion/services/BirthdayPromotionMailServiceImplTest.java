package com.customers.promotion.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.testng.Assert.*;

@SpringBootTest
public class BirthdayPromotionMailServiceImplTest {
    @Autowired
    private BirthdayPromotionMailServiceImpl service;

    @Test
    public void givenCustomerBirthdaysGetList() {
        assertNotEquals(service.getBirthdayList(), null);
    }
}