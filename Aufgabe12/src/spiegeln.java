
public class spiegeln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(mirror("Spiegel"));
	}

	private static String mirror(String in) {
		// TODO Auto-generated method stub
		char []input = in.toCharArray();
		int length = in.length()-1;
		return mirror(input,length,in);
	}

	private static String mirror(char[] input, int length, String in) {
		// TODO Auto-generated method stub
		if (length==0){
			in+=input[length];
			return in;
		}
		else {
			in+=input[length];
			return mirror(input,length-1,in);
		}
	}

}
