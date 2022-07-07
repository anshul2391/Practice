package javapractice;

public class NoofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 145;
		
		//getting the last digit each time and then get the factorial
		// add each of the factorial to get the complete data
		int totalfact = 0;
		while(num!=0) {
		int lastdigit = num%10;
		//System.out.println(lastdigit);
		int fac=1;
	
		
		for(int j=1; j<=lastdigit; j++) {
			fac = fac*j;
			//System.out.println(fac);
		}
		totalfact = totalfact+ fac;
		     num = num/10;
		     
		     
		}           
		System.out.println(totalfact);
	
		
		
		
		
			
			
			
		

	}
	}

