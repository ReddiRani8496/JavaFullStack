package oe;

public interface SupportingStaffService {
	
	//Registration
    void addRegistration(Registration registration);
    void deleteRegistration(String regId);
    List<Registration> getAllRegistrations();
    Optional<Registration> getRegistrationById(String regId);
    void updateRegistration(Registration registration);
    Optional<Registration> getRegistrationByEmail(String email);
    
    
    // Attendance
   
    List<Attendance> getAllAttendances();
   
    // Patient Records
    void addPatientRecord(PatientRecords patientRecord);
    void deletePatientRecord(String recordId);
    List<PatientRecords> getAllPatientRecords();
    Optional<PatientRecords> getPatientRecordById(String recordId);
    void updatePatientRecord(PatientRecords patientRecord);
 
    
    // Availability
    
    void addAvailability(Availability availability);
    void deleteAvailability(String id);
    List<Availability> getAllAvailabilities();
    Optional<Availability> getAvailabilityById(String id);
    void updateAvailability(Availability availability);
    
	// Request service
    void addRequest(Request request);
    void deleteRequest(String requestId);
    List<Request> getAllRequests();
    Optional<Request> getRequestById(String requestId);
    void updateRequest(Request request);
    
    
    // Rating
    List<Rating> getAllRatings();
    
 // Bar chart Attendance
    List<BarChartAttendance> getAllAttendancePercents();
    
    // Request Dashboard
    List<HospitalRequest> getAllHospitalRequests();

}

