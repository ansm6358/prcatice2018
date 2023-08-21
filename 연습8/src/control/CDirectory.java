package control;

import java.util.Vector;

import model.MDirectory;
import valueObject.VCDirectory;
import valueObject.VMDirectory;

public class CDirectory {

	private MDirectory mDirectory;
	private  Vector<VCDirectory> vCDirectories;
	
	public CDirectory() {
		this.mDirectory = new MDirectory();
	}

	public Vector<VCDirectory> getData(String filename) {
		Vector<VMDirectory> vEDirectories = this.mDirectory.getData(filename);
		this.vCDirectories = new Vector<VCDirectory>();
		for (VMDirectory vEDirectory: vEDirectories) {
			VCDirectory  vCDirectory = new VCDirectory();
			vCDirectory.setId(vEDirectory.getId());
			vCDirectory.setText(vEDirectory.getText());
			vCDirectory.setFilename(vEDirectory.getFilename());
			this.vCDirectories.add(vCDirectory);
		}
		
		
		
		
		return this.vCDirectories;
	}

}
