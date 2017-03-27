/**
 * Rechteck-Klasse
 * @author Jan
 *
 */
public class Rechteck extends FigMZLA{
/**
 * Konstruktor des Rechtecks
 * @param x Position auf der X-Achse
 * @param y Position auf der Y-Achse
 * @param z Position auf der Z-Ebene
 * @param a Seitenlaenge des Rechtecks
 * @param b Seitenbreite des Rechtecks
 */
	public Rechteck(int x,int y,int z,int a,int b){
		super(x,y,z,a,b);
		super.figurenTyp="Rechteck";
	}

	/**
	 * Die Berechnung der Flaeche des Rechtecks
	 */
	public double berechneFlaeche() {
		return A*B;
	}
}
