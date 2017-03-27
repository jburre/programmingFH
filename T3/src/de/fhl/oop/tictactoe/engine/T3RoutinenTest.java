package de.fhl.oop.tictactoe.engine;

import junit.framework.Assert;

import org.junit.Test;


/**
 * Diese Klasse testet wiederkehrend genutzte Hilfsroutinen
 * @author Nane Kratzke
 *
 */
public class T3RoutinenTest {

	/**
	 * Testet die deepclone Methode die dazu bestimmt ist,
	 * ein 2D Array nicht nur in der ersten sondern auch
	 * in der zweiten Dimension zu klonen.
	 */
	@Test
	public void testDeepclone() {
		char[][] feld = { 
				{ T3Konstanten.LEER, T3Konstanten.LEER, T3Konstanten.X },
				{ T3Konstanten.LEER, T3Konstanten.O, T3Konstanten.O },
				{ T3Konstanten.LEER, T3Konstanten.X, T3Konstanten.O }			
		};
		
		char[][] clone = T3Routinen.deepclone(feld);

		// Pruefung entlang der Hauptdiagonalen
		feld[0][0] = T3Konstanten.X;
		feld[1][1] = T3Konstanten.X;
		feld[2][2] = T3Konstanten.X;
		
		Assert.assertTrue(clone[0][0] != feld[0][0]);
		Assert.assertTrue(clone[1][1] != feld[1][1]);
		Assert.assertTrue(clone[2][2] != feld[2][2]);
		
		Assert.assertTrue(clone[0][0] == T3Konstanten.LEER);
		Assert.assertTrue(clone[1][1] == T3Konstanten.O);
		Assert.assertTrue(clone[2][2] == T3Konstanten.O);
	}
	
	/**
	 * Testet die Methode gewonnen() die dazu bestimmt ist,
	 * festzustellen ob ein Spieler O oder X auf einem gegebenen
	 * Spielfeld inkl. Belegung gewonnen hat oder nicht.
	 */
	@Test
	public void testGewonnen() {
		char[][] feld = { 
				{ T3Konstanten.LEER, T3Konstanten.LEER, T3Konstanten.X },
				{ T3Konstanten.LEER, T3Konstanten.O, T3Konstanten.O },
				{ T3Konstanten.LEER, T3Konstanten.X, T3Konstanten.O }			
		};

		Assert.assertEquals(false, T3Routinen.gewonnen(T3Konstanten.X, feld));
		Assert.assertEquals(false, T3Routinen.gewonnen(T3Konstanten.O, feld));
		
		feld[1][0] = T3Konstanten.O;
		Assert.assertEquals(true, T3Routinen.gewonnen(T3Konstanten.O, feld));
		Assert.assertEquals(false, T3Routinen.gewonnen(T3Konstanten.X, feld));
		
		feld[0][0] = T3Konstanten.X;
		feld[0][1] = T3Konstanten.X;
		Assert.assertEquals(true, T3Routinen.gewonnen(T3Konstanten.X, feld));
		Assert.assertEquals(true, T3Routinen.gewonnen(T3Konstanten.O, feld));
	}

}
