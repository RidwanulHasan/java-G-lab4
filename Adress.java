package com.aiub.ex1;

public class Adress {
	
	String city;
	String country;
	
	

	public Adress() {
		
	}



	public Adress(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}



	@Override
	public String toString() {
		return "Adress [city=" + city + ", country=" + country + "]";
	}

	
	
}
