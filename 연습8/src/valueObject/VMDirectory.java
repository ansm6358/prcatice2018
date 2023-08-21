package valueObject;

import java.util.Scanner;

public class VMDirectory {
	private String id;
	private String text;
	private String filename;
	
	public void readFromFile(Scanner scanner) {
		this.id = scanner.next();
		this.text = scanner.next();
		this.filename = scanner.next();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
