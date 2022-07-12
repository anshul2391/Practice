package javapractice;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a1 = {1,2,3,4,5,6,7,8,9,10};
		int [] a2 = {1,3,5,7};
		int f =0;
		int a =0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<a2.length;i++) {
			int j;
			for(j=i; j<a1.length; j++) {
				if(a2[i]==a1[j]) {
					f++;
				}
				
				else {
					a++;
					
				}
				if(a==(a1.length-a2.length))
				al.add(a1[j]);	
			}
			
		
		if(f==a2.length)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		System.out.println(al);
	}

}
}
