package ¼ö¾÷;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class GwamokList {
	//components
	private Vector<Gwamok> gwamokVector;  
	
	public GwamokList() {
		this.gwamokVector = new Vector<Gwamok>();
	}
	
	public String getGwamokName(int gwamokID) throws GwamokNameNotFoundException {
		for (Gwamok gangjwa: this.gwamokVector) {
			if(gangjwa.getId()==gwamokID) {
				return gangjwa.getName();
			}
		}	
		throw new GwamokNameNotFoundException(gwamokID);
	}

	public void readFromFile() throws FileNotFoundException {
		File file = new File("gwamok.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			Gwamok gwamok = new Gwamok();
			gwamok.readFromFile(scanner);
			this.gwamokVector.add(gwamok);
		}
		scanner.close();
		
	}

	public void writeToFile() {
		for(Gwamok gwamok: this.gwamokVector) {
			gwamok.writeToFile();
		}
	}
}
