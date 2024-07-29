package oe;

public class HospitalStaffServiceImpl implements HospitalStaffService {

    @Autowired
    private RequestRepository requestRepository;
    
    @Autowired
    private RegistrationRepository registrationRepository;
    
    @Autowired
    private RoleRepository roleRepository;

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
    private UserRepository userRepository;
    
    
    
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }
    
 // Role operations
    @Override
    public void addRole(Role role) {
    	System.out.println(role);
        roleRepository.save(role);
        System.out.println("added");
    }

    @Override
    public void deleteRole(String roleName) {
        roleRepository.deleteById(roleName);
    }

    @Override
    public List<Role> getAllRoles() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role getRoleById(String roleName) {
        return roleRepository.findById(roleName).orElse(null);
    }

    @Override
    public void updateRole(Role role) {
        roleRepository.save(role);
    }
    
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

    public List<Availability> getAvailabilityByRegId(String regId) {
        return availabilityRepository.findByRegistration_RegId(regId);
    }
    
    
    // Floor allocation
    @Autowired
    private FloorAllocationRepository floorAllocationRepository;

    @Override
    public void addFloorAllocation(FloorAllocation floorAllocation) {
        floorAllocationRepository.save(floorAllocation);
    }

    @Override
    public void deleteFloorAllocation(String id) {
        floorAllocationRepository.deleteById(id);
    }

    @Override
    public List<FloorAllocation> getAllFloorAllocations() {
        return (List<FloorAllocation>) floorAllocationRepository.findAll();
    }

    @Override
    public Optional<FloorAllocation> getFloorAllocationById(String id) {
        return floorAllocationRepository.findById(id);
    }

    @Override
    public void updateFloorAllocation(FloorAllocation floorAllocation) {
        floorAllocationRepository.save(floorAllocation);
    }
    
    @Autowired
    private PatientAgeGroupRepository patientAgeGroupRepository;

    @Override
    public List<PatientAgeGroup> getAllPatientAgeGroups() {
        return patientAgeGroupRepository.findAll();
    }
    
    @Autowired
    private PatientsThreeYearsCountRepository patientsThreeYearsCountRepository;

    @Override
    public List<PatientsThreeYearsCount> getAllPatientsThreeYearsCounts() {
        return patientsThreeYearsCountRepository.findAll();
    }
}
