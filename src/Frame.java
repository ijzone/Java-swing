import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel();				// Button Panel.
		
		JLabel label = new JLabel("JLabel Text");
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea();		// Multiple line of text.
		JTextField txtField = new JTextField();		// single line of text. Possible to put int number to set allow text size.
		
		/** panel.add(new JLabel("Welcome to Brandon's Application"));	// Set text in JPanel. */
		
		panel.setLayout(new BorderLayout());
		
		/** button panel */
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		/** button Action Listener */
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				txtArea.append("Hello Brandon zone$\n");
				label.setText(txtArea.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		/** Set components position */
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);
		
		frame.add(panel);											// Set JPanel in JFrame.
		frame.setResizable(false);									// Resizable YN setting.
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));		// Set preferred window size.
		frame.setSize(840, 840/12*9);								// Set application window size.
		frame.setLocationRelativeTo(null);							// Set application to the center.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// Set stopping JVM when exit the application.
	}
}
