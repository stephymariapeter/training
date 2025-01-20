package com.obsqura.training.arrays;

public class Student {
	int id;
	String name;
	Address address;
	Student(String name,int id,Address address){
		super();
		this.name= name;
		this.id = id;
		this.address = address;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(address.houseName);
		System.out.println(address.district);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println(address.pin);
	}
	public static void main(String[] args) {
		Address address = new Address("HouseName123","Alappuzha","Alappy","kerala","india",6888007);
		Student s = new Student("Stephy",1,address);
		s.display();
	}
}
