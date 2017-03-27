/**
 * Die Kreis-Klasse
 * @author Jan
 *
 */
public class Kreis extends Ellipse{
/**
 * Konstruktor der Klasse, ruft durch Super den Konstruktor von Ellipse auf
 * @param x Position auf der X-Achse
 * @param y Position auf der Y-Achse
 * @param z Position auf der Z-Ebene
 * @param a Radius des Kreises
 */
	public Kreis (int x, int y, int z, int a){
		super(x,y,z,a,a);
		super.figurenTyp="Kreis";
	}
}
