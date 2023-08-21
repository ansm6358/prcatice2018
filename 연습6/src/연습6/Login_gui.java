package 연습6;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login_gui extends JFrame{
	
	String ddddd = "1234";
	String PW = "12345";
	
	Login_gui(){
		super("로그인창");
		this.setSize(300, 200);
		this.setLayout(new GridLayout(2,1,30,30));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel PanelL = new JPanel();
		PanelL.setLayout(new GridLayout(2,0));
		this.add(PanelL);
		
		JPanel PanelT = new JPanel();
		PanelT.setLayout(new GridLayout(2,0));
		this.add(PanelT);
		
		JPanel PanelB = new JPanel();
		PanelB.setLayout(new GridLayout(2,1));
		this.add(PanelB);

		JPanel PanelB2 = new JPanel();
		PanelB2.setLayout(new GridLayout(2,1));
		this.add(PanelB2);
		
		
		JButton Cancle = new JButton("Cancle");
		PanelB2.add(Cancle);
		
		JLabel ID = new JLabel("                        아이디");
		JLabel Password = new JLabel("                        비밀번호");
		PanelL.add(ID);
		PanelL.add(Password);
		
		JTextField IDBox = new JTextField("아이디");
		JTextField passwordBox = new JTextField("비밀번호");
		PanelT.add(IDBox);
		PanelT.add(passwordBox);
		
		JButton Login = new JButton("Login");
		
		Login.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent arg0) {
				String get_id = IDBox.getText();
				String get_pw = passwordBox.getText();
				if(ddddd.equals(get_id)&&PW.equals(get_pw)) {
					JOptionPane.showMessageDialog(null, "log in succseeesss");

					//System.out.println("log in succseeesss");
				}
			}
		});
		PanelB.add(Login);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Login_gui first = new Login_gui();

	}

}
