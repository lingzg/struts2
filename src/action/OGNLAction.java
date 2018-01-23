package action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.Emp;
import entity.User;

public class OGNLAction {
	private Integer id=1;
	private String name="lisi";
	private User user=new User();
	private String[] cityArray={"beijing","shanghai","guangzhou"};
	private List<String> cityList=new ArrayList<String>();
	private Map<String,String> cityMap=new HashMap<String, String>();
	private List<Emp> emps=new ArrayList<Emp>();
	private Integer from=1;
	private Integer to=3;
	
	public String showOGNL(){
		user.setUserName(name);
		user.setPassword("12345");
		cityList.add("shenzhen");
		cityList.add("chongqing");
		cityList.add("qingdao");
		cityMap.put("beijing", "2300万人口");
		cityMap.put("shanghai", "2000万人口");
		cityMap.put("guangzhou", "1800万人口");
		
		Emp e1=new Emp();
		e1.setName("刘备");
		e1.setSalary(8000.0);
		emps.add(e1);
		Emp e2=new Emp();
		e2.setName("关羽");
		e2.setSalary(6000.0);
		emps.add(e2);
		Emp e3=new Emp();
		e3.setName("张飞");
		e3.setSalary(5000.0);
		emps.add(e3);
		
		return "success";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String[] getCityArray() {
		return cityArray;
	}

	public void setCityArray(String[] cityArray) {
		this.cityArray = cityArray;
	}

	public List<String> getCityList() {
		return cityList;
	}

	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public Map<String, String> getCityMap() {
		return cityMap;
	}

	public void setCityMap(Map<String, String> cityMap) {
		this.cityMap = cityMap;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public Integer getTo() {
		return to;
	}

	public void setTo(Integer to) {
		this.to = to;
	}
	
}
