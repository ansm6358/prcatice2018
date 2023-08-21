package view;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CLecture;
import valueObject.VCLecture;

class LecturePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private CLecture cLecture;
	private Vector<VCLecture> vCLectures;
	
	private LectureList lectureList;
	
	public LecturePanel() {
		this.lectureList = new LectureList();
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setViewportView(this.lectureList);
		this.add(scrollpane);
	}	
	public void initialize(String id) {
		// TODO Auto-generated method stub
		
	}
	
	public void refresh(String filename) {
		this.cLecture = new CLecture();
		this.vCLectures = cLecture.getData(filename);
		
		this.lectureList.addRows(this.vCLectures);
	}
	
	private class LectureList extends JTable{
		private static final long serialVersionUID = 1L;
		
		private DefaultTableModel tableModel;
		
		private LectureList() {
			Vector<String> header = new Vector<String>();
			header.add("강좌번호");
			header.add("강좌명");
			header.add("담당교수");
			header.add("학점");
			header.add("시간");
			this.tableModel = new DefaultTableModel(header,0);
			this.setModel(this.tableModel);
			
		}

		public void addRows(Vector<VCLecture> vCLectures) {
			if(vCLectures != null) {
				this.tableModel.setRowCount(0);
				Vector<String> rowData;
				for(VCLecture vCLecture: vCLectures) {
					rowData = new Vector<String>();
					rowData.add(vCLecture.getId());
					rowData.add(vCLecture.getName());
					rowData.add(vCLecture.getProfessorName());
					rowData.add(vCLecture.getCredit());
					rowData.add(vCLecture.getTime());
					this.tableModel.addRow(rowData);
				}
					this.getSelectionModel().addSelectionInterval(0, 0);
					this.updateUI();
			}
		} 
	}
}