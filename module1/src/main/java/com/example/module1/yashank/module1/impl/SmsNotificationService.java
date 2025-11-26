package com.example.module1.yashank.module1.impl;

import com.example.module1.yashank.module1.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending... " + message);
    }
}
