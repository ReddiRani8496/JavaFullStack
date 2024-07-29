package training.iqgateway.client;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NotePadFrame extends JFrame {
    private JMenuBar jMenuBar2 = new JMenuBar();
    private JMenu jMenu1 = new JMenu();
    private JMenu jMenu2 = new JMenu();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JMenuItem jMenuItem2 = new JMenuItem();
    private JMenuItem jMenuItem3 = new JMenuItem();
    private JMenuItem jMenuItem4 = new JMenuItem();

    public NotePadFrame() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Note Pad Frame" );
        this.setJMenuBar(jMenuBar2);
        jMenu1.setText("File");
        jMenu2.setText("Open");
        jMenuItem1.setText("Save");
        jMenuItem2.setText("close");
        jMenuItem3.setText("New");
        jMenuItem4.setText("Save As");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jMenuItem4);
        jMenuBar2.add(jMenu1);
        jMenu2.add(jMenuItem1);
        jMenu2.add(jMenuItem2);
        jMenuBar2.add(jMenu2);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
