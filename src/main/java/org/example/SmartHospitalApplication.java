
package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SmartHospitalApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(SmartHospitalApplication.class, args);

        PatientAlertProcessor processor =
                context.getBean(PatientAlertProcessor.class);

        processor.displayConfiguration();

        // Routine patient notification
        processor.processRoutineAlert(
                "P001",
                "Your hospital appointment is scheduled for tomorrow."
        );

        // Critical ICU notification
        processor.processEmergencyAlert(
                "P002",
                "Critical ICU alert. Immediate medical attention required."
        );

        context.close();
    }
}
