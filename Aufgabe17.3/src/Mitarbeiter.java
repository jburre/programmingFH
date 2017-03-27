import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Mitarbeiter extends Person{

	private String email;
	protected static List <Reservierung> buchungen=new LinkedList<Reservierung>();
	
	public Mitarbeiter(String vorname, String nachname, String email){
		super (vorname,nachname);
		this.email=email;
	}
	
	public String toString(){
		return super.toString()+" ("+email+")";
	}
	
	public void reserviere(Raum raum, Uhrzeit beginn, Uhrzeit ende, String bemerkung){
		Reservierung dummy =new Reservierung(beginn, ende);
		dummy.setRaum(raum);
		dummy.setMitarbeiter(this);
		dummy.setBemerkung(bemerkung);
		raum.addReservierung(dummy);
		this.buchungen.add(dummy);
	}
}
