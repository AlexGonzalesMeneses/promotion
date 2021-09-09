/**
 * @author: Alex Gonzales
 */

package com.customers.promotion.services;

import com.customers.promotion.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class BirthdayPromotionMailServiceImpl implements BirthdayPromotionMailService {
    @Value("${discountValue}")
    private BigDecimal discountValue;
    private CustomerService customerService;
    private JavaMailSender mailSender;

    public BirthdayPromotionMailServiceImpl(CustomerService customerService, JavaMailSender mailSender) {
        this.customerService = customerService;
        this.mailSender = mailSender;
    }

    @Override
    public List<Customer> getBirthdayList() {
        List<Customer> customers = customerService.findAll();
        String today = formatDateToString(LocalDate.now());
        return (List<Customer>) customers.stream()
                .filter(c -> formatDateToString(c.getBirthday()).equals(today));
    }

    private String formatDateToString(LocalDate date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM");
        return format.format(date);
    }

    @Override
    public void sendMail() {
        List<Customer> customers = getBirthdayList();
        customers.forEach(c -> {
            String content = createMessageToPromotion(c);
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setTo(c.getFirstName());
            mail.setSubject("Discount!");
            mail.setText(createMessageToPromotion(c));
            mailSender.send(c.getEmail());
        });
    }

    private String createMessageToPromotion(Customer customer) {
        StringBuilder message = new StringBuilder();
        message.append(customer.getFirstName()+" Hoy es su cumpleaños y usted es importante para nosotros, " +
                " queremos celebralo ofreciendo un "+ discountValue + " de descuento y delivery gratuito. Valido por 24 hrs");
        return message.toString();
    }
}
