package de.fhl.oop.tictactoe.player;

import java.util.Vector;

import de.fhl.oop.tictactoe.engine.T3Konstanten;
import de.fhl.oop.tictactoe.engine.T3Routinen;
import de.fhl.oop.tictactoe.engine.T3Spiel;
/**
 * Eine Klasse, die den versierten Spieler erweitert und eine absolute Gewinnstrategie oder ein
 * unentschieden implementiert.
 * @author Jan
 *
 */
public class SpielerJan extends T3VersierterSpieler{

	/**
	 * Konstruktor
	 * @param name zu waehlender Name des Spielers.
	 */
	public SpielerJan(String name) {
		super(name);
	}
	
	/**
	 * Eine Methode zur Ermittlung der Spielzuege
	 * @param feld das zugrundeliegende Spielarray.
	 * @return die Anzahl bisher gespielter Zuege.
	 */
	public int zugnummer(char[][] feld) {
		return T3Konstanten.BREITE * T3Konstanten.BREITE - this.leere_felder(feld).size() + 1;
	}

	/**
	 * Hauptmethode zum Setzen von Spielzuegen.
	 */
	public void am_zug(char v, T3Spiel s) throws Exception {
		char[][] feld=s.lese_feld();
		
		//Spielzuege fuer X
		if (v==T3Konstanten.X){
			//Spielzug 1
			if (this.zugnummer(feld)==1){
				s.setze_auf_feld(this, v, 1, 1);
				return;
			}
			//Spielzug 2
			if (this.zugnummer(feld)==3){
				//Abfragen auf Kante
				if (feld[1][0]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 2, 2);
				}
				if (feld[0][1]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 2, 2);
				}
				if (feld[2][1]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 0, 0);
				}
				if (feld[1][2]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 2, 1);
				}
				
				//Abfragen auf Ecke
				if (feld[0][0]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 2, 2);
				}
				if (feld[0][2]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 2, 0);
				}
				if (feld[2][0]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 0, 2);
				}
				if (feld[2][2]==T3Konstanten.O){
					s.setze_auf_feld(this, v, 0, 0);
				}
				return;
			}
			//Folgespielzuege
			if (this.zugnummer(feld)>3){
				//Wenn du gewinnen kannst, dann gewinne.
				Vector<T3FeldPos> gewinnfelder = this.gewinnfelder(v, feld);
				if (!gewinnfelder.isEmpty()) {
					T3FeldPos pos = gewinnfelder.firstElement();
					s.setze_auf_feld(this, v, pos.getX(), pos.getY());
					return;
				}
				
				// Wenn der Gegner gewinnen kann, blocke ihn
				char gegner = v == T3Konstanten.X ? T3Konstanten.O : T3Konstanten.X;
				gewinnfelder = this.gewinnfelder(gegner, feld);
				if (!gewinnfelder.isEmpty()) {
					T3FeldPos pos = (T3FeldPos)gewinnfelder.firstElement();
					s.setze_auf_feld(this, v, pos.getX(), pos.getY());
					return;
				}
				
				//Methode fuer leere Felder
				T3FeldPos emptyPos = new T3FeldPos();
				for (T3FeldPos pos : this.leere_felder(feld)) {
					char[][] lookahead = T3Routinen.deepclone(feld);
					lookahead[pos.getX()][pos.getY()] = v;
					emptyPos = pos;
					
					
				if (feld [0][2]==T3Konstanten.X){
					if (feld[2][1]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 2, 1);
						return;
					}
					else {
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
				}
				if (feld[2][1]==T3Konstanten.X){
					if (feld [2][0]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 2, 0);
						return;
					}
					else {
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
				}
				if (feld[2][2]==T3Konstanten.X){
					if (feld[0][2]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 0, 2);
						return;
					}
					else {
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
				}
				if (feld [2][0]==T3Konstanten.X){
					if (feld [0][0]!=T3Konstanten.LEER){
						if (feld[0][1]!=T3Konstanten.LEER){
							if (feld[2][1]==T3Konstanten.LEER){
								s.setze_auf_feld(this, v, 2, 1);
								return;
							}
							else {
								emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
								s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
								return;
							}
						}
						else {
							s.setze_auf_feld(this, v, 0, 1);
							return;
						}
					}
					else{
						s.setze_auf_feld(this, v, 0, 0);
						return;
					}
				}
				if (feld[0][0]==T3Konstanten.X){
					s.setze_auf_feld(this, v, 2, 0);
					return;
					}
			
				}
			}
		}
		//Spielzuege für O
		else {
			//Wenn Mitte Leer setze auf Mitte
			if (this.zugnummer(feld) == 2 && feld[1][1] == T3Konstanten.LEER) {
				s.setze_auf_feld(this, v, 1, 1);
				return;
			}
			//Wenn Mitte nicht leer, setze auf unten Links
			if (this.zugnummer(feld) == 2) {
				s.setze_auf_feld(this, v, 2, 0);
				return;
			}
			//Spielzug Nr 2
			if (this.zugnummer(feld)==4){
				//Abfangen, wenn der Gegner die Mitte besitzt und auf unten rechts oder oben Links setzen.
				if (feld[1][1]==T3Konstanten.X){
					if (feld[0][0]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 0, 0);
						return;
					}
					else {
						s.setze_auf_feld(this, v, 2, 2);
						return;
					}
				}
				//Wenn der ich Mitte habe, setze auf die Kanten.
				else {
					if (feld[2][1]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 2, 1);
						return;
					}
					if (feld[1][2]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 1, 2);
						return;
					}
					if (feld[0][1]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 0, 1);
						return;
					}
					else {
						s.setze_auf_feld(this, v, 1, 0);
						return;
					}
				}
			}
			//Folgespielzuege
			if (this.zugnummer(feld)>4){
				
				T3FeldPos emptyPos = new T3FeldPos();
				for (T3FeldPos pos : this.leere_felder(feld)) {
					char[][] lookahead = T3Routinen.deepclone(feld);
					lookahead[pos.getX()][pos.getY()] = v;
					emptyPos = pos;
				}
				
				Vector<T3FeldPos> gewinnfelder = this.gewinnfelder(v, feld);
				if (!gewinnfelder.isEmpty()) {
					T3FeldPos pos = gewinnfelder.firstElement();
					s.setze_auf_feld(this, v, pos.getX(), pos.getY());
					return;
				}
				
				// Wenn der Gegner gewinnen kann, blocke ihn
				char gegner = v == T3Konstanten.X ? T3Konstanten.O : T3Konstanten.X;
				gewinnfelder = this.gewinnfelder(gegner, feld);
				if (!gewinnfelder.isEmpty()) {
					T3FeldPos pos = (T3FeldPos)gewinnfelder.firstElement();
					s.setze_auf_feld(this, v, pos.getX(), pos.getY());
					return;
				}
				
				//Folgezuege, wenn kein Gewinn in 3 Zuegen moeglich.
				if (feld[0][1]==T3Konstanten.O){
					if (feld[2][0]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 2, 0);
						return;
					}
					else {
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
				}
				if (feld[1][2]==T3Konstanten.O){
					if (feld[2][0]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 2, 0);
						return;
					}
					else {
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
				}
				if (feld[1][0]==T3Konstanten.O){
					if (feld[2][1]==T3Konstanten.LEER){
						s.setze_auf_feld(this, v, 2, 1);
						return;
					}
					else {
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
				}
				if (feld[2][1]==T3Konstanten.O){
					if (feld[0][0]!=T3Konstanten.LEER){
						emptyPos = (T3FeldPos)this.leere_felder(feld).firstElement();
						s.setze_auf_feld(this, v, emptyPos.getX(), emptyPos.getY());
						return;
					}
					else {
						s.setze_auf_feld(this, v, 0, 0);
						return;
					}
				}
				
			}
		}
	}
	}
