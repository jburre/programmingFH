import java.util.Map;


public class worte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Integer> m = zaehlen.countChars(true, "OOoooo", 'O','o');
		for (Character key : m.keySet()){
			System.out.println(key+" : "+m.get(key));
		}
	}

}
