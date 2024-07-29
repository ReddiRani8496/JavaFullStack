
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
		//NewExampleRunnable runObj = new NewExampleRunnable();
        es.execute(new NewExampleRunnable("One"));
        es.execute(new NewExampleRunnable("Two"));
        es.shutdown();
    }
}
