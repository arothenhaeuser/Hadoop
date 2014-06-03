import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IO {
	public int count = 0;
	BufferedReader scan = null;
	String path = "amazon_reviews_de_100000.txt";
	int res = 0;
	String[] splits;
	String s;
	public IO() {
		try {
			scan = new BufferedReader(new FileReader(path));
			//scan = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String getNext() {
		if(res==0){
		
		s="";
		while(s.length() == 0) {
			try {
				s += scan.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			splits = s.split("\\W");
			if (!(splits.length == 0)){
			//s = s.replaceAll("\\W", "");
			splits[splits.length-1] = splits[splits.length-1].replaceAll("\\d", "");
			res = splits.length;
			s=splits[splits.length-1];
			}
			}
		}
		else{
			while(s.length() == 0) {
			res--;
			splits[res] = splits[res].replaceAll("\\d", "");
			s=splits[res];
			}
		}
		count++;
		return s;
	}
	public boolean hasNext() {
		return false;
	}
}
