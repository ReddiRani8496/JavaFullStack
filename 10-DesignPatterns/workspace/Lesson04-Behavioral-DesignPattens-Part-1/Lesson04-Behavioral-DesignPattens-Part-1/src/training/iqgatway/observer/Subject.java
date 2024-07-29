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
public interface Subject {
   
    // Methods to Register and UnRegister Observers
    public void register(Observer obs);
    public void unregister(Observer obs);
    
    // Methods to Notify Observers of Some Change
    public void notifyObservers();
    
    // Method to Get Updates From the Subject
    public Object getUpdate(Observer obs);
    
}
