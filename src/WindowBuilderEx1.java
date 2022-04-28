import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class WindowBuilderEx1 {

	private JFrame frame;
	private JTextField txtfdId;
	private JTextField txtfdPw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderEx1 window = new WindowBuilderEx1();
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
	public WindowBuilderEx1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnNewButton.setBounds(283, 41, 131, 174);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginForm.setBounds(67, 13, 229, 32);
		frame.getContentPane().add(lblLoginForm);
		
		txtfdId = new JTextField();
		txtfdId.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtfdId.setBounds(93, 64, 148, 32);
		frame.getContentPane().add(txtfdId);
		txtfdId.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(12, 58, 65, 32);
		frame.getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setBounds(12, 143, 65, 32);
		frame.getContentPane().add(lblPw);
		
		txtfdPw = new JTextField();
		txtfdPw.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtfdPw.setColumns(10);
		txtfdPw.setBounds(93, 148, 148, 32);
		frame.getContentPane().add(txtfdPw);
	}
}
