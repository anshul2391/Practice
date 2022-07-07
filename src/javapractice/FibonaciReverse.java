package javapractice;

import java.util.Scanner;

public class FibonaciReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FibonaciReverse.fibonacci();
	}
	
	public static void fibonacci() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int limit =obj.nextInt();
		
		int a =0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<limit;i++) {
			
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
