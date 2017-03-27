import java.util.Scanner;


public class flexibel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int feld=0;
		
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
		in.close();
		
		for (int j = (anzahl-1); j>=0;j--){
			System.out.println("Wert an Position "+j+" im angelegten Array: "+eingabe[j]);
		}
	}

}
