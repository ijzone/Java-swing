import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame {

	public LoginWindow() {
		JPanel panel = new JPanel();
		JLabel laId = new JLabel("ID");
		JLabel laPw = new JLabel("Password");
		
		JTextField txtId = new JTextField(10);
		JPasswordField txtPw = new JPasswordField(10);
		JButton logBtn = new JButton("Login");
		
		panel.add(laId);
		panel.add(txtId);
		panel.add(laPw);
		panel.add(txtPw);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Brandon";
				String pw = "lee";
				
				if( id.equals(txtId.getText()) && pw.equals(String.valueOf(txtPw.getPassword())) ) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully!");
				}else {
					JOptionPane.showMessageDialog(null, "Please check your ID and Password");
				}
			}
		});
		add(panel);
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LoginWindow();
	}
	
	/**
	 * Swing Designer
	 * 1. Swing 디자인을 UI로 편하게 만들어 주는 기능.
	 * 2. WindowBuilder가 없을 경우:
	 * 	  Eclipse Marketplace -> WindowBuilder 다운로드 받아서 사용.
	 */
}
