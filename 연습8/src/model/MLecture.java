package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import global.Constants.EDataFileName;
import valueObject.VMDirectory;
import valueObject.VMLecture;

public class MLecture {

	private Vector<VMLecture> vMLectures;
	
	public MLecture() {
		this.vMLectures = new Vector<VMLecture>();
	}

	public Vector<VMLecture> getData(String filename) {
		try {
			this.vMLectures.clear();
			
			File file = new File(EDataFileName.path.getString()+filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				VMLecture vELecture = new VMLecture();
				vELecture.readFromFile(scanner);
				this.vMLectures.add(vELecture);				
			}
			scanner.close();	
			return this.vMLectures;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
