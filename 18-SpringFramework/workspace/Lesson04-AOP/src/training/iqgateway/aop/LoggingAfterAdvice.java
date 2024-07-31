package training.iqgateway.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.messaging.simp.stomp.BufferingStompDecoder;

public class LoggingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object result, Method businessMethodName, Object[] businessMethodArgs, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging after advice invoked...");
		System.out.println("Logging advice inkoved on : " + businessMethodName);
		System.out.println("Arguments of business method : " + businessMethodArgs[0]);
		System.out.println("Result from the business method: " + result);
		
	}

}
