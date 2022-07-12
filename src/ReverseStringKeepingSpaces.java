
public class ReverseStringKeepingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sr = reverseCheck("I am Working");
		System.out.println(sr);
	
	}
	
	public static String reverseCheck(String s) {
		
		char[] ori = s.toCharArray();
		char[] rev = new char[ori.length];
		
		for(int i=0; i<s.length(); i++) {
			if(ori[i]==' ') {
				rev[i]=' ';
			
			}
		}
		int j= rev.length-1;
		for(int i=0; i<s.length(); i++) {
			if(ori[i]!=' ') {
				if(rev[j]==' ') {
					j--;
				}
				
				rev[j]=ori[i];
				j--;
			}
		}
		
		return String.valueOf(rev);
		
		
	}
   
	}

