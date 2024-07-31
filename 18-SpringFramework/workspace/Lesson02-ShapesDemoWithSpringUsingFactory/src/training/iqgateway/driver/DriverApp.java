package training.iqgateway.driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.Shape;
import training.iqgateway.business.impl.Circle;
import training.iqgateway.business.impl.Rectangle;

public class DriverApp {
	public static void main(String[] args) {
		
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("/beans.xml");
		
		
		Shape shapeRef = (Rectangle) appCtx.getBean("rectangleBean");
		shapeRef.printInfo();
		
		
		Shape shapeRef1 = (Circle) appCtx.getBean("circleBean");
		shapeRef1.printInfo();
		
		Shape shapeRef3 = (Shape) appCtx.getBean("shapeMakerBean");
		
		shapeRef3.printInfo();
		
	}
}
