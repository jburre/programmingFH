/**
 * Die Quadrat-Klasse
 * @author Jan
 *
 */
public class Quadrat extends Rechteck{

	/**
	 * Konstruktor von Quadrat, der durch super den Konstruktor von Rechteck aufruft
	 * @param x Position auf der X-Achse
	 * @param y Position auf der Y-Achse
	 * @param z Position auf der Z-Ebene
	 * @param a Seitenlaenge des Quadrats
	 */
	public Quadrat(int x,int y,int z,int a){
		super(x,y,z,a,a);
		super.figurenTyp="Quadrat";
	}
}
