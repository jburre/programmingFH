import java.util.Scanner;


public class einfuegen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		boolean verif=true;
		do {
			System.out.println("Wollen Sie eine Adresse einfuegen? <y/n>");
			if (in.nextLine().equalsIgnoreCase("y")){
				System.out.println("Bitte geben Sie einen Vornamen ein:");
				String vn = in.next();
				System.out.println("Bitte geben Sie einen Nachnamen ein:");
				String nn=in.next();
				System.out.println("Bitte geben Sie eine Strasse ein:");
				String str = in.next();
				System.out.println("Bitte geben Sie einen Hausnummer ein:");
				int nr = in.nextInt();
				System.out.println("Bitte geben Sie einen Adresszusatz ein:");
				String zusatz = in.next();
				System.out.println("Bitte geben Sie eine PLZ ein:");
				int plz = in.nextInt();
				System.out.println("Bitte geben Sie eine Stadt ein:");
				String city = in.next();
				System.out.println("Bitte geben Sie ein Land ein:");
				String land = in.next();
				adresse adr = new adresse (vn,nn,str,nr,zusatz,plz,city,land);
				System.out.println("Sie haben folgende Adresse eingegeben:");
				System.out.print(adr);
			}
			
			else {
				verif = false;
			}
		} while (verif == true);
		System.out.println(adresse.anzahl);
		in.close();
		
	}

}
