/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.composite;

/**
 *
 * @author Sai Baba
 */
public class CompositePatternTester {
    
    public static void main(String[] args) {
        
        Shape triangleShape1 = new Triangle();
        Shape triangleShape2 = new Triangle();
        
        Shape circleShape1 = new Circle();
        Shape CircleShape2 = new Circle();
        
        Drawing drawingRef = new Drawing();
        drawingRef.add(triangleShape1);
        drawingRef.add(triangleShape2);
        drawingRef.add(circleShape1);
        drawingRef.add(CircleShape2);
        drawingRef.draw("Blue");
        
        drawingRef.clear();
        
        drawingRef.add(triangleShape1);
        drawingRef.add(triangleShape2);
        drawingRef.add(circleShape1);
        drawingRef.add(CircleShape2);
        drawingRef.draw("Green");
    }
    
}
