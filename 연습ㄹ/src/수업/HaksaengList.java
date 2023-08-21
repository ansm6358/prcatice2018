package ¼ö¾÷;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class HaksaengList {
	//components
	private Vector<Haksaeng> haksaengVector;
	
	public HaksaengList() {
		this.haksaengVector = new Vector<Haksaeng>();
	}
	
	public void readFromFile() throws FileNotFoundException {

		File file = new File("haksaeng.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			Haksaeng haksaeng = new Haksaeng();
			haksaeng.readFromFile(scanner);
			this.haksaengVector.add(haksaeng);
		}
		scanner.close();
	
	}

	public void writeToFile() {
		for(Haksaeng haksaeng: this.haksaengVector) {
			haksaeng.writeToFile();
		}
	}

	public String getHaksaengName(int haksaengID) throws HaksaengNumberNotExistException {
		for (Haksaeng haksaeng: this.haksaengVector) {
			if(haksaeng.getId()==haksaengID) {
				return haksaeng.getName();
			}
		}	
		throw new HaksaengNumberNotExistException(haksaengID);
	}

}
