package com.aiub.ex2;

public class Triangle {
	
	
	
	private int height;
	private int weight;
	public Triangle() {
		super();
	}
	public Triangle(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
	public void showinfo() {
		
		System.out.println (height*weight);
		
	}
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", weight=" + weight + "]";
	}
	
}
	
	

	




	
	



