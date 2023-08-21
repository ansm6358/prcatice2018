public class Main {
	
	//component
	private MainFrame mainFrame; //메인은 메인프레임이라는 j프레임을 알고 있다
	//associate
	
	public Main() {
		this.mainFrame = new MainFrame(); //친구는 친구인데 내가 만든 친구(자식)
		this.mainFrame.setVisible(true);
	}

	public void run() {
		
	}
	
	public static void main(String[] args) { //os가 여기서 부터 실행하라는 것 //이 클래스는 시작점만 알려주지 위의 메인
		Main main;
		main = new Main();
		main.run();
	}

}
