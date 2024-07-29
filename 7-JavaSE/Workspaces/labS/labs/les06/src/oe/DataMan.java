package oe;

import java.util.HashMap;

public class DataMan
{
//  static Customer customer1 = 
//       new Customer("Gary Williams", "Houston, TX", "713.555.8765");
//
//  static Customer customer2 =
//       new Customer("Lynn Munsinger", "Orlando, FL", "407.695.2210");
//
//  static Customer customer3 =
//       new Customer("Rachael O'leary", "Brisbane, QLD", "07.3031.1100");
//
//  static Customer customer4 =
//       new Customer("Tony Obermeit", "Brisbane, QLD", "07.3031.9987");
//    
//    static Customer customer5 = 
//        new Company("iQGateway","IndiraNagar","435354","Larry",20);
//    
//    static Customer customer6 =
//        new Individual("John","Banglore","34543543","54343");
    
//    private static Customer[] customers;
    private static Customer[] customers = null;
    
    public static void buildCustomers() {
        if(customers != null) return;
        customers = new Customer[6];
        customers[0] =  new Customer("Gary Williams", "Houston, TX", "713.555.8765");
        customers[1] = new Customer("Lynn Munsinger", "Orlando, FL", "407.695.2210");
        customers[2] =   new Customer("Rachael O'leary", "Brisbane, QLD", "07.3031.1100");
        customers[3] = new Customer("Tony Obermeit", "Brisbane, QLD", "07.3031.9987");
        customers[4] =  new Company("iQGateway","IndiraNagar","435354","Larry",20);
        customers[5] =   new Individual("John","Banglore","34543543","54343");
    }
    
   static {
        buildCustomers();
    }
    
    public static Customer findCustomerById(int custId) {
        for(int i=0;i<customers.length;i++) {
            System.out.println(customers[i].getId());
            if(customers[i].getId()==custId)
                return customers[i];
        }
        return null;
    }
    
    private static class ProductMap extends HashMap {
        public void add(Product p) {
            String key = Integer.toString(p.getId());
            put(key, p);
        }
       
    }
    private static ProductMap products = null;
    
    public static void buildProducts() {
        if(products != null) return;
        products = new ProductMap();
      //  products.add(new Product());
        
        products.add(
            new Hardware("SDRM - 128 MB", null, 299.0)
            );
        products.add(new Software("Spreadsheet-SSP/V2.0",null,45.0));
        products.add(new Software("Word Processing-SWP/V4.5", null, 65.0));
        products.add(new Manual("Manual-Vision OS/2x +", null, 125.0));
        products.add(new Hardware("GP 800x600",null,48.0));
    }
    
    static {
        buildProducts();
    }
    
    public static Product findProductById(int id) {
        String key = Integer.toString(id);
        return (Product) products.get(key);
    }
}
