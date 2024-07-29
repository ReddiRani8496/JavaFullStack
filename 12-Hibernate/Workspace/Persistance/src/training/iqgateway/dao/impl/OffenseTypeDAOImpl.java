package training.iqgateway.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import training.iqgateway.dao.DAO;
import training.iqgateway.entities.OffenseTypeEO;
import training.iqgateway.util.HibernateUtil;

public class OffenseTypeDAOImpl  implements DAO<OffenseTypeEO, String>{

    public String add(OffenseTypeEO offenceTypeRef) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        String returnedKey = (String) sessionRef.save(offenceTypeRef);
        tnx.commit();
        sessionRef.close();
        return returnedKey;
    }

    public void update(OffenseTypeEO offenceTypeRef) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        tnx.begin();
        sessionRef.update(offenceTypeRef);
        tnx.commit();
        sessionRef.close();
    }

    public void delete(String offenseID) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        Transaction tnx = sessionRef.getTransaction();
        OffenseTypeEO offense = sessionRef.get(OffenseTypeEO.class, offenseID);
        if(offense != null) {
            tnx.begin();
            sessionRef.delete(offenseID);
            tnx.commit();
        }
        sessionRef.close();
    }

    public OffenseTypeEO findByID(String offenseID) {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        OffenseTypeEO offense = sessionRef.get(OffenseTypeEO.class, offenseID);
        return offense;
    }

    public List<OffenseTypeEO> findAll() {
        Session sessionRef = HibernateUtil.getSessionFactory().openSession();
        List offenseTypes = sessionRef.createCriteria(OffenseTypeEO.class).list();
        return offenseTypes;
    }
}
