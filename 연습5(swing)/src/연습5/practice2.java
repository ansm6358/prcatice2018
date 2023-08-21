package 연습5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class practice2 extends JFrame{ //jframe을 상속
	practice2(){
		setTitle("연습2");
		setSize(200, 200);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null); //레이아웃(버튼 등등)의 위치 설정값을 없애 직접 설정하겠다는 의미
		JButton click = new JButton("here");
		click.setSize(70, 20);
		click.setLocation(50, 10);
		add(click);
		
		
	}

	public static void main(String[] args) {
		practice2 second = new practice2();

	}

}
