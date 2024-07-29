/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.fatorymethod;

import training.iqgateway.fatorymethod.Laptop;
import training.iqgateway.fatorymethod.Server;
import training.iqgateway.fatorymethod.WorkStation;

/**
 *
 * @author Sai Baba
 */
// Factory Class
public class WorkStationFactory {

    // Factory Method [ Factory is a Place Where Products are Created ], 
    // In Java Context [ Factory method Creates the Requried Objects ]
    public static WorkStation getWorkStation(String givenType, String givenRam, 
                                             String givenSsd, String givenCpu) {
        
        if("Laptop".equalsIgnoreCase(givenType)) {
            return new Laptop(givenRam, givenSsd, givenCpu);
        }
        else if("Server".equalsIgnoreCase(givenType)) {
            return new Server(givenRam, givenSsd, givenCpu);
        }
        return null;
    }
 }
