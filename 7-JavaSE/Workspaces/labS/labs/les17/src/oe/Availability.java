package oe;

import java.sql.Date;

public class Availability {
    private String id;
       private Registration registration;
       private String name;
       private String specialisation;
       private String isAvailable;
       private Date availableFrom;
       private Date availableTo;

       public Availability() {
           super();
       }

       public Availability(String id, Registration registration, String name, String specialisation, String isAvailable,
                           Date availableFrom, Date availableTo) {
           super();
           this.id = id;
           this.registration = registration;
           this.name = name;
           this.specialisation = specialisation;
           this.isAvailable = isAvailable;
           this.availableFrom = availableFrom;
           this.availableTo = availableTo;
       }

       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.id = id;
       }

       public Registration getRegistration() {
           return registration;
       }

       public void setRegistration(Registration registration) {
           this.registration = registration;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getSpecialisation() {
           return specialisation;
       }

       public void setSpecialisation(String specialisation) {
           this.specialisation = specialisation;
       }

       public String getIsAvailable() {
           return isAvailable;
       }

       public void setIsAvailable(String isAvailable) {
           this.isAvailable = isAvailable;
       }

       public Date getAvailableFrom() {
           return availableFrom;
       }

       public void setAvailableFrom(Date availableFrom) {
           this.availableFrom = availableFrom;
       }

       public Date getAvailableTo() {
           return availableTo;
       }

       public void setAvailableTo(Date availableTo) {
           this.availableTo = availableTo;
       }

       @Override
       public String toString() {
           return "Availability [id=" + id + ", registration=" + registration + ", name=" + name + ", specialisation="
                   + specialisation + ", isAvailable=" + isAvailable + ", availableFrom=" + availableFrom
                   + ", availableTo=" + availableTo + "]";
       }
}
