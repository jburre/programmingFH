import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

/**
* Testfaelle, die die Implementierung abpruefen sollen.
* Vorgabe der Aufgabe 19.1
* @author Nane Kratzke
*
*/
public class Test19_Zaehlen {

	/**
	* Pruefe ob countChars bei einem typischen Aufruf funktioniert.
	*/
	@Test
	public void testCaseInsensitive() {
	Map<Character, Integer> m = zaehlen.countChars(false, "Hello World", 'o','e');
	
	// Pruefe die Struktur der Rueckgabe
	assertTrue(m.keySet().size() == 2);
	assertTrue(m.keySet().contains('o'));
	assertTrue(m.keySet().contains('e'));
	
	// Pruefe Inhalt der Rueckgabe
	assertTrue(m.get('o') == 2);
	assertTrue(m.get('e') == 1);
	}
	
	/**
	* Pruefe ob countChars case sensitive korrekt verarbeitet.
	*Die Testmethode ist fuer die Implementierung von Case-Sensitive nicht logisch
	@Test
	public void testCaseSensitive() {
	Map<Character, Integer> m = zaehlen.countChars(false, "Hello World", 'o', 'e', '!');
	
	assertTrue(m.get('o') == 2);
	assertTrue(m.get('O') == 2);
	assertTrue(m.get('e') == 1);
	assertTrue(m.get('E') == 1);
	assertTrue(m.get('!') == 0);
	}
	*/
	
	//Nachfolgender Code durch den Studenten Jan-Henrik Burre hinzugefügt.
	/**
	 * Pruefe, ob die Methode Sonderzeichen verarbeiten kann.
	 */
	@Test
	public void testSpecialSign(){
		Map<Character, Integer> m = zaehlen.countChars(true, "/äääääääööööööüüüüü$$$$%%%??!", 'ä','ö','ü','$','%','?','/','!');
		assertTrue(m.get('ä')==7);
		assertTrue(m.get('ö')==6);
		assertTrue(m.get('ü')==5);
		assertTrue(m.get('$')==4);
		assertTrue(m.get('%')==3);
		assertTrue(m.get('?')==2);
		assertTrue(m.get('/')==1);
		assertTrue(m.get('!')==1);
		
	}
	
	/**
	 * Pruefe, ob die Methode auch Leerzeichen verarbeiten kann.
	 */
	@Test
	public void testEmptyString(){
		Map<Character, Integer> m = zaehlen.countChars(false, "   ", ' ');
		assertTrue(m.get(' ')==3);
	}
	
	
	/**
	 * Pruefe, ob die Methode bei einem leeren String eine leere Ausgabe liefert.
	 */
	@Test
	public void testNullString(){
		Map<Character, Integer> m = zaehlen.countChars(false, "", ' ');
		assertTrue(m.get(' ')==0);
	}
	
	/**
	 * Pruefe, ob "\" eingelesen werden kann oder übersprungen wird.
	 */
	@Test
	public void testCaseSensitiveWithOddCountOfChar(){
		Map<Character, Integer> m = zaehlen.countChars(true, "OOoooo", 'O','o');
		assertTrue(m.get('o')==4);
		assertTrue(m.get('O')==2);
	}
	
	
	
	}

