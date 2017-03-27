import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
* Testet den in der Klasse Sort befindlichen BinSort Algorithmus.
* Vorgabe fuer Aufgabe 19.2
* @author Nane Kratzke
*/
public class BugSortTest {

/**
* Testet aufsteigenden BinSort mit einer Liste von Strings.
*/
@Test
public void testBinSortWithStrings() {
	List<String> strs = new LinkedList<String>();
	strs.add("Hello World");
	strs.add("Mein Name ist Hase");
	strs.add("Das wird schon klappen");
	
	BugSort<String> stringSorter = new BugSort<String>();
	List<String> sorted = stringSorter.binSort(strs,true);
	
	assertTrue(sorted.get(0).equals("Das wird schon klappen"));
	assertTrue(sorted.get(1).equals("Hello World"));
	assertTrue(sorted.get(2).equals("Mein Name ist Hase"));
	}
	
	/**
	* Testet aufsteigenden BinSort mit einer Liste von Integern.
	*/
	//Problem dieser Methode war, dass jede Sortierung automatisch aufsteigend sortiert war
	@Test
	public void testBinSortWithIntegersAsc() {
		List<Integer> is = new LinkedList<Integer>();
		for (int i = 0; i <= 5; i++) is.add(i);
		
			BugSort<Integer> integerSorter = new BugSort<Integer>();
			List<Integer> sorted = integerSorter.binSort(is,true);
		
			// Wir pruefen die aufsteigende Sortierung
			for (int i = 0; i < sorted.size() - 1; i++) {
				assertTrue(sorted.get(i) <= sorted.get(i + 1));
		}
	}
	
	/*
	 * Fehlende Ueberpruefung der absteigenden Sortierung
	 */
	@Test
	public void testBinSortWithIntegersDesc(){
		List<Integer> is = new LinkedList<Integer>();
		for (int i = 0; i <= 5; i++) is.add(i);
		
			BugSort<Integer> integerSorter = new BugSort<Integer>();
			List<Integer> sorted = integerSorter.binSort(is,false);
		
			// Wir pruefen die absteigende Sortierung
			for (int i = 0; i < sorted.size() - 1; i++) {
				assertTrue(sorted.get(i) >= sorted.get(i + 1));
	}
	}
	
}