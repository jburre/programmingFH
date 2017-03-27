
public class umdrehen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(backward("olleH"));
	}

	private static String backward(String input) {
		// TODO Auto-generated method stub
		String ret="";
		char []a =input.toCharArray();
		int length = a.length-1;
		return backward(a,length,ret);
	}

	private static String backward(char[] a, int length, String ret) {
		// TODO Auto-generated method stub
		if (length==0){
			ret+=a[length];
			return ret;
		}
		else {
			ret+=a[length];
			return backward(a,length-1,ret);
		}
	}

}
