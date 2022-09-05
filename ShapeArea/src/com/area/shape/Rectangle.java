package com.area.shape;

public class Rectangle extends Shape {
	
	public Rectangle(double length, double breadth) {
		super(length, breadth);
		System.out.println("The  area of a Rectangle is length X breadth : ");
	}

	public double area() {
		double area1 = length * breadth;
		return area1;
		
	}

}
