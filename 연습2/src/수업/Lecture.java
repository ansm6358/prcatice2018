package 수업;

import java.io.File;
import java.io.IOException;
// Lecture : computerSum과 computerAverageFromFile라는 두개의 동사로 정의된 명사
// 아무거나 정의할 수 있음
public class Lecture {
	
	public void computerAverageUsing() throws IOException {
		File file; //-> 메모리 할당 및 주소지정
		file = new File("score.txt"); //-> File을 Open함 -> 더 특정한 정보 = Parameter
		// new : 1. 메모리 공간 확보, 2. 메모리 시작 주소를 'file'이름에 가져다줌
		// 에러나는 이유 : 읽어올 파일이름을 만들지 않았다.
		Scanner scanner = new Scanner(file); //파일을 직접읽어오는것이 아니라, 받은 것을 읽어서 번역만 해주는 것
		//scanner.delimiter(); 구문 인식 기준 세우기
		//기본 delimiter : 띄워쓰기, 라인피드, 리턴캐리지

		String names[] = new String[10];	// 시작주소 + 몇번째 주소  => HDD의 파일을 메모리로 올리기 위함임 
		float scores[] = new float[10]; // 10개를 만들라는 소리     => HDD의 파일을 메모리로 올리기 위함임
		char grades[] = new char[10];// 계산해서 저장하기 위함
		//0~9번 까지의 메모리 할당
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) { //->boolean
			names[count] = scanner.next();//String을 읽는 것 -> Space나 캐릭터 리턴, 엔드오브 파일 등까지 / 메모리 이미 확보됨
			scores[count] = scanner.nextInt();//문자열로 읽고 이것을 Float로 변환해라
			if(scores[count]>90) {
				grades[count]='A';
			}else if(scores[count]>80) {
				grades[count]='B';
			}else if(scores[count]>70) {
				grades[count]='C';
			}else if(scores[count]>60) {
				grades[count]='D';
			}else{
				grades[count]='F';
			}
			sum = sum + scores[count];
			System.out.println(names[count]);
			System.out.println(scores[count]);
			count++; //count = count + 1;
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {//count갯수만큼 돔
			System.out.print(names[i]);
			System.out.print(scores[i]);//Carriage Return + Line Feed = ln = "\n"
			System.out.println(grades[i]);
		}
		avg = sum/count; // -> 0으로 나눠질 수 있는 문제가 있음!! -> 해결하는 것이 숙제
		System.out.println("\r\n"+avg);

		//String name1 = scanner.next();// 다음꺼 까지 읽어옴
		//float score1 = scanner.nextFloat();

		scanner.close(); //미리 해둘 것, 그리고 이 사이에 코딩하기


	}
		
}
