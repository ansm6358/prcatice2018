public class Main {
	
	//component
	private MainFrame mainFrame; //������ �����������̶�� j�������� �˰� �ִ�
	//associate
	
	public Main() {
		this.mainFrame = new MainFrame(); //ģ���� ģ���ε� ���� ���� ģ��(�ڽ�)
		this.mainFrame.setVisible(true);
	}

	public void run() {
		
	}
	
	public static void main(String[] args) { //os�� ���⼭ ���� �����϶�� �� //�� Ŭ������ �������� �˷����� ���� ����
		Main main;
		main = new Main();
		main.run();
	}

}
