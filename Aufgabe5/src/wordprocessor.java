import java.util.Scanner;


public class wordprocessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine zu konvertierende Zeichenkette ein:");
		String input = in.nextLine();
		in.close();
		System.out.println(convert(input));
	}

	private static String convert(String input) {
		// TODO Auto-generated method stub
		int j=0;
		String ret="";
		for (int i =0; i<input.length();i++){
			if (input.charAt(i) == ' ' || i==(input.length()-1)){
				String word="";
				if (i==(input.length()-1)){
					word =input.substring(j,(i+1));
				}
				else {
					word = input.substring(j, i);
				}
				if (word.charAt(0)!='_'&&word.charAt(word.length()-1)!='_') {
					ret+=word+" ";
				}
				if (word.charAt(0)=='_'&&word.charAt(word.length()-1)=='_'){
					word= word.substring(1, -1);
					word=word.toLowerCase();
					ret+=word+" ";
				}
				if (word.charAt(0)!='_'&&word.charAt(word.length()-1)=='_'){
					word=word.toLowerCase();
					word = word.substring(0, word.indexOf('_'));
					ret+=word+" ";
				}
				if (word.charAt(0)=='_'&&word.charAt(word.length()-1)!='_'){
					word = word.substring(1);
					word=word.toUpperCase();
					ret+=word+" ";
				}
				j=i+1;
			}
		}
		return ret;
	}

}
