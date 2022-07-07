package javapractice;

public class Stringpractice {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            	  
            String s = "googlecom";
            int count[] = new int[256];
            int len = s.length();
            char ch[] = new char[len];
            
            for(int i=0; i<len ;i++) 
            	count[s.charAt(i)]++;
            
            for(int i=0; i<len ;i++) {
            ch[i]=s.charAt(i);
            int find =0;
            
            for(int j=0; j<=i;j++) {
            	if(ch[j]==s.charAt(i))
            		find++;
            }	
            
            if (find == 1)  
        		//prints occurrence of the character   
        		System.out.println("The occurrence of "+ s.charAt(i)+ " is: " + count[s.charAt(i)]);  
            		
            
            		
            
            	  
            	    }
            
	}
	
}


