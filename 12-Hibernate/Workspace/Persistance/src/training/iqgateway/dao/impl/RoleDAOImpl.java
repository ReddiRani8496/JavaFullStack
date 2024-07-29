package training.iqgateway.dao.impl;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;

import training.iqgateway.dao.DAO;
import training.iqgateway.entities.RoleEO;
import training.iqgateway.util.HibernateUtil;

/**
 * This class provides implementation for the Data Access Object (DAO) operations related to the Role entity.
 */
public class RoleDAOImpl implements DAO<RoleEO,String> {
    
    /**
         * Adds a new role entity to the database.
         *
         * @param roleEORef The role entity to be added.
         * @return The primary key of the added role entity.
         */
   @Override
    public String add(RoleEO roleEORef) {
            // TODO Auto-generated method stub
            Session sessionRef = HibernateUtil.getSessionFactory().openSession();
            Transaction tnx = sessionRef.getTransaction();
            tnx.begin();
            String returnedKey = (String) sessionRef.save(roleEORef);
            tnx.commit();
            sessionRef.close();
            return returnedKey;
    }

    /**
         * Updates an existing role entity in the database.
         *
         * @param roleEORef The role entity to be updated.
         */
    @Override
    public void update(RoleEO roleEORef) {
            // TODO Auto-generated method stub
            Session sessionRef = HibernateUtil.getSessionFactory().openSession();
            Transaction tnx = sessionRef.getTransaction();
            tnx.begin();
            sessionRef.update(roleEORef);
            tnx.commit();
            sessionRef.close();
            
    }
    
    /**
        * Deletes a role entity from the database based on the role name.
        *
        * @param roleName The name of the role to be deleted.
        */
    @Override
    public void delete(String roleName) {
            // TODO Auto-generated method stub
            Session sessionRef = HibernateUtil.getSessionFactory().openSession();
            Transaction tnx = sessionRef.getTransaction();
            RoleEO role = (RoleEO) sessionRef.get(RoleEO.class, roleName);
            if(role != null) {
                    tnx.begin();
                    sessionRef.delete(role);
                    tnx.commit();
            }
            sessionRef.close();
    }
    
    /**
         * Finds a role entity in the database based on the role name.
         *
         * @param roleName The name of the role to be found.
         * @return The role entity if found, otherwise null.
         */
    @Override
    public RoleEO findByID(String roleName) {
            // TODO Auto-generated method stub
            Session sessionRef = HibernateUtil.getSessionFactory().openSession();
            RoleEO roleEORef = sessionRef.get(RoleEO.class, roleName);
            return roleEORef;
    }

    /**
         * Retrieves all role entities from the database.
         *
         * @return A list of all role entities.
         */
    @Override
    public List<RoleEO> findAll() {
            // TODO Auto-generated method stub
            Session sessionRef = HibernateUtil.getSessionFactory().openSession();            
            List roles= sessionRef.createCriteria(RoleEO.class).list();
            return roles;
    }
}
