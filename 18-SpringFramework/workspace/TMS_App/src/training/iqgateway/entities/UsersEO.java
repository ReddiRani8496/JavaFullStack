package training.iqgateway.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
 /**
  * Entity class representing a USERS table in the TM schema.
  */
@Entity
@Table(name = "USERS")
public class UsersEO {
    
    @Id
    @Column(name = "USER_ID")
   private String userId;
   
   @Column(name = "USER_NAME")
   private String userName;
   
   @Column(name = "PASSWORD")
   private String password;
   
   @Column(name = "EMAIL")
   private String email;
   
   @ManyToOne
    @JoinColumn(name="ROLENAME", referencedColumnName="ROLENAME")
   private RoleEO roleName;
   
    /**
         * Default constructor.
         */
   public UsersEO() {}


    /**
        * Parameterized constructor.
        * @param userId The ID of the user.
        * @param userName The name of the user.
        * @param password The password of the user.
        * @param email The email address of the user.
        * @param roleName The role of the user.
        */
    public UsersEO(String userId, String userName, String password, String email, RoleEO roleName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.roleName = roleName;
    }

    /**
         * Set the user ID.
         * @param userId The ID of the user.
         */
	public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
        * Get the user ID.
        * @return The ID of the user.
        */
    public String getUserId() {
        return userId;
    }

    /**
         * Set the user name.
         * @param userName The name of the user.
         */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
         * Get the user name.
         * @return The name of the user.
         */
    public String getUserName() {
        return userName;
    }

    /**
         * Set the user password.
         * @param password The password of the user.
         */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
         * Get the user password.
         * @return The password of the user.
         */
    public String getPassword() {
        return password;
    }
    
    /**
         * Set the user email.
         * @param email The email address of the user.
         */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
        * Get the user email.
        * @return The email address of the user.
        */
    public String getEmail() {
        return email;
    }
    
    /**
        * Get the role name.
        * @return The role of the user.
        */
	public RoleEO getRoleName() {
		return roleName;
	}
        
    /**
         * Set the role name.
         * @param roleName The role of the user.
         */
	public void setRoleName(RoleEO roleName) {
		this.roleName = roleName;
	}
        
    /**
         * Get a string representation of the UsersEO object.
         * @return A string representation of the UsersEO object.
         */
	@Override
	public String toString() {
		return "UsersEO [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", roleName=" + roleName + "]";
	}

}
