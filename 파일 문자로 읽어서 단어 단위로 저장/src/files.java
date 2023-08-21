import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("abc.txt");
		Scanner sc = new Scanner(file);
		String b;
		String c;
		while(sc.hasNext()) {
			String a = sc.nextLine();
			int idx = a.indexOf(" ");
			String mail1 = a.substring(0, idx);
			char mail2 = a.charAt(0);
			char a1 = 'i';
			if(a1 == a.charAt(0)) {
			System.out.println(mail2);}
		}
		
	}

}
