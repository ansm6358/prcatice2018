package ����;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*1.Hasnext(25) ���� -�ذ�
delimeter (25)
   -delimeter ���� ����(10)
Integer(25)
Float(25)
*/
public class Scanner {

	// instance variables
	private FileReader fileReader;

	public Scanner(File file) throws FileNotFoundException {
		this.fileReader = new FileReader(file);
	}
	static String first_word = "";
	public boolean hasNext() throws IOException {
		boolean eof = true;		
		int input = this.fileReader.read();
		if(!(input==10) || (input==32)||(input == -1)) 
		{first_word = first_word + (char)input;}
		if(input==-1) {
			this.fileReader.close();
			eof = false;
		}
		return eof;
	}
	
	private int skipDelemeter() throws IOException {
		
		int delemeter =0;
		int word = 0;
		boolean del = false;
		while(!del) {
			int hex = this.fileReader.read();
		if((hex==10) || (hex==32)||(hex == -1)) {
			delemeter = hex;
		}
		else {
			word = hex;	
			del = true;
}}	
		return word;
	}
	private boolean isDelimeter(int lastChar) {
		boolean Delimeter;
		Delimeter = false;
		switch(lastChar) {
		case 0x20: //space
			Delimeter = true;
				break;
			case 0xD: //LF
			Delimeter = true;
				break;
			case 0xA:  //CR
			Delimeter = true;
				break;
			default:
					break;
			case -1:
				Delimeter = true;
				break;
			}
		
		return Delimeter;
	}

	public String next() throws IOException {
		String result = new String();
		int lastChar = skipDelemeter(); //�������͸� �н�
		while(!isDelimeter(lastChar)) { 
		result = result + first_word;
		result = result + (char)lastChar; //*���� �̸��� LF�� �տ� �پ���� ������ ����
		first_word = "";
		lastChar = this.fileReader.read(); //delimeter�� �����ϴ� ���� ����		
	}
		return result;
	}

	private int stringToInt(String string) {
		int currenVal = 0;
		for(int i =0; i<string.length(); i++) {
			currenVal = currenVal*10 + (string.charAt(i) & 0x0F); //00001111 and ���Ѽ� �ƽ�Űĳ���ͷ� ���������� ��ȯ			
		}
		return currenVal;
	}

	public float nextInt() throws IOException {
		String string = this.next();
		int result = stringToInt(string);
		return result;
	}


	public void close() throws IOException {
	}

}
