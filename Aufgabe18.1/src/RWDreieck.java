/**
 * Die RW-Klasse
 * @author Jan
 *
 */
public class RWDreieck extends FigMZLA{

	/**
	 * Der Konstruktor der RWDreieck-Klasse
	 * @param x Position auf der X-Achse
	 * @param y Position auf der Y-Achse
	 * @param z Position auf der Z-Ebene
	 * @param a Seitenlaenge des Dreiecks
	 * @param b Seitenbreite des Dreiecks
	 */
	public RWDreieck(int x,int y,int z, int a,int b){
		super(x,y,z,a,b);
		super.figurenTyp="RWDreieck";
	}

	/**
	 * Die Flaechenberechnung des Dreiecks
	 */
	public double berechneFlaeche() {
		return ((A*B)/2);
	}
}
