package training.iqgateway.tests;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.OffenseTypeDAOImpl;
import training.iqgateway.entities.OffenseTypeEO;


public class OffenseTypeEOTest {
    private DAO<OffenseTypeEO, String> offenseDAORef = new OffenseTypeDAOImpl();
    
    @Test
    public void createOffenceTypeTest() {
        OffenseTypeEO offense = new OffenseTypeEO("1","General offences", "All Vehicles",new Integer(100));
        String returnedKey = offenseDAORef.add(offense);
        Assert.assertEquals("1", returnedKey);
    }
    
    @Test
    public void updateOffenseTypeTest() {
        OffenseTypeEO offense = new OffenseTypeEO("1","General offences", "All Vehicles",new Integer(200));
         offenseDAORef.update(offense);
         OffenseTypeEO offenceRef = offenseDAORef.findByID("1");
        Assert.assertEquals(new Integer(200), offenceRef.getPenalty());
    }
    
    @Test
    public void deleteOffenseTypeTest() {
        offenseDAORef.delete("1");
        OffenseTypeEO offense = offenseDAORef.findByID("1");
        Assert.assertNull(offense);
    }
    
    @Test
    public void findByOffenceIdTest() {
        OffenseTypeEO offense = offenseDAORef.findByID("1");
        Assert.assertNotNull(offense);
        System.out.println(offense);
    }
    
    @Test
    public void findAllOffenseTest() {
            List<OffenseTypeEO> offences = offenseDAORef.findAll();
            Assert.assertNotNull(offences);
            for (Iterator iterator = offences.iterator(); iterator.hasNext();) {
				OffenseTypeEO offenseTypeEO = (OffenseTypeEO) iterator.next();
				System.out.println(offenseTypeEO);
			}
            
    }
}
