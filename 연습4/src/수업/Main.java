package 수업;

import java.io.IOException;
// 2018.04.04에 이어서
public class Main {
	
	public static void main(String[] args) throws IOException { // main = code segment의 시작
		Lecture lecture = new Lecture();//lecture라는 실체를 만들어냄
//		lecture.computeSum(); //lecture가 가진 동사(computeSum)를 시킨것
//		lecture.computerAverageUsingScanner();
		lecture.computerAverageUsing();
	}
}