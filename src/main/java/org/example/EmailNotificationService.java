package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {

        System.out.println("EMAIL NOTIFICATION");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);
    }
}
