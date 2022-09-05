package com.area.shape;

public class Triangle extends Shape{

	public Triangle(double length, double breadth) {
		super(length, breadth);
		System.out.println("The  area of a Triangle is 1/2 * base * height : ");
	}
	
	public double area() {
		double area4 = 1/2 * length * breadth;
		return area4;
		
	}

}
