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
public class CommandExecutorProxy implements CommandExecutor {
    
    private boolean isAdmin;
    private CommandExecutor executor;
    
    public CommandExecutorProxy(String username, String pwd) {
        if(username.equals("Rahul") && pwd.equals("rahul123")) {
            isAdmin=true;
            executor = new CommandExecutorImpl();
        }
    }
    
    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin) {
            if(cmd.contains("mk")) {
                throw new Exception("mk Command is Not Allowed ...");
            }
            else
            {
                executor.runCommand(cmd);
            }
            
        }
        else {
            if(cmd.contains("mk")) {
                throw new Exception("mk Command is Not Allowed ...");
            }
            else
            {
                executor.runCommand(cmd);
            }
        }
    }
 }
