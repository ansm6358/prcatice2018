package valueObject;

import java.util.Scanner;

public class VMLecture {
	private String id;
	private String name;
	private String professorName;
	private String credit;
	private String time;
	
	public void readFromFile(Scanner scanner) {
		this.id = scanner.next();
		this.name = scanner.next();
		this.professorName = scanner.next();
		this.credit = scanner.next();
		this.time = scanner.next();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


}
