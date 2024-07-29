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
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a Triangle with " + fillColor);
    }
    
}
