package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import global.Constants.EDataFileName;
import valueObject.VMDirectory;

public class MDirectory {

	private Vector<VMDirectory> vEDirectories;
	
	public MDirectory() {
		this.vEDirectories = new Vector<VMDirectory>();
	}

	public Vector<VMDirectory> getData(String filename) {
		try {
			this.vEDirectories.clear();
			
			File file = new File(EDataFileName.path.getString()+filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				VMDirectory vEDirectory = new VMDirectory();
				vEDirectory.readFromFile(scanner);
				this.vEDirectories.add(vEDirectory);				
			}
			scanner.close();	
			return this.vEDirectories;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
