package de.fhl.oop.tictactoe.engine;

import junit.framework.Assert;
import de.fhl.oop.tictactoe.player.*;

import org.junit.*;

/**
 * Testet 
 * ob der generelle Spielablauf funktioniert
 * ob die Engine Last aushaelt
 * ob die Engine robust gegenueber Programmierfehlern implementierter Spieler ist
 * @author Nane Kratzke
 *
 */
public class T3SpielTest {
	
	public Katastrophenspieler kspieler = new Katastrophenspieler("Katastrophe");
	public ZufallsSpieler zspieler1 = new ZufallsSpieler("Zufall 1");
	public ZufallsSpieler zspieler2 = new ZufallsSpieler("Zufall 2");
	
	public CrazySpieler cspieler = new CrazySpieler("Ohne Einfall");
	
	/**
	 * Testet den generellen Spielablauf wie er durch die Klasse T3Spiel
	 * gewaehrleistet wird.
	 * Prueft ebenfalls ob die Regelverstosszaehlung funktioniert.
	 */
	@Test
	public void testT3Spiel_Ablauf() {

		// Teste ob katastrophale Programmierungen den Absturz bringen 
		Assert.assertEquals(-2000, T3Starter.starte_partie(1000, kspieler, zspieler1, false));
		Assert.assertEquals(2000, kspieler.anz_regelverstoesse());
		Assert.assertEquals(2000, T3Starter.starte_partie(1000, zspieler2, kspieler, false));
		Assert.assertEquals(4000, kspieler.anz_regelverstoesse());

		Assert.assertEquals(-2000, T3Starter.starte_partie(1000, kspieler, cspieler, false));
		Assert.assertEquals(6000, kspieler.anz_regelverstoesse());
		Assert.assertEquals(2000, T3Starter.starte_partie(1000, cspieler, kspieler, false));
		Assert.assertEquals(8000, kspieler.anz_regelverstoesse());
	}

	/**
	 * Testet auf Last. Viele Spiele
	 */
	@Test
	public void testT3Spiel_Last() {

		// Teste ob Last einen Absturz zur Folge hat
		try {
			T3Starter.starte_partie(100000, zspieler1, zspieler2, false);
		} catch (Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}

	
}
