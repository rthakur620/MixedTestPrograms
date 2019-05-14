package com.mix;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Employee , String> hm = new HashMap();
		Employee emp1 = new Employee(25, "Rahul");
		Employee emp2 = new Employee(25, "Rahul");
		hm.put(emp1, "abc");
		hm.put(emp2, "def");
		System.out.println(hm.get(emp1));
		System.out.println(hm.get(emp1));
	}
}

class Employee {
	int age;
	String name;
	
	
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 31*age + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		
		if(((Employee)obj).age == this.age && (((Employee)obj).name).equals(this.name)){
			return true;
		}else{
			return false;
		}
	}
	
}
