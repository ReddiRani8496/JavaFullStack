package training.iqgateway.client.sample;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NotePadFrame extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JMenuBar jMenuBar1 = new JMenuBar();
    private JMenu jMenu1 = new JMenu();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JMenuItem jMenuItem2 = new JMenuItem();
    private JMenuItem jMenuItem3 = new JMenuItem();
    private JMenuItem jMenuItem4 = new JMenuItem();
    private JMenu jMenu2 = new JMenu();
    private JMenuItem jMenuItem5 = new JMenuItem();
    private JMenuItem jMenuItem6 = new JMenuItem();
    private JMenuItem jMenuItem7 = new JMenuItem();
    private JMenuItem jMenuItem8 = new JMenuItem();
    private JMenuItem jMenuItem9 = new JMenuItem();
    private JMenu jMenu3 = new JMenu();
    private JMenuItem jMenuItem10 = new JMenuItem();
    private JMenuItem jMenuItem11 = new JMenuItem();
    private JMenuItem jMenuItem12 = new JMenuItem();

    public NotePadFrame() {
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
        this.setTitle( "Note Pad Frame" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        jMenu1.setText("File");
        jMenuItem1.setText("New");
        jMenuItem2.setText("Save");
        jMenuItem3.setText("SaveAs");
        jMenuItem4.setText("Print");
        jMenu2.setText("Edit");
        jMenuItem5.setText("Cut");
        jMenuItem6.setText("Copy");
        jMenuItem7.setText("Paste");
        jMenuItem8.setText("Delete");
        jMenuItem9.setText("Find");
        jMenu3.setText("View");
        jMenuItem10.setText("Zoom");
        jMenuItem11.setText("Status Bar");
        jMenuItem12.setText("Word wrap");
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jMenu1.add(jMenuItem4);
        jMenuBar1.add(jMenu1);
        jMenu2.add(jMenuItem5);
        jMenu2.add(jMenuItem6);
        jMenu2.add(jMenuItem7);
        jMenu2.add(jMenuItem8);
        jMenu2.add(jMenuItem9);
        jMenuBar1.add(jMenu2);
        jMenu3.add(jMenuItem10);
        jMenu3.add(jMenuItem11);
        jMenu3.add(jMenuItem12);
        jMenuBar1.add(jMenu3);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
