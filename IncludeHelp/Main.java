// Java Swing Program to Implementing 
// getIndexOf(Component com), getLayer(Component com) 
// and getPosition(Component com) methods in 
// JLayeredPane to get a specified layer information 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*; 

// Driver Class 
public class Main { 
	// main function 
	public static void main(String[] args) 
	{ 
		JFrame frame = new JFrame("JLayeredPane Example"); 
		frame.setDefaultCloseOperation( 
			JFrame.EXIT_ON_CLOSE); 
		frame.setSize(400, 400); 
		
		// Creating an object of JLayeredPane 
		JLayeredPane layeredPane = new JLayeredPane(); 
		
		frame.add(layeredPane); // Adding Frame to it 
		
		// Create three colored panels 
		JPanel panel1 = createColoredPanel(Color.RED, 100, 
										100, 200, 200); 
		JPanel panel2 = createColoredPanel(Color.GREEN, 150, 
										150, 200, 200); 
		JPanel panel3 = createColoredPanel(Color.BLUE, 200, 
										200, 200, 200); 
		
		// Add the panels to the layered pane with different 
		// layer values 
		layeredPane.add(panel1, JLayeredPane.DEFAULT_LAYER); 
		layeredPane.add(panel2, JLayeredPane.PALETTE_LAYER); 
		layeredPane.add(panel3, JLayeredPane.MODAL_LAYER); 
		
		// Creating a JButton by clicking which we get layer 
		// information 
		JButton getInfoButton = new JButton( 
			"Click here to get Layer Information"); 
		
		getInfoButton.setBounds(10, 10, 100, 30); 
		frame.add(getInfoButton); 
		
		getInfoButton.addActionListener( 
			new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent e) 
				{ 
					// Get information about the second 
					// panel (panel2) 
					int index = layeredPane.getIndexOf(panel2); 
					int layer = layeredPane.getLayer(panel2); 
					int position = layeredPane.getPosition(panel2); 

					JOptionPane.showMessageDialog(null, "Index: " + index 
							+ "\nLayer: " + layer + "\nPosition: " + position); 
				} 
			}); 

		frame.setVisible(true); 
	} 

	private static JPanel createColoredPanel(Color color,int x, int y,int width,int height) 
	{ 
		JPanel panel = new JPanel(); 
		panel.setBackground(color); 
		panel.setBounds(x, y, width, height); 
		return panel; 
	} 
}
