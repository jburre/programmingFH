import java.util.Scanner;


public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihren Namen ein:");
		String name= in.nextLine();
		System.out.print("Hallo "+name+" schön dich zu sehen.\nWie geht es Dir?");
	}

}
