
public class Ellipse extends FigMZLA{

	public Ellipse(int x, int y, int z, int a, int b){
		super(x,y,z,a,b);
		super.figurenTyp="Ellipse";
	}

	public double berechneFlaeche() {
		return Math.PI*(A/2)*(B/2);
	}
}
