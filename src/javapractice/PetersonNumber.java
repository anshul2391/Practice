package javapractice;

public class PetersonNumber {
	
	public static void peterson(int num) {
		
		
		//taking the last digit
		int temp = num;
		
		int sum= 0;
		while(num!=0)
		{
			int r = num%10;
			int fac= 1;
		for(int i=1; i<=r; i++)
		{
			fac=fac*i;
			//System.out.println(fac);
		}
		sum = sum+fac;
		num= num/10;
		}
		
		if(sum ==temp)
		{
			System.out.println(temp + "  is a peterson number");
		}
		
		else
			System.out.println(temp + " is not a peterson number");
	}

	public static void main(String[] args) {
		

		
		PetersonNumber.peterson(15);

		
		
		
		
	}
}
