
// getters and setters for this class
public class Nurse {
    private Vitals patientVitals;
    private VitalsData vitalsData;

    // now the constructor class
    // Constructor
    public Nurse() {
        this.patientVitals = new Vitals();
        this.vitalsData = new VitalsData();
    }

    // Record patient vitals
    public void recordVitals(String weight, String height, String bodyTemperature, String bloodPressure) {
        patientVitals.setWeight(weight);
        patientVitals.setHeight(height);
        patientVitals.setBodyTemperature(bodyTemperature);
        patientVitals.setBloodPressure(bloodPressure);
    }

    // Store vitals data
    public void storeVitalsData() {
        vitalsData.saveVitals(patientVitals);
    }

    // Get patient vitals
    public Vitals getPatientVitals() {
        return patientVitals;
    }
}

class Vitals {
    private String weight;
    private String height;
    private String bodyTemperature;
    private String bloodPressure;

    // Getters and setters for the vitals
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(String bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}
// added vital data part

class VitalsData {
    // Placeholder for the data storage logic
    public void saveVitals(Vitals vitals) {
        // Implement the logic to save vitals data (e.g., to a file, database, etc.)
    }
}
