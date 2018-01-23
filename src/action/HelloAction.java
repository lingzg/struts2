package action;

import entity.User;

public class HelloAction {
	private String realName;
	private User user;
	
	public HelloAction(){
		System.out.println("实例化action...");
	}
	
	public String sayHello(){
		System.out.println("Hello,Action");
		System.out.println("姓名："+realName);
		System.out.println("用户名："+user.getUserName());
		System.out.println("密码："+user.getPassword());
		return "success";
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		System.out.println("注入参数realName...");
		this.realName = realName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		System.out.println("注入对象user...");
		this.user = user;
	}
	
}
