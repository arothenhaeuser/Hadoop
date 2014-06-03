import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO {
	
	Scanner scan = null;
	String path = "";
	
	public IO() {
		try {
			scan = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String getNext() {
		String s="";
		while(s.length() == 0) {
			s = scan.next();
			s.replaceAll("^a-zA-Z", "");
		}
		return s;
	}
	public boolean hasNext() {
		return scan.hasNext();
	}
}
