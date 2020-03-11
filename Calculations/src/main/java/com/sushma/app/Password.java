package com.sushma.app;

public class Password {
  boolean existsnumber=false;
	public boolean checkNumberExists(String passwordstring) {
     char[] passwordchars=passwordstring.toCharArray();
     for(char c:passwordchars)
     {
    	 int ainum=(int) c;
    	 if(ainum>47&&ainum<58)
    	 {
    		 existsnumber=true;
    	 }
     }
	return existsnumber;}

}
