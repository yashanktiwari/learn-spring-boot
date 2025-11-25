package com.example.module1.yashank.module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("paying...");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("After initialization of the bean");
        System.out.println("Before paying");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("After payment");
        System.out.println("Before destroying the bean");
    }
}
