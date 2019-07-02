package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SqlMapClientTemplate template;
	
	public List<Employee> getEmployeebyDepartmentId(int id){
		return template.queryForList("getEmployeebyDepartmentId", id);
		
	}
	
	public Employee getEmployeebyEmployeeId (int id){
		return (Employee) template.queryForObject("getEmployeebyEmployeeId",id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Autowired
	private SqlMapClientTemplate template;
	
	public List<Employee> getEmployeesByDept(int deptId) {
		return (List<Employee>) template.queryForList("getEmployeesByDept", deptId);
	}
	public Employee getEmployeeByEmpId(int empId) {
		return (Employee) template.queryForObject("getEmployeeByEmpId", empId);
	}
	public void insertEmployee(Employee emp) {
		template.insert("insertEmployee", emp);
	}
	*/
}
