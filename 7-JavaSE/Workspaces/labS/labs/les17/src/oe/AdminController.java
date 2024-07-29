package oe;

public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addUser")
    public void addUser(@RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName,
                        @RequestParam("role") String roleName,
                        @RequestParam("email") String email,
                        @RequestParam("photo") MultipartFile photo) throws IOException {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setRole(adminService.getRoleById(roleName));
        user.setEmail(email);
        user.setPhoto(photo.getBytes());

        adminService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable String id) {
        adminService.deleteUser(id);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
    	System.out.println(adminService.getAllUsers());
        return adminService.getAllUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable String id) {
        return adminService.getUserById(id);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestParam("id") String id,
                           @RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("role") String roleName,
                           @RequestParam("email") String email,
                           @RequestParam(value = "photo", required = false) MultipartFile photo) throws IOException {
        User user = adminService.getUserById(id);
        if (user != null) {
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setRole(adminService.getRoleById(roleName));
            user.setEmail(email);
            if (photo != null && !photo.isEmpty()) {
                user.setPhoto(photo.getBytes());
            }
            adminService.updateUser(user);
        }
    }

    @PostMapping("/addRole")
    public void addRole(@RequestBody Role role) {
        adminService.addRole(role);
    }

    @DeleteMapping("/deleteRole/{roleName}")
    public void deleteRole(@PathVariable String roleName) {
        adminService.deleteRole(roleName);
    }

    @GetMapping("/getRoles")
    public List<Role> getAllRoles() {
        return adminService.getAllRoles();
    }

    @GetMapping("/getRoleById/{name}")
    public Role getRoleById(@PathVariable String name) {
        return adminService.getRoleById(name);
    }

    @PutMapping("/updateRole")
    public void updateRole(@RequestBody Role role) {
        adminService.updateRole(role);
    }
    
    @GetMapping("/attendance")
    public List<Attendance> getAllAttendances() {
        return adminService.getAllAttendances();
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

        adminService.addRegistration(registration);
       
    }

    @DeleteMapping("/deleteRegistration/{id}")
    public void deleteRegistration(@PathVariable String id) {
    	adminService.deleteRegistration(id);
    }

    @GetMapping("/allRegistrations")
    public List<Registration> getAllRegistrations() {
    
       return adminService.getAllRegistrations();
        
    }

    @GetMapping("/getRegistrationById/{id}")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable String id) {
        Optional<Registration> registration = adminService.getRegistrationById(id);
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
        Optional<Registration> optionalRegistration = adminService.getRegistrationById(regId);
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
            adminService.updateRegistration(registration);
             
        } else {
             ResponseEntity.notFound().build();
        }
    }
    
    
    // Bar chart attendance
    @GetMapping("/attendancePercentage")
    public List<BarChartAttendance> getAllAttendancePercentages() {
    	System.out.println("controller"+adminService.getAllAttendancePercents());
    	return adminService.getAllAttendancePercents();
    }
    
    @Autowired
    private AdminService service;

    @GetMapping("/shiftAttendance")
    public List<ShiftAttendance> getAllShiftAttendances() {
        return service.getAllShiftAttendances();
    }
    
}
