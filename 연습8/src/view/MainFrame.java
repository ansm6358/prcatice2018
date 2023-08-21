package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;

import global.Constants.EMainFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = EMainFrame.serialVersionUID.getInt();
	
	private PersonalInfoPanel personalInfo;
	private RegistrationPanel registration;
	
	//constructor
	public MainFrame() {
		//attributes
		this.setTitle(EMainFrame.Title.getString()); 
		this.setSize(EMainFrame.Width.getInt(), EMainFrame.Height.getInt());		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(
				dim.width/2 -this.getSize().width/2, 
				dim.height/2 -this.getSize().height/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//components
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		this.personalInfo = new PersonalInfoPanel();
		this.add(this.personalInfo, BorderLayout.NORTH);
		
		this.registration = new RegistrationPanel();
		this.add(this.registration, BorderLayout.CENTER);
		
		this.setVisible(true);

	}

	public void initialize(String id) {
		
		this.personalInfo.initialize(id);
		this.registration.initialize(id);
	}

}
