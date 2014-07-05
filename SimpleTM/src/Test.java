import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class Test {
	InputStream stream = null;
	Scanner scan = null;
	public int count;
	
	public Test(){
		try {
			stream = new FileInputStream("data/amazon_reviews_de_100000.txt");
			scan = new Scanner(stream, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String next(){
		String s = scan.next();
		s = s.replaceAll("\\W", "");
		s = s.replaceAll("\\d", "");
		count++;
		return s;
	}
	
	public boolean hasNext(){
		return scan.hasNext();
	}
}
