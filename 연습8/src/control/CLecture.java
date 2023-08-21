package control;

import java.util.Vector;

import model.MDirectory;
import model.MLecture;
import valueObject.VCDirectory;
import valueObject.VCLecture;
import valueObject.VMDirectory;
import valueObject.VMLecture;

public class CLecture {

	private MLecture mLecture;
	private Vector<VCLecture> vCLectures;
	
	public CLecture() {
		this.mLecture = new MLecture();
	}

	public Vector<VCLecture> getData(String filename) {
		Vector<VMLecture> vMLectures = this.mLecture.getData(filename);
		this.vCLectures = new Vector<VCLecture>();
		
		for (VMLecture vMLecture: vMLectures) {
			VCLecture  vCLecture = new VCLecture();
			vCLecture.setId(vMLecture.getId());
			vCLecture.setName(vMLecture.getName());
			vCLecture.setProfessorName(vMLecture.getProfessorName());
			vCLecture.setCredit(vMLecture.getCredit());
			vCLecture.setTime(vMLecture.getTime());
			this.vCLectures.add(vCLecture);
		}
		return this.vCLectures;
	}

}
