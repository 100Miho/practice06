package com.javaex.ex04;

public class Customer extends User {
	private int point;
	
	public Customer() {}
	public Customer(String id, String password, String name, int point) {
//		setId(id);
//		setPassword(password);
//		setName(name);
		super(id, password, name);
		this.point=point;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	
	@Override
	public void showInfo() {
//		System.out.printf("#아이디: %s, @패스워드: %s,  #이름: %s, #포인트: %d%n", getId(), getPassword(), getName(), point);
		System.out.printf("#아이디: %s, @패스워드: %s,  #이름: %s, #포인트: %d%n", id, password, name, point);
	}
}