package training.iqgateway;

public class AppEntry{
    public static void main(String[] args) {
        
        Customer custRef1 = new Customer();
        custRef1.setCustId(1001);
        custRef1.setName("Vishnu");
        custRef1.setAddress("Indira Nagar");
        custRef1.setPhone("23878744");
        
        Customer custRef2 = new Customer();
        custRef2.setCustId(1002);
        custRef2.setName("Rani");
        custRef2.setAddress("Chennai");
        custRef2.setPhone("7438984375");
    }
}
