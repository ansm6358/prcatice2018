package 수업;

import java.io.FileNotFoundException;
import java.io.IOException;
// 2018.04.04에 이어서
public class Main {
	
	public static void main(String[] args){ 
		try {
		//개설된 강좌를 수강하는 학생들의 성적을 처리
		//0.학생 등록
		GwamokList gwamokList = new GwamokList();
		gwamokList.readFromFile();
		gwamokList.writeToFile();	
		//1.강좌 개설-과목, 담당 교수, 강의실, 학기, ...
		HaksaengList haksaengList = new HaksaengList();
		haksaengList.readFromFile();
		haksaengList.writeToFile();
		//2.수강신청-학번
		Gangjwa sugang = new Gangjwa();
		sugang.associate(gwamokList,haksaengList);
		sugang.readFromFile();
		sugang.writeToFile();
		sugang.a();
	
		//3.성적처리-학번,성적
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (GwamokNameNotFoundException e) {
			e.printStackTrace();
		}
	}
}