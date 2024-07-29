/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.factorymethod.test;

import training.iqgateway.abstractfactory.LaptopFactory;
import training.iqgateway.abstractfactory.ServerFactory;
import training.iqgateway.abstractfactory.WorkStation;
import training.iqgateway.abstractfactory.WorkStationFactory;

/**
 *
 * @author Sai Baba
 */
public class AbstractFactoryPatternTest {
    
    public static void main(String[] args) {
        
         //Laptop laptopRef = new Laptop();
        WorkStation laptopRef = WorkStationFactory
                .getWorkstation(new LaptopFactory("8 GB", "480 GB", "2.4 GHz"));

        WorkStation serverRef = WorkStationFactory
                .getWorkstation(new ServerFactory("32 GB", "1000 TB", "3.0 GHz"));
        
        System.out.println("Factory Laptop Config Details  : " + laptopRef);
        System.out.println("Factory Server Configt Details : " + serverRef);
    }
    
}
