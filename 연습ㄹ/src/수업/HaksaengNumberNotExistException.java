package 수업;

public class HaksaengNumberNotExistException extends Exception {


	public HaksaengNumberNotExistException(int haksaengID) {
		super("학생 번호가 존재하지 않습니다-"+haksaengID); //super 클래스는 상속 받는 것
		// TODO Auto-generated constructor stub
	}

	

}
