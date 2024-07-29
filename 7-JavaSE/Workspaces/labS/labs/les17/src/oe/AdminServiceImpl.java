package oe;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

//
    @Autowired
    private AttendanceRepository attendanceRepository;
//
//    // User operations
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
    public List<Attendance> getAllAttendances() {
        return (List<Attendance>) attendanceRepository.findAll();
    }
    
    @Autowired
    private RegistrationRepository registrationRepository;
    
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

    
    // Attendance percentage
    
    @Autowired
    private BarChartAttendanceRepository barChartAttendanceRepository;
    
    @Override
    public List<BarChartAttendance> getAllAttendancePercents() {
    	System.out.println("impl" + barChartAttendanceRepository.findAll());
        return barChartAttendanceRepository.findAll();
    }
    
    @Autowired
    private ShiftAttendanceRepository repository;
    
    @Override
    public List<ShiftAttendance> getAllShiftAttendances() {
        return repository.findAll();
    }
}
