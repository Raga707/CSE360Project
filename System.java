public class System {
    // Private fields to store different aspects of the system's data
    private VitalsData recordedVitalsData; // Stores recorded vitals data of patients
    private PatientDetails patientDetails; // Stores patient details
    private List<Prescription> prescriptions; // Stores a list of prescriptions
    private List<Medication> prescribedMedications; // Stores a list of prescribed medications
    private ExaminationFindings examinationFindings; // Stores examination findings
    private List<Message> messages; // Stores messages

    // Method to store recorded vitals data
    public void storeRecordedVitalsData(VitalsData data) {
        this.recordedVitalsData = data;
    }

    // Method to provide patient details
    public void providePatientDetails(PatientDetails data) {
        this.patientDetails = data;
    }

    // Method to allow viewing of prescriptions
    public List<Prescription> allowViewPrescriptions() {
        return this.prescriptions;
    }

    // Method to store prescribed medications
    public void storePrescribedMedications(List<Medication> medications) {
        this.prescribedMedications = medications;
    }

    // Method to store examination findings
    public void storeExaminationFindings(ExaminationFindings findings) {
        this.examinationFindings = findings;
    }

    // Method to store and deliver messages
    public void storeDeliverMessages(List<Message> messages) {
        this.messages = messages;
    }

    // Method to allow receiving messages
    public List<Message> allowReceivingMessages() {
        return this.messages;
    }
}
