
public class Auto {

	private String Hersteller;
	private long km;
	private double EUR;
	private String Farbe;
	private boolean Unfallwagen;
	private String Kraftstoff;
	private double PS;
	
	public Auto(String Hersteller,long km,double EUR,String Farbe,boolean Unfallwagen,String Kraftstoff,double PS){
		this.Hersteller=Hersteller;
		this.km=km;
		this.EUR=EUR;
		this.Farbe=Farbe;
		this.Unfallwagen=Unfallwagen;
		this.Kraftstoff=Kraftstoff;
		this.PS=PS;
	}
	
	public double getEUR(){
		return this.EUR;
	}
	
	public String toString(){
		if (Unfallwagen==false){
			return "---\nHersteller: "+Hersteller+"\nPreis: "+EUR+"EUR\nMotor: "+PS+" PS("+Kraftstoff+")\nKM-Stand: "+ km+" km\nFarbe: "+Farbe+"\n---";
		}
		else{
			return "---\nHersteller: "+Hersteller+"\nPreis: "+EUR+"EUR\nMotor: "+PS+" PS("+Kraftstoff+")\nKM-Stand: "+ km+" km\nFarbe: "+Farbe+"\nunfallfrei\n---";
		}
	}
}
