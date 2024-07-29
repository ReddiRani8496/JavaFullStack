package training.iqgateway.dao.impl;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;

import training.iqgateway.dao.DAO;
import training.iqgateway.entities.OwnerEO;
import training.iqgateway.util.HibernateUtil;

public class OwnerDAOImpl implements DAO<OwnerEO, String>{

    public String add(OwnerEO ownerRef) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        String returnedKey = (String) sessionRef.save(ownerRef);
        tnx.commit();
        sessionRef.close();
        return returnedKey;
    }

    public void update(OwnerEO ownerRef) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        sessionRef.update(ownerRef);
        tnx.commit();
        sessionRef.close();
    }

    public void delete(String ownerID) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        OwnerEO owner = sessionRef.get(OwnerEO.class,ownerID );
        if(owner != null) {
            tnx.begin();
            sessionRef.delete(owner);
            tnx.commit();
        }
        sessionRef.close();
    }

    public OwnerEO findByID(String ownerID) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        OwnerEO owner = sessionRef.get(OwnerEO.class,ownerID );
        return owner;
    }

    public List<OwnerEO> findAll() {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        List owners = sessionRef.createCriteria(OwnerEO.class).list();
        return owners;
    }
}
