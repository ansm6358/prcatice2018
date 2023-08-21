package 수업;

public class GwamokNameNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public GwamokNameNotFoundException(int gwamokID) {
		super("강좌번호가 존재하지 않습니다."+gwamokID);
		//extends는 exception을 가져오는 것
		//슈퍼는 부모가 해야할 일을 해라
	}


}
