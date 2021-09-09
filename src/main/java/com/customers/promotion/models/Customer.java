/**
 * @author: Alex Gonzales
 */

package com.customers.promotion.models;

import com.customers.promotion.dto.CustomerDto;

import javax.mail.internet.MimeMessage;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Customer extends ModelBase<CustomerDto>{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public MimeMessage getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
