/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.adapter;

/**
 *
 * @author Sai Baba
 */
public class AdapterPatternTester {
    
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }
    
    private static Volt getVolt(SocketAdapter sockAdapterRef, int i) {
        switch(i) {
            case 3   : return sockAdapterRef.get3Volt();
            case 12  : return sockAdapterRef.get12Volt();
            case 120 : return sockAdapterRef.get120Volt();
            default  : return sockAdapterRef.get120Volt();
        }
    }
    
    private static void testObjectAdapter() {
        SocketAdapter sockAdapterRef = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapterRef, 3);
        Volt v12 = getVolt(sockAdapterRef, 12);
        Volt v120 = getVolt(sockAdapterRef, 120);
        
        System.out.println("V3 Volts Using Object Adapter = " + v3.getVolts());
        System.out.println("V12 Volts Using Object Adapter = " + v12.getVolts());
        System.out.println("V120 Volts Using Object Adapter = " + v120.getVolts());
    }
    
    private static void testClassAdapter() {
        SocketAdapter sockAdapterRef = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapterRef, 3);
        Volt v12 = getVolt(sockAdapterRef, 12);
        Volt v120 = getVolt(sockAdapterRef, 120);
        
        System.out.println("V3 Volts Using Class Adapter = " + v3.getVolts());
        System.out.println("V12 Volts Using Class Adapter = " + v12.getVolts());
        System.out.println("V120 Volts Using Class Adapter = " + v120.getVolts());
    }
    
}
