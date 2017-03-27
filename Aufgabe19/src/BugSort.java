import java.util.List;

/**
* Die Klasse BugSort soll diverse Sortieralgorithmen bereitstellen.
* Aktuell wird nur der Binaersort Algorithmus angeboten.
* @author Nane Kratzke
*/
public class BugSort<T extends Comparable<T>> {
	
	/**
	* Sortiert eine Liste von Werten nach dem Binaersort Algorithmus.
	* @param list Zu sortierende Liste (list != null)
	* @return Aufsteigend sortierte Liste
	*/
	
	//public List<T> binSort(final List<T> list) { return binSort(list, true); }
	//Aenderung des Listentyps von final auf dynamisch und der boolschen Angabe auf eine Variable, um überhaupt descending sortieren
	//zu koennen
	public List<T> binSort(List<T> list, boolean sort) {
		if (list.isEmpty()){
			return list;
			}
		else {
			return binSorter(list, sort); 
			}
	}

	/**
	* Sortiert eine Liste von Werten nach dem Binaersort Algorithmus
	* aufsteigend oder absteigend.
	* @param list Zu sortierende Liste (list != null)
	* @param asc Soll aufsteigend oder absteigend sortiert werden
	* @return Aufsteigend sortierte Liste (wenn asc == true)
	* Absteigend sortierte Liste (wenn asc == false)
	*/
	
	//public List<T> binSorter(List<T> list, boolean asc) {
	//Aenderung des Methodenkopfes, um Doppeldeutigkeit zu beheben, die durch die Aenderung der Liste von final auf dynamisch
	//erfolgte
	public List<T> binSorter(List<T> list, boolean asc) {
		BugTree<T> bintree = new BugTree<T>(list);
		return asc ? bintree.ascending() : bintree.descending();
	}
}