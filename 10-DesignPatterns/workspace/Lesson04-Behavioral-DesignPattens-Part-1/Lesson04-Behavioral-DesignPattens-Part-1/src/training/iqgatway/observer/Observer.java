/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgatway.observer;

/**
 *
 * @author Sai Baba
 */
public interface Observer {
    
    // Method to Update the Observer, Used By Subject
    public void update();
    
    // Attach With Subject to Observe
    public void setSubject(Subject sub);
    
}
