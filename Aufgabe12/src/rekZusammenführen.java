import java.util.LinkedList;
import java.util.List;


public class rekZusammenführen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> as = new LinkedList<Integer>();
		for (int i = 7; i >= 1; i -= 2) as.add(i);
		List<Integer> bs = new LinkedList<Integer>();
		for (int i = 2; i <= 6; i += 2) bs.add(i);
		System.out.println(serialize(zip(as, bs), " + "));
	}
	
	private static List<Integer> zip(List<Integer> as, List<Integer> bs) {
		// TODO Auto-generated method stub
		List<Integer>cs=new LinkedList<Integer>();
		return zip(as,bs,cs);
	}

	private static List<Integer> zip(List<Integer> as, List<Integer> bs,
			List<Integer> cs) {
		// TODO Auto-generated method stub
		if (as.isEmpty()&&bs.isEmpty())return cs;
		else {
			if (!as.isEmpty()&&bs.isEmpty()){
				cs.add(as.remove(0));
			}
			if (as.isEmpty()&&!bs.isEmpty()){
				cs.add(bs.remove(0));
			}
			if (!as.isEmpty()&&!bs.isEmpty()){
				cs.add(as.remove(0));
				cs.add(bs.remove(0));
			}
			return zip(as,bs,cs);
		}
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
			ret = ret.substring(0, end-2);
			return ret;
		}
		else {
			ret+=vs.remove(zero)+input;
			return serialize(vs,ret,input,zero);
		}
	}

}
