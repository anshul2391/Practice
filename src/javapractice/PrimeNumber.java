package javapractice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=100; i++) {
			//System.out.println("inside main for loop:" + i);
			int f =0;
			for(int j=i; j>0; j--) {
				//System.out.println("inside j for loop:" + j);
				if(i%j==0) {
				//System.out.println("s");
					f++;
				}
				
			}
			if (f==2)
				System.out.println(i);
			
			
			
		}

	}

}
