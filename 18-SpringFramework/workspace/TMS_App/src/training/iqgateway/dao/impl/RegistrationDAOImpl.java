package training.iqgateway.dao.impl;


import java.util.Collections;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import training.iqgateway.entities.*;
import training.iqgateway.util.*;
import training.iqgateway.dao.DAO;

public class RegistrationDAOImpl implements DAO<RegistrationEO, String> {
    
    private Session session = null;
    private Transaction txn = null;
    
    public RegistrationDAOImpl() {
        super();
    }

    public String add(RegistrationEO entity) {
        session = HibernateUtil.getSessionFactory().openSession();
        txn = session.getTransaction();
        txn.begin();
        String returnedRegID = (String)session.save(entity);
        if(returnedRegID != null) {
            txn.commit();
            session.close();
        }
        else
            txn.rollback();
        return returnedRegID;
    }

    public void update(RegistrationEO entity) {
        session = HibernateUtil.getSessionFactory().openSession();
        txn = session.getTransaction();
        txn.begin();
        session.update(entity);
        txn.commit();
        session.clear();
    }

    public void delete(String ID) {
        session = HibernateUtil.getSessionFactory().openSession();
        txn = session.getTransaction();
        RegistrationEO regEO = session.get(RegistrationEO.class, ID);
        if(regEO != null) {
            txn.begin();
            session.delete(regEO);
            txn.commit();
        }
        session.close();
    }

    public RegistrationEO findByID(String ID) {
        session = HibernateUtil.getSessionFactory().openSession();
        RegistrationEO regEO = session.get(RegistrationEO.class, ID);
        session.close();
        return regEO;
    }

    public List<RegistrationEO> findAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<RegistrationEO> registrations = session.getNamedQuery("Registrations.findAll").list();
        session.close();
        return registrations;
    }
}

