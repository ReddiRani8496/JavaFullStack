package oe;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

import java.util.Scanner;
import java.util.*;

public class OrderEntry  
{
  public static void main(String[] args) throws Exception
  {
    Order   order = new Order();
    double  orderTotal;
    boolean exceedsLimit;
    double  taxRate = 0.0825;
    double  taxValue;

    System.out.println("Order Entry Application");
    orderTotal = order.getOrderTotal();
    System.out.println("Order Total: " + orderTotal);
    
    taxValue = orderTotal * taxRate;
    System.out.println("Tax Value:   " + taxValue);

    orderTotal += taxValue;
    System.out.println("Final Total: " + orderTotal);

    exceedsLimit = orderTotal > 10.00;
    System.out.println("Total Exceeds $10.00: " + exceedsLimit);

    // order.setOrderDate(27, 1, 2001);
    order.setOrderDate(27, 2, 2001);
    char region = 'A';
    String shipDate = order.getShipDate(region);
    System.out.println("Order Date:         " + order.getOrderDate());
    System.out.println("Days till shipping: " + Util.getDaysToShip(region));
    System.out.println("Expected Ship Date: " + shipDate);
    
    
    // customer objects
    Customer customer1 = new Customer();
    /*customer1.setId(1);
    customer1.setName("Gary Williams");
    customer1.setAddress("Houstone, TX");
    customer1.setPhone("713.555.8765");
    System.out.println("\nCustomers:"); */
    System.out.println(customer1.toString());
    System.out.println(customer1);
    
    Customer customer2 = new Customer();
    /* customer2.setId(2);
     customer2.setName("Lynn Munsinger");
     customer2.setAddress("Orlando, FL");
     customer2.setPhone("407.695.2210");    */
     System.out.println(customer2.toString());
     
     order.setCustomer(DataMan.findCustomerById(1));
     order.showOrder();
     order.setCustomer(DataMan.findCustomerById(2));
     order.showOrder();
     order.setCustomer(DataMan.findCustomerById(3));
     order.showOrder();
     
     Order order2 = new Order(Util.getDate(7, 3, 2002),"Overnight");
     System.out.println(order2);
     
     order2.setCustomer(DataMan.findCustomerById(6));
     String fileName = "Customer.txt";
     
        PrintWriter printWriter = new PrintWriter(fileName);
         printWriter.println(DataMan.findCustomerById(1));
         printWriter.println(DataMan.findCustomerById(2));
         printWriter.println(DataMan.findCustomerById(3));
         printWriter.println(DataMan.findCustomerById(4));
        printWriter.close();
        
        
        // read the customer.txt file
        FileInputStream fis = new FileInputStream(fileName);
        int fileSize = fis.available();
        byte[] bbuf = new byte[fileSize];
        fis.read(bbuf,0,fileSize);
        System.out.println( new String(bbuf));
//        for(int cx = 0 ;cx<fileSize;cx++) {
//            System.out.print(bbuf[cx]);
//        }
        fis.close();
        
        InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName));
        char[] cbuf = new char[fileSize];
        isr.read(cbuf);
        System.out.println(cbuf);
        isr.close();
        
     Scanner sc = new Scanner(new File(fileName));
     while(sc.hasNext())
            System.out.println(sc.nextLine());
     sc.close();
     
     ObjectOutputStream cs = new ObjectOutputStream(new FileOutputStream("customers.ser"));
     cs.writeObject(DataMan.findCustomerById(1));
     cs.close();
     
     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customers.ser"));
     Customer cust1 = (Customer) ois.readObject();
     ois.close();
     System.out.println(cust1);

     System.out.println("Order details");
     ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("orders.ser"));
     ous.writeObject(order);
     ous.close();
     
     
     ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream("orders.ser"));
     Order restOrd2 = (Order) ios1.readObject();
     System.out.println(restOrd2);
     restOrd2.showOrder();
     ios1.close();
     
     order.setCustomer(DataMan.findCustomerById(5));
     order.addOrderItem(2001);
     order.addOrderItem(2002);
     order.addOrderItem(2001);
     order.showOrder();
     
     System.out.println("Product is: " + DataMan.findProductById(2001));
 }
}