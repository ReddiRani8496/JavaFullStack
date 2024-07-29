package oe;

public class SupportingStaffServiceImpl implements SecurityStaffService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;
    
    @Autowired
    private RequestRepository requestRepository;
    
    // Registration
    
    @Override
    public void addRegistration(Registration registration) {
        registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(String regId) {
        registrationRepository.deleteById(regId);
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public Optional<Registration> getRegistrationById(String regId) {
        return registrationRepository.findById(regId);
    }

    @Override
    public void updateRegistration(Registration registration) {
        registrationRepository.save(registration);
    }
    
    @Override
    public Optional<Registration> getRegistrationByEmail(String email) {
        return registrationRepository.findByEmail(email);
    }
    
   
    // Attendance
   
    @Override
    public List<Attendance> getAllAttendances() {
    	System.out.println("service method");
    	return (List<Attendance>)attendanceRepository.findAll();
    }
    
    
    // Patient Records
    
    @Autowired
    private PatientRecordsRepository patientRecordsRepository;

    @Override
    public void addPatientRecord(PatientRecords patientRecord) {
        patientRecordsRepository.save(patientRecord);
    }

    @Override
    public void deletePatientRecord(String recordId) {
        patientRecordsRepository.deleteById(recordId);
    }

    @Override
    public List<PatientRecords> getAllPatientRecords() {
        return (List<PatientRecords>) patientRecordsRepository.findAll();
    }

    @Override
    public Optional<PatientRecords> getPatientRecordById(String recordId) {
        return patientRecordsRepository.findById(recordId);
    }

    @Override
    public void updatePatientRecord(PatientRecords patientRecord) {
        patientRecordsRepository.save(patientRecord);
    }
    
    // Availability
    @Autowired
    private AvailabilityRepository availabilityRepository;

    @Override
    public void addAvailability(Availability availability) {
        availabilityRepository.save(availability);
    }

    @Override
    public void deleteAvailability(String id) {
        availabilityRepository.deleteById(id);
    }

    @Override
    public List<Availability> getAllAvailabilities() {
        return (List<Availability>) availabilityRepository.findAll();
    }

    @Override
    public Optional<Availability> getAvailabilityById(String id) {
        return availabilityRepository.findById(id);
    }

    @Override
    public void updateAvailability(Availability availability) {
        availabilityRepository.save(availability);
    }
    
    @Override
    public void addRequest(Request request) {
        requestRepository.save(request);
    }

    @Override
    public void deleteRequest(String requestId) {
        requestRepository.deleteById(requestId);
    }

    @Override
    public List<Request> getAllRequests() {
        return (List<Request>) requestRepository.findAll();
    }

    @Override
    public Optional<Request> getRequestById(String requestId) {
        return requestRepository.findById(requestId);
    }

    @Override
    public void updateRequest(Request request) {
        requestRepository.save(request);
    }
    
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
    
    @Autowired
    private BarChartAttendanceRepository barChartAttendanceRepository;
    
    @Override
    public List<BarChartAttendance> getAllAttendancePercents() {
    	System.out.println("impl" + barChartAttendanceRepository.findAll());
        return barChartAttendanceRepository.findAll();
    }
    
    // Requests for dashboard
    
    @Autowired
    private HospitalRequestRepository hospitalRequestRepository;

    @Override
    public List<HospitalRequest> getAllHospitalRequests() {
        return hospitalRequestRepository.findAll();
    }
    
   
}

