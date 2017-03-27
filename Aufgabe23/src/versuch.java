import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;


public class versuch {

	public static List<String> all;

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		//char[]pwset={'1','2','3','4','5','6','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(md5("Bruce Springsteencuw3"));
	}
	
	public static String md5(String s) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		return DatatypeConverter.printBase64Binary(md.digest(s.getBytes()));
	}

}
