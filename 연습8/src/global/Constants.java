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
	public static enum EMainFrame{ //static  고정적으로 메모리를 초기화 해서 주소를 할 당 해서 만들어 놓는것
		serialVersionUID("1"),
		Title("수강신청"),
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
		NameLable(" 아이디  "),
		NameTextSize("15"),
		PasswordLable("비밀번호"),
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
		LbInsaPostfix("님 안녕하세요"),
		BtnInfo("개인정보"),
		BtnLogout("로그아웃");
		
		private String value;
		private EPersonalInfoPanel(String value) {this.value = value;}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EErrorDialog{
		serialVersionUID("1"),
		title("오류"),
		message("잘못 입력 했습니다");
		
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

