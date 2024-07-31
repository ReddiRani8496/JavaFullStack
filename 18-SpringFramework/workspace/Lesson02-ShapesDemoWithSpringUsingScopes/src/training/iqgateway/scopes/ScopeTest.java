package training.iqgateway.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.impl.Rectangle;

public class ScopeTest {
	
	public static void main(String[] args) {
		System.out.println("Singleton beans from same context");
		singletonTest1("rectangleBean");
		
		System.out.println("Prototype beans from same context");
		singletonTest1("rectangleBean1");
	}
	
	public static void singletonTest1(String beanName) {
		ApplicationContext appCxt = new ClassPathXmlApplicationContext("/beans.xml");
		
		Rectangle r1 =(Rectangle) appCxt.getBean(beanName);
		
		Rectangle r2 =(Rectangle) appCxt.getBean(beanName);
		
		compareRectangles(r1,r2);
		r1.setLength(50);
		compareRectangles(r1,r2);
	}
	
	
	public static void compareRectangles(Rectangle r1, Rectangle r2) {
		System.out.println(" R1: ");
		r1.printInfo();
		System.out.println(" R2: ");
		r2.printInfo();
		System.out.printf(" R1==R2 : %s%n ", r1==r2);
	}
}
