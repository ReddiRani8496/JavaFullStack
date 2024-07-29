package training.iqgateway;

public class StringProcessing {
    public static void main(String[] args) {
        
        String companyName = "iQGateway ";
        String location = "Bengaluru";
        String fullAddress = companyName + location;
        System.out.println("Company Name ID " + companyName.hashCode());
        System.out.println("Company Location  " + location.hashCode());
        System.out.println("Company  fullAddress  " +  fullAddress.hashCode());
        
        companyName = companyName + location;
        System.out.println("Company Name ID " + companyName.hashCode());
        
        
        String s1 = new String("TCS");
        String s2 = new String("Chennai");
        String s3 = new String("Chennai");
        System.out.println(s2.hashCode() + " " + s3.hashCode());
        
        int i = 123456;
        System.out.println(String.valueOf(i).charAt(4));
    }
}
