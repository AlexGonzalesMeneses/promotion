/**
 * @author: Alex Gonzales
 */

package com.customers.promotion.dto;

import com.customers.promotion.models.Customer;

public class CustomerDto extends DtoBase<Customer>{
    private String firstName;
    private String lastName;
    private String nit;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
