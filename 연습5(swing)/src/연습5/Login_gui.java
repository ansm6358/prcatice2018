package 연습5;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Login_gui extends JFrame{
	Login_gui(){
		super("로그인창");
		this.setSize(300, 200);
		this.setLayout(new GridLayout(2,1,30,30));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TitledBorder title= new TitledBorder("12345");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitlePosition(TitledBorder.TOP);
		
		JPanel PanelL = new JPanel();
		PanelL.setLayout(new GridLayout(2,0));
		this.add(PanelL);
		PanelL.setBorder(title);
		
		JPanel PanelT = new JPanel();
		PanelT.setLayout(new GridLayout(2,0));
		this.add(PanelT);
		
		JPanel PanelB = new JPanel();
		PanelB.setLayout(new GridLayout(2,1));
		this.add(PanelB);

		JPanel PanelB2 = new JPanel();
		PanelB2.setLayout(new GridLayout(2,1));
		this.add(PanelB2);
		
		JButton Login = new JButton("Login");
		PanelB.add(Login);
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
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Login_gui first = new Login_gui();

	}

}
