package ����5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class practice2 extends JFrame{ //jframe�� ���
	practice2(){
		setTitle("����2");
		setSize(200, 200);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null); //���̾ƿ�(��ư ���)�� ��ġ �������� ���� ���� �����ϰڴٴ� �ǹ�
		JButton click = new JButton("here");
		click.setSize(70, 20);
		click.setLocation(50, 10);
		add(click);
		
		
	}

	public static void main(String[] args) {
		practice2 second = new practice2();

	}

}
