package emailValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void Validator(String s) {
		
		 String regex = "^(?!.*\\.{2})([a-zA-Z0-9]+)([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]?)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)@([a-z A-Z]{2,20}).([a-z A-Z]{2,4})(.[a-z]{2,8})?$";
	     
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