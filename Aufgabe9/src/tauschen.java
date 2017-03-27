import java.util.Scanner;


public class tauschen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int feld =0;
		System.out.println("Wieviele Werte wollen Sie eingeben?");
		
		
		int anzahl = in.nextInt();
		int []eingabe=new int[anzahl];
		
		if (anzahl<= 0){
			System.out.println("Vielen Dank, dass Sie das Programm genutzt haben.");
			
		}
		else {
			for (int i = 1; i<=anzahl;i++){
				System.out.println("Bitte geben Sie den "+i+". Wert ein:");
				int input=in.nextInt();
				eingabe[feld]=input;
				feld++;
			}
		}

		System.out.println("Sie haben folgendes Array erzeugt:");
		System.out.println(array_to_string(eingabe));
		
		System.out.println("Welche Positionen wollen Sie tauschen?");
		int a=in.nextInt();
		int b=in.nextInt();
		
		swap(eingabe,a,b);
		System.out.println(array_to_string(eingabe));
	}

	private static String array_to_string(int[] eingabe) {
		// TODO Auto-generated method stub
		String ausgabe="[";
		int anzahl =eingabe.length;
		for (int j=0; j<(anzahl-1);j++){
			ausgabe+=eingabe[j]+",";
		}
		ausgabe+=eingabe[(anzahl-1)]+"]";
		return ausgabe;
	}

	private static void swap(int[] eingabe, int a, int b) {
		// TODO Auto-generated method stub
		int dummy = eingabe[a];
		eingabe[a]=eingabe[b];
		eingabe[b]=dummy;
	}

}
