/**
 * Legt ein neues Set an Figuren an und gibt die GEsamtflaeche aller Figuren nach einer Filterung aus.
 * @author Lyz
 *
 */
public class gesamt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Rechteck(5, 5, -10, 10, 20);
		new RWDreieck(30, 2, 80, 3, 4);
		new Ellipse(4, 10, 31, 10, 20);
		new Kreis(10, 10, 31, 5);
		new Quadrat(100, 200, 13, 35);
		new Rechteck(5, 5, 7, 10, 20);
		new RWDreieck(30, 2, -11, 3, 4);
		new Ellipse(4, 10, -17, 10, 20);
		new Kreis(10, 10, 50, 5);
		new Quadrat(100, 200, 30, 35);
		new Rechteck(5, 5, 25, 10, 20);
		new RWDreieck(30, 2, 7, 3, 4);
		new Ellipse(4, 10, 4, 10, 20);
		new Kreis(10, 10, 10, 5);
		new Quadrat(100, 200, 5, 35);
		
		System.out.println(FigMZLA.flaechen(0,50));
	}

}
