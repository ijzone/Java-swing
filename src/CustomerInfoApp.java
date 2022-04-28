import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class CustomerInfoApp {

	private JFrame frame;
	private JTextField txtID;
	private JPasswordField txtPW;
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField birthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInfoApp window = new CustomerInfoApp();
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
	public CustomerInfoApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 1936, 1067);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		
		JLabel lblWelcome = new JLabel("Welcome! This is Main Panel");
		lblWelcome.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblWelcome.setBounds(372, 78, 417, 52);
		mainPanel.add(lblWelcome);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(121, 146, 210, 44);
		mainPanel.add(lblNewLabel_1);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblAge.setBounds(121, 216, 210, 44);
		mainPanel.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblGender.setBounds(121, 296, 210, 44);
		mainPanel.add(lblGender);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPhone.setBounds(457, 146, 210, 44);
		mainPanel.add(lblPhone);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblBirthday.setBounds(457, 216, 210, 44);
		mainPanel.add(lblBirthday);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNote.setBounds(457, 296, 210, 44);
		mainPanel.add(lblNote);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		name.setBounds(272, 146, 199, 44);
		mainPanel.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 18));
		age.setColumns(10);
		age.setBounds(272, 216, 199, 44);
		mainPanel.add(age);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		phone.setColumns(10);
		phone.setBounds(615, 143, 199, 44);
		mainPanel.add(phone);
		
		birthday = new JTextField();
		birthday.setFont(new Font("Tahoma", Font.PLAIN, 18));
		birthday.setColumns(10);
		birthday.setBounds(615, 216, 199, 44);
		mainPanel.add(birthday);
		
		JComboBox gender = new JComboBox(new String[] {"Male", "Female"});
		gender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gender.setBackground(Color.WHITE);
		gender.setBounds(272, 299, 199, 44);
		mainPanel.add(gender);
		
		JTextArea note = new JTextArea();
		note.setBackground(Color.LIGHT_GRAY);
		note.setBounds(615, 296, 199, 114);
		mainPanel.add(note);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nameTxt = name.getText();
				String ageTxt = age.getText();
				String phoneTxt = phone.getText();
				String bTxt = birthday.getText();
				String genderTxt = gender.getSelectedItem().toString();
				String noteTxt = note.getText();
						
			}
		});
		
		btnNewButton_1.setBounds(348, 442, 199, 44);
		mainPanel.add(btnNewButton_1);
//		frame.setBounds(100, 100, 450, 300);
		ImgPanel welcomePanel = new ImgPanel(new ImageIcon("C://workspace-java/Swing/images/lance-asper-pAWY7xrsLwc-unsplash.jpg").getImage());
		welcomePanel.setBounds(0, 0, 1936, 1067);
		frame.getContentPane().add(welcomePanel);
		welcomePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(443, 131, 95, 51);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 30));
		welcomePanel.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setBounds(332, 195, 315, 68);
		txtID.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txtID.setToolTipText("Enter ID");
		welcomePanel.add(txtID);
		txtID.setColumns(10);
		
		txtPW = new JPasswordField();
		txtPW.setBounds(332, 292, 315, 68);
		txtPW.setToolTipText("Enter Password");
		welcomePanel.add(txtPW);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(225, 196, 106, 68);
		lblId.setFont(new Font("SansSerif", Font.BOLD, 18));
		welcomePanel.add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(225, 292, 106, 68);
		lblPw.setFont(new Font("SansSerif", Font.BOLD, 18));
		welcomePanel.add(lblPw);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(342, 373, 288, 55);
		btnNewButton.setIcon(new ImageIcon("C:\\workspace-java\\Swing\\images\\login_button_1.jpg"));
		btnNewButton.setPressedIcon(new ImageIcon("C:\\workspace-java\\Swing\\images\\login_button_1_clicked.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Login Clicked!");
				System.out.println(txtID.getText());
				System.out.println(String.valueOf(txtPW.getPassword()));
				
				/**
				 * Possible to compare JPasswordField => Arrays.equals(txtPW.getPassword(), "ikjoo".toCharArray()
				 */
				if( "Brandon".equals(txtID.getText()) && "ikjoo".equals(String.valueOf(txtPW.getPassword())) ) {
					JOptionPane.showMessageDialog(frame, "Welcome Brandon!");
					welcomePanel.setVisible(false);
					mainPanel.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(frame, "Please try again...");
				}
				txtID.setText("");
				txtPW.setText("");
			}
		});
		
		welcomePanel.add(btnNewButton);
		frame.setSize(welcomePanel.getWidth(), welcomePanel.getHeight());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar());
	}
	/** 윈도우 상단 메뉴바 생성 */
	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		
		bar.add(fileMenu);
		bar.add(aboutMenu);
		
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		
		fileMenu.add(openFile);
		fileMenu.addSeparator();	// 메뉴 버튼 사이에 선 넣기.
		fileMenu.add(exit);
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);		// 프로그램 종료.
			}
		});
		
		return bar;
	}
}
	
class ImgPanel extends JPanel {
	private Image img;
	
	public ImgPanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}
}

