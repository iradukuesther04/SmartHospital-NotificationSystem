package org.example;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {

        System.out.println("SMS NOTIFICATION");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);
    }
}
