
import java.util.LinkedList;
import java.util.List;

/**
 * Die Figurklasse
 * @author Jan
 *
 */

public class Figur {

	protected int X;
	protected int Y;
	protected int Z;
	private static List<Figur> figuren = new LinkedList<Figur>();
	
	/**
	 * Der Figurkonstruktor
	 * @param x Position der Figur auf der X-Achse
	 * @param y Position auf der Y-Achse
	 * @param z Position auf der Z-Ebene
	 */
	public Figur (int x,int y, int z ){
		this.X=x;
		this.Y=y;
		this.Z=z;
		figuren.add(this);
	}
	
	/**
	 * Gibt die Liste aller eingefuegten Figuren zurueck
	 * @return Liste aller Figuren
	 */
	public static final List<Figur> getAlleFiguren(){
		return figuren;
	}
	
	/**
	 * sortiert die Figuren in der Liste anhand ihrer Position auf der Z-Ebene
	 * @return Gibt ein Array der Figuren zurueck
	 */
	public static final Figur[] getZsortierteFiguren(){
		Figur[]figurenArray =new Figur[figuren.size()];
		figuren.toArray(figurenArray);
		bubblesort(figurenArray);
		return figurenArray;
	}

	/**
	 * Ein Algorithmus zur Sortierung der Figuren anhand der Z-Ebene
	 * @param figurenArray Gibt das sortierte Array zurueck
	 */
	private static void bubblesort(Figur[] figurenArray) {
			boolean unsorted=true;
			while (unsorted) {
			unsorted = false;
			for (int i=0; i < figurenArray.length-1; i++) {
				
				if (!(figurenArray[i].Z >= figurenArray[i+1].Z)) {
				Figur dummy = figurenArray[i];
				figurenArray[i] = figurenArray[i+1];
				figurenArray[i+1] = dummy;
				unsorted = true;
				}
			}
		
		}
	}

	/**
	 * Filtert einige Figuren anhand von Werten aus
	 * @param i untere Begrenzung des Z-Werts
	 * @param j obere Begrenzung des Z-Werts
	 * @param figurs die zu filternde Liste
	 * @return gibt ein gefiltertes Array zurueck
	 */
	public static Figur[] filterZ(int i, int j, Figur[] figurs) {
		List <Figur> figures =new LinkedList<Figur>();
		for (int l=0; l < figurs.length-1; l++){
			if (figurs[l].Z>=i&&figurs[l].Z<=j){
				figures.add(figurs[l]);
			}
		}
		Figur []letzte =new Figur[figures.size()];
		for (int k =0; k<figures.size();k++){
			letzte[k]=figures.get(k);
		}
		return letzte;
	}
	}