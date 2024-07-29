/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.bridge;

/**
 *
 * @author Sai Baba
 */
public class BridgePatternTester {
    
    public static void main(String[] args) {
        Shape triangleRef = new Triangle(new RedColor());
        triangleRef.applyColor();
        
        Shape circleRef = new Circle(new BlueColor());
        circleRef.applyColor();
        
    }
    
}
