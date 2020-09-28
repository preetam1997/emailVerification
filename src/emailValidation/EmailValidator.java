package emailValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void Validator(String s) {
		
		 String regex = "^([a-z A-Z 0-9]+)([a-z A-Z 0-9 .!#$%&'*+/=?^_`{|}~-]*)$";
	     
	      boolean result = Pattern.matches(regex,s);
	      if(result) {
	         System.out.println("Given email is valid");
	      } else {
	         System.out.println("Given email is not valid");
	      }
	   }

	

		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
	      while(true){
	    	  System.out.println("Enter your Email: ");
		      String email = sc.next();
		      if(email.matches("stop")) {
		    	  return;
		      }
		      Validator(email);
	    
	      }
	   
	    
	    
	
		
		
		
	
	
	}
}