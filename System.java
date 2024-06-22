public class System {
    private VitalsData recordedVitalsData;
    private PatientDetails patientDetails;
    private List<Prescription> prescriptions;
    private List<Medication> prescribedMedications;
    private ExaminationFindings examinationFindings;
    private List<Message> messages;

    public void storeRecordedVitalsData(VitalsData data) { }
    public void providePatientDetails(PatientDetails data) { }
    public List<Prescription> allowViewPrescriptions() { return null; }
    public void storePrescribedMedications(List<Medication> medications) { }
    public void storeExaminationFindings(ExaminationFindings findings) { }
    public void storeDeliverMessages(List<Message> messages) { }
    public List<Message> allowReceivingMessages() { return null; }
}
