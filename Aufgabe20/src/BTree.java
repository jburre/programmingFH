import java.util.LinkedList;
import java.util.List;

/**
 * Eine Klasse, die einen Binaerbaum generiert.
 * @author Jan
 *
 * @param <T> Noch zu waehlender Parameter
 */
public class BTree <T extends Comparable<T>>{

	/**
	 * Der Baum besteht aus einem Knoten mit Wert,
	 * einem linken und einem rechten Zweig.
	 */
	private T value;
	private  BTree<T> left;
	private BTree<T> right;
	
	/**
	 * Konstruktor
	 * @param t Zu uebergebender Parameter
	 */
	public BTree(T t){
		this.value=t;
	}
	
	/**
	 * Methode zur Entnahme des rechten Zweiges
	 * @return der rechte Zweig von BTree
	 */
	public BTree<T> getRight(){
		return this.right;
	}
	
	/**
	 * Methode zur Entnahme des linken Zweiges
	 * @return den linken Zweig von BTree
	 */
	public BTree<T> getLeft(){
		return this.left;
	}
	/**
	 * Gettermethode fuer den Knoten
	 * @return den Wert des Knotens von BTree
	 */
	public T value(){
		return this.value;
	}
	
	/**
	 * Methode zum Setzen des Linken Baumzweigs
	 * @param tree uebergibt einen Binaerbaum
	 */
	public void setLeft(BTree<T> tree){
		this.left=tree;
	}
	
	/**
	 * Methode zum Setzen des rechten Baumzweigs
	 * @param tree ubergibt einen Binaerbaum
	 */
	public void setRight(BTree<T> tree){
		this.right=tree;
	}
	
	/**
	 * Einfuegemethode fuer BTree
	 * @param v einen Eingabewert von Typ T
	 */
	public void insert(T v){
		if (v.compareTo(this.value()) < 0) {
			if (this.getLeft() == null) { this.setLeft(new BTree<T>(v)); }
		else { this.getLeft().insert(v); }
		}
		
		if (v.compareTo(this.value()) >= 0) {
			if (this.getRight() == null) { this.setRight(new BTree<T>(v)); }
		else { this.getRight().insert(v); }
		}
	}
	
	/**
	 * Eine Methode zur Erstellung einer sortierten Liste
	 * aus dem Binaerbaum nach dem LKR-Prinzip.
	 * @return eine aufsteigend Sortierte Liste
	 */
	public List<T> buildInOrderList() {
		List<T> ret = new LinkedList<T>();
		
		if (this.getLeft() != null) { 
			ret.addAll(this.getLeft().buildInOrderList()); 
			}
		
		ret.add(this.value());
		
		if (this.getRight() != null) { 
			ret.addAll(this.getRight().buildInOrderList()); 
			}
		
		return ret;
	}
	
	/**
	 * Eine Algorithmus zur Erstellung einer sortierten Liste
	 * @param is Eine Liste, die ubergeben wird
	 * @return Eine aufsteigend sortierte Liste
	 */
	public static <T extends Comparable<T>> List<T> bsort(List<T> is) {
		BTree<T> tree = new BTree<T>(is.remove(0));
		
		for (T i : is) { 
			tree.insert(i); 
			}
	
		return tree.buildInOrderList();
		}
}
