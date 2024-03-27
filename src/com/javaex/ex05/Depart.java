package com.javaex.ex05;

public class Depart extends Employee {
	 //코드작성
	private String department;
	
	public Depart(String name, int salary, String department) {
		setName(name);
		setSalary(salary);
		this.department=department;
	}
	
	@Override
	public void showInformation() {
		System.out.printf("이름: %s, 연봉: %d, 부서: %s%n", getName(), getSalary(), department);
	}
}
