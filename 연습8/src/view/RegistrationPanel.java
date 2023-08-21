package view;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class RegistrationPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private SelectionPanel selectionPanel;
	private JPanel movePanel1;
	private JPanel basketPanel1;
	private JPanel movePanel2;
	private JPanel resultPanel1;
	
	public RegistrationPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.selectionPanel = new SelectionPanel();
		this.add(this.selectionPanel);
		
		this.movePanel1 = new JPanel();
		this.add(this.movePanel1);
		
		this.basketPanel1 = new JPanel();
		this.add(this.basketPanel1);
		
		this.movePanel2 = new JPanel();
		this.add(this.movePanel2);
		
		this.resultPanel1 = new JPanel();
		this.add(this.resultPanel1);
		
	}

	public void initialize(String id) {
		this.selectionPanel.initialize(id);
//		this.basketPanel1.initialize(id);
//		this.resultPanel1.initialize(id);
	}
	

}
