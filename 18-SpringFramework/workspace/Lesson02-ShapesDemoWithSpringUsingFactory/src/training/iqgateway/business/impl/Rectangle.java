package training.iqgateway.business.impl;

import training.iqgateway.business.Shape;

public class Rectangle extends Shape{
	
	private double length,width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		super();
		System.out.println("parameterised constructor from rectangle called");
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	public double getArea() {
		return length * width;
	}

}
