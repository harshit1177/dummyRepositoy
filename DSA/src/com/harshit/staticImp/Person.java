package com.harshit.staticImp;

public class Person {

	public static int age;
	
	public String name;

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {

		Person.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
	
	
}
