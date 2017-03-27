import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Raum {

	private int geb;
	private int etage;
	private int raum;
	protected static List <Reservierung> reservierungen=new LinkedList<Reservierung>();
	
	public Raum (int geb, int etage, int raum){
		this.geb=geb;
		this.etage=etage;
		this.raum=raum;
	}
	
	public String toString(){
		String output= "Raum "+geb+"-"+etage+"."+raum+"\n";
		for (Reservierung reservierung: reservierungen){
			if (reservierung.raum.raum == this.raum){
				output+="gebucht von "+reservierung+"\n";
			}
		}
		return output;
	}
	
	public void addReservierung(Reservierung r){
		reservierungen.add(r);
	}
	
	
}
