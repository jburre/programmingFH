import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 
 * Eine Klasse, die eine generische Warteschlange
 * auf der Basis einer LinkedList erstellt
 * @author Jan
 *
 * @param <T> Frei waehlbarer Parameter
 */
public class MyQueue <T>{
	
	/**
	 * Eine LinkedList zur Speicherung der Daten
	 */
	private List <T>storage=new LinkedList<T>();

	/**
	 * Eine Methode zum Hinzufuegen von Daten.
	 * @param v Uebergabeparameter vom Typ T
	 * @return einen Boolschen Wert, wenn die Operation gelungen ist.
	 */
	public boolean enter(T v){
		storage.add(v);
		return true;
	}
	
	/**
	 * Entfernt das erste Element in der Wartschlange und liest es aus.
	 * @return Ein Element vom Typ T
	 * @throws NoSuchElementException Eine Exception, wenn die Warteschlange leer ist.
	 */
	public T leave() throws NoSuchElementException{
		if (storage.isEmpty()){
			throw new NoSuchElementException();
		}
		return storage.remove(0);
	}
	
	/**
	 * Eine ueberpruefende Methode, ob die Liste leer ist.
	 * @return Liefert true, wenn die Liste leer ist.
	 */
	public boolean isEmpty(){
		return storage.isEmpty();
	}
	
	/**
	 * Liest das erste Element der Warteschlange aus.
	 * @return Das erste Element der Warteschlange
	 */
	public T front(){
		if (storage.isEmpty()){
			return null;
		}
		else {
			return storage.get(0);
		}
	}
	
	/**
	 * Eine Methode zur Erstellung einer Stringrepresaentation der Warteschlange.
	 * @return Eine Stringdarstellung vom letzten zum ersten Element.
	 */
	public String toString(){
		String ret="[";
		int i = storage.size()-1;
		ret+=rollback(storage,i,ret);
		return ret;
		
	}

	/**
	 * Rekursiv aufrufende Methode der ToString. Erstellt einen String.
	 * @param s Eine Liste, die durchlaufen werden soll.
	 * @param i Einen Zaehler, der herabgezaehlt wird.
	 * @param ret 
	 * @return Einen String der Elemente der Liste, vom letzen zum 
	 * ersten Element. 
	 */
	private String rollback(List<T> s, int i, String ret) {
		if (i==0){
			ret+= s.get(i)+"]";
		}
		if (i!=0) {
			ret+= s.get(i)+", "+rollback(s,i-1,ret);
		}
		return ret;
	}
}
