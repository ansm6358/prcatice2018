package ����10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
		   public static void main(String args[]) throws FileNotFoundException {
		        
		       String message = "This is a sample message.\n";
		       
		       File file = new File("test1.txt");
		       File file2 = new File("student");
		       Scanner scanner = new Scanner(file2);
				
		     
		     
		       FileWriter writer = null;
		        
		        try {
		            // ���� ������ ���뿡 �̾ ������ true��, ���� ������ ���ְ� ���� ������ false�� �����Ѵ�.
		            writer = new FileWriter(file, false);
		              while(scanner.hasNext()) {
					String sID = scanner.next();
					String sPassword = scanner.next();
					  writer.write(sID+" ");
					  writer.write(sPassword+"\r\n");
		              }
		          
		            writer.flush();
		            
		            System.out.println("DONE");
		        } catch(IOException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                if(writer != null) writer.close();
		            } catch(IOException e) {
		                e.printStackTrace();
		            }
		        }

	}

}
