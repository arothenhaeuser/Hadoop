import java.util.ArrayList;


public class Liste {
	
	ArrayList<String> wordList = new ArrayList<String>();
	ArrayList<Integer> countList = new ArrayList<Integer>();
	
	public void add(String s) {
		boolean flag = true;
		for(int i=0; i<wordList.size(); i++) {
			if(wordList.get(i).equals(s)) {
				countList.set(i, countList.get(i)+1);
				flag=false;
				break;
			}
		}
		if(flag){
			countList.add(0);
			wordList.add(s);
		}
		
	}
	
	public String toString() {
		return "";
	}
}
