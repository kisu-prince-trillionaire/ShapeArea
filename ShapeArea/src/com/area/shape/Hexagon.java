package com.area.shape;

public class Hexagon extends Shape {
    public Hexagon(double length) {
		super(length);
		System.out.println("The  area of a Hexagon is 3* root 3 * side * side : ");
	}
    
	public double area() {
		double area5 = (5.17 * length * length)/2;
		return area5;
		
	}

}
