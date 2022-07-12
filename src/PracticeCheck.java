
public class PracticeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  System.out.println(isSubString("javaisaprogramminglanguage","programming"));

  

     }
	
	
	public static boolean isSubString(String main, String sub) {
		
		return main.matches( "(.*)" + sub + "(.*)");
	}
	
public static int isSubString1(String main, String sub) {
		
		return main.indexOf(sub);
	}
	  

}


