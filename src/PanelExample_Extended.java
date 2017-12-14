import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExample_Extended {

	public JPanel createContentPane() {
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.YELLOW);
		
		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(10,35);
		redPanel.setSize(100,100);
		totalGUI.add(redPanel);
		
		JButton redButton = new JButton("clock");
		redButton.setBounds(15, 40, 70, 20);
		redPanel.add(redButton);
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setLocation(0, 0);
		redLabel.setSize(50, 40);
		redLabel.setHorizontalAlignment(0);
		redPanel.add(redLabel);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(460, 35);
		bluePanel.setSize(100, 100);
		totalGUI.add(bluePanel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(120,35);
		greenPanel.setSize(330, 100);
		totalGUI.add(greenPanel);
		
		JButton blueButton = new JButton("alarm");
		blueButton.setBounds(10, 40, 80, 20);
		bluePanel.add(blueButton);
		
		JPanel grayPanel = new JPanel();
		grayPanel.setBackground(Color.DARK_GRAY);
		grayPanel.setLocation(10, 140);
		grayPanel.setSize(550, 50);
		totalGUI.add(grayPanel);
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

}
