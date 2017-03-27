import java.util.LinkedList;
import java.util.List;


public class rekList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> vs = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) vs.add(i);
		System.out.println(serialize(vs, "+"));
	}

	private static String serialize(List<Integer> vs, String input) {
		// TODO Auto-generated method stub
		String ret="";
		int zero=0;
		return serialize(vs,ret,input,zero);
	}

	private static String serialize(List<Integer> vs, String ret, String input,
			int zero) {
		// TODO Auto-generated method stub
		if (vs.isEmpty()){
			int end = ret.length();
			ret = ret.substring(0, end-1);
			return ret;
		}
		else {
			ret+=vs.remove(zero)+input;
			return serialize(vs,ret,input,zero);
		}
	}

}
