import java.util.Scanner;


public class zaehlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine auszuwertende Zeichenkette ein:");
		String input = in.nextLine();
		in.close();
		auswertung(input);
	}

	public static void auswertung(String input) {
		// TODO Auto-generated method stub
		int zaehlerA=0;
		int zaehlerE=0;
		int zaehlerF=0;
		int zaehlerR=0;
		int zaehlerQ=0;
		int zaehlerZ=0;
		
		input=input.toLowerCase();
		for (int i=0; i<input.length();i++){
			char c=input.charAt(i);
				if (c == 'a')zaehlerA+=1;
				if (c == 'e')zaehlerE+=1;
				if (c == 'f')zaehlerF+=1;
				if (c == 'r')zaehlerR+=1;
				if (c == 'q')zaehlerQ+=1;
				if (c == 'z')zaehlerZ+=1;
				}
		
		double durchschnittA=(zaehlerA/input.length())*100;
		double durchschnittE=(zaehlerE/input.length())*100;
		double durchschnittF=(zaehlerF/input.length())*100;
		double durchschnittR=(zaehlerR/input.length())*100;
		double durchschnittQ=(zaehlerQ/input.length())*100;
		double durchschnittZ=(zaehlerZ/input.length())*100;
		
		System.out.println("a: "+zaehlerA+" Vorkommen ("+durchschnittA+")");
		System.out.println("e: "+zaehlerE+" Vorkommen ("+durchschnittE+")");
		System.out.println("f: "+zaehlerF+" Vorkommen ("+durchschnittF+")");
		System.out.println("r: "+zaehlerR+" Vorkommen ("+durchschnittR+")");
		System.out.println("q: "+zaehlerQ+" Vorkommen ("+durchschnittQ+")");
		System.out.println("z: "+zaehlerZ+" Vorkommen ("+durchschnittZ+")");
			}
		}
		
