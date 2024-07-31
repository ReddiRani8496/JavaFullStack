package training.iqgateway.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.iqgateway.dao.DAO;
import training.iqgateway.entities.RoleEO;
import training.iqgateway.entities.UsersEO;
import training.iqgateway.util.HibernateUtil;

/**
 * This class provides data access methods for UsersEO entities.
 */
public class UsersDAOImpl implements DAO<UsersEO, String>{
    
	private SessionFactory sessionFactoryRef;
	
	public UsersDAOImpl(){}
	
	
	
	
    public UsersDAOImpl(SessionFactory sessionFactoryRef) {
		super();
		this.sessionFactoryRef = sessionFactoryRef;
	}




	public SessionFactory getSessionFactoryRef() {
		return sessionFactoryRef;
	}

	public void setSessionFactoryRef(SessionFactory sessionFactoryRef) {
		this.sessionFactoryRef = sessionFactoryRef;
	}

	/**
        * Adds a new UsersEO entity to the database.
        * 
        * @param userEORef The UsersEO entity to be added.
        * @return The key of the added entity.
        */
    @Override
    public String add(UsersEO userEORef) {
        Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        String returnedKey = (String) sessionRef.save(userEORef);
        tnx.commit();
        sessionRef.close();
        return returnedKey;
    }
    
    /**
         * Updates an existing UsersEO entity in the database.
         * 
         * @param userEORef The UsersEO entity to be updated.
         */
    @Override
    public void update(UsersEO userEORef) {
        Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        sessionRef.update(userEORef);
        tnx.commit();
        sessionRef.close();
    }
    
    /**
        * Deletes a UsersEO entity from the database based on the provided ID.
        * 
        * @param ID The ID of the UsersEO entity to be deleted.
        */
    @Override
    public void delete(String ID) {
        Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        UsersEO users = (UsersEO) sessionRef.get(UsersEO.class, ID);
        if(users != null) {
                tnx.begin();
                sessionRef.delete(users);
                tnx.commit();
        }
        sessionRef.close();
    }
    
    /**
        * Finds a UsersEO entity in the database based on the provided ID.
        * 
        * @param ID The ID of the UsersEO entity to be found.
        * @return The UsersEO entity found, or null if not found.
        */
    @Override
    public UsersEO findByID(String ID) {
        Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
        UsersEO usersEORef = sessionRef.get(UsersEO.class, ID);
        return usersEORef;
    }
    
    /**
         * Retrieves all UsersEO entities from the database.
         * 
         * @return A list of all UsersEO entities.
         */
    @Override
    public List<UsersEO> findAll() {
        Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();            
        List users= sessionRef.createCriteria(UsersEO.class).list();
        return users;
    }
}
