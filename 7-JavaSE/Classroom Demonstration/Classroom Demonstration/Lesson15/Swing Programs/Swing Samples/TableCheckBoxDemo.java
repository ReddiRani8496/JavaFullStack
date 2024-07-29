

import java.sql.Timestamp;

import java.util.ArrayList;

import javax.swing.*;

import javax.swing.table.*;

public class TableCheckBoxDemo extends JFrame {

 

    private static final long serialVersionUID = 1L;

    private JTable table;

 

    public TableCheckBoxDemo() {

		Object[] columnNames = {"Type", "Company", "Shares", "Price", "Boolean"};


        Object[][] data = {

            {"Buy", "IBM", new Integer(1000), new Double(80.50), false},

            {"Sell", "MicroSoft", new Integer(2000), new Double(6.25), true},

            {"Sell", "Apple", new Integer(3000), new Double(7.35), true},

            {"Buy", "Nortel", new Integer(4000), new Double(20.00), false}

        };


        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        table = new JTable(model) {

 

            private static final long serialVersionUID = 1L;

 

         
            @Override
            public Class getColumnClass(int column) {

                switch (column) {

                    case 0:

                        return String.class;

                    case 1:

                        return String.class;

                    case 2:

                        return Integer.class;

                    case 3:

                        return Double.class;

                    default:

                        return Boolean.class;

                }

            }

        };

        table.setPreferredScrollableViewportSize(table.getPreferredSize());

        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane);

       

        for (int i = 0; i < table.getRowCount(); i++) {

             Boolean isChecked = Boolean.valueOf(table.getValueAt(i, 4).toString());
             if (isChecked) {

                //get the values of the columns you need.
                   System.out.println(" Clicked .. ");

            } else {

                System.out.printf("Row %s is not checked \n", i);

            }

        }

    }

 

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

 

            public void run() {

                TableCheckBoxDemo frame = new TableCheckBoxDemo();

                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

                frame.pack();

                frame.setLocation(150, 150);

                frame.setVisible(true);

            }

        });

    }

}