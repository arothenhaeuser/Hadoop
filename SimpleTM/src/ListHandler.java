import java.util.ArrayList;


public class ListHandler {
	ArrayList<Liste> liste = new ArrayList<Liste>();
	public int count = 0;
	public void add(String s) {
		if(s.length() == 0){
			return;
		}
		if(s.length()>liste.size()){
			while(!(s.length()==liste.size())){
				liste.add(new Liste());	
			}
		}
		liste.get(s.length()-1).add(s);
	}

	public String toString() {
		String s = "";
		for(int i=0; i<liste.size(); i++) {
			s += liste.get(i).toString() + "\n";
			count++;
		}
		return s;
	}
	
	public int sum(){
		int sum = 0;
		for(int i=0; i<liste.size(); i++){
			sum += liste.get(i).sum();
		}
		return sum;
	}
}
