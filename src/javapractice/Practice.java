package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		
		System.out.println(counter("laaridldsa"));
		
}
	
	public static String counter(String s) {
		String rev= "" ;
		for(int i=0; i<s.length(); i++) {
			
			String sub = String.valueOf(s.charAt(i));
			int j = i+1;
			if( j<s.length() && !sub.contains(String.valueOf(s.charAt(j)))) {
				rev = rev + s.charAt(j);
				System.out.println(rev);
				j++;
			}
			  rev +=sub;
				
			}
		return rev;
		}
		
		
	
	
	
	
	}

