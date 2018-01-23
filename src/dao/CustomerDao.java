package dao;

import java.util.ArrayList;
import java.util.List;

import entity.City;
import entity.Customer;
import entity.Sex;

public class CustomerDao {
	public Customer findById(){
		Customer c=new Customer();
		c.setName("张三");
		c.setPassword("12345");
		c.setDesc("中华人民共和国公民");
		c.setMarry(true);
		c.setSex("F");
		List<String> list=new ArrayList<String>();
		list.add("beijing");
		list.add("guangzhou");
		c.setTravelCities(list);
		c.setHome("shanghai");
		return c;
	}
	
	public List<Sex> findAllSex(){
		List<Sex> list=new ArrayList<Sex>();
		Sex s1=new Sex();
		s1.setCode("M");
		s1.setName("男");
		list.add(s1);
		Sex s2=new Sex();
		s2.setCode("F");
		s2.setName("女");
		list.add(s2);
		Sex s3=new Sex();
		s3.setCode("O");
		s3.setName("其他");
		list.add(s3);
		return list;
	}
	
	public List<City> findAllCity(){
		List<City> list=new ArrayList<City>();
		City c1=new City("beijing","北京");
		City c2=new City("shanghai","上海");
		City c3=new City("guangzhou","广州");
		City c4=new City("shenzhen","深圳");
		City c5=new City("chongqing","重庆");
		City c6=new City("qingdao","青岛");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c6);
		list.add(c5);
		return list;
	}
}
