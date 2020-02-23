package com.aiub.ex1;

public class Information {
	
	
	private int id;
	private String name;
	private double cgpa;
	private Adress address;
	public Information() {
		super();
	}
	public Information(int id, String name, double cgpa, Adress address) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Information [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", address=" + address + "]";
	}
	
	
}