import java.util.Scanner;


public class christmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie die gewünschte Höhe des Baumes ein: ");
		int hoehe = in.nextInt();
		in.close();
		
		int leere = hoehe-1;
		int sterne= 1;
		for (int i =1; i<=hoehe;i++){
			for (int l = 1; l<=leere;l++){
				System.out.print(" ");
			}
			for (int k=1;k<=sterne;k++){
				System.out.print("*");
			}
			leere--;
			sterne+=2;
			System.out.println();
		}
		for (int j=1; j<=(hoehe-1);j++){
			System.out.print(" ");
		}
		System.out.print("I");
	}

}
