package oe;

import java.sql.Date;

public class FloorAllocation {
    private String id;
        private String isAllocated;
        private String floorNumber;
        private Registration registration;
        private String name;
        private String department;
        private Date effectiveDate;
        private Date endDate;
        private String shift;

        public FloorAllocation() {
            super();
        }

        public FloorAllocation(String id, String isAllocated, String floorNumber, Registration registration, String name,
                               String department, Date effectiveDate, Date endDate, String shift) {
            super();
            this.id = id;
            this.isAllocated = isAllocated;
            this.floorNumber = floorNumber;
            this.registration = registration;
            this.name = name;
            this.department = department;
            this.effectiveDate = effectiveDate;
            this.endDate = endDate;
            this.shift = shift;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsAllocated() {
            return isAllocated;
        }

        public void setIsAllocated(String isAllocated) {
            this.isAllocated = isAllocated;
        }

        public String getFloorNumber() {
            return floorNumber;
        }

        public void setFloorNumber(String floorNumber) {
            this.floorNumber = floorNumber;
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

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Date getEffectiveDate() {
            return effectiveDate;
        }

        public void setEffectiveDate(Date effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public Date getEndDate() {
            return endDate;
        }

        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }

        public String getShift() {
            return shift;
        }

        public void setShift(String shift) {
            this.shift = shift;
        }

        @Override
        public String toString() {
            return "FloorAllocation [id=" + id + ", isAllocated=" + isAllocated + ", floorNumber=" + floorNumber
                    + ", registration=" + registration + ", name=" + name + ", department=" + department
                    + ", effectiveDate=" + effectiveDate + ", endDate=" + endDate + ", shift=" + shift + "]";
        }
}
