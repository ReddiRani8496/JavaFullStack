package training.iqgateway.client.sample;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OrderEntry extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JTextField jTextField2 = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JButton jButton1 = new JButton();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JTextArea jTextArea6 = new JTextArea();

    public OrderEntry() {
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
        this.setTitle( "OrderEntry" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        jLabel1.setText("Order Id");
        jLabel1.setBounds(new Rectangle(10, 10, 80, 25));
        jTextField1.setBounds(new Rectangle(95, 15, 100, 20));
        jLabel2.setText("Customer Id");
        jLabel2.setBounds(new Rectangle(10, 65, 105, 20));
        jTextField2.setBounds(new Rectangle(110, 60, 85, 25));
        jLabel3.setText("Name");
        jLabel3.setBounds(new Rectangle(10, 95, 51, 20));
        jLabel4.setText("Phone");
        jLabel4.setBounds(new Rectangle(10, 125, 51, 20));
        jLabel5.setText("Address");
        jLabel5.setBounds(new Rectangle(5, 160, 75, 20));
        jTextArea1.setBounds(new Rectangle(80, 95, 130, 20));
        jTextArea2.setBounds(new Rectangle(75, 125, 135, 20));
        jTextArea3.setBounds(new Rectangle(80, 160, 125, 20));
        jLabel6.setText("Order Date");
        jLabel6.setBounds(new Rectangle(225, 10, 80, 25));
        jLabel7.setText("Order Total");
        jLabel7.setBounds(new Rectangle(225, 50, 85, 25));
        jLabel8.setText("Product Id");
        jLabel8.setBounds(new Rectangle(225, 125, 90, 20));
        jLabel9.setText("Add");
        jLabel9.setBounds(new Rectangle(270, 170, 85, 25));
        jButton1.setText("Add");
        jButton1.setBounds(new Rectangle(270, 170, 85, 30));
        jTextArea4.setBounds(new Rectangle(310, 15, 75, 20));
        jTextArea5.setBounds(new Rectangle(310, 55, 80, 15));
        jTextArea6.setBounds(new Rectangle(305, 125, 90, 20));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        this.getContentPane().add(jTextArea6, null);
        this.getContentPane().add(jTextArea5, null);
        this.getContentPane().add(jTextArea4, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jLabel9, null);
        this.getContentPane().add(jLabel8, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jTextArea3, null);
        this.getContentPane().add(jTextArea2, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel1, null);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
