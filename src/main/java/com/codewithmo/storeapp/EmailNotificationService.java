package com.codewithmo.storeapp;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService  implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("msg has been sent using Email service");
    }
}
