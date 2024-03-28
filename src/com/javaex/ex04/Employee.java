package com.javaex.ex04;

public class Employee extends User {
	private int salary;
	
	public Employee() {}
	public Employee(String id, String password, String name, int salary) {
//		setId(id);
//		setPassword(password);
//		setName(name);
		super(id, password, name);
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}

	
	@Override
	public void showInfo() {
//		System.out.printf("#아이디: %s, @패스워드: %s, #이름: %s, #월급: %d원\n", getId(), getPassword(), getName(), salary);
		System.out.printf("#아이디: %s, @패스워드: %s, #이름: %s, #월급: %d원\n", id, password, name, salary);
	}
}