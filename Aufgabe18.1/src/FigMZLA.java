/**
 * Die abstrakte Klasse FigMZLA
 * @author Jan
 *
 */
public abstract class FigMZLA extends Figur{
	/**
	 * 
	 */
	protected int A;
	protected int B;
	protected String figurenTyp;
	
	
	/**
	 * Konstruktor der FigMZLA
	 * @param x Position auf der X-Achse
	 * @param y Position auf der Y-Achse
	 * @param z Position auf der Z-Ebene
	 * @param a Laenge der Figur
	 * @param b Breite der Figur
	 */
	public FigMZLA (int x, int y, int z, int a, int b){
		super(x,y,z);
		this.A=a;
		this.B=b;
	}
	
	/**
	 * Eine abstrakte Methode zur Flaechenberechnung
	 * @return Ein Double des Flaecheninhaltes der Figur
	 */
	public abstract double berechneFlaeche();
	
	public String toString(){
		return figurenTyp+" an Position ("+super.X+","+super.Y+","+super.Z+") mit einer Fläche von "+berechneFlaeche()+" Flächeneinheiten.";
	}
	

	/**
	 * Eine Methode zur Berechnung der Gesamtflaeche aller Figuren nach einem vorgegebenen Filter
	 * @param a untere Grenze des Filters
	 * @param b obere Grenze des Filters
	 * @return eine Stringausgabe der Gesamtfläche und sortierten Figuren
	 */
	public static String flaechen(int a, int b) {
		// TODO Auto-generated method stub
		double gesamt=0;
		
		for (Figur f: Figur.filterZ(a, b, Figur.getZsortierteFiguren())){
			FigMZLA dummy = (FigMZLA) f;
			gesamt+=dummy.berechneFlaeche();
		}
		
		double durchschnitt = (gesamt/(Figur.filterZ(a, b, Figur.getZsortierteFiguren()).length));
		String ret= "Die Gesamtfläche aller " + filterZ(a,b,getZsortierteFiguren()).length + " Figuren beträgt " + gesamt + " Flächeneinheiten.\nDie durchschnittliche Fläche pro Figur beträgt " + durchschnitt + " Flächeneinheiten.";
		return ret;
	}

}
