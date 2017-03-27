
public class rekDurchlauf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		
		System.out.println(zeichenweise(a, "-"));
	}

	private static String zeichenweise(int[] a, String sep) {
		// TODO Auto-generated method stub
		String ret="";
		int i=0;
		return zeichenweise(a,sep,ret,i);
	}

	private static String zeichenweise(int[] a, String sep, String ret, int i) {
		// TODO Auto-generated method stub
		if (i==(a.length)-1){
			ret+=a[i];
			return ret;
		}
		else {
			ret+=a[i]+sep;
			return zeichenweise(a,sep,ret,i+1);
		}

	}

}
