package training.iqgateway.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverApp {
	
	public static void main(String[] args) {
		BeanFactory beanFactoryRef = new ClassPathXmlApplicationContext("/beans.xml");
		
		ConfigurableApplicationContext configCtx = (ConfigurableApplicationContext) beanFactoryRef;
		
		configCtx.start();
		System.out.println(configCtx.isRunning());
		configCtx.stop();
		configCtx.close();
	}

}
