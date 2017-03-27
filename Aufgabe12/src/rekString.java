
public class rekString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(foo("Hello World"));
	}

	private static String foo(String input) {
		// TODO Auto-generated method stub
		String ret="";
		char[] a= input.toCharArray();
		int i= 0;
		return foo(a,i,ret);
	}

	private static String foo(char[] a, int i, String ret) {
		// TODO Auto-generated method stub
		if (i==a.length-1){
			ret+=a[i];
			return ret;
		}
		else {
			ret+=a[i]+"-";
			return foo(a,i+1,ret);
		}
	}

}
