package oe;

public class HospitalStaffController {

    @Autowired
    private HospitalStaffService requestService;
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
        requestService.addRequest(request);
    }

    @DeleteMapping("/deleteRequest/{id}")
    public ResponseEntity<Void> deleteRequest(@PathVariable String id) {
        requestService.deleteRequest(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/allRequests")
    public ResponseEntity<List<Request>> getAllRequests() {
        List<Request> requests = requestService.getAllRequests();
        return ResponseEntity.ok(requests);
    }

    @GetMapping("/getRequestById/{id}")
    public ResponseEntity<Request> getRequestById(@PathVariable String id) {
        Optional<Request> request = requestService.getRequestById(id);
        return request.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/updateRequest")
    public void updateRequest(@RequestParam("id") String id,
                                                 @RequestParam("staffId") String staffId,
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
        Optional<Request> optionalRequest = requestService.getRequestById(id);
        if (optionalRequest.isPresent()) {
            Request request = optionalRequest.get();
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
            requestService.updateRequest(request);
           
        } else {
            ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/addUser")
    public void addUser(@RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName,
                        @RequestParam("role") String roleName,
                        @RequestParam("email") String email,
                        @RequestParam("photo") MultipartFile photo) throws IOException {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setRole(requestService.getRoleById(roleName));
        user.setEmail(email);
        user.setPhoto(photo.getBytes());

        requestService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable String id) {
    	requestService.deleteUser(id);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return requestService.getAllUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable String id) {
        return requestService.getUserById(id);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestParam("id") String id,
                           @RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("role") String roleName,
                           @RequestParam("email") String email,
                           @RequestParam(value = "photo", required = false) MultipartFile photo) throws IOException {
        User user = requestService.getUserById(id);
        if (user != null) {
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setRole(requestService.getRoleById(roleName));
            user.setEmail(email);
            if (photo != null && !photo.isEmpty()) {
                user.setPhoto(photo.getBytes());
            }
            requestService.updateUser(user);
        }
    }

    @PostMapping("/addRole")
    public void addRole(@RequestBody Role role) {
    	requestService.addRole(role);
    }

    @DeleteMapping("/deleteRole/{roleName}")
    public void deleteRole(@PathVariable String roleName) {
    	requestService.deleteRole(roleName);
    }

    @GetMapping("/getRoles")
    public List<Role> getAllRoles() {
        return requestService.getAllRoles();
    }

    @GetMapping("/getRoleById/{name}")
    public Role getRoleById(@PathVariable String name) {
        return requestService.getRoleById(name);
    }

    @PutMapping("/updateRole")
    public void updateRole(@RequestBody Role role) {
    	requestService.updateRole(role);
    }
    
    
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

        requestService.addRegistration(registration);
       
    }

    @DeleteMapping("/deleteRegistration/{id}")
    public void deleteRegistration(@PathVariable String id) {
    	requestService.deleteRegistration(id);
    }

    @GetMapping("/allRegistrations")
    public List<Registration> getAllRegistrations() {
       return requestService.getAllRegistrations();
        
    }

    @GetMapping("/getRegistrationById/{id}")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable String id) {
        Optional<Registration> registration = requestService.getRegistrationById(id);
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
        Optional<Registration> optionalRegistration = requestService.getRegistrationById(regId);
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
            requestService.updateRegistration(registration);
             
        } else {
             ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/allAvailabilities")
    public List<Availability> getAllAvailabilities() {
        return requestService.getAllAvailabilities();
        
    }

    @GetMapping("/getAvailabilityById/{id}")
    public ResponseEntity<Availability> getAvailabilityById(@PathVariable String id) {
        Optional<Availability> availability = requestService.getAvailabilityById(id);
        return availability.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/addAvailability")
    public void addAvailability(@RequestBody List<Availability> availabilities) {
        availabilities.forEach(availability -> requestService.addAvailability(availability));
    }

    @PutMapping("/updateAvailability")
    public void updateAvailability(@RequestBody Availability availability) {
    	requestService.updateAvailability(availability);
    }

    @DeleteMapping("/deleteAvailability/{id}")
    public void deleteAvailability(@PathVariable String id) {
    	requestService.deleteAvailability(id);
    }
    
    @GetMapping("/getByRegId/{regId}")
    public List<Availability> getAvailabilityByRegId(@PathVariable String regId) {
        return requestService.getAvailabilityByRegId(regId);
    }
    
    
    
    // Floor allocation
    @PostMapping("/allocateFloor")
    public void addFloorAllocation(@RequestBody FloorAllocation floorAllocation) {
    	requestService.addFloorAllocation(floorAllocation);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFloorAllocation(@PathVariable String id) {
    	requestService.deleteFloorAllocation(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/allAllocatedFloors")
    public List<FloorAllocation> getAllFloorAllocations() {
        return requestService.getAllFloorAllocations();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<FloorAllocation> getFloorAllocationById(@PathVariable String id) {
        Optional<FloorAllocation> floorAllocation = requestService.getFloorAllocationById(id);
        return floorAllocation.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/updateAllocatedFloor")
    public void updateFloorAllocation(@RequestBody FloorAllocation floorAllocation) {
    	requestService.updateFloorAllocation(floorAllocation);
    }
    
    
    @GetMapping("/patientAgeGroup")
    public List<PatientAgeGroup> getAllPatientAgeGroups() {
        return requestService.getAllPatientAgeGroups();
    } 
    
    @GetMapping("/patientsCount")
    public List<PatientsThreeYearsCount> getAllPatientsThreeYearsCounts() {
        return requestService.getAllPatientsThreeYearsCounts();
    }
    
    
}