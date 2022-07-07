package javapractice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<10;i++)
		{
			int c = a+b;
			a=b;
			b=c;
			//System.out.println(a);
			System.out.println(c);
	
	}
		//System.out.println(c);
	}
	

}
