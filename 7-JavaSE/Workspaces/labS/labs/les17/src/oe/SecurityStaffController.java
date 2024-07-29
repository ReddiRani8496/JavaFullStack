package oe;

public class SecurityStaffController {

    @Autowired
    private SecurityStaffService securityStaffService;

    @PostMapping("/addRegistration")
    public void addRegistration(@RequestParam("firstName") String firstName,
                                                        @RequestParam("lastName") String lastName,
                                                        @RequestParam("gender") String gender,
                                                        @RequestParam("email") String email,
                                                        @RequestParam("dateOfBirth") String dateOfBirth,
                                                        @RequestParam("idType") String idType,
                                                        @RequestParam("regType") String regType,
                                                        @RequestParam("specialisation") String specialisation,
                                                        @RequestParam("qualification") String qualification,
                                                        @RequestParam("isExperienced") String isExperienced,
                                                        @RequestParam("yearsOfExperience") String yearsOfExperience,
                                                        @RequestParam("password") String password,
                                                        @RequestParam("photo") MultipartFile photo,
                                                        @RequestParam("govtId") MultipartFile govtId,
                                                        @RequestParam("qualificationDocs") MultipartFile qualificationDocs,
                                                        @RequestParam("experienceDocs") MultipartFile experienceDocs) throws IOException {
        Registration registration = new Registration();
        registration.setFirstName(firstName);
        registration.setLastName(lastName);
        registration.setGender(gender);
        registration.setEmail(email);
        registration.setDateOfBirth(java.sql.Date.valueOf(dateOfBirth));
        registration.setIdType(idType);
        registration.setRegType(regType);
        registration.setSpecialisation(specialisation);
        registration.setQualification(qualification);
        registration.setIsExperienced(isExperienced);
        registration.setYearsOfExperience(yearsOfExperience);
        registration.setIsVerified("false");
        registration.setPhoto(photo.getBytes());
        registration.setPassword(password);
        registration.setGovtId(govtId.getBytes());
        registration.setQualificationDocs(qualificationDocs.getBytes());
        registration.setExperienceDocs(experienceDocs.getBytes());

       securityStaffService.addRegistration(registration);
       
    }

    @DeleteMapping("/deleteRegistration/{id}")
    public void deleteRegistration(@PathVariable String id) {
    	securityStaffService.deleteRegistration(id);
    }

    @GetMapping("/allRegistrations")
    public List<Registration> getAllRegistrations() {
       return securityStaffService.getAllRegistrations();
        
    }

    @GetMapping("/getRegistrationById/{id}")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable String id) {
        Optional<Registration> registration = securityStaffService.getRegistrationById(id);
        return registration.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/updateRegistration")
    public void updateRegistration(@RequestParam("regId") String regId,
                                                           @RequestParam("firstName") String firstName,
                                                           @RequestParam("lastName") String lastName,
                                                           @RequestParam("gender") String gender,
                                                           @RequestParam("email") String email,
                                                           @RequestParam("dateOfBirth") String dateOfBirth,
                                                           @RequestParam("idType") String idType,
                                                           @RequestParam("regType") String regType,
                                                           @RequestParam("specialisation") String specialisation,
                                                           @RequestParam("qualification") String qualification,
                                                           @RequestParam("isExperienced") String isExperienced,
                                                           @RequestParam("password") String password,
                                                           @RequestParam("yearsOfExperience") String yearsOfExperience,
                                                           @RequestParam("isVerified") String isVerified,
                                                           @RequestParam(value = "photo", required = false) MultipartFile photo,
                                                           @RequestParam(value = "govtId", required = false) MultipartFile govtId,
                                                           @RequestParam(value = "qualificationDocs", required = false) MultipartFile qualificationDocs,
                                                           @RequestParam(value = "experienceDocs", required = false) MultipartFile experienceDocs) throws IOException {
        Optional<Registration> optionalRegistration = securityStaffService.getRegistrationById(regId);
        if (optionalRegistration.isPresent()) {
            Registration registration = optionalRegistration.get();
            registration.setFirstName(firstName);
            registration.setLastName(lastName);
            registration.setGender(gender);
            registration.setEmail(email);
            registration.setDateOfBirth(java.sql.Date.valueOf(dateOfBirth));
            registration.setIdType(idType);
            registration.setRegType(regType);
            registration.setSpecialisation(specialisation);
            registration.setQualification(qualification);
            registration.setIsExperienced(isExperienced);
            registration.setYearsOfExperience(yearsOfExperience);
            registration.setIsVerified(isVerified);
            registration.setPassword(password);
            if (photo != null && !photo.isEmpty()) {
                registration.setPhoto(photo.getBytes());
            }
            if (govtId != null && !govtId.isEmpty()) {
                registration.setGovtId(govtId.getBytes());
            }
            if (qualificationDocs != null && !qualificationDocs.isEmpty()) {
                registration.setQualificationDocs(qualificationDocs.getBytes());
            }
            if (experienceDocs != null && !experienceDocs.isEmpty()) {
                registration.setExperienceDocs(experienceDocs.getBytes());
            }
            securityStaffService.updateRegistration(registration);
             
        } else {
             ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/getRegistrationByEmail/{email}")
    public ResponseEntity<Registration> getRegistrationByEmail(@PathVariable("email") String email) {
    	System.out.println(email);
        Optional<Registration> registration = securityStaffService.getRegistrationByEmail(email);
        return registration.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    
    
    // Attendance
    @GetMapping("/allAttendances")
    public List<Attendance> getAllAttendances() {
    	System.out.println("inside controller");
    	List<Attendance> attendanceList = securityStaffService.getAllAttendances();
    	return attendanceList;       
    }
    
    


    @PostMapping("/addPatientRecord")
    public void addPatientRecord(@RequestBody PatientRecords patientRecord) {
    	securityStaffService.addPatientRecord(patientRecord);
    }

    @DeleteMapping("/deletePatientRecord/{id}")
    public ResponseEntity<Void> deletePatientRecord(@PathVariable String id) {
    	securityStaffService.deletePatientRecord(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/allPatientRecords")
    public List<PatientRecords> getAllPatientRecords() {
    	return securityStaffService.getAllPatientRecords();
        
    }

    @GetMapping("/getPatientRecordById/{id}")
    public ResponseEntity<PatientRecords> getPatientRecordById(@PathVariable String id) {
        Optional<PatientRecords> patientRecord = securityStaffService.getPatientRecordById(id);
        return patientRecord.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/updatePatientRecord")
    public void updatePatientRecord(@RequestBody PatientRecords patientRecord) {
    	securityStaffService.updatePatientRecord(patientRecord);

    }
    
    
    // Availability



    @GetMapping("/allAvailabilities")
    public List<Availability> getAllAvailabilities() {
        return securityStaffService.getAllAvailabilities();
        
    }

    @GetMapping("/getAvailabilityById/{id}")
    public ResponseEntity<Availability> getAvailabilityById(@PathVariable String id) {
        Optional<Availability> availability = securityStaffService.getAvailabilityById(id);
        return availability.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/addAvailability")
    public void addAvailability(@RequestBody List<Availability> availabilities) {
        availabilities.forEach(availability -> securityStaffService.addAvailability(availability));
    }

    @PutMapping("/updateAvailability")
    public void updateAvailability(@RequestBody Availability availability) {
        securityStaffService.updateAvailability(availability);
    }

    @DeleteMapping("/deleteAvailability/{id}")
    public void deleteAvailability(@PathVariable String id) {
        securityStaffService.deleteAvailability(id);
    }
    
    
    @PostMapping("/addRequest")
    public void addRequest(@RequestParam("staffId") String staffId,
                           @RequestParam("name") String name,
                           @RequestParam("email") String email,
                           @RequestParam("verified") String verified,
                           @RequestParam("department") String department,
                           @RequestParam("requestedBy") String requestedBy,
                           @RequestParam("availabilityStatus") String availabilityStatus,
                           @RequestParam("requestStatus") String requestStatus,
                           @RequestParam("requestedDate") String requestedDate,
                           @RequestParam("requiredFrom") String requiredFrom,
                           @RequestParam("requiredTo") String requiredTo,
                           @RequestParam("shift") String shift,
                           @RequestParam("comments") String comments,
                           @RequestParam(value = "photo", required = false) MultipartFile photo) throws IOException {
        Request request = new Request();
        request.setStaffId(staffId);
        request.setName(name);
        request.setEmail(email);
        request.setVerified(verified);
        request.setDepartment(department);
        request.setRequestedBy(requestedBy);
        request.setAvailabilityStatus(availabilityStatus);
        request.setRequestStatus(requestStatus);
        request.setRequestedDate(java.sql.Date.valueOf(requestedDate));
        request.setRequiredFrom(java.sql.Date.valueOf(requiredFrom));
        request.setRequiredTo(java.sql.Date.valueOf(requiredTo));
        request.setShift(shift);
        request.setComments(comments);
        
        if (photo != null && !photo.isEmpty()) {
            request.setPhoto(photo.getBytes());
        }
        System.out.println("Controller method");
        securityStaffService.addRequest(request);
    }

    @DeleteMapping("/deleteRequest/{id}")
    public ResponseEntity<Void> deleteRequest(@PathVariable String id) {
    	securityStaffService.deleteRequest(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/allRequests")
    public ResponseEntity<List<Request>> getAllRequests() {
        List<Request> requests = securityStaffService.getAllRequests();
        return ResponseEntity.ok(requests);
    }

    @GetMapping("/getRequestById/{id}")
    public ResponseEntity<Request> getRequestById(@PathVariable String id) {
        Optional<Request> request = securityStaffService.getRequestById(id);
        return request.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    
    @PutMapping("/updateRequest")
    public ResponseEntity<Void> updateRequest(@RequestBody UpdateRequestDTO requestDTO) throws IOException {
        System.out.println("inside update request " + requestDTO.getId());
        Optional<Request> optionalRequest = securityStaffService.getRequestById(requestDTO.getId());
        if (optionalRequest.isPresent()) {
            Request request = optionalRequest.get();
            request.setStaffId(requestDTO.getStaffId());
            request.setName(requestDTO.getName());
            request.setEmail(requestDTO.getEmail());
            request.setVerified(requestDTO.getVerified());
            request.setDepartment(requestDTO.getDepartment());
            request.setRequestedBy(requestDTO.getRequestedBy());
            request.setAvailabilityStatus(requestDTO.getAvailabilityStatus());
            request.setRequestStatus(requestDTO.getRequestStatus());
            request.setRequestedDate(java.sql.Date.valueOf(requestDTO.getRequestedDate()));
            request.setRequiredFrom(java.sql.Date.valueOf(requestDTO.getRequiredFrom()));
            request.setRequiredTo(java.sql.Date.valueOf(requestDTO.getRequiredTo()));
            request.setShift(requestDTO.getShift());
            request.setComments(requestDTO.getComments());
            if (requestDTO.getPhoto() != null && requestDTO.getPhoto().length > 0) {
                request.setPhoto(requestDTO.getPhoto());
            }
            securityStaffService.updateRequest(request);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    // Ratings
    @GetMapping("/allRatings")
    public List<Rating> getAllRatings() {
        return securityStaffService.getAllRatings();
    }
    
    @GetMapping("/attendancePercentage")
    public List<BarChartAttendance> getAllAttendancePercentages() {
    	System.out.println("controller"+securityStaffService.getAllAttendancePercents());
    	return securityStaffService.getAllAttendancePercents();
    }
    
    // Requests
    @GetMapping("/hospitalRequests")
    public List<HospitalRequest> getAllHospitalRequests() {
        return securityStaffService.getAllHospitalRequests();
    }
    
}

