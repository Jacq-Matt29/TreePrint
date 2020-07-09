import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI extends JFrame {

	public JButton importArray;
	public JButton printTree;
	
	public GUI() {
	
		setPreferredSize(new Dimension(700, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI trial");;
		
		JPanel panel = new JPanel();
		
		importArray = new JButton("Import array");
		printTree = new JButton("Print Binary Tree");
		importArray.setBounds(20, 20, 160, 30);
		printTree.setBounds(20, 20, 160, 30);
		
		panel.add(importArray);
		panel.add(printTree);
		
		this.getContentPane().add(panel);
		pack();
		setVisible(true);
		
		//int[] arr = {33, 17, 44, 2, 4, 99, 86};
		//TreePrint tree = new TreePrint(arr);
		
		
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
