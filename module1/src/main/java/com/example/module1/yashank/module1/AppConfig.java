package com.example.module1.yashank.module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentService paymentService() {
        System.out.println("Customizing the creation of the payment service bean");
        return new PaymentService();
    }
}
