import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 
 * Eine Klasse, die eine generische Warteschlange
 * auf der Basis einer Array erstellt
 * @author Jan
 *
 * @param <T> Frei waehlbarer Parameter
 */
public class TSQueue <T>{
	
	/**
	 * Ein Array zur Speicherung der Daten
	 */
	private T[] storage;
	private int max;
	private boolean voll;
	private int anfang, ende;
	
	/**
	 * Konstruktor
	 * @param i Arraylaenge
	 */
	public TSQueue(int i){
		this.max=i;
	}

	/**
	 * Eine Methode zum Hinzufuegen von Daten.
	 * @param v Uebergabeparameter vom Typ T
	 * @return einen Boolschen Wert, wenn die Operation gelungen ist.
	 */
	public boolean enter(T v){
		ende = inc(ende);
		storage[ende] = v;
		voll = (anfang == inc(ende));
		return true;
	}
	
	private int inc(int i) {
		if (++i == storage.length) i = 0;
		return i;
	}

	/**
	 * Entfernt das erste Element in der Wartschlange und liest es aus.
	 * @return Ein Element vom Typ T
	 * @throws NoSuchElementException Eine Exception, wenn die Warteschlange leer ist.
	 */
	public T leave() throws NoSuchElementException{
		T e = storage[anfang];
		anfang = inc(anfang);
		voll = false;
		return e;
	}
	
	/**
	 * Eine ueberpruefende Methode, ob die Liste leer ist.
	 * @return Liefert true, wenn die Liste leer ist.
	 */
	public boolean isEmpty(){
		return this.voll;
	}
	
	/**
	 * Liest das erste Element der Warteschlange aus.
	 * @return Das erste Element der Warteschlange
	 */
	public T front(){
		return storage[anfang];
	}
	
	public int size(){
		return this.max;
	}
	
	public List<T> getQueue(){
		List<T> l = new LinkedList<T>();
		for (T t: storage){
			l.add(t);
		}
		return l;
	}
}
