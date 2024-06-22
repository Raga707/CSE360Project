public class Doctor {
    private MedicalHistory patientMedicalHistory;
    private PatientDetails patientDetails;
    private ExaminationFindings examinationFindings;
    private List<Medication> prescribedMedications;
    private List<Message> messages;
    private RiskFactors patientRiskFactors;
    private List<Note> medicalNotes;

    public MedicalHistory accessMedicalHistory() { return null; }
    public PatientDetails retrievePatientDetails() { return null; }
    public void documentExaminationFindings(ExaminationFindings findings) { }
    public void prescribeMedications(List<Medication> medications) { }
    public void sendMessage(Message message) { }
    public RiskFactors determineRiskFactors() { return null; }
    public void addMedicalNotes(Note note) { }
}
