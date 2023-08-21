package 수업;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*1.Hasnext(25) 문제 -해결
delimeter (25)
   -delimeter 지정 가능(10)
Integer(25)
Float(25)
*/
public class Scanner {
	// instance variables
	private FileReader fileReader;
	private char[] delimeters = {0x0A, 0x0D, 0x20, 'x'};
	private int EOF = -1;
	private char minus = 0x2D;
	private char dot = 0x2E;
	private char first =0x30;
	private char last = 0x39;
	private String first_word="";
	private boolean being;
	public Scanner(File file) throws FileNotFoundException {
		this.fileReader = new FileReader(file);
	}
	
	public boolean hasNext() throws IOException {
		boolean eof = true;
		boolean del = true;
		int i = 0;
		int input = this.fileReader.read();
		while(del) {
			if(i==delimeters.length){
			first_word =first_word + (char)input;
			being = true;
			del = false;}
		else if(input == delimeters[i]) {
			being = false;
			del = false;
			}
		else if(!(input == delimeters[i])) {
				i++;
			}	
}	
		

		if(input==EOF) {
			this.fileReader.close();
			eof = false;
		}
		return eof;
	}
	
	private int skipDelemeter() throws IOException {
			int i = 0;	
		int delemeter =0;
		int word = 0;
		boolean del = false;
		int hex = this.fileReader.read();
		while(!del) {
		if(i==delimeters.length){
				word = hex;	
			del = true;}
		else if(hex == delimeters[i]) {
			delemeter = hex;
			int hex2=this.fileReader.read();
			hex = hex2;
			i=0;
			}
		else if(!(hex == delimeters[i])) {
				i++;
			}	
}	
		return word;
	}
	private boolean isDelimeter(int lastChar) {
		boolean Delimeter;
		Delimeter = false;
		
		for(int i=0; i<delimeters.length;i++) {
			if(lastChar==delimeters[i]) {
				Delimeter = true;
			}
		}
		if(lastChar==EOF) {
			Delimeter = true;
		}
		return Delimeter;
	}

	public String next() throws IOException {
		String result = new String();
		int lastChar = skipDelemeter(); //딜리미터만 패스
		while(!isDelimeter(lastChar)) { 
			if(being){		
				result = result + first_word;
					being = false;	}
		result = result + (char)lastChar; //*다음 이름에 LF가 앞에 붙어오는 문제가 있음
		first_word = "";

		lastChar = this.fileReader.read(); //delimeter를 측정하는 동사 생성		
	}
		return result;
	}

	private int stringToInt(String string) {
		int currenVal = 0;
		boolean change = false;
		for(int i =0; i<string.length(); i++) {
			if(string.charAt(i)==minus) {
				change = true;
				i++;
			}
			else if(string.charAt(i)>=first && string.charAt(i)<=last)
			currenVal = currenVal*10 + (string.charAt(i) & 0x0F); //00001111 and 시켜서 아스키캐릭터로 이진법으로 변환			
		
			else {
				System.out.print("정수가 아닙니다. 옳은 숫자를 넣어주세요.");
			}

		}
		while(change) {
			currenVal = 0 - currenVal;
			change = false;
		}
		return currenVal;
	}

	public float nextInt() throws IOException {
		String string = this.next();
		int result = stringToInt(string);
		return result;
	}
	
	private float stringToFloat(String string) {
		float currenVal = 0;
		float  decimal = 0;
		boolean change = false;
		boolean infront = true;
		for(int i =0; i<string.length(); i++) { 
			if(string.charAt(i)==minus) {
				change = true;
			}
			else if(string.charAt(i) ==dot) {
				infront = false;
			}
			else if(string.charAt(i)<first && string.charAt(i)>last) {
				System.out.print("실수가 아닙니다. 옳은 값을 넣어주세요.");
			}
			else if (infront) {
				currenVal = currenVal*10 + (string.charAt(i) & 0x0F); //00001111 and 시켜서 아스키캐릭터로 이진법으로 변환
			}
			else if(!infront){
			decimal = decimal/10 + (string.charAt(i) & 0x0F)/10;
		}
			}
			currenVal = currenVal + decimal;	
		while(change) {
			currenVal = 0 - currenVal;
			change = false;
		}

		return currenVal;

}

	public float nextFloat() throws IOException {
		String string = this.next();
		float result = stringToFloat(string);
		return result;
	}
	

	public void close() throws IOException {
	}

}
