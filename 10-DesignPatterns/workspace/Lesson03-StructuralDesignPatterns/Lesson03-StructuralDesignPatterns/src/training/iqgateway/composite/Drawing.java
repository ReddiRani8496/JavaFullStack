/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sai Baba
 */
public class Drawing implements Shape{
    
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for(Shape s: shapes) {
            s.draw(fillColor);
        }
    }
    
    public void add(Shape s) {
        shapes.add(s);
    }
    
    public void remove(Shape s) {
        shapes.remove(s);
    }
    
    public void clear() {
        System.out.println("Clearing All the Shapes of Drawing ");
        shapes.clear();
    }
}
