import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilderEx2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderEx2 window = new WindowBuilderEx2();
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
	public WindowBuilderEx2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Ex2");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel lastPage = new JPanel();
		lastPage.setBounds(0, 0, 794, 576);
		frame.getContentPane().add(lastPage);
		lastPage.setLayout(null);
		
		JButton btnPrev = new JButton("Go To Next");
		JButton btnNext = new JButton("Go To Last");
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 794, 576);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrev.setVisible(false);
				btnNext.setVisible(true);
			}
		});
		btnPrev.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnPrev.setBounds(38, 72, 114, 318);
		startPage.add(btnPrev);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNext.setVisible(false);
				btnPrev.setVisible(true);
			}
		});
		btnNext.setVisible(false);
		btnNext.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnNext.setBounds(568, 76, 125, 375);
		lastPage.add(btnNext);
		
		
	}
}
