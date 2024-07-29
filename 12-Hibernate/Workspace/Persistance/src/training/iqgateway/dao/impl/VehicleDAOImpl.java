package training.iqgateway.dao.impl;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import training.iqgateway.dao.DAO;
import training.iqgateway.entities.VehicleEO;
import training.iqgateway.util.HibernateUtil;

public class VehicleDAOImpl implements DAO<VehicleEO,Integer>{

    public Integer add(VehicleEO vehicleRef) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        Integer returnedKey = (Integer) sessionRef.save(vehicleRef);
        tnx.commit();
        sessionRef.close();
        return returnedKey;
    }

    public void update(VehicleEO vehicleRef) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        sessionRef.update(vehicleRef);
        tnx.commit();
        sessionRef.close();
    }

    public void delete(Integer vehicleID) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        VehicleEO vehicle = sessionRef.get(VehicleEO.class, vehicleID);
        if(vehicle != null) {
            tnx.begin();
            sessionRef.delete(vehicle);
            tnx.commit();
        }
        sessionRef.close();
    }

    public VehicleEO findByID(Integer vehicleID) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        VehicleEO vehicle = sessionRef.get(VehicleEO.class, vehicleID);
        sessionRef.close();
        return vehicle;
    }

    public List<VehicleEO> findAll() {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        List vehicles = sessionRef.createCriteria(VehicleEO.class).list();
        sessionRef.close();
        return vehicles;
    }
}
