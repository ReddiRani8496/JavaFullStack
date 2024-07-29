
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
		MyRunnableExample runObj = new MyRunnableExample();
        es.execute(runObj);
        es.execute(runObj);
        es.shutdown();
    }
}
