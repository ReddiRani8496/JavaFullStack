package oe;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private String roleName;
       private String description;
       private List<User> users = new ArrayList<>();

       public Role() {}

       public Role(String roleName, String description) {
           this.roleName = roleName;
           this.description = description;
       }

       public String getRoleName() {
           return roleName;
       }

       public void setRoleName(String roleName) {
           this.roleName = roleName;
       }

       public String getDescription() {
           return description;
       }

       public void setDescription(String description) {
           this.description = description;
       }

       public List<User> getUsers() {
           return users;
       }

       public void setUsers(List<User> users) {
           this.users = users;
       }

       public void addUser(User user) {
           users.add(user);
           user.setRole(this);
       }

       public void removeUser(User user) {
           users.remove(user);
           user.setRole(null);
       }

       @Override
       public String toString() {
           return "Role [roleName=" + roleName + ", description=" + description + "]";
       }
}
