package javapractice;

import java.util.Arrays;

public class ArraysCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		String str = "javaaaaaJAJ";
		
		int[] count = new int[256];
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length();i++)
			count[str.charAt(i)]++;
		
		for(int i=0; i<str.length();i++) {
			ch[i]=str.charAt(i);
			int f =0;
			for(int j=0;j<=i;j++)
			{ if(ch[i]==str.charAt(j))
				f++;
				
			}
			
			if(f==1)
				System.out.println(str.charAt(i) + ":" + count[str.charAt(i)]);
			
			
			
			
		}
		
		
	}

	}
