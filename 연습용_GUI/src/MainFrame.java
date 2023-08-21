import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel;
	private LoginDialog loginDialog;
	
	//constructor
	public MainFrame() {
		//attributes
		this.setTitle(Constants.MAIN_TITLE); 
		this.setSize(Constants.MAIN_W, Constants.MAIN_H);		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(
				dim.width/2 -this.getSize().width/2, 
				dim.height/2 -this.getSize().height/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//components
		this.mainPanel = new JPanel();	
		this.add(this.mainPanel);
		
		//child window
		this.loginDialog = new LoginDialog(this);
		this.loginDialog.setVisible(true);
	}
}
