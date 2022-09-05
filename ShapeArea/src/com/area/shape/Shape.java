package com.area.shape;

public class Shape {
	protected String shapeName;
	double length;
	double breadth;
	
	public Shape(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Shape(double length) {
		this.length = length;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
}
