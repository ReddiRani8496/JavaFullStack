import java.util.concurrent.*;
public class ExampleCallable implements Callable {
	private final String name;
	private final int len;
	private int sum = 0;
	public ExampleCallable(String givenName, int givenLen) {
		this.name = givenName;
		this.len = givenLen;
	}
	public String call() throws Exception {
		for(int i=0;i<len;i++) {
			System.out.println(name + " : "+i);
			sum += i;
		}
		return "Sum = " + sum;
	}
}	