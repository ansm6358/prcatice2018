package ����5;

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
		this.mainFrame.setTitle("������û");
		this.mainFrame.setSize(350, 200);
		this.mainFrame.setLocationRelativeTo(null);
		this.mainFrame.setLayout(new FlowLayout());
		this.mainFrame.setVisible(true);
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		
		TitledBorder title= new TitledBorder("�α���â");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitlePosition(TitledBorder.TOP);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setPreferredSize(new Dimension(340,156));
		LoginPanel.setBackground(Color.red);
		LoginPanel.setBorder(title);
		this.mainFrame.add(LoginPanel);	
		
		JLabel LoginLabel = new JLabel("���̵�");
		
		LoginPanel.add(LoginLabel);
		
		JLabel pwLabel = new JLabel("��й�ȣ");
		
		LoginPanel.add(pwLabel);
		
		JTextField LoginText = new JTextField("���̵�");
		
		LoginPanel.add(LoginText);
		
		JTextField pwText = new JTextField("��й�ȣ");
		
		LoginPanel.add(pwText);
		
		JButton LoginButton = new JButton("Login");
		
		LoginPanel.add(LoginButton);
		
		JButton CancleButton = new JButton("Cancle");
		
		LoginPanel.add(CancleButton);
	}
	

	public static void main(String[] args) { //os�� ���⼭ ���� �����϶�� �� //�� Ŭ������ �������� �˷����� ���� ����
		Main main;
		main = new Main();
		main.run();
	}

}
