/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sai Baba
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }
    
    @Override
    public void addUser(User user) {
       this.users.add(user);
    }
    
    @Override
    public void sendMessage(String msg, User user) {
        for(User u: this.users) {
            // Message should not be received by the User Sending it
            if(u != user) {
                u.receive(msg);
            }
        }
    }
}
