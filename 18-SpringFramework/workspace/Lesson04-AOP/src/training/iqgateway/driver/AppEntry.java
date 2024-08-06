package training.iqgateway.driver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.CurrencyConverter;
import training.iqgateway.business.impl.CurrencyConverterImpl;
import training.iqgateway.business.impl.Customer;

public class AppEntry {
	public static void main(String[] args) {
		
		
		// Creating dependent object
//		CurrencyConverterImpl ccRef = new CurrencyConverterImpl();
		
		//Creating source object on which dependent is dependent on
//		Customer custRef = new Customer(1001,"Rahul","Indiranagar","8790787");
		
		// Binding the dependency via setter method [setter injection]
//		ccRef.setCustomerRef(custRef);
		
		// Binding the dependency via constructor method [constructor injection]
		//CurrencyConverterImpl ccRef = new CurrencyConverterImpl(custRef);
		
		
		// Instantiation of IOC container
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("/beans.xml");
		
		//Looking up for the business component object
		
		CurrencyConverter ccRef = (CurrencyConverter)appCtx.getBean("businessBean");
		
		
		//Invoke business methods
		System.out.println(ccRef.dollarToRS(1000));
	}
}