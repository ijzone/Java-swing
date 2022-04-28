import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTablePractice {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Practice");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"Id", "Name", "Country"};
		Object[][] data = new Object[][] {
			{"1", "Ikjoo", "Korea"},
			{"2", "Brandon", "USA"},
			{"3", "Shelly", "UK"}
		};
		
		JTable table = new JTable(data, headings);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		table.setFillsViewportHeight(true);
		
		panel.add(table);
		panel.add(new JScrollPane(table));
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
