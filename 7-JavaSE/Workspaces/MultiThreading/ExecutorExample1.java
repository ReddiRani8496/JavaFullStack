import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;
public class ExecutorExample1 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		Future<String> f1= es.submit(new ExampleCallable("One", 5));
		Future<String> f2 = es.submit(new ExampleCallable("Two",10));
		
		try {
			es.shutdown();
			es.awaitTermination(5, TimeUnit.SECONDS);
			
			String result1 = f1.get();
			System.out.println("Result of one: " + result1);
			
			String result2 = f2.get();
			System.out.println("Result of second: " + result2);
		} catch(ExecutionException | InterruptedException e) {
				e.printStackTrace();
		}		
	}
}	
		