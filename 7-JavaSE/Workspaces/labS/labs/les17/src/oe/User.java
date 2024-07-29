package oe;

public class User {
    private String id;
       private String firstName;
       private String lastName;
       private Role role;
       private String email;
       private String password;
       private byte[] photo;

       public User() {
           super();
       }

       public User(String id, String firstName, String lastName, Role role, String email, String password, byte[] photo) {
           super();
           this.id = id;
           this.firstName = firstName;
           this.lastName = lastName;
           this.role = role;
           this.email = email;
           this.password = password;
           this.photo = photo;
       }

       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.id = id;
       }

       public String getFirstName() {
           return firstName;
       }

       public void setFirstName(String firstName) {
           this.firstName = firstName;
       }

       public String getLastName() {
           return lastName;
       }

       public void setLastName(String lastName) {
           this.lastName = lastName;
       }

       public Role getRole() {
           return role;
       }

       public void setRole(Role role) {
           this.role = role;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public String getPassword() {
           return password;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       public byte[] getPhoto() {
           return photo;
       }

       public void setPhoto(byte[] photo) {
           this.photo = photo;
       }

       @Override
       public String toString() {
           return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + ", email=" + email + ", password=" + password + ", photo=" + Arrays.toString(photo) + "]";
       }
}
