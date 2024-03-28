package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] user = new User[3];	// User클래스와 하위 클래스 모두 담을 수 있는 배열
		
		user[0] = new Customer("jws", "j1234", "정우성", 1_000);
		user[1] = new Customer("yjs", "y2345", "유재석", 5_000);
		user[2] = new Employee("master", "m7788", "운영자", 500);
		
		for(User val : user) {
			val.showInfo();
		}
		int salasy = ((Employee)user[2]).getSalary();
		System.out.println("참고로 "+ user[2].getName() + "의 월급은" + salasy + "원입니다.");
	}
}