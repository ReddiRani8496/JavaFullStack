package training.iqgateway.tests;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import training.iqgateway.entities.*;
import training.iqgateway.util.*;
import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.*;

public class RegistrationEOTest {
    
    private DAO<RegistrationEO, String> regDAOTest = new RegistrationDAOImpl();
    private DAO<OwnerEO, String> ownerRef = new OwnerDAOImpl();
    private DAO<VehicleEO, Integer> vehicleRef = new VehicleDAOImpl();
    
    @Test
    public void addRegistrationTest() {
        RegistrationEO registrationRef = new RegistrationEO();
        registrationRef.setRegistrationID("KA 32 AB 9221");
        VehicleEO vehicle = vehicleRef.findByID(1);
        registrationRef.setVehicle(vehicle);
        OwnerEO owner = ownerRef.findByID("99607604580");
        registrationRef.setOwner(owner);
        java.util.Date date = new java.util.Date();
        Date regDate = new Date(date.getTime());
        registrationRef.setRegistrationDate(regDate);
        String regID = regDAOTest.add(registrationRef);
        Assert.assertEquals("KA 32 AB 9221", regID);
        System.out.println("Registration done");
    }
    
    @Test
    public void updateRegistrationTest() {
        RegistrationEO registrationRef = new RegistrationEO();
        registrationRef.setRegistrationID("KA 32 AB 9221");
        VehicleEO vehicle = vehicleRef.findByID(1);
        registrationRef.setVehicle(vehicle);
        OwnerEO owner = ownerRef.findByID("99607604580");
        registrationRef.setOwner(owner);
        Date regDate = Date.valueOf("2024-03-30");
        registrationRef.setRegistrationDate(regDate);
        regDAOTest.update(registrationRef);
        String regID = regDAOTest.findByID("KA 32 AB 9221").getRegistrationID();
        Assert.assertEquals("KA 32 AB 9221", regID);
        System.out.println("Registration updated");
    }
    
    @Test
    public void deleteRegistrationTest() {
    	regDAOTest.delete("KA 32 AB 9221");
    	RegistrationEO regEO = regDAOTest.findByID("KA 32 AB 9221");
        Assert.assertNull(regEO);
        System.out.println("Registration deleted");
    }
    
    @Test
    public void findRegistrationByID() {
    	RegistrationEO regEO = regDAOTest.findByID("KA 32 AB 9221");
        Assert.assertNotNull(regEO);
    }
    
    @Test
    public void findAllRegistrations() {
    	List<RegistrationEO> registrations = regDAOTest.findAll();
    	for (Iterator iterator = registrations.iterator(); iterator.hasNext();) {
			RegistrationEO registrationEO = (RegistrationEO) iterator.next();
			System.out.println(registrationEO);
		}
    }
}
