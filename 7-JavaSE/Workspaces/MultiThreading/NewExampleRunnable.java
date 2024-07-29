public class NewExampleRunnable implements Runnable {
	private final String name;
	public NewExampleRunnable(String givenName) {
		this.name = givenName;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+" : "+i);
		}
	}
}
	