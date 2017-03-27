import java.util.Scanner;


public class spiegeln {

	public static String mirror(String a){
		String output="";
		for (int i = a.length()-1; i>=0;i--){
			output+=a.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie das zu spiegelnde Wort ein: ");
		String input= in.next();
		in.close();
		System.out.println(input + mirror(input));
	}

}
