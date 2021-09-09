/**
 * @author: Alex Gonzales
 */

package com.customers.promotion;

import com.customers.promotion.models.Customer;
import com.customers.promotion.repositories.CustomerRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DevelopmentBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private CustomerRepository customerRepository;

    public DevelopmentBootstrap(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
       Customer customer = new Customer();
       customer.setFirstName("Alex");
       customer.setLastName("Gonzales");
       customer.setBirthday(LocalDate.of(1998,07,20));
       customer.setEmail("alex.gonzales@gmail.com");
       customerRepository.save(customer);

        Customer customer1 = new Customer();
        customer.setFirstName("Henry");
        customer.setLastName("Villa");
        customer.setBirthday(LocalDate.of(1998,9,9));
        customer.setEmail("alex.gonzales@gmail.com");
        customerRepository.save(customer);

        Customer customer2 = new Customer();
        customer.setFirstName("Heidi");
        customer.setLastName("Gonzales");
        customer.setBirthday(LocalDate.of(1998,9,9));
        customer.setEmail("heidi.gonzales@gmail.com");
        customerRepository.save(customer);

        Customer customer3 = new Customer();
        customer.setFirstName("Daniela");
        customer.setLastName("Gonzales");
        customer.setBirthday(LocalDate.of(1998,9,9));
        customer.setEmail("daniela.gonzales@gmail.com");
        customerRepository.save(customer);

        Customer customer4 = new Customer();
        customer.setFirstName("Camila");
        customer.setLastName("Gonzales");
        customer.setBirthday(LocalDate.of(1998,9,9));
        customer.setEmail("camila.gonzales@gmail.com");
        customerRepository.save(customer);
    }
}
