/**
 * Klasser zur Generierung eines Objektes
 * @author Jan
 *
 */

class MyObject implements Comparable<MyObject> {
	
	/**
	 * Einen Wert des Objektes vom Typ Integer
	 */
	int value;
	
	/**
	 * Konstruktor
	 * @param v Einen Integerwert
	 */
	public MyObject(int v) { 
		this.value = v; 
		}
	/**
	 * Vergleichsoperation von MyObject
	 */
	public int compareTo(MyObject o) { 
		return this.value - o.value; 
		}
	
	/**
	 * Erstellt eine Stringrepresaentation von MyObject
	 * @return Einen Stringdarstellung von MyObject
	 */
	public String toString(){
		return this.value+"";
	}
}