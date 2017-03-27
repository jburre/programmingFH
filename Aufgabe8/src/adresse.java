import java.lang.Object;

public class adresse {
	private String vorname;
	private String nachname;
	private String strasse;
	private int hausnummer;
	private String adresszusatz;
	private int plz;
	private String stadt;
	private String land;
	public static int anzahl;
	
	public adresse (String vn, String nm, String str, int nr, String adresse, int plz, String stadt, String land){
		this.vorname=vn;
		this.nachname=nm;
		this.strasse=str;
		this.hausnummer=nr;
		this.adresszusatz=adresse;
		this.plz=plz;
		this.stadt=stadt;
		this.land=land;
		anzahl++;
	}
	public String toString(){
		return vorname+" "+nachname+"\n"+strasse+" "+hausnummer+" "+adresszusatz+"\n"+plz+" "+stadt+"\n"+land;
	}
	
	public Object clone(){
		adresse dummy = new adresse(vorname, nachname, strasse, hausnummer, adresszusatz, plz, stadt, land);
		return dummy;
	} 
	
	public boolean equals(adresse adr){
		return vorname==adr.vorname && nachname==adr.nachname && strasse ==adr.strasse && adresszusatz==adr.adresszusatz&& hausnummer==adr.hausnummer&&plz==adr.plz &&stadt==adr.stadt&&land==adr.land;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adresse adr1 = new adresse(
				 "Max", "Mustermann",
				 "Beispielgasse", 12, "c",
				 12345, "Exemplaria", "Germany"
				 );
		adresse adr2 = new adresse(
				"Maren", "Musterfrau",
				"Beispielgasse", 12, "c",
				12345, "Exemplaria", "Germany"
				);
		
		adresse adr3 = adr1;
		adresse adr4 = (adresse) adr1.clone();
		System.out.println("adr1 == adr2" + (adr1 == adr2)); // false
		System.out.println("adr1 == adr3" + (adr1 == adr3)); // true
		System.out.println("adr1 == adr4" + (adr1 == adr4)); // false
		System.out.println("adr1.equals(adr4):" + adr1.equals(adr4)); // true
		System.out.println("adr4.equals(adr1):" + adr4.equals(adr1)); // true
		
		System.out.println("Adresse 1:");
		System.out.println(adr1);
		System.out.println("Adresse 2:");
		System.out.println(adr2);
		System.out.println("Adresse 3:");
		System.out.println(adr3);
		System.out.println("Adresse 4:");
		System.out.println(adr4);
	}

}
