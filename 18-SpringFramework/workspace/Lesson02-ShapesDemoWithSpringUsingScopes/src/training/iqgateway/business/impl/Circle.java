package training.iqgateway.business.impl;

import training.iqgateway.business.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    	
    }
    
    public Circle(double radius) {
    	System.out.println("parameterised constructor from circle called");
        this.radius = radius;
    }

//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
    
   
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	 public double getArea() {
	    	return Math.PI * radius * radius;
	    }


}