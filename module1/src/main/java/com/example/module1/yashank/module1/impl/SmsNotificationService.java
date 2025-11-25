package com.example.module1.yashank.module1.impl;

import com.example.module1.yashank.module1.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending... " + message);
    }
}
