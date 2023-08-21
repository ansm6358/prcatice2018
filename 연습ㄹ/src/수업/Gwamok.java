package ¼ö¾÷;

import java.util.Scanner;
import java.util.Vector;

public class Gwamok {
	
	private int id;
	private String name;
	

	public int getId() {return id;}

	public String getName() {return name;}


	public void readFromFile(Scanner scanner) {
		 this.id = scanner.nextInt();
		 this.name = scanner.next();		
	}

	public void writeToFile() {
		System.out.println(this.id+ " "+this.name);
		
	}
}	
