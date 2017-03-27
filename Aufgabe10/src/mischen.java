import java.util.Stack;


public class mischen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <String>stapel1 =new Stack<String>();
		Stack<String> stapel2 = new Stack<String>();
		
		stapel1.add("Kreuz Dame");
		stapel1.add("Karo 7");
		stapel1.add("Pik Bube");
		stapel1.add("Herz As");
		
		stapel2.add("Pik As");
		stapel2.add("Herz Bube");
		stapel2.add("Karo Dame");
		stapel2.add("Kreuz Bube");
		stapel2.add("Pik 4");
		stapel2.add("Herz 8");
		
		System.out.println(collection_to_string(merge(stapel1, stapel2)));
	}

	private static Stack<String> merge(Stack<String> stapel1, Stack<String> stapel2) {
		// TODO Auto-generated method stub
		Stack<String> stapel3 = new Stack<String>();
		return merge(stapel1,stapel2,stapel3);
	}

	private static Stack<String> merge(Stack<String> stapel1, Stack<String> stapel2,
			Stack<String> stapel3) {
		// TODO Auto-generated method stub
		if (stapel1.isEmpty()&&stapel2.isEmpty()){
			return stapel3;
		}
		else {
			if (!stapel1.isEmpty()) stapel3.add(stapel1.pop());
			if (!stapel2.isEmpty()) stapel3.add(stapel2.pop());
			return merge(stapel1,stapel2,stapel3);
		}
	}

	private static String collection_to_string(Stack<String> s){
		String ret="[";
		return (collection_to_string(s,ret));
	}
	
	private static String collection_to_string(Stack<String> s, String ret) {
		// TODO Auto-generated method stub
		if (s.size()==1){
			ret+=s.pop();
			ret+="]";
			return ret;
		}
		else {
			ret+=s.pop()+", ";
			return collection_to_string(s,ret);
		}
	}
}
