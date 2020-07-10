import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame {

	public JButton importArray;
	public JButton printTree;
	public JTextField treeContainer;
	public JButton label;
	
	public GUI() {
	
		setPreferredSize(new Dimension(1000, 600));
		setLocation(150, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tree GUI");

		JPanel mainPanel = new JPanel();
		
		treeContainer = new JTextField(10);
		importArray = new JButton("Import array");
		//printTree = new JButton("Print Binary Tree");
		//label = new JButton("Array to Binary Tree");
		
		mainPanel.add(treeContainer);
		//panel.add(label);
		//panel.add(printTree);
		//panel.add(importArray);
		
		setContentPane(mainPanel);
		setVisible(true);
		pack();
		
	}
	
	public void paint(Graphics g) {
		g.drawLine(0, 0, 100, 100);
		/*super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		Line2D line = new Line2D.Float(0,0,100,100);
		g2.draw(line);*/
	}
	
	
	public static void main(String[] args) {
		
		new GUI();
		
	}

}
