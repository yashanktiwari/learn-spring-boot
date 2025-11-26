package com.example.module1.yashank.module1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {

	// Constructor dependency injection is preferred because with it, we can make the variables final (immutable)
//	final NotificationService notificationService;

//	public Module1Application(NotificationService notificationService) {
//		this.notificationService = notificationService; // Constructor dependency injection
//	}

	@Autowired
	Map<String, NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}

	@Override
	public void run(String... args) {
		for(var notificationService : notificationServiceMap.entrySet()) {
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("hello");
		}
	}
}
