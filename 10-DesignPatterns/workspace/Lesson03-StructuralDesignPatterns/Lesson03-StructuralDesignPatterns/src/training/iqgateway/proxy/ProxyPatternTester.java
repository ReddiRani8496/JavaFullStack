/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.proxy;

/**
 *
 * @author Sai Baba
 */
public class ProxyPatternTester {
    
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Rahul", "rahul123");
        
        try
        {
            executor.runCommand("cmd.exe dir");
            executor.runCommand("cmd.exe mkdir");
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
