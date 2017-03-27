/**
2 * Klasse zur Definition aller Parameter fuer Experimente
3 * mit dem Kassensimulationsmodell.
4 * @author Nane Kratzke
5 *
6 */
public class Parameters {

/**
* Dauer, die ein Kunde benoetigt, um ein Produkt einzukaufen.
* Einheit: Sekunden pro Produkt
*/
static final int TIME_PER_PRODUCT = 60;

/**
* Minimale Anzahl an Produkten, die ein Kunde kaufen kann.
* Einheit: Produkte
*/
static final int MIN_PRODUCTS = 10;

/**
* Maximale Anzahl an Produkten, die ein Kunde kaufen kann.
* Einheit: Produkte
*/
static final int MAX_PRODUCTS = 50;

/**
* Maximale Laenge einer Warteschlange vor einer Kasse.
* Einheit: Kunden
*/
static final int MAX_QUEUE_LENGTH = 6;

/**
* Leistung einer normalen Kasse.
* Einheit: Sekunden pro Produkt
*/
static final int NORM_QUEUE = 20;

/**
* Leistung einer schnellen Kasse.
* Einheit: Sekunden pro Produkt
*/
static final int FAST_QUEUE = 10;

/**
 * Leistung einer langsamen Kasse.
 * Einheit: Sekunden pro Produkt
*/
static final int SLOW_QUEUE = 40;

/**
* Anzahl an Kunden, die simuliert werden sollen.
* Einheit: Kunden
*/
static final int CUSTOMER_AMOUNT = 100;

/**
* Maximale Sekundenanzahl zwischen zwei Kunden.
* Einheit: Ein Kunde alle n Sekunden
*/
static final int CUSTOMER_ARRIVAL_RATE = 30;

 }