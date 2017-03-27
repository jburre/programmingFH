
public class Person {

	private String vorname;
	private String nachname;
	
	public Person(String vorname, String nachname){
		this.vorname=vorname;
		this.nachname=nachname;
	}
	
	public String toString(){
		return vorname+" "+nachname;
	}
	
	public String getVorname(){
		return this.vorname;
	}
	
	public String getNachname(){
		return this.nachname;
	}
}
