import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BackImgPanel extends JPanel {
	private Image img;
	
	public BackImgPanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}
}

public class PanelBackgroundImg {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Background Image");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		BackImgPanel panel = new BackImgPanel(new ImageIcon("./images/lance-asper-pAWY7xrsLwc-unsplash.jpg").getImage());
		frame.add(panel);
		frame.pack();
//		File file = new File("./images/Miami_city.jpg");
//		System.out.println(file.exists() ? "Exists" : "Not Exists");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
