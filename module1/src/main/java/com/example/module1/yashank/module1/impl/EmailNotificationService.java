package com.example.module1.yashank.module1.impl;

import com.example.module1.yashank.module1.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sending... " + message);
    }
}
