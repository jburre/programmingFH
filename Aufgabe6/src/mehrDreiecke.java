import java.util.Scanner;


public class mehrDreiecke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Wieviele Dreiecke wollen sie ausgeben?");
		int anzahl = in.nextInt();
		System.out.println("Wie hoch soll jedes Dreieck sein?");
		int hoehe= in.nextInt();
		in.close();
		
		int sterne = 1;
		
		for (int i=1;i<=anzahl;i++){
			
			for (int k= 1; k<=hoehe;k++){
				
				for (int l=1;l<=sterne;l++){
					System.out.print("*");
				}
				System.out.println();
				sterne++;
			}
			System.out.println();
			sterne =1;
		}
	}

}
