package training.iqgateway.test;

import java.util.ArrayList;

import java.util.Scanner;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;
import training.iqgateway.factory.DepartmentDAOFactory;

public class DepartmentDAOTest {
    
    public DepartmentDAO deptDAORef = DepartmentDAOFactory.createDepartmentDAO();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        DepartmentDAOTest deptTestRef = new DepartmentDAOTest();
//        deptTestRef.testCreateDepartment();
    //    deptTestRef.testUpdateDepartment();
//            deptTestRef.testDeleteDepartment();
           deptTestRef.testSelectByPrimaryKey();
            deptTestRef.testRetrieveDepartment();
    }
    
    public void testCreateDepartment() {
        DepartmentEO deptEORef = new DepartmentEO(310,"Testing", 100, 1700);
        Integer result = deptDAORef.add(deptEORef);
        
        if(result > 0) {
            System.out.println("Record inserted successfully");
        }
    }
    
    public void testUpdateDepartment() {
        DepartmentEO deptEORef = new DepartmentEO(310,"TestingUpdate", 100, 1700);
        Integer result = deptDAORef.update(deptEORef);
        if(result > 0) {
            System.out.println("Record updated successfully");
        }
    }
    
    public void testDeleteDepartment() {
        System.out.println("Enter department Id: ");
        Integer deptId = sc.nextInt();
      Integer result = deptDAORef.delete(deptId);
      if(result > 0) {
          System.out.println("Record Deleted successfully");
      }
    }
    
    public void testSelectByPrimaryKey() {
        System.out.println("Enter department Id: ");
        Integer deptId = sc.nextInt();
        DepartmentEO  deptEORef = deptDAORef.findByDepartmentID(deptId);
        System.out.println(deptEORef);         
    }
    
    public void testRetrieveDepartment() {
        ArrayList<DepartmentEO> departments = deptDAORef.findAllDepartments();
        for(DepartmentEO department : departments) {
            System.out.println(department);
        }
        
    }
}
