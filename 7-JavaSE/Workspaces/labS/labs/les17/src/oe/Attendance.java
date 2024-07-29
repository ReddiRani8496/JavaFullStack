package oe;

import java.sql.Date;

public class Attendance {
    private String id;
      private String name;
      private String email;
      private String role;
      private String hospitalName;
      private Date attendedDate;
      private String status;

      public Attendance() {
          super();
      }

      public Attendance(String id, String name, String email, String role, String hospitalName, Date attendedDate,
                        String status) {
          super();
          this.id = id;
          this.name = name;
          this.email = email;
          this.role = role;
          this.hospitalName = hospitalName;
          this.attendedDate = attendedDate;
          this.status = status;
      }

      @Override
      public String toString() {
          return "Attendance [id=" + id + ", name=" + name + ", email=" + email + ", role=" + role + ", hospitalName="
                  + hospitalName + ", attendedDate=" + attendedDate + ", status=" + status + "]";
      }

      public String getId() {
          return id;
      }

      public void setId(String id) {
          this.id = id;
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

      public String getRole() {
          return role;
      }

      public void setRole(String role) {
          this.role = role;
      }

      public String getHospitalName() {
          return hospitalName;
      }

      public void setHospitalName(String hospitalName) {
          this.hospitalName = hospitalName;
      }

      public Date getAttendedDate() {
          return attendedDate;
      }

      public void setAttendedDate(Date attendedDate) {
          this.attendedDate = attendedDate;
      }

      public String getStatus() {
          return status;
      }

      public void setStatus(String status) {
          this.status = status;
      }
}
