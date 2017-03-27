import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>stapel1=new LinkedList<String>();
		List<String>stapel2=new LinkedList<String>();
		
		stapel1.add("Herz As");
		stapel1.add("Pik Bube");
		stapel1.add("Karo 7");
		stapel1.add("Kreuz Dame");
		
		stapel2.add("Herz 8");
		stapel2.add("Kreuz Bube");
		stapel2.add("Karo Dame");
		stapel2.add("Herz Bube");
		stapel2.add("Pik As");
		stapel2.add("Pik 4");
		
		System.out.println(collection_to_string(randmerge(stapel1, stapel2)));
	}
	
	private static List randmerge(List<String> stapel1, List<String> stapel2) {
		// TODO Auto-generated method stub
		List <String>stapel3=new LinkedList<String>();
		return randmerge(stapel1,stapel2,stapel3);
	}

	private static List randmerge(List<String> stapel1, List<String> stapel2,
			List<String> stapel3) {
		// TODO Auto-generated method stub
		int n=stapel1.size();
		int m=stapel2.size();
		if(stapel1.isEmpty()&&stapel2.isEmpty()){
			return stapel3;
		}
		else {
			if (!stapel1.isEmpty()){
				int a = (int)(n*Math.random());
				stapel3.add(stapel1.remove(a));
			}
			if (!stapel2.isEmpty()){
				int b= (int)(m*Math.random());
				stapel3.add(stapel2.remove(b));
			}
			return randmerge(stapel1,stapel2,stapel3);
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
