package org.example;

import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyUrgentNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {

        System.out.println(" EMERGENCY ICU ALERT ");
        System.out.println("Patient ID: " + patientId);
        System.out.println("URGENT MESSAGE: " + message);
    }
}
