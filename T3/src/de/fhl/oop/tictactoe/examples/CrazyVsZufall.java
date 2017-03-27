package de.fhl.oop.tictactoe.examples;

import de.fhl.oop.tictactoe.engine.T3Starter;
import de.fhl.oop.tictactoe.player.*;

/**
 * Startet eine Tic Tac Toe Partie der Crazy gegen die Zufallsstrategie.
 * @author Nane Kratzke
 *
 */
public class CrazyVsZufall {

	/**
	 * Hauptprogramm.
	 * @param args Kommandozeilenparameter (werden nicht ausgewertet)
	 */
	public static void main(String[] args) {
		T3Starter.starte_partie(1000, new CrazySpieler("Crazy"), new ZufallsSpieler("Zufall"));

	}

}
