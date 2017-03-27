import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Die Viewklasse des Taschenrechners
 * @author Jan-Henrik Burre
 *
 */
public class TRView extends JFrame {
	// Datenfeld des Taschenrechner-Views zur Darstellung des Displays
	private JTextField display = new JTextField();{ 
		this.display.setEditable(false); this.display.setSize(200, 60);
		}
	
	/* Datenfeld in Form eines Vectors in dem alle Tasten des Taschenrechners abgelegt werden
	* Die Tasten werden in diesem Programm ueber den entsprechenden Index angesprochen. */
	public List<JButton> buttons = new LinkedList<JButton>();
	{ buttons.add(new JButton ("0")); // Index 0
	buttons.add(new JButton ("1")); // Index 1
	buttons.add(new JButton ("2")); // Index 2
	buttons.add(new JButton ("3"));
	buttons.add(new JButton ("4"));
	buttons.add(new JButton ("5"));
	buttons.add(new JButton ("6"));
	buttons.add(new JButton ("7"));
	buttons.add(new JButton ("8"));
	buttons.add(new JButton ("9"));
	buttons.add(new JButton ("+")); // Index 10
	buttons.add(new JButton ("-")); // Index 11
	buttons.add(new JButton ("*"));
	buttons.add(new JButton ("/"));
	buttons.add(new JButton ("="));
	buttons.add(new JButton ("C"));
	
	}
	/* Datenfelder des Views die auf das Modelobjekt und Controllerobjekt des TR verweisen */
	protected TRModel model = new TRModel();
	protected TRControl controller = new TRControl(this, model);
	
	/* Konstruktor zum Anlegen eines Viewobjekts eines Taschenrechners. Der Konstruktor
	* platziert alle Bedienelemente und "verlinkt" diese mit einem Controller */
	public TRView() {
		super ("Taschenrechner"); 
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Panel tastenpanel = new Panel(); GridLayout gbLayout = new GridLayout (4, 4);
		gbLayout.setHgap(5); gbLayout.setVgap(5); tastenpanel.setLayout(gbLayout);
		// Zeile 1 des Bedienpanels des TR wird angelegt
		tastenpanel.add (this.buttons.get(1)); 
		tastenpanel.add (this.buttons.get(2));
		tastenpanel.add(this.buttons.get(3));
		tastenpanel.add (this.buttons.get(10));
		
		tastenpanel.add(this.buttons.get(4));
		tastenpanel.add(this.buttons.get(5));
		tastenpanel.add(this.buttons.get(6));
		tastenpanel.add(this.buttons.get(11));
		
		tastenpanel.add(this.buttons.get(7));
		tastenpanel.add(this.buttons.get(8));
		tastenpanel.add(this.buttons.get(9));
		tastenpanel.add(this.buttons.get(12));
		// Zeile 4 des Bedienpanels des TR wird angelegt
		tastenpanel.add (this.buttons.get(15)); 
		tastenpanel.add (this.buttons.get(0));
		tastenpanel.add (this.buttons.get(14)); 
		tastenpanel.add (this.buttons.get(13));
		
		// Display des TR in die erste Zeile setzen. Das Bedienpanel direkt darunter
		this.add(display, BorderLayout.NORTH); this.add(tastenpanel, BorderLayout.CENTER);
		// Alle Tasten des Rechners mit dem Controllerobjekt verknuepfen
		for (JButton b : buttons) { b.addActionListener(controller); }
		this.setSize(250, 250);
		this.setVisible(true);
	}
	
	/**
	* Diese Methode wird vom Controller aufgerufen, wenn der View
	* aufdatiert werden soll.
	*/
	public void update() {
		String result = model.getResult();
		String operator = model.getOperator();
		String operand = model.getOperand();
		String error = model.getError().equals("") ? "" : (model.getError() + "!!!");
		display.setText(result + operator + operand + error);
	}
}