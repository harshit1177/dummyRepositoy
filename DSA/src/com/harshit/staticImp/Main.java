package com.harshit.staticImp;

public class Main {

	public static void main(String[] args) {
	
		Person person1 = new Person();
		person1.setName("Harshit");
		person1.setAge(28);
		System.out.println(person1.age);
		System.out.println(person1.name);

		//Make sure for static keyword we are calling via class only and not object

		Person person2 = new Person();
		person2.setName("dummy");
		person2.setAge(30);

		System.out.println(person2.name);
		System.out.println(person2.age);



	}

}
