package oe;

public interface HospitalStaffService {
    
	// Request service
    void addRequest(Request request);
    void deleteRequest(String requestId);
    List<Request> getAllRequests();
    Optional<Request> getRequestById(String requestId);
    void updateRequest(Request request);
    
    //login
    void addUser(User user);
    void deleteUser(String userId);
    List<User> getAllUsers();
    User getUserById(String userId);
    void updateUser(User user);
    
 // Role operations
    void addRole(Role role);
    void deleteRole(String roleName);
    List<Role> getAllRoles();
    Role getRoleById(String roleName);
    void updateRole(Role role);
    
    
 // Availability
    
    void addAvailability(Availability availability);
    void deleteAvailability(String id);
    List<Availability> getAllAvailabilities();
    Optional<Availability> getAvailabilityById(String id);
    void updateAvailability(Availability availability);
    public List<Availability> getAvailabilityByRegId(String regId);
    
    
    //Registration
    void addRegistration(Registration registration);
    void deleteRegistration(String regId);
    List<Registration> getAllRegistrations();
    Optional<Registration> getRegistrationById(String regId);
    void updateRegistration(Registration registration);
    
    // Floor Allocation
    void addFloorAllocation(FloorAllocation floorAllocation);
    void deleteFloorAllocation(String id);
    List<FloorAllocation> getAllFloorAllocations();
    Optional<FloorAllocation> getFloorAllocationById(String id);
    void updateFloorAllocation(FloorAllocation floorAllocation);
 
    //Patient Age group
    List<PatientAgeGroup> getAllPatientAgeGroups();
    
    // patient 3 years comparision
    List<PatientsThreeYearsCount> getAllPatientsThreeYearsCounts();
}
