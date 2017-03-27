import java.util.Scanner;


public class tabelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl i ein:");
		int i = in.nextInt();
		System.out.println("Bitte geben Sie eine Zahl j ein:");
		int j = in.nextInt();
		in.close();
		
		System.out.println(multitab(i,j));
	}

	public static String multitab(int i, int j) {
		// TODO Auto-generated method stub
		String ret ="";
		for (int a=1;a<=j;a++){
			for (int b=1; b<=i;b++){
				ret+=a*b+" ";
			}
			ret+="\n";
		}
		return ret;
	}

}
