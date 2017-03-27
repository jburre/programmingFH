
public class Uhrzeit {

	private int stunde;
	private int minute;
	
	public Uhrzeit (int stunde, int minute){
		this.stunde=stunde;
		this.minute=minute;
	}
	
	public String toString(){
		return stunde+":"+minute+" Uhr";
	}
}
