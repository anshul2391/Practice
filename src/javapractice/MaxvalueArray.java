package javapractice;

import java.util.Arrays;

public class MaxvalueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int[] a = {11,4,7,34,7,8,39,4,3,8,2,6,788};
		int temp;
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++) {
			  if(a[i]<a[j])
			{
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			
			
			
		}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
	}

}
