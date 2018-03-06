package com.example.maventest;

public class Patient {
	private int id;
	private String name;
	private int nationalId;

	private Address address;
	
	//default constructor
	public Address getAddress() {
		return address;
	}
	
	//factory class
	public static Patient getInstance(int id,String name)
	{
		System.out.println("Creating Factory method using factory method: ");
		return new Patient(id,name);
	}
	
	//init method
	public void onCreate() {
		System.out.println("Patient created: "+ this);
		
	}
	//destroy method
	public void onDestroy() {
		System.out.println("Patient destroyed");
		
	}

	

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public Patient() {

	}

	public Patient(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + ", address=" + address + "]";
	}

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("help me!!!");

	}

}
