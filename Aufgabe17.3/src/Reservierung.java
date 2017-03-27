
public class Reservierung {

	private String bemerkung;
	private Uhrzeit beginn;
	private Uhrzeit ende;
	protected Raum raum;
	protected Mitarbeiter von;
	
	public Reservierung (Uhrzeit beginn, Uhrzeit ende){
		this.beginn=beginn;
		this.ende=ende;
	}
	
	public void setBemerkung(String bemerkung){
		this.bemerkung=bemerkung;
	}
	
	public void setRaum(Raum raum){
		this.raum=raum;
	}
	
	public String toString(){
		return von +" "+beginn+ " bis " +ende+ " für " +bemerkung;
	}

	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		// TODO Auto-generated method stub
		this.von=mitarbeiter;
	}
}
