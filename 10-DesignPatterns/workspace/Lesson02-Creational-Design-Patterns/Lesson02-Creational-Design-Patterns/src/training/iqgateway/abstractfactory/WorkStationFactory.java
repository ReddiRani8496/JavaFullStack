/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.abstractfactory;

/**
 *
 * @author Sai Baba
 */
public class WorkStationFactory {
    
    public static WorkStation getWorkstation(ComputerAbstractFactory factory) {
        return factory.createWorkStation();
    }
    
}
