package entity;

import java.util.List;

public class Customer {
	private String name;
	private String password;
	private String desc;
	private String sex;
	private boolean marry;
	private List<String> travelCities;
	private String home;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	public List<String> getTravelCities() {
		return travelCities;
	}
	public void setTravelCities(List<String> travelCities) {
		this.travelCities = travelCities;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
}
