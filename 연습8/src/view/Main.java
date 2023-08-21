package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import global.Constants.ELoginDialog;


public class Main {
	
	//component
	private LoginDialog loginDialog;
	private MainFrame mainFrame;
	//associate
	
	public Main() {
		//child window
		ActionHandler actionHandler = new ActionHandler();
		this.loginDialog = new LoginDialog(actionHandler);

	}
	private void initialize() {
		this.loginDialog.initialize();	
	}
	private void loginOK() {
		String id =loginDialog.validateUser();
				if(id != null) {
				loginDialog.dispose();	
				this.mainFrame = new MainFrame();
				this.mainFrame.initialize(id);
				}
			}
	private void loginCancle() {
			loginDialog.cancle();
				loginDialog.dispose();		
	}
	
	class ActionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent actionEvent) {	
			if(actionEvent.getActionCommand().equals(ELoginDialog.OkButton.getString())) {
				loginOK();
				
				
			}else if(actionEvent.getActionCommand().equals(ELoginDialog.CancleButton.getString())) {
				loginCancle();
			}
		}	
	}
	
	public static void main(String[] args) { 
		Main main;
		main = new Main();
		main.initialize();
	}
	

}
