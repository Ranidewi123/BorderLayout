import javax.swing.*;
import java.awt.*;

public class LayoutBorderTP {

	JFrame frame = new JFrame("TP1 Border Layout");
	JLabel title1 = new JLabel("NORTH");
	JLabel title2 = new JLabel("SOUTH");
	JLabel title3 = new JLabel("CENTER");
	JLabel title4 = new JLabel("WEST");
	JLabel title5 = new JLabel("EAST");
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	public LayoutBorderTP() {
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		
		panel1.setBackground(new Color(255, 198, 178));
		panel2.setBackground(new Color(255, 159, 139));
		panel3.setBackground(new Color(255, 123, 111));
		panel4.setBackground(new Color(219, 46, 61));
		panel5.setBackground(new Color(255, 63, 63));
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		panel1.add(title1);
		panel2.add(title2);
		panel3.add(title3);
		panel4.add(title4);
		panel5.add(title5);
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LayoutBorderTP();
			}
		});
	}

}