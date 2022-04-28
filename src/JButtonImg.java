import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class JButtonImg {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JButtonImg window = new JButtonImg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JButtonImg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 837, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 819, 496);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("New button");
		button.setIcon(new ImageIcon("C:\\workspace-java\\Swing\\images\\button_1.jpg"));
		button.setBounds(306, 141, 163, 70);
		/** Button pressed event */
		button.setPressedIcon(new ImageIcon("C:\\\\workspace-java\\\\Swing\\\\images\\\\button_1_clicked.jpg"));
		panel.add(button);
	}
}
