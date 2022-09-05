package com.area.shape;

public class Circle extends Shape {
	public static double pi = 3.14;

	public Circle(double length) {
		super(length);
		System.out.println("The  area of a Circle is pi * radius * radius : ");
	}
	
	public double area() {
		double area3 = pi * length * length;
		return area3;
		
	}

}
