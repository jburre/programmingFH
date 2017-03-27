import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;


public class PWThread extends Thread{
	public char[]pwset;
	private String name;
	private String pw;
	private long procTime;
	private String truePW;
	public List<String> all;
	private String test;

	public PWThread(String name, String pw, char[] pwset, List<String> all) {
		this.name=name;
		this.pw=pw;
		this.pwset=pwset;
		this.all=all;
	}

	public static String md5(String s) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		return DatatypeConverter.printBase64Binary(md.digest(s.getBytes()));
	}
	
	public String getN(){
		return this.name;
	}
	
	public String getPW(){
		return this.pw;
	}
	
	public long getProcTime() {
		return this.procTime; 
		}
	
	public void run() {
		  long start = System.currentTimeMillis();

		  try {
		   for (String s : all) {
		    this.test = md5(this.name + s);
		    if (test.equals(this.pw)) {
		     this.truePW = s;
		     break;
		    }
		   }

		  }

		  catch (NoSuchAlgorithmException e) {
		   e.printStackTrace();
		  }
		  long end = System.currentTimeMillis();
		  this.procTime = end - start;
		 }

	/*
	private String bruteForce(String name, String pw, List<String> all) throws NoSuchAlgorithmException {
		String ret ="";
		for (String s : all){
			this.test=md5(name+s);
			if (this.test.equals(pw)){
				ret= s;
				break;
			}
		}
		return ret;
	}
	*/
	
	public String getTruePW(){
		return this.truePW;
	}
}
