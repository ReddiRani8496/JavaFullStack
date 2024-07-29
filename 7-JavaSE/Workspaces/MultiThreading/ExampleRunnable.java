public class ExampleRunnable implements Runnable {
	private int i = 0;
	
	public void run() { // Runnable interface run method is called
		
		for( i=0;i<10;i++) {
			//System.out.println(i);
			System.out.println("Value of i from : " + Thread.currentThread()+" "+i);

		}
	}
	public static void main(String[] args) {
		ExampleRunnable runnableObj = new ExampleRunnable();
		Thread thread1 = new Thread(runnableObj);
		thread1.start();
		
		Thread thread2 = new Thread(runnableObj);
		thread2.start();
	}
}	