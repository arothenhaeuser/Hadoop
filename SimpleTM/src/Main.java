
public class Main {

	public static void main(String[] args) {
		ListHandler handler = new ListHandler();
		IO io = new IO();
		try{
			while(true){
				handler.add(io.getNext());
				System.out.println("ich arbeite noch");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//output
		//System.out.println(handler);
		handler.toString();
		System.out.println(io.count);
	}

}
