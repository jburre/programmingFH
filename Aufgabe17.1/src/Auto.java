
public class Auto {


	private String hersteller;
	private long km;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double psLeistung;
	private Bestand bestand;
	
	public Auto(String Hersteller,long km,double EUR,String Farbe,boolean Unfallwagen,String Kraftstoff,double PS){
		this.hersteller=Hersteller;
		this.km=km;
		this.preis=EUR;
		this.farbe=Farbe;
		this.unfallwagen=Unfallwagen;
		this.kraftstoff=Kraftstoff;
		this.psLeistung=PS;
	}
	
	public boolean zumBestandHinzu(Bestand bestand){
		if (bestand.istVorhanden(this)){
			return false;
		}
		else {
			bestand.aufnehmen(this);
			return true;
		}
	}
	
	public boolean ausDemBestand(){
		if (bestand.istVorhanden(this)){
			return false;
		}
		else {
			bestand.entnehmen(this);
			return true;
		}
	}
	
	public String toString(){
		if (unfallwagen==false){
			return "---\nHersteller: "+hersteller+"\nPreis: "+preis+"EUR\nMotor: "+psLeistung+" PS("+kraftstoff+")\nKM-Stand: "+ km+" km\nFarbe: "+farbe+"\n---";
		}
		else{
			return "---\nHersteller: "+hersteller+"\nPreis: "+preis+"EUR\nMotor: "+psLeistung+" PS("+kraftstoff+")\nKM-Stand: "+ km+" km\nFarbe: "+farbe+"\nunfallfrei\n---";
		}
	}
	
	public double getPreis(){
		return this.preis;
	}
	
	
}
