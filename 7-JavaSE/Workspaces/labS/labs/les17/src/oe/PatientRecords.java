package oe;

import java.sql.Date;

public class PatientRecords {
    private String recordId;
        private String patientId;
        private String nurseId;
        private String patientName;
        private Date dateOfBirth;
        private String gender;
        private String contact;
        private String nurseName;
        private String nurseEmail;
        private String medicalHistory;
        private String treatmentPlan;
        private String notes;
        private String condition;

        public PatientRecords() {
            super();
        }

        public PatientRecords(String recordId, String patientId, String nurseId, String patientName, Date dateOfBirth,
                              String gender, String contact, String nurseName, String nurseEmail, String medicalHistory,
                              String treatmentPlan, String notes, String condition) {
            super();
            this.recordId = recordId;
            this.patientId = patientId;
            this.nurseId = nurseId;
            this.patientName = patientName;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.contact = contact;
            this.nurseName = nurseName;
            this.nurseEmail = nurseEmail;
            this.medicalHistory = medicalHistory;
            this.treatmentPlan = treatmentPlan;
            this.notes = notes;
            this.condition = condition;
        }

        public String getRecordId() {
            return recordId;
        }

        public void setRecordId(String recordId) {
            this.recordId = recordId;
        }

        public String getPatientId() {
            return patientId;
        }

        public void setPatientId(String patientId) {
            this.patientId = patientId;
        }

        public String getNurseId() {
            return nurseId;
        }

        public void setNurseId(String nurseId) {
            this.nurseId = nurseId;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getNurseName() {
            return nurseName;
        }

        public void setNurseName(String nurseName) {
            this.nurseName = nurseName;
        }

        public String getNurseEmail() {
            return nurseEmail;
        }

        public void setNurseEmail(String nurseEmail) {
            this.nurseEmail = nurseEmail;
        }

        public String getMedicalHistory() {
            return medicalHistory;
        }

        public void setMedicalHistory(String medicalHistory) {
            this.medicalHistory = medicalHistory;
        }

        public String getTreatmentPlan() {
            return treatmentPlan;
        }

        public void setTreatmentPlan(String treatmentPlan) {
            this.treatmentPlan = treatmentPlan;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        @Override
        public String toString() {
            return "PatientRecords [recordId=" + recordId + ", patientId=" + patientId + ", nurseId=" + nurseId
                    + ", patientName=" + patientName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", contact="
                    + contact + ", nurseName=" + nurseName + ", nurseEmail=" + nurseEmail + ", medicalHistory="
                    + medicalHistory + ", treatmentPlan=" + treatmentPlan + ", notes=" + notes + ", condition=" + condition
                    + "]";
        }
}
