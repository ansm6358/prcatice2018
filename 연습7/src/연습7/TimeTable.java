package ����7;

import java.util.ArrayList;
import java.util.HashMap;


public class TimeTable<LectureInfoBean> implements Cloneable {
	
	// ��:0, ȭ:1, ��:2 ... �� ���� ������ �����ϴ� �ؽ�
	private HashMap<Character, Integer> dayMap = null;
	// �� x �� �ð�ǥ
	// �ð�ǥ���� row�� ���� �ð� [ ex) 0,1,2,3,4,5,6,7,8,9 ] col�� ��, ȭ, ��, ��, .. �� ���� ������ ����
	private boolean[][] timeTable = null;
	// ���� �ش� TimeTable Ŭ������ ���Ե� ������ ID�ڵ�, lectureInfoHash�� ��ȸ�ϴµ� ���ȴ�
	private ArrayList<String> lectureIDList = null;
	// ����� ���� ���� ����� �ڷᱸ��, ���� TimeTable�� ���ԵǾ� �ִ� ������ �̸��� ���Եȴ�
	// �˻��� �ӵ��� �����Ͽ� Hash�� �����
	// ���� ������ ������ �ִٸ� true�� �����Ѵ�
	private HashMap<String, Boolean> lectureNameHash = null;
	// ���� ������ ������ ������ ���̺�
	private HashMap<String, ArrayList<LectureInfoBean>> lectureInfoMap = null;
	// ���� ��������� ������ �� ������ �� �������� �˷��ش�
	private int curCredit = 0;
	
	public int getCredit() {
		return this.curCredit;
	}
	
	public void setLectureInfoMap(HashMap<String, ArrayList<LectureInfoBean>> map) {
		
		this.lectureInfoMap = map;
	}
	
	@SuppressWarnings("unchecked")
	public TimeTable clone() throws CloneNotSupportedException {
		
		TimeTable tableBean = (TimeTable) super.clone();
		tableBean.dayMap = (HashMap<Character, Integer>) dayMap.clone();
		tableBean.lectureIDList = (ArrayList<String>) lectureIDList.clone();
		tableBean.lectureNameHash = (HashMap<String, Boolean>) lectureNameHash.clone();
		
		tableBean.timeTable = new boolean[7][10];
		for(int i=0,iLen=timeTable.length; i<iLen; i++) {
			for(int j=0,jLen=timeTable[i].length; j<jLen; j++) {
				tableBean.timeTable[i][j] = timeTable[i][j];
			}
		}
		return tableBean;
	}
	
	/**
	 * @param hash			-	lectureInfoHash�� ����� �������� <String,LectureInfoBean>
	 * @param dayMapInfo	-	��:0, ȭ:1, .. �� ���� ������ �����ϴ� �ؽ�. ��, ������ �ε����� �ٲ��ִ� �ؽ��̴�
	 */
	public TimeTable(HashMap<String, ArrayList<LectureInfoBean>> hash) {
		
		lectureInfoMap = hash;
		
		// �� x ���� �ð�ǥ ���� �����
		timeTable = new boolean[7][10];
		lectureIDList = new ArrayList<String>();
		lectureNameHash = new HashMap<String, Boolean>();
		// ��:0, ȭ:1 �� ���� ������ ������ �ؽ�, ���� ���������� ��� Ŭ������ �����ϰ� �����
		dayMap = new HashMap<Character, Integer>();
		dayMap.put('��', 0);
		dayMap.put('ȭ', 1);
		dayMap.put('��', 2);
		dayMap.put('��', 3);
		dayMap.put('��', 4);
		dayMap.put('��', 5);
		dayMap.put('��', 6);
	}
	
	/**
	 * @param chDay			-	�������� ������ ��¥ ex) ��,ȭ,��,��,��,��,���� ���ڰ� ���´�
	 * @param beginTime		-	�������� ������ ���� �ð��� �����Ѵ�
	 * @param endTime		-	�������� ������ ������ �ð��� �����Ѵ�
	 */
	public void setBreakTime(Character chDay,int beginTime,int endTime) {
		
		int day = dayMap.get(chDay);
		
		for(int j=beginTime; j<=endTime; j++) {
			timeTable[day][j] = true;
		}
		
	}
	
	/**
	 * @param	lectureInfo
	 * @return	boolean			���� ���� lectureName�� lectureCode�� ���ǰ� �ִٸ� true, ���ٸ� false
	 * 							������ lectureCode�� lectureName�� �����ϹǷ� lectureName���θ� �˻��Ѵ�
	 * 							����� ���� ���̴� �� �ܰ��̹Ƿ� ���� �߿��ϴ�. ���ܰ� ������ �˻��� ���� 
	 */
	private boolean hasSameLecture(String lectureName) {
		
		boolean flag = false;
		
		// ����, ���� �Է����� ���� ������ �̹� �����ϰ� �ִٸ�,
		if( lectureNameHash.containsKey(lectureName) ) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * @param 	beanList	-	ArrayList<LectureInfo>�� ������, �ϳ��� ������ ���Ͽ��� �����°� �ƴ϶� 
	 * 							�ٸ� ������ ����� �� �ֱ� �����̴�.
	 * 							�������, ��ǻ�� ��Ű���� ������ ��,ȭ�� ����� �ϰԵȴ�  
	 * @return				-	������ ����ϴ� �ð��� �ߺ��Ǵ� ������ ���ٸ� true �׷��� �ʴٸ� false
	 */
	private boolean hasSameTimeLecture(ArrayList<LectureInfoBean> beanList) {
		
		for(int i=0,len=beanList.size(); i<len; i++) {
			
			LectureInfoBean bean = beanList.get(i);
			
			int beginTime = Integer.parseInt(bean.getStartTime());
			int endTime = Integer.parseInt(bean.getFinishTime());
			int day = dayMap.get(bean.getDay().charAt(0));
			
			// ���� �ð��� �������� ������ �ִٸ�,
			for(int j=beginTime; j<=endTime; j++) {
				
				if( timeTable[day][j] == true ) {
					// false�� �����Ѵ�
					return true;
				}
			}
		}
		// �ڵ尡 ���ʱ��� �Դٴ� �ǹ̴� �Էµ� ����� ���� �ð��� �ߺ��Ǵ� ������ ���ٴ� �ǹ�
		return false;
	}
	
	private boolean hasSameTimeLecture(LectureInfoBean bean) {

		if (bean != null) {

			int beginTime = Integer.parseInt(bean.getStartTime());
			int endTime = Integer.parseInt(bean.getFinishTime());
			int day = dayMap.get(bean.getDay().charAt(0));

			// ���� �ð��� �������� ������ �ִٸ�,
			for (int j = beginTime; j <= endTime; j++) {

				if (timeTable[day][j] == true) {
					// false�� �����Ѵ�
					return true;
				}
			}
		}
		// �ڵ尡 ���ʱ��� �Դٴ� �ǹ̴� �Էµ� ����� ���� �ð��� �ߺ��Ǵ� ������ ���ٴ� �ǹ�
		return false;
	}
	
	/**
	 * @param	bean
	 * @����	��� ������ �����Ǿ� �� �޼ҵ带 ȣ���ϰ� �Ǹ� �ð�ǥ�� �Է����� ���� ������ ��ϵǰ� �ȴ�
	 * 		�ʹݿ� �����Ͱ� �� �� ������ �Ǹ� �̻��� ���� ȣ��� �� �����Ƿ� ����ó���� �߰��Ѵ�. - 2015.05.23 Anh	
	 */
	private void registLecture(ArrayList<LectureInfoBean> lectureList) {
		
		LectureInfoBean bean = null;
		for(int i=0,len=lectureList.size(); i<len; i++) {
			
			bean = lectureList.get(i);
			
			int beginTime = Integer.parseInt(bean.getStartTime());
			int endTime = Integer.parseInt(bean.getFinishTime());
			int day = dayMap.get(bean.getDay().charAt(0));
			
			// �ð�ǥ�� ���� ������ �Է��Ѵ�
			for(int j=beginTime; j<=endTime; j++) 
				timeTable[day][j] = true;
			// ���� �ð�ǥ�� �� ������ �����Ѵ�
			curCredit += Integer.parseInt(bean.getCredit());
			// ���� �ð�ǥ�� � ������ �߰��ߴ����� �����Ѵ�
			lectureNameHash.put(bean.getLectureName(), true);
			// ������ ������ ��ȸ�� ���� �ĺ����� �����Ѵ�
			lectureIDList.add(bean.getLectureID());
		}
	}
	
	private void registLecture(LectureInfoBean bean) {

		int beginTime = Integer.parseInt(bean.getStartTime());
		int endTime = Integer.parseInt(bean.getFinishTime());
		int day = dayMap.get(bean.getDay().charAt(0));
		
		// �ð�ǥ�� ���� ������ �Է��Ѵ�
		for(int j=beginTime; j<=endTime; j++) 
			timeTable[day][j] = true;
		// ���� �ð�ǥ�� �� ������ �����Ѵ�
		curCredit += Integer.parseInt(bean.getCredit());
		// ���� �ð�ǥ�� � ������ �߰��ߴ����� �����Ѵ�
		lectureNameHash.put(bean.getLectureName(), true);
		// ������ ������ ��ȸ�� ���� �ĺ����� �����Ѵ�
		lectureIDList.add(bean.getLectureID());
	}
	
	/**
	 * @param 	bean
	 * @����	�����ڴ� ��� ���� ���Ͽ� �� �Լ��� ȣ���ϸ� �ȴ�. ���� �˾Ƽ� �����
	 * 			�ش� ���̺� �ߺ��Ǵ� ������ �ִ� ���,
	 * 			�׸��� ���� �ð��� �ߺ��Ǵ� ������ �ִ� ��쿡�� ���� ������ �������� �ʰ�
	 * 			�ߺ��Ǵ� ������ ������ ���� ��쿡�� ���� ���̺� �߰��Ѵ�
	 */
	public boolean setIfNotHasLecture(ArrayList<LectureInfoBean> lectureList) {
		
		boolean flag = false;
		if (lectureList != null) {
			
			LectureInfoBean bean = null;
			for(int i=0,len=lectureList.size(); i<len; i++) {

				bean = lectureList.get(i);
				
				if (setIfNotHasLecture(bean)) { 
					registLecture(bean);
					flag = true;
				}
			}
		}
		
		return flag;
	}
	
	public boolean setIfNotHasLecture(LectureInfoBean bean) {
		
		if(bean != null) {
			
			if (hasSameLecture(bean.getLectureName()))
				return false;
			
			if (hasSameTimeLecture(bean))
				return false;
			
			return true;
		}
		return false;
	}
	
	/**
	 * �׽�Ʈ��
	 */
	public void printAllLecture() {
		
		for(int i=0,len=lectureIDList.size(); i<len; i++) {
			System.out.println(" /"+lectureIDList.get(i));
		}
	}
	
	public void printTimeTable() {
		
		for(int i=0,iLen=timeTable.length; i<iLen; i++) {
			for(int j=0,jLen=timeTable[i].length; j<jLen; j++) {
				System.out.print("[ "+timeTable[i][j]+" ]");
			}
			System.out.println();
		}
	}
	
	/**
	 * �׽�Ʈ �뵵
	 */
	public void printAllLectureNameAndTime() {
		
		String lectureID = null;
		
		System.out.println("�� ���� :"+getCredit());
		for(int i=0,len=lectureIDList.size(); i<len; i++) {
			lectureID = lectureIDList.get(i);
			ArrayList<LectureInfoBean> list = lectureInfoMap.get(lectureID);
			
			for(int j=0,size=list.size(); j<size; j++) {
				System.out.println("---------------------------------");
				System.out.println("lecture ID		:"+list.get(j).getLectureID());
				System.out.println("lecture Name 		:"+list.get(j).getLectureName());
				System.out.println("lecture Day  		:"+list.get(j).getDay());
				System.out.println("lecture Start Time 	:"+list.get(j).getStartTime());
				System.out.println("lecture End Time 	:"+list.get(j).getFinishTime());
				System.out.println("lecture Cridet		:"+list.get(j).getCredit());
			}
		}
	}
}

