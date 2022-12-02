package CS2020.assignment2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductListGUI 
{
    public ProductListGUI()
    {
        JFrame frame = new JFrame();

        frame.setSize(800,600);
        frame.setTitle("<Bryn Elliott>: Assignment 2");

        JPanel panel1 = new JPanel();//full window
        panel1.setBackground(Color.gray);
        panel1.setSize(800, 600);
        panel1.setLayout(new BorderLayout());
        JPanel panel2 = new JPanel();//left side
        panel2.setBackground(Color.gray);
        panel2.setPreferredSize(new Dimension(500, 600));
        panel2.setBorder(BorderFactory.createRaisedBevelBorder());
        JPanel panel3 = new JPanel();//right side
        panel3.setBackground(Color.white);
        panel3.setPreferredSize(new Dimension(300, 600));
        panel3.setBorder(BorderFactory.createEmptyBorder());


        // JSplitPane splitPane = new JSplitPane(SwingConstants.VERTICAL, panel2, panel3);
        // panel1.add(splitPane);

        panel1.add(panel2, BorderLayout.LINE_START);
        panel1.add(panel3, BorderLayout.LINE_END);

        JMenuItem i1, i2, i3, i4;  
        JMenuBar menuBar = new JMenuBar();  
        JMenu menu = new JMenu("Menu");   

        i1 = new JMenuItem("About");  
        i2 = new JMenuItem("Import Data");  
        i3 = new JMenuItem("Inventory");  
        i4 = new JMenuItem("Export to CSV");  

        menu.add(i1); 
        menu.add(i2); 
        menu.add(i3);  
        menu.add(i4); 

        menuBar.add(menu); 

        frame.setJMenuBar(menuBar); 
        frame.setLayout(null); 
        frame.add(panel1);
        frame.setVisible(true);  
    }
}