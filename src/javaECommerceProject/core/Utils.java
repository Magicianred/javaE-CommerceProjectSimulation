package javaECommerceProject.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	 public static boolean match(String email){
	        String regex = "^[a-zA-Z0-9_!#$%&'*?`~^.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        if(!matcher.matches()) {
	        	System.out.println(email + " email adresi, RegEx doğrulamasından geçemedi");
	        }
	        return matcher.matches();
	    }
}
