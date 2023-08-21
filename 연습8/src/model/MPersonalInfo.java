package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import global.Constants.EDataFileName;
import valueObject.VMPersonalInfo;

public class MPersonalInfo {

	public VMPersonalInfo getPersonalInfo(String id) {
		VMPersonalInfo vEPersonalInfo = new VMPersonalInfo();
		try {
			File file = new File(EDataFileName.path.getString()+EDataFileName.personalInfo.getString());
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				vEPersonalInfo.readFromFile(scanner);
				if(vEPersonalInfo.getId().equals(id)) {
					return vEPersonalInfo;
				}
				
			}
			scanner.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
