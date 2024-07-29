package training.iqgateway.client;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class LoginUI extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JPasswordField jPasswordField1 = new JPasswordField();
    private JTextField jTextField1 = new JTextField();
    private JButton jButton1 = new JButton();

    public LoginUI() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Login UI" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        jLabel1.setText("User Name");
        jLabel1.setBounds(new Rectangle(30, 10, 95, 20));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(30, 65, 85, 25));
        jPasswordField1.setBounds(new Rectangle(125, 60, 130, 30));
        jTextField1.setBounds(new Rectangle(125, 5, 130, 30));
        jButton1.setText("Login");
        jButton1.setBounds(new Rectangle(120, 125, 94, 27));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jPasswordField1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
