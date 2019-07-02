package kr.co.jhta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {
	
	private SqlMapClientTemplate template;
	
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public List<Customer> getAllCustomers(){
		return (List<Customer>) template.queryForList("getAllCustomers");
	}
	
	public Customer getCustomerByNo(int no) {
		return (Customer) template.queryForObject("getCustomerByNo", no);
	}
	public void insertCustomer(Customer customer) {
		template.insert("insertCustomer", customer);
	}
	public void updateCustomer(Customer customer){
		template.update("updateCustomer", customer);
	}
	public void deleteCustomer(int no) {
		template.delete("deleteCustomer", no);
	}
	public Customer searchCustomerByOption(Map<String, Object> map){
		return (Customer) template.queryForObject("searchCustomerByOption", map);
	}
}
