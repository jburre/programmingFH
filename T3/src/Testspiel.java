import de.fhl.oop.tictactoe.engine.T3Starter;
import de.fhl.oop.tictactoe.player.*;

public class Testspiel {
	
	public static void main(String[] args) {
		T3Starter.starte_partie(
			
			1000,
			new CrazySpieler("Crazy"),
			new ZufallsSpieler("Zufall")
		);
	}
}