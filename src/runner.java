import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class runner {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	protected static void createAndShowGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame(" There are 3 JPanels in here! ");
		
		PanelExample_Extended demo = new PanelExample_Extended();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(580, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JOptionPane.showMessageDialog(frame, "Hello");
		
	}

}
