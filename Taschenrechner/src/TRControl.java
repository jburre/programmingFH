import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Eine Control-Klasse für den Taschenrechner.
 * @author Jan-Henrik Burre
 *
 */
public class TRControl implements ActionListener {
	/**
	* Datenfelder des Controller Objekts eines Taschenrechners
	*/
	private TRView view;
	private TRModel model;
	/**
	* Konstruktor zum Anlegen eines Taschenrechner Controller Objekts
	* @param v Viewobjekt eines Taschenrechners, dass dieser Controller betreut
	* @param m Modelobjekt eines Taschenrechners, dass dieser Controller betreut
	*/
	public TRControl (TRView v, TRModel m) {
	this.view = v;
	this.model = m;
	}

	/**
	 * Eventlistener
	 */
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == view.buttons.get(0)) zahlAnhaengen("0"); // 0
		if (ev.getSource() == view.buttons.get(1)) zahlAnhaengen("1"); // 1
		if (ev.getSource() == view.buttons.get(2)) zahlAnhaengen("2"); // 2
		if (ev.getSource() == view.buttons.get(3)) zahlAnhaengen("3");
		if (ev.getSource() == view.buttons.get(4)) zahlAnhaengen("4");
		if (ev.getSource() == view.buttons.get(5)) zahlAnhaengen("5");
		if (ev.getSource() == view.buttons.get(6)) zahlAnhaengen("6");
		if (ev.getSource() == view.buttons.get(7)) zahlAnhaengen("7");
		if (ev.getSource() == view.buttons.get(8)) zahlAnhaengen("8");
		if (ev.getSource() == view.buttons.get(9)) zahlAnhaengen("9");
		if (ev.getSource() == view.buttons.get(10)) setRechenzeichen("+"); // Plus
		if (ev.getSource() == view.buttons.get(11)) setRechenzeichen("-"); // Minus
		if (ev.getSource() == view.buttons.get(12)) setRechenzeichen("*"); // Mal
		if (ev.getSource() == view.buttons.get(13)) setRechenzeichen("/"); // Geteilt
		if (ev.getSource() == view.buttons.get(14)) berechnen(); // =
		if (ev.getSource() == view.buttons.get(15)) loeschen(); // C
	}
	
	/**
	* Wird aufgerufen, wenn eine Zahl auf dem Taschenrechner betaetigt wurde
	* Diese Zahl wird der aktuell auf dem Display stehenden Zahl angehaengt
	* @param i Die Ziffer die an den aktuell eingegebenen Operanden angehaengt werden soll
	*/
	private void zahlAnhaengen (String i) {
		model.setOperand(model.getOperand() + i);
		view.update();
	}
	
	/**
	* Wird aufgerufen, wenn eine Operatoraste, -, /, *) betaetigt wurde
	* @param i Der eingegebene Operator (+, -, /, *)
	*/
	private void setRechenzeichen (String i) {
		model.setOperator(i);
		view.update();
	}
	
	/**
	* Wird aufgerufen, wenn die C Taste auf einem Taschenrechner
	* betaetigt wurde.
	*/
	private void loeschen() {
		model.clear();
		view.update();
	}
	
	/**
	* Wird aufgerufen, wenn die = Taste auf einem Taschenrechner betaetigt wurde.
	*/
	private void berechnen() {
		model.berechne();
		view.update();
	}
}