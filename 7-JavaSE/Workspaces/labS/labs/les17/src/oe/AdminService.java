package oe;

public interface AdminService {

    // User operations
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

    // Registration operations
    void addRegistration(Registration registration);
    void deleteRegistration(String registrationId);
    List<Registration> getAllRegistrations();
    Optional<Registration> getRegistrationById(String registrationId);
    void updateRegistration(Registration registration);

    // Attendance operations
    List<Attendance> getAllAttendances();
    
    // Bar chart Attendance
    List<BarChartAttendance> getAllAttendancePercents();
    
    // shift attendance
    List<ShiftAttendance> getAllShiftAttendances();
}
