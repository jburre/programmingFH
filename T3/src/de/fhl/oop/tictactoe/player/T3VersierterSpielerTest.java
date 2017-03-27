package de.fhl.oop.tictactoe.player;

import org.junit.Test;
import de.fhl.oop.tictactoe.engine.*;

import java.util.*;
import junit.framework.Assert;

/**
 * Testet die Methoden leere_felder, gewonnen und gewinnfelder der
 * Klasse T3VersierterSpieler
 * @author Nane Kratzke
 *
 */
public class T3VersierterSpielerTest {

	/**
	 * Testet die Methode leere_felder() die zur Bestimmung
	 * noch leerer Felder auf einem Tic Tac Toe Spielfeld
	 * bestimmt ist.
	 */
	@Test
	public void testLeere_felder() {
		char[][] feld = { 
				{ T3Konstanten.LEER, T3Konstanten.LEER, T3Konstanten.X },
				{ T3Konstanten.LEER, T3Konstanten.O, T3Konstanten.O },
				{ T3Konstanten.LEER, T3Konstanten.X, T3Konstanten.O }			
		};
		
		T3VersierterSpieler spieler = new T3VersierterSpieler("Testspieler") { 
			public void am_zug(char v, T3Spiel s) { return; } 
		};
		
		Vector<T3FeldPos> felder = spieler.leere_felder(feld);
		
		Assert.assertEquals(4, felder.size());
		Assert.assertEquals(true, felder.contains(new T3FeldPos(0,0)));
		Assert.assertEquals(true, felder.contains(new T3FeldPos(0,1)));
		Assert.assertEquals(true, felder.contains(new T3FeldPos(1,0)));
		Assert.assertEquals(true, felder.contains(new T3FeldPos(2,0)));
	}

	/**
	 * Test die Methode gewinnfelder() die dazu bestimmt ist,
	 * festzustellen, welche Gewinnfelder ein Spieler X oder O in seinem
	 * naechsten Zug hat.
	 */
	@Test
	public void testGewinnfelder() {
		char[][] feld = { 
				{ T3Konstanten.X, T3Konstanten.LEER, T3Konstanten.X },
				{ T3Konstanten.LEER, T3Konstanten.O, T3Konstanten.O },
				{ T3Konstanten.X, T3Konstanten.X, T3Konstanten.LEER }			
		};
		
		T3VersierterSpieler spieler = new T3VersierterSpieler("Testspieler") { 
			public void am_zug(char v, T3Spiel s) { return; } 
		};
		
		Vector<T3FeldPos> gewinnfelder_X = spieler.gewinnfelder(T3Konstanten.X, feld);
		Vector<T3FeldPos> gewinnfelder_O = spieler.gewinnfelder(T3Konstanten.O, feld);
		
		Assert.assertEquals(3, gewinnfelder_X.size());
		Assert.assertEquals(1, gewinnfelder_O.size());
		
		Assert.assertEquals(true, gewinnfelder_X.contains(new T3FeldPos(0,1)));
		Assert.assertEquals(true, gewinnfelder_X.contains(new T3FeldPos(1,0)));
		Assert.assertEquals(true, gewinnfelder_X.contains(new T3FeldPos(2,2)));

		char[][] feld2 = { 
				{ T3Konstanten.LEER, T3Konstanten.LEER, T3Konstanten.LEER },
				{ T3Konstanten.LEER, T3Konstanten.LEER, T3Konstanten.LEER },
				{ T3Konstanten.LEER, T3Konstanten.LEER, T3Konstanten.LEER }			
		};
		
		gewinnfelder_X = spieler.gewinnfelder(T3Konstanten.X, feld2);
		gewinnfelder_O = spieler.gewinnfelder(T3Konstanten.O, feld2);
		Assert.assertEquals(0, gewinnfelder_X.size());
		Assert.assertEquals(0, gewinnfelder_O.size());
		
	}

}
