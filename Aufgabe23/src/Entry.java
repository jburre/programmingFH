import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


public class Entry {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path="C:/Users/Lyz/Desktop/pins.csv";
		InputStream is = new FileInputStream(path);
		InputStreamReader bridge = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(bridge);
		
		char[]pwset={'1','2','3','4','5','6','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String line ="";
		
		List<String> all= new LinkedList<String>();
		//iterate(pwset,4,new char[4],0,all);
		  for (char a : pwset) {
			   for (char b : pwset) {
			    for (char c : pwset) {
			     for (char d : pwset) {

			      all.add("" + a + b + c + d);
			     }
			    }
			   }
			  }
		List <PWThread> threads = new LinkedList<PWThread>();
		while ((line = reader.readLine()) != null){
			String name = line.substring(1, (line.indexOf(",")-1));
			String pw = line.substring((line.indexOf(",")+3),line.length()-2);
			threads.add(new PWThread(name,pw,pwset,all));
			//System.out.println(pw);
		}
		
		long start = System.currentTimeMillis();
		for (PWThread p : threads) { p.start(); } // Threads starten
		for (PWThread p : threads) { p.join(); } // Threads zusammenführen
		long runtime = System.currentTimeMillis() - start;
		
		
		long total = 0; long max = 0;
		for (PWThread p : threads) {
		String name = p.getName(); String pw = p.getTruePW(); long proc = p.getProcTime();
		System.out.println(name +" hat folgendes Passwort "+ pw+" Ratedauer: " + proc + " ms");
		max = proc > max ? proc : max;
		total += proc;
		}
		
		System.out.println("Gemessene Laufzeit: " + runtime + " ms");
		System.out.println("Längste Laufzeit: " + max + " ms");
		System.out.println("Addierte Laufzeit: " + total + " ms");
		System.out.println("Speedup von: " + ((double)total / runtime));
	} 

	private static void iterate(char[] chars, int len, char[] build, int pos,
			List<String> all) {
        if (pos == len) {
            String word = new String(build);
            all.add(word);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            build[pos] = chars[i];
            iterate(chars, len, build, pos + 1,all);
        }
	} 

}
