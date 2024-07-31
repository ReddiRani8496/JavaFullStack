package training.iqgateway.factory;

import training.iqgateway.business.Shape;
import training.iqgateway.business.impl.Circle;
import training.iqgateway.business.impl.Rectangle;

public class ShapeMaker {
	
	public ShapeMaker(double givenValue) {
		System.out.println(givenValue + " from shapemaker constructor");
	}
	
	public static Shape randomShape(double size) {
		double d = Math.random();
		System.out.println(d);
		Shape shapeObjToBeReturned = null;
		if(d<0.33) {
			shapeObjToBeReturned= new Circle(size);
		}else if(d<0.66) {
			shapeObjToBeReturned = new Rectangle(size, size*2);
		} else {
			shapeObjToBeReturned = new Rectangle(size, size*4);
		}
		return shapeObjToBeReturned;
	}
}
