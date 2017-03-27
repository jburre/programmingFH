import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;


public class zaehlen {

	/**
	2 * Zaehlt die Vorkommensanzahl von Zeichen innerhalb eines Strings.
	3 * @param sensitive Soll case sensitive gezaehlt werden oder nicht?
	4 * @param str Zu durchsuchender String.
	5 * @param cs Zu zaehlende Zeichen innerhalb von str.
	6 * @return Map<Character, Integer> Gezaehlte Vorkommen als
	7 * Mapping von Zeichen auf Haeufigkeit.
	8 */
	public static Map<Character, Integer> countChars( boolean sensitive, String str, char... cs) {
		
		List <Character>check =new LinkedList<Character>();	//Eine Liste mit den abzugleichenden Char
		
	Map<Character, Integer> ret = new HashMap<Character, Integer>();
		for (char c : cs) {
			
			
			if (sensitive){ 								//Ueberpruefung des Codes auf Case sensitive und fuegt diese dann in lower Case ein
				Character.toLowerCase(c);
			}
			if (!check.contains(c)) {
				check.add(c);								//fuegt den Char normal zur Liste hinzu
				ret.put(c, 0);
			}
			if (sensitive && (Character.toUpperCase(c) != Character.toLowerCase(c)) && ( ! check.contains(Character.toUpperCase(c)))) {
				ret.put(Character.toUpperCase(c), 0);
				check.add(Character.toUpperCase(c)); 
				}
	}
	
		if (!sensitive) {									//prueft ob case sensitive false ist und verwandelt den String ansonsten in lowerCase
			str = str.toLowerCase();
		}
		
		for (int i = 0; i < str.length(); i++) {					//Änderung des Entrypoints von i =1 auf i=0 und des Zaehlers auf str.length();
			for (char c : check) {
				/*if (!sensitive) { 								//Ueberfluessige Abfrage bei der Implementierung von Sensitive
					if (c == str.charAt(i)) {
					ret.put(c, ret.get(c) + 1);
						}
					} else {
					*/
						if (c == str.charAt(i)) {
							ret.put(c, ret.get(c)+1);
							//ret.put(Character.toUpperCase(c), ret.get(c)+1);	//fuehrte zu einer falschen Zaehlung von Chars
							}
						}
				}
		return ret;
		}
	}