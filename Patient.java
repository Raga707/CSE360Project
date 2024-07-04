public class Patient {
    private PersonalInformation personalInformation;
    private AppointmentDetails appointmentDetails;
    private HealthRecords healthRecords;

    // Constructor
    public Patient() {
        this.personalInformation = new PersonalInformation();
        this.appointmentDetails = new AppointmentDetails();
        this.healthRecords = new HealthRecords();
    }

    // Provide or update personal information
    public void providePersonalInformation(String name, String age, String address, String contactInfo) {
        personalInformation.setName(name);
        personalInformation.setAge(age);
        personalInformation.setAddress(address);
        personalInformation.setContactInfo(contactInfo);
    }

    // Confirm appointment details
    public void confirmAppointmentDetails(String appointmentDate, String appointmentTime, String reason) {
        appointmentDetails.setAppointmentDate(appointmentDate);
        appointmentDetails.setAppointmentTime(appointmentTime);
        appointmentDetails.setReason(reason);
    }

    // View health records
    public HealthRecords viewHealthRecords() {
        return healthRecords;
    }
}

class PersonalInformation {
    private String name;
    private String age;
    private String address;
    private String contactInfo;

    // Getters and setters for personal information
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}

class AppointmentDetails {
    private String appointmentDate;
    private String appointmentTime;
    private String reason;

    // Getters and setters for appointment details
    public String getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(String appointmentDate) { this.appointmentDate = appointmentDate; }

    public String getAppointmentTime() { return appointmentTime; }
    public void setAppointmentTime(String appointmentTime) { this.appointmentTime = appointmentTime; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}

class HealthRecords {
    // Placeholder for health records logic
}

// correct
