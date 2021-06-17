import java.io.UnsupportedEncodingException;
import java.util.Base64;


public class Base64Security {

	static String pwd;
	public static void main(String[] args) throws UnsupportedEncodingException {
		// Provide the password text
		pwd = "SAm";
		
		// Encode using Base64
		String encodepwd = Base64.getEncoder().encodeToString(pwd.getBytes("UTF-16"));
		
		System.out.println("Encoded pwd"+" "+ encodepwd);
		
		// Decode in byte format
		byte[] decodearr = Base64.getDecoder().decode(encodepwd);
        
		// Converting into string format
		String decodepwd = new String(decodearr, "UTF-16");
	   
		System.out.println("Decoded pwd"+" "+ decodepwd);
	}

}
