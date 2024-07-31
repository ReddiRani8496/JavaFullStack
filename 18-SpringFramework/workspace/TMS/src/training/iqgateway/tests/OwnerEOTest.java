package training.iqgateway.tests;

import java.time.LocalDate;
import java.sql.Date;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.OwnerDAOImpl;
import training.iqgateway.entities.OwnerEO;

public class OwnerEOTest {
    private DAO<OwnerEO, String> ownerDAORef=new OwnerDAOImpl();
    
    @Test
    public void addOwnerTest() {
    	
        OwnerEO ownerRef = new OwnerEO("99607604580","Aadhar","Rock","Mock",Date.valueOf(LocalDate.of(2000, 3, 15)),"Male","9087654321","Banglore",32423,"Doctor");
       String owner = ownerDAORef.add(ownerRef);
       Assert.assertEquals("99607604580",owner);
    }
    
    @Test
    public void updateOwnerTest() {
    	
        OwnerEO ownerRef = new OwnerEO("99607604580","Aadhar","Rock","Mock",Date.valueOf(LocalDate.of(2000, 3, 15)),"Male","9087654367","Banglore",32423,"Doctor");
        ownerDAORef.update(ownerRef);
        OwnerEO owner = ownerDAORef.findByID("99607604580");
        Assert.assertEquals("9087654367",owner.getPhoneNumber());
    }
    
    @Test
    public void deleteOwnerTest() {
        ownerDAORef.delete("99607604580");
        OwnerEO owner = ownerDAORef.findByID("99607604580");
        Assert.assertNull(owner);
    }
    
    @Test
    public void findByIdTest(){
        OwnerEO owner = ownerDAORef.findByID("99607604580");
        Assert.assertNotNull(owner);
        System.out.println(owner);
    }
    
    @Test
    public void findAllTest() {
        List<OwnerEO> owners = ownerDAORef.findAll();
        Assert.assertNotNull(owners);
         for (Iterator iterator = owners.iterator(); iterator.hasNext();) {
                OwnerEO ownerEO = (OwnerEO) iterator.next();
             System.out.println(ownerEO);
         }
    }
}
