import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Bestand {

	private static List<Auto> autos = new ArrayList<Auto>();
	
	public Bestand(){
		
	}
	
	public boolean istVorhanden(Auto a){
		if (autos.contains(a)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean aufnehmen (Auto a){
		if (this.istVorhanden(a)){
			return false;
		}
		else{
			autos.add(a);
			return true;
		}
	}
	
	public boolean entnehmen(Auto a){
		if (this.istVorhanden(a)){
			return false;
		}
		else {
			autos.remove(a);
			return true;
		}
		
	}
	
	public Auto[] getAutosAlsArray(){
		Auto [] a = new Auto[this.autos.size()];
		for (int i=0;i<this.autos.size();i++){
			a[i]=this.autos.get(i);
		}
		return a;
	}
	
	public Auto[] sortiertNachPreis(){
		Auto[]autos=this.getAutosAlsArray();
		boolean unsorted=true;
		while (unsorted) {
			unsorted = false;
			for (int i=0; i < autos.length-1; i++) {
				if (!(autos[i].getPreis() >= autos[i+1].getPreis())) {
				Auto dummy = autos[i];
				autos[i] = autos[i+1];
				autos[i+1] = dummy;
				unsorted = true;
				}
			}
		}
		return autos;
	}
	
}
