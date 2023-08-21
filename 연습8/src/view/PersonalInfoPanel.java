package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.CPersonalInfo;
import global.Constants.EPersonalInfoPanel;
import valueObject.VCPersonalInfo;


public class PersonalInfoPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel lbInsa;
	private JLabel lbInsaPostfix;
	private JButton btnInfo;
	private JButton btnLogout;

	public PersonalInfoPanel() {
		this.lbInsa = new JLabel();
		this.add(this.lbInsa);
		this.lbInsaPostfix = new JLabel(EPersonalInfoPanel.LbInsaPostfix.getString());
		this.add(this.lbInsaPostfix);
		this.btnInfo = new JButton(EPersonalInfoPanel.BtnInfo.getString());
		this.add(this.btnInfo);
		this.btnLogout = new JButton(EPersonalInfoPanel.BtnLogout.getString());
		this.add(this.btnLogout);
		
	}
	public void initialize(String id) {
		this.showPersonalInfo(id);
	}	 
	
	private void showPersonalInfo(String id) {
		CPersonalInfo cPersonalInfo = new CPersonalInfo();
		VCPersonalInfo vEPersonalInfo= cPersonalInfo.getPersonalInfo(id);
		this.lbInsa.setText(vEPersonalInfo.getName());
	}


}
