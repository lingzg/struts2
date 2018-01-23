package action;

import java.util.List;

import dao.CustomerDao;
import entity.City;
import entity.Customer;
import entity.Sex;

public class ToUpdateCustomerAction {
	private Customer customer;
	private List<Sex> sexes;
	private List<City> cities;
	
	public ToUpdateCustomerAction(){
		System.out.println("实例化ToUpdateCustomerAction...");
	}
	public String execute(){
		System.out.println("调用ToUpdateCustomerAction业务方法...");
		CustomerDao dao=new CustomerDao();
		customer=dao.findById();
		sexes=dao.findAllSex();
		cities=dao.findAllCity();
		return "success";
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Sex> getSexes() {
		return sexes;
	}

	public void setSexes(List<Sex> sexes) {
		this.sexes = sexes;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
