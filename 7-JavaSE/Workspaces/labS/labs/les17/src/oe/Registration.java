package oe;

import java.sql.Date;

public class Registration {
    private String regId;
       private String firstName;
       private String lastName;
       private String gender;
       private byte[] photo;
       private String email;
       private Date dateOfBirth;
       private String idType;
       private byte[] govtId;
       private String regType;
       private String specialisation;
       private String qualification;
       private byte[] qualificationDocs;
       private String isExperienced;
       private String yearsOfExperience;
       private byte[] experienceDocs;
       private String isVerified;
       private String password;

       public Registration() {
           super();
       }

       public Registration(String regId, String firstName, String lastName, String gender, byte[] photo, String email,
                           Date dateOfBirth, String idType, byte[] govtId, String regType, String specialisation, String qualification,
                           byte[] qualificationDocs, String isExperienced, String yearsOfExperience, byte[] experienceDocs,
                           String isVerified, String password) {
           super();
           this.regId = regId;
           this.firstName = firstName;
           this.lastName = lastName;
           this.gender = gender;
           this.photo = photo;
           this.email = email;
           this.dateOfBirth = dateOfBirth;
           this.idType = idType;
           this.govtId = govtId;
           this.regType = regType;
           this.specialisation = specialisation;
           this.qualification = qualification;
           this.qualificationDocs = qualificationDocs;
           this.isExperienced = isExperienced;
           this.yearsOfExperience = yearsOfExperience;
           this.experienceDocs = experienceDocs;
           this.isVerified = isVerified;
           this.password = password;
       }

       public String getRegId() {
           return regId;
       }

       public void setRegId(String regId) {
           this.regId = regId;
       }

       public String getFirstName() {
           return firstName;
       }

       public void setFirstName(String firstName) {
           this.firstName = firstName;
       }

       public String getLastName() {
           return lastName;
       }

       public void setLastName(String lastName) {
           this.lastName = lastName;
       }

       public String getGender() {
           return gender;
       }

       public void setGender(String gender) {
           this.gender = gender;
       }

       public byte[] getPhoto() {
           return photo;
       }

       public void setPhoto(byte[] photo) {
           this.photo = photo;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public Date getDateOfBirth() {
           return dateOfBirth;
       }

       public void setDateOfBirth(Date dateOfBirth) {
           this.dateOfBirth = dateOfBirth;
       }

       public String getIdType() {
           return idType;
       }

       public void setIdType(String idType) {
           this.idType = idType;
       }

       public byte[] getGovtId() {
           return govtId;
       }

       public void setGovtId(byte[] govtId) {
           this.govtId = govtId;
       }

       public String getRegType() {
           return regType;
       }

       public void setRegType(String regType) {
           this.regType = regType;
       }

       public String getSpecialisation() {
           return specialisation;
       }

       public void setSpecialisation(String specialisation) {
           this.specialisation = specialisation;
       }

       public String getQualification() {
           return qualification;
       }

       public void setQualification(String qualification) {
           this.qualification = qualification;
       }

       public byte[] getQualificationDocs() {
           return qualificationDocs;
       }

       public void setQualificationDocs(byte[] qualificationDocs) {
           this.qualificationDocs = qualificationDocs;
       }

       public String getIsExperienced() {
           return isExperienced;
       }

       public void setIsExperienced(String isExperienced) {
           this.isExperienced = isExperienced;
       }

       public String getYearsOfExperience() {
           return yearsOfExperience;
       }

       public void setYearsOfExperience(String yearsOfExperience) {
           this.yearsOfExperience = yearsOfExperience;
       }

       public byte[] getExperienceDocs() {
           return experienceDocs;
       }

       public void setExperienceDocs(byte[] experienceDocs) {
           this.experienceDocs = experienceDocs;
       }

       public String getIsVerified() {
           return isVerified;
       }

       public void setIsVerified(String isVerified) {
           this.isVerified = isVerified;
       }

       public String getPassword() {
           return password;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       @Override
       public String toString() {
           return "Registration [regId=" + regId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
                   + gender + ", photo=" + Arrays.toString(photo) + ", email=" + email + ", dateOfBirth=" + dateOfBirth
                   + ", idType=" + idType + ", govtId=" + Arrays.toString(govtId) + ", regType=" + regType
                   + ", specialisation=" + specialisation + ", qualification=" + qualification + ", qualificationDocs="
                   + Arrays.toString(qualificationDocs) + ", isExperienced=" + isExperienced + ", yearsOfExperience="
                   + yearsOfExperience + ", experienceDocs=" + Arrays.toString(experienceDocs) + ", isVerified="
                   + isVerified + ", password=" + password + "]";
       }
}
