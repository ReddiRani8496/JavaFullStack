package training.iqgateway.tests;

import java.sql.Date;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.VehicleDAOImpl;
import training.iqgateway.entities.VehicleEO;


public class VehicleEOTest {
    private DAO<VehicleEO, Integer> vehicleDAORef = new VehicleDAOImpl();
    
    @Test 
    public void addVehicle() {
        //1, "52WVC10338"," 7004AN", "Car","Red", "Diesel", Date.valueOf(LocalDate.of(2024, 3, 15)),"Maruti","Tata","SUV"
        VehicleEO vehicle = new VehicleEO(new Integer(1),"52WVC10338","7004AN","Car","Red","Diesel", Date.valueOf(LocalDate.of(2024, 3, 15)),"Maruti","Tata","SUV");
        Integer returnedKey = (Integer) vehicleDAORef.add(vehicle);
        Assert.assertEquals(new Integer(1),returnedKey);
    }
    
    @Test
    public void updateVehicle() {
    	VehicleEO vehicleRef = new VehicleEO(new Integer(1),"52WVC10338","7004AN","Car","Black","Diesel", Date.valueOf(LocalDate.of(2024, 3, 15)),"Maruti","Tata","SUV");
         vehicleDAORef.update(vehicleRef);
         VehicleEO vehicle = vehicleDAORef.findByID(1);
        Assert.assertEquals("Black",vehicle.getVehicleColor());
    }
    
    @Test
    public void deleteVehicle() {
    	vehicleDAORef.delete(new Integer(1));
    	VehicleEO vehicle = vehicleDAORef.findByID(1);
    	Assert.assertNull(vehicle);
    }
    
    @Test
    public void findByVehicleIdTest() {
    	 VehicleEO vehicle = vehicleDAORef.findByID(1);
    	 Assert.assertNotNull(vehicle);
    	 System.out.println(vehicle);
    }
    
    @Test
    public void findVehiclesTest() {
    	List<VehicleEO> vehicles = vehicleDAORef.findAll();
    	Assert.assertNotNull(vehicles);
    	for (Iterator iterator = vehicles.iterator(); iterator.hasNext();) {
			VehicleEO vehicleEO = (VehicleEO) iterator.next();
			System.out.println(vehicleEO);
		}
    }
}
