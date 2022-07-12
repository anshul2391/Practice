
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "helloworld";
		String add="";
		
		for(int i=0; i<str.length();i++) {
			boolean repeat = false;
			//for(int j=i+1; j<str.length();j++)
			
				if(str.charAt(i)==str.charAt(i+1)) {
					repeat =true;
					
				}
				
					
			
			if(!repeat) {
				add +=str.charAt(i);
			}
			
		}
			System.out.println(add);
	}

}
