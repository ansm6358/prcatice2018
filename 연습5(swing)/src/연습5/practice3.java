package ����5;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class practice3  extends JFrame{
	public practice3() {
		super("����");
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton a1 = new JButton("1��");
		this.add(a1);
	}
	
	public static void main(String[] args){
		practice3 a = new practice3();

	}

}