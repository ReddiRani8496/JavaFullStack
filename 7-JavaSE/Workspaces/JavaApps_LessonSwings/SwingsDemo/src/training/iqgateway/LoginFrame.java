package training.iqgateway;

import java.awt.Color;
import java.awt.*;

import javax.swing.*;
public class LoginFrame {
    public static void main(String[] args) {
        
        JFrame  loginFrame = new JFrame();
        loginFrame.setTitle("TMS Login");
        loginFrame.setVisible(true);
        loginFrame.setSize(500,500);
        loginFrame.setLocationRelativeTo(null);
         loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
      //   GridLayout gridLayoutRef = new GridLayout(2,2);
         
         JPanel componentsPanel = new JPanel();
         componentsPanel.setSize(200,200);
        // componentsPanel.setBackground(Color.black);
      //   componentsPanel.setLayout(gridLayoutRef);
         loginFrame.add(componentsPanel);
         
        JLabel nameLabel = new JLabel("Name");
        componentsPanel.add(nameLabel);
        
        JTextField nameTextField = new JTextField(25);
        componentsPanel.add(nameTextField);     
        
         JButton okBtn = new JButton("Click me");
         componentsPanel.add(okBtn);
         
         JButton cancelBtn = new JButton("Cancel");
         componentsPanel.add(cancelBtn);
         
      //  componentsPanel.repaint();
    }
}
