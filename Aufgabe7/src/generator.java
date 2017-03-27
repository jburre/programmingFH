import java.util.Scanner;


public class generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input= in.nextLine();
		in.close();
		System.out.println(pwgen(input));
	}

	private static String pwgen(String input) {
		// TODO Auto-generated method stub
		String ret ="";
		int total=0;
		for (String w : input.split(" +")){
			ret+=w.charAt(0);
			total++;
		}
		ret+=total;
		return ret;
	}

}
