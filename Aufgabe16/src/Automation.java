
public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		
		for(Auto a : Auto.getBestand()) System.out.println(a);
		System.out.println("Insgesamt " + Auto.getAnzahl() + " Autos im Bestand.");
	}

}
