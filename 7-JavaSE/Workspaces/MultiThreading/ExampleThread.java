public class ExampleThread extends Thread {
	//private  int i=0; // each thread object has one copy of i
	@Override
	public void run() {
		for( i=0;i<10;i++) {
			System.out.println("Value of i from : " + Thread.currentThread()+" "+i);
			
		}
	}
	public static void main(String[] args) {
		ExampleThread thread1 = new ExampleThread();
		thread1.start();
		ExampleThread thread2 = new ExampleThread();
		thread2.start();
	}
}	