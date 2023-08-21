package 연습5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Main {
	
	private JFrame mainFrame;
	
	public Main() {
		this.mainFrame = new JFrame();
		this.mainFrame.setTitle("수강신청");
		this.mainFrame.setSize(350, 200);
		this.mainFrame.setLocationRelativeTo(null);
		this.mainFrame.setLayout(new FlowLayout());
		this.mainFrame.setVisible(true);
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		
		TitledBorder title= new TitledBorder("로그인창");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitlePosition(TitledBorder.TOP);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setPreferredSize(new Dimension(340,156));
		LoginPanel.setBackground(Color.red);
		LoginPanel.setBorder(title);
		this.mainFrame.add(LoginPanel);	
		
		JLabel LoginLabel = new JLabel("아이디");
		
		LoginPanel.add(LoginLabel);
		
		JLabel pwLabel = new JLabel("비밀번호");
		
		LoginPanel.add(pwLabel);
		
		JTextField LoginText = new JTextField("아이디");
		
		LoginPanel.add(LoginText);
		
		JTextField pwText = new JTextField("비밀번호");
		
		LoginPanel.add(pwText);
		
		JButton LoginButton = new JButton("Login");
		
		LoginPanel.add(LoginButton);
		
		JButton CancleButton = new JButton("Cancle");
		
		LoginPanel.add(CancleButton);
	}
	

	public static void main(String[] args) { //os가 여기서 부터 실행하라는 것 //이 클래스는 시작점만 알려주지 위의 메인
		Main main;
		main = new Main();
		main.run();
	}

}
