/**
 * Die Modelklasse fuer den Taschenrechner
 * @author Jan-Henrik Burre
 *
 */
public class TRModel {
	/**
	 * Eine Stringdatenhaltung des Results, des Operators,
	 * des Operanden und des Errors.
	 */
	private String result="";
	private String operator="";
	private String operand="";
	private String error="";

	/**
	 * Berechnung eines Ergebnisses anhand einer Eingabe.
	 */
	public void berechne() {
		try {
			// Resultat, Operator oder Operand liegen nicht vor => tue nichts
			if (this.result.equals("") || this.operator.equals("") || this.operand.equals(""))
				return;
			// Ab hier normale Verarbeitung
			float a = Float.valueOf(this.result);
			float b = Float.valueOf(this.operand);
			if (this.operator.equals("+")) this.result = String.valueOf(a + b);
			if (this.operator.equals("-")) this.result = String.valueOf(a - b);
			if (this.operator.equals("/")) {
			// Nicht durch Null teilen
				if (b == 0.0) throw new Exception("Division by Zero");
					this.result = String.valueOf(a / b);
			}
			if (this.operator.equals("*")) this.result = String.valueOf(a * b);
				this.operator = "";
				this.operand = "";
				this.error = "";
			} catch (Exception ex) {
				this.clear();
				this.error = ex.getMessage();
			}
		}

	/**
	 * Loescht die Eingabe.
	 */
	public void clear() {
		this.result="";
		this.error="";
		this.operand="";
		this.operator="";
	}
	
	/**
	 * Settermethode fuer den Operator.
	 * @param op Stringdarstellung des Operators
	 */
	public void setOperator(String op) {
		// Resultat, Operator und Operand existieren aus vorherigen Eingaben => erstmal
		// rechnen
		if (!(this.result.equals("") && this.operator.equals("") && this.operand.equals(""))){
			this.berechne();
			if (!this.getError().equals("")) { return; }
			// Wenn Fehler aufgetreten, Methode verlassen
		}
		// Es wurde bereits ein Operand eingegeben => diesen zum Resultat machen
		if (!this.operand.equals("")) {
			this.result = this.operand;
			this.operand = "";
		}
		// Es liegt kein Resultat vor => Resultat auf Null setzen
		if (this.result.equals("")) { this.result = "0"; }
		this.operator = op;
		this.error = "";
		}

	/**
	 * Getter-Methode fuer den Error
	 * @return die Fehlermeldung
	 */
	public String getError() {
		return this.error;
	}

	/**
	 * Getter-Methode fuer das Result.
	 * @return Das Result als String.
	 */
	public String getResult() {
		return this.result;
	}

	/**
	 * Gettermethode fuer den Operator
	 * @return Den Operator als String.
	 */
	public String getOperator() {
		return this.operator;
	}

	/**
	 * Gettermethode fuer den Operanden
	 * @return Den Operanden als String.
	 */
	public String getOperand() {
		return this.operand;
	}

	/**
	 *  Setzt den Operanden auf den String
	 * @param s Neuer Operator
	 */
	public void setOperand(String s) {
		if (this.operand.equals("")&&this.operator.equals("")) result="";
		this.operand=s;
		this.error="";
	}
	
}
