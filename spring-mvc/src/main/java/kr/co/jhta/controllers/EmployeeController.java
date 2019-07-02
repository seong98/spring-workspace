package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public DepartmentDao departmentDao;
	@Autowired
	public EmployeeDao employeeDao;
	
	@RequestMapping("/depts.do")
	public String list(Model model) {
		
		List<Department> department =departmentDao.getAllDepartments();
		model.addAttribute("department",department);
		
		return "emp/depts";
	}
	
	@RequestMapping("/employees.do")
	public String employees(Model model, int deptid) {
		
		List<Employee> employee=employeeDao.getEmployeebyDepartmentId(deptid);
		model.addAttribute("employee",employee);
		
		return "emp/employees";
	}
	
	@RequestMapping("/employee.do")
	public String employee(Model model, int empid) {
		Employee employee= employeeDao.getEmployeebyEmployeeId(empid);
		model.addAttribute("employee", employee);
		
		return "emp/employee";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Autowired
	private DepartmentDao deptDao;
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("/depts.do")
	public String depts(Model model) {
		
		List<Department> depts = deptDao.getAllDepartments();
		model.addAttribute("depts", depts);
		
		return "emp/depts";
	}
	@RequestMapping("/employees.do")
	public String employees(int deptid, Model model) {
		
		List<Employee> emps = empDao.getEmployeesByDept(deptid);
		model.addAttribute("emps", emps);
		
		return "emp/employees";
	}
	@RequestMapping("/employee.do")
	public String employee(int empid, Model model) {
		Employee emp = empDao.getEmployeeByEmpId(empid);
		model.addAttribute("emp", emp);
		
		
		return "emp/employee";
	}
	@RequestMapping("/form.do")
	public String form() {
		
		
		return "emp/form";
	}
	
	@RequestMapping("/add.do")
	public String add(Employee emp) {
		
		empDao.insertEmployee(emp);
		return "redirect:depts.do";
	}
	*/
	
}
