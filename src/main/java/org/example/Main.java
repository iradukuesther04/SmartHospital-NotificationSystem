package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ConfigurableApplicationContext context =
                SpringApplication.run(SmartHospitalApplication.class, args);

        PatientAlertProcessor processor =
                context.getBean(PatientAlertProcessor.class);

        processor.displayConfiguration();

        processor.processRoutineAlert(
                "P001",
                "Your hospital appointment is scheduled for tomorrow."
        );

        processor.processEmergencyAlert(
                "P002",
                "Critical ICU alert. Immediate medical attention required."
        );

        context.close();
        }
    }
