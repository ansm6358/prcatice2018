package global;

public class Constants {
	public static enum EDataFileName{
		path("data/"),
		root("root"),
		login("login"),
		personalInfo("student");
		
		private String value;
		private EDataFileName(String value) {this.value = value;}
		public String getString() {return this.value;}
	}
	public static enum EMainFrame{ //static  ���������� �޸𸮸� �ʱ�ȭ �ؼ� �ּҸ� �� �� �ؼ� ����� ���°�
		serialVersionUID("1"),
		Title("������û"),
		Width("800"),
		Height("600");
		
		private String value;
		private EMainFrame(String value) {this.value = value;}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum ELoginDialog {
		serialVersionUID("1"),
		width("300"),
		height("200"),
		NameLable(" ���̵�  "),
		NameTextSize("15"),
		PasswordLable("��й�ȣ"),
		PasswordTextSize("15"),
		OkButton("OK"),
		CancleButton("cancle");
		
		
		
		private String value;
		private ELoginDialog(String value) {this.value = value;}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EPersonalInfoPanel{
		serialVersionUID("1"),
		LbInsaPostfix("�� �ȳ��ϼ���"),
		BtnInfo("��������"),
		BtnLogout("�α׾ƿ�");
		
		private String value;
		private EPersonalInfoPanel(String value) {this.value = value;}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EErrorDialog{
		serialVersionUID("1"),
		title("����"),
		message("�߸� �Է� �߽��ϴ�");
		
		private String value;
		private EErrorDialog(String value) {this.value = value;}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EDirectoryPanel{
		serialVersionUID("1");
		
		private String value;
		private EDirectoryPanel(String value) {this.value = value;}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
}

