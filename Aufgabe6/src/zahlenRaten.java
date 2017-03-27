import java.util.Scanner;


public class zahlenRaten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int geheimzahl = (int) (99 * Math.random() + 1);
		Scanner in = new Scanner (System.in);
		System.out.println("Willkommen beim Zahlenraten. Bitte gib deine Zahl ein. Sie muss zwischen 1 und 100 liegen.");
		int anzahl = 1;
		int rateZahl;
		do {
			System.out.println(anzahl+". Versuch:");
			rateZahl=in.nextInt();
			if (rateZahl >geheimzahl){
				System.out.println("Meine Zahl ist kleiner.");
			}
			if (rateZahl <geheimzahl){
				System.out.println("Meine Zahl ist größer.");
			}
			if (rateZahl == geheimzahl){
				System.out.println("Du hast meine Zahl beim "+anzahl+". Versuch erraten.");
			}
			anzahl++;
		} while (rateZahl!=geheimzahl);
		in.close();
	}

}
