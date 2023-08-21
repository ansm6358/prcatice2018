package control;

import model.MPersonalInfo;
import valueObject.VCPersonalInfo;
import valueObject.VMPersonalInfo;

public class CPersonalInfo {

	private MPersonalInfo mPersonalInfo;
	
	public CPersonalInfo() {
		this.mPersonalInfo = new MPersonalInfo();
	}
	
	public VCPersonalInfo getPersonalInfo(String id) {
		//get data from entity
		VMPersonalInfo vEPersonalInfo = this.mPersonalInfo.getPersonalInfo(id);
		
		//create control value object and set data from entity value object
		VCPersonalInfo vCPersonalInfo = new VCPersonalInfo();
		vCPersonalInfo.setId(vEPersonalInfo.getId());
		vCPersonalInfo.setName(vEPersonalInfo.getName());
		
		return vCPersonalInfo;
	}

}
