package com.area.shape;

public class Square extends Shape {

	public Square(double length) {
		super(length);
		System.out.println("The area of a Square is length X length :");
	}

	public double area() {
		double area2 = length * length;
		return area2;
		
	}

}
