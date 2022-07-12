package javapractice;


public class SecongHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1,3,8,9,4,3,54,67};
		int highest = Integer.MIN_VALUE;
		int sHigh = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]>highest) {
				
				sHigh = highest;
				highest = a[i];
				
			}
			else if(a[i]>sHigh && a[i]!=highest) {
				sHigh=a[i];
			}
			
		}
		System.out.println(highest);
		System.out.println(sHigh);
			
		
	}

}
