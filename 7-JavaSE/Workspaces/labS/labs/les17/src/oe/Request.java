package oe;

import java.sql.Date;

public class Request {
    private String id;
       private String staffId;
       private String name;
       private String email;
       private byte[] photo;
       private String verified;
       private String department;
       private String requestedBy;
       private String availabilityStatus;
       private String requestStatus;
       private Date requestedDate;
       private Date requiredFrom;
       private Date requiredTo;
       private String shift;
       private String comments;

       public Request() {
           super();
       }

       public Request(String id, String staffId, String name, String email, byte[] photo, String verified,
                      String department, String requestedBy, String availabilityStatus, String requestStatus, Date requestedDate,
                      Date requiredFrom, Date requiredTo, String shift, String comments) {
           super();
           this.id = id;
           this.staffId = staffId;
           this.name = name;
           this.email = email;
           this.photo = photo;
           this.verified = verified;
           this.department = department;
           this.requestedBy = requestedBy;
           this.availabilityStatus = availabilityStatus;
           this.requestStatus = requestStatus;
           this.requestedDate = requestedDate;
           this.requiredFrom = requiredFrom;
           this.requiredTo = requiredTo;
           this.shift = shift;
           this.comments = comments;
       }

       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.id = id;
       }

       public String getStaffId() {
           return staffId;
       }

       public void setStaffId(String staffId) {
           this.staffId = staffId;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public byte[] getPhoto() {
           return photo;
       }

       public void setPhoto(byte[] photo) {
           this.photo = photo;
       }

       public String getVerified() {
           return verified;
       }

       public void setVerified(String verified) {
           this.verified = verified;
       }

       public String getDepartment() {
           return department;
       }

       public void setDepartment(String department) {
           this.department = department;
       }

       public String getRequestedBy() {
           return requestedBy;
       }

       public void setRequestedBy(String requestedBy) {
           this.requestedBy = requestedBy;
       }

       public String getAvailabilityStatus() {
           return availabilityStatus;
       }

       public void setAvailabilityStatus(String availabilityStatus) {
           this.availabilityStatus = availabilityStatus;
       }

       public String getRequestStatus() {
           return requestStatus;
       }

       public void setRequestStatus(String requestStatus) {
           this.requestStatus = requestStatus;
       }

       public Date getRequestedDate() {
           return requestedDate;
       }

       public void setRequestedDate(Date requestedDate) {
           this.requestedDate = requestedDate;
       }

       public Date getRequiredFrom() {
           return requiredFrom;
       }

       public void setRequiredFrom(Date requiredFrom) {
           this.requiredFrom = requiredFrom;
       }

       public Date getRequiredTo() {
           return requiredTo;
       }

       public void setRequiredTo(Date requiredTo) {
           this.requiredTo = requiredTo;
       }

       public String getShift() {
           return shift;
       }

       public void setShift(String shift) {
           this.shift = shift;
       }

       public String getComments() {
           return comments;
       }

       public void setComments(String comments) {
           this.comments = comments;
       }

       @Override
       public String toString() {
           return "Request [id=" + id + ", staffId=" + staffId + ", name=" + name + ", email=" + email + ", photo="
                   + Arrays.toString(photo) + ", verified=" + verified + ", department=" + department + ", requestedBy="
                   + requestedBy + ", availabilityStatus=" + availabilityStatus + ", requestStatus=" + requestStatus
                   + ", requestedDate=" + requestedDate + ", requiredFrom=" + requiredFrom + ", requiredTo=" + requiredTo
                   + ", shift=" + shift + ", comments=" + comments + "]";
       }
}
