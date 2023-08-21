import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JLabel nameLable;
	private JTextField nameText;
	private JLabel passwordLable;
	private JTextField passwordText;
	private JButton okButton;
	private JButton cancleButton;
	
	public LoginDialog(MainFrame mainFrame) {
		super(mainFrame);
		
		//attributes
		int x = mainFrame.getX() + mainFrame.getWidth()/2;
		int y = mainFrame.getY() + mainFrame.getHeight()/2;
		
		this.setSize(400,200);
		this.setLocation(x- this.getWidth()/2, y - this.getHeight()/2);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		// components
		ActionListener actionHandler = new ActionHandler();
		JPanel panel1 = new JPanel();
		nameLable= new JLabel(" 아이디  ");
		panel1.add(nameLable);
		nameText=new JTextField(15);
		panel1.add(nameText);
		this.add(panel1);
		
		JPanel panel2 = new JPanel();
		passwordLable= new JLabel("비밀번호");
		panel2.add(passwordLable);
		passwordText= new JTextField(15);
		panel2.add(passwordText);
		this.add(panel2);
		
		JPanel panel3 = new JPanel();
		okButton= new JButton("OK");
		okButton.addActionListener(actionHandler);
		okButton.setActionCommand("OK");	
		panel3.add(okButton);
		
		cancleButton= new JButton("cancle");
		cancleButton.addActionListener(actionHandler);
		cancleButton.setActionCommand("cancle");
		panel3.add(cancleButton);
		this.add(panel3);
	}
	
	class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent actionEvent) {	
			if(actionEvent.getActionCommand().equals("OK")) {
				System.out.println(nameText.getText());
				System.out.println(passwordText.getText());
			}
			else if(actionEvent.getActionCommand().equals("cancle")) {
				System.out.println("cancle");
			}
		}
		
	}

}
