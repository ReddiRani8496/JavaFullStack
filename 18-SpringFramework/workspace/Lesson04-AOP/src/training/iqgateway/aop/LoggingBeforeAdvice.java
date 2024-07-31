package training.iqgateway.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method businessMethodName, Object[] businessMethodArgs, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging before advice invoked....");
		System.out.println("Logging advice invoked on: " + businessMethodName);
		System.out.println("Arguments of Business Method: " + businessMethodArgs[0]);
		
	}
	
}
