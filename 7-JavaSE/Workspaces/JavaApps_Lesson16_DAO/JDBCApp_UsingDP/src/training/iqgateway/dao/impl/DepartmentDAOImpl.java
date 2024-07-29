package training.iqgateway.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.*;

import java.util.ArrayList;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;
import training.iqgateway.util.ResourceManager;

public class DepartmentDAOImpl implements DepartmentDAO{
    /** The SQL SELECT All*/
    protected final String SQL_SELECT = "select * from " + getTableName() + "";
    
    /** The SQL INSERT. */
    protected final String SQL_INSERT = "insert into " + getTableName() + " " + "(Department_ID, Department_Name,manager_id, location_id) values(?,?,?,?)";
    
    /** The SQL UPDATE */
    protected final String SQL_UPDATE = "update  " + getTableName() + " set department_name=?, manager_id=?, location_id=? where department_id=?";
    
    /** The SQL Delete */
    protected final String SQL_DELETE = "delete from " + getTableName() + " where department_id = ?";
    
    /** SQL select based on primary key */
    protected final String SQL_SELECT_BY_PRIMARY_KEY = "select * from " + getTableName() + " where department_id = ?";
    
    public String getTableName() {
        return "Departments";
    }

    public Integer add(DepartmentEO departmentEORef) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            con = ResourceManager.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt. setInt(1, departmentEORef.getDepartmentId());
            pstmt.setString(2, departmentEORef.getDepartmentName());
            pstmt.setInt(3, departmentEORef.getManagerId());
            pstmt.setInt(4, departmentEORef.getLocationId());
            
             result = pstmt.executeUpdate();
                } catch(SQLException e) {
                    e.printStackTrace();
                } finally {
                   ResourceManager.close(pstmt);
                    ResourceManager.close(con);
                 }
        return result;
        } 

    public Integer update(DepartmentEO departmentEORef) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            con = ResourceManager.getConnection();
            pstmt = con.prepareStatement(SQL_UPDATE);
            pstmt.setString(1, departmentEORef.getDepartmentName());
            pstmt.setInt(2, departmentEORef.getManagerId());
            pstmt.setInt(3,departmentEORef.getLocationId());
            pstmt.setInt(4, departmentEORef.getDepartmentId());
            
            result = pstmt.executeUpdate();
            
        } catch(SQLException e) {
                    e.printStackTrace();
            } finally {
                   ResourceManager.close(pstmt);
                    ResourceManager.close(con);
                 }
        return result;
    } 

    public Integer delete(Integer departmentId) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            con =  ResourceManager.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, departmentId);
           result = pstmt.executeUpdate();
        } catch(SQLException e) {
                    e.printStackTrace();
            } finally {
                   ResourceManager.close(pstmt);
                    ResourceManager.close(con);
                 }
        return result;
    }

    public DepartmentEO findByDepartmentID(Integer departmentId) {
        Connection con = null;
        PreparedStatement pstmt = null;
        DepartmentEO departmentEORef = null;
        try {
            con =  ResourceManager.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_PRIMARY_KEY);
            pstmt.setInt(1, departmentId);
           ResultSet res = pstmt.executeQuery();
            // process the result set
            while(res.next()) {
                departmentEORef = new DepartmentEO();
                departmentEORef.setDepartmentId( res.getInt(1));
                departmentEORef.setDepartmentName(res.getString(2));
                departmentEORef.setManagerId (res.getInt(3));
                departmentEORef.setLocationId(res.getInt(4));
            }
        } catch(SQLException e) {
                    e.printStackTrace();
            } finally {
                ResourceManager.close(pstmt);
                ResourceManager.close(con);
            }
        return departmentEORef;
    }

    public ArrayList<DepartmentEO> findAllDepartments() {
        Connection con = null;
        PreparedStatement pstmt = null;
       
        ArrayList<DepartmentEO> list = new ArrayList<DepartmentEO>();
        ResultSet res = null;
        try {
            con =  ResourceManager.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
          
           res = pstmt.executeQuery();
            while(res.next()) {
                DepartmentEO departmentEORef = new DepartmentEO();
                int deptId = res.getInt(1);
                String deptName = res.getString(2);
                int managerId = res.getInt(3);
                int locationId = res.getInt(4);
                departmentEORef.setDepartmentId(deptId);
                departmentEORef.setDepartmentName(deptName);
                departmentEORef.setManagerId(managerId);
                departmentEORef.setLocationId(locationId);
                
                list.add(departmentEORef);
            }
        } catch(SQLException e) {
                    e.printStackTrace();
            } finally {
                ResourceManager.close(res);
                ResourceManager.close(pstmt);
                ResourceManager.close(con);
            }
        return list;
    }
}
