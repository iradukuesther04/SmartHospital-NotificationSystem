package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    @Qualifier("emergencyService")
    private NotificationService emergencyService;

    @Value("${hospital.name:Kacyiru Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET}")
    private String apiSecret;

    public void processRoutineAlert(String patientId, String message) {

        System.out.println("Hospital: " + hospitalName);

        notificationService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {

        System.out.println("Hospital: " + hospitalName);

        emergencyService.sendNotification(patientId, message);
    }

    public void displayConfiguration() {

        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("API Secret Loaded: " +
                (apiSecret != null && !apiSecret.isBlank()));
    }
}
