package training.iqgateway.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;
import training.iqgateway.rowmapper.DepartmentRowMapper;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplateRef;
	
	public DepartmentDAOImpl() {
		
	}
	
	

	public DepartmentDAOImpl(JdbcTemplate jdbcTemplateRef) {
		super();
		this.jdbcTemplateRef = jdbcTemplateRef;
	}



	public JdbcTemplate getJdbcTemplateRef() {
		return jdbcTemplateRef;
	}



	public void setJdbcTemplateRef(JdbcTemplate jdbcTemplateRef) {
		this.jdbcTemplateRef = jdbcTemplateRef;
	}



	@Override
	public List<DepartmentEO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insert(DepartmentEO record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(DepartmentEO record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer findDepartmentsManagerById(Integer id) {
		// TODO Auto-generated method stub
		
		Integer resultDeptEORef = null;
		
		String sql = "SELECT MANAGER_ID FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		try {
			resultDeptEORef = jdbcTemplateRef.queryForObject(sql, Integer.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultDeptEORef;
	}



	@Override
	public DepartmentEO findDepartmentById(Integer id) {
		// TODO Auto-generated method stub
		DepartmentEO resultDeptEORef = null;
		DepartmentRowMapper deptRowMapper = new DepartmentRowMapper();
		
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		try {
			resultDeptEORef = jdbcTemplateRef.queryForObject(sql, deptRowMapper, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultDeptEORef;
	}

}
