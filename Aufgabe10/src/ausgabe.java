import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class ausgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List v = new LinkedList(); for (int i = 1; i < 5; i++) v.add(i);
		Stack s = new Stack(); for (int i = 1; i < 5; i++) s.add(i);
		Map t = new HashMap(); for (int i = 65; i < 69; i++) t.put(i, (char)i);
		
		System.out.println(collection_to_string(v));
		System.out.println(collection_to_string(s));
		System.out.println(collection_to_string(t));
	}

	private static String collection_to_string(Map t) {
		// TODO Auto-generated method stub
		String ret="[";
		Iterator it = t.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry entry = (Map.Entry) it.next();
			int key = (int)entry.getKey();
			int value = (char)entry.getValue();
			ret+=key +" --> "+value;
		}
		ret+="]";
		return ret;
	}
	
	private static String collection_to_string(Stack s){
		String ret="[";
		return (collection_to_string(s,ret));
	}

	private static String collection_to_string(Stack s, String ret) {
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

	private static String collection_to_string(List v) {
		// TODO Auto-generated method stub
		String ret="[";
		for (Iterator it = v.iterator(); it.hasNext();){
			ret+=it.next()+", ";
		}
		ret = ret.substring(0, (ret.length()-2))+"]";
		return ret;
	}

}
