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
public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;
    
    public MyTopicSubscriber(String givenName) {
        this.name = givenName;
    }
    
    @Override
    public void update() {
       String msg = (String) topic.getUpdate(this);
       if(msg == null) {
           System.out.println(name + " : No new message ");
       }
       else {
           System.out.println(name + " : Consuming message " + msg);
       }
    }

    @Override
    public void setSubject(Subject sub) {
       this.topic = sub;
    }
    
}
