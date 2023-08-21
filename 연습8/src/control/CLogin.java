package control;
import model.MLogin;

public class CLogin {
	private MLogin mLogin;
	
	public boolean valudateUser(String ID, String password) {
		this.mLogin = new MLogin();		
		boolean result = this.mLogin.valudateUser(ID, password);
		return result;
	}

}
