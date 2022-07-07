package javapractice;

public class SortingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Rajat my name ";
		String[] sarr = s.split(" "); 
		int arlen = sarr.length;
		
		for(int i=1; i<arlen; i++) {
			String word = sarr[i];
		int ar = i-1;	
		
		while(ar>=0 && word.length()<sarr[ar].length()) {
			sarr[ar+1]=sarr[ar];
					ar--;
			
		}
			sarr[ar+1]=word;
		}	
			
			for(int i=0; i<sarr.length; i++)
				System.out.print(sarr[i]+ " ");
			
			
		
		
	}

}
