import java.util.ArrayList;


public class ListHandler {
	ArrayList<Liste> liste = new ArrayList<Liste>();
	
	public void add(String s) {
		if(s.length()>=liste.size()){
			while(!(s.length()==liste.size())){
			liste.add(new Liste());	
			}
		}
		liste.get(s.length()-1).add(s);
	}

	public String toString() {
		String s = "j";
		for(int i=0; i<liste.size(); i++) {
			//s += liste.get(i).toString() + "\n";
			System.out.println(liste.get(i));
		}
		return s;
	}
}
