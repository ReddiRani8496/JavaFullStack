/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.chainofresponsibility;

/**
 *
 * @author Sai Baba
 */
public class CORTester {
    
    private DispenseChain c1;
    
    public CORTester() {
           // Initialize the Chain 
           this.c1 = new Rupee500Dispenser();
           DispenseChain c2 = new Rupee200Dispenser();
           DispenseChain c3 = new Rupee100Dispenser();
           
           // Setting the Chain of Responsibility 
           c1.setNextChain(c2);
           c2.setNextChain(c3);
 
    }
    
    public static void main(String[] args) {
        CORTester corTesterRef = new CORTester();
        //while(true) {
            int amount = 0;
            System.out.println("Enter Withdrawl Amount : ");
            java.util.Scanner scanObj = new java.util.Scanner(System.in);
            amount = scanObj.nextInt();
            if(amount % 100 != 0) {
                System.out.println("Amount Should be in Multiples of 100's");
            }
            else {
                corTesterRef.c1.dispense(new Currency(amount));
            }
            return;
        //}
    }
}
