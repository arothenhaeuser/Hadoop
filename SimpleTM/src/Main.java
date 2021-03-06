import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Main {

	public static void main(String[] args) {
		ListHandler handler = new ListHandler();
		Test test = new Test();
		try{
			while(test.hasNext()){
				handler.add(test.next());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Anzahl Listen: " + handler.count);
		System.out.println("Anzahl W�rter: " + test.count);
		System.out.println("Anzahl Zeichen (ohne entfernte Sonderzeichen): " + (handler.sum()+test.count));
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("results.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writer.println(handler);
		writer.close();
	}

}
