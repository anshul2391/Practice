package javapractice;

class SubString {
    public int lengthOfLongestSubstring(String s) {
       
       String sub = null; 
        int num = 0;
        for(int i=0; i<s.length(); i++)
        {
            sub = String.valueOf(s.charAt(i));
            
            for(int j=i+1; j<s.length(); j++){
                
                if(!sub.contains(String.valueOf(s.charAt(j)))){
                    
                    sub = sub + String.valueOf(s.charAt(j));
                }
                
                else
                    break;
            }
           
          if(num<sub.length())
          {
              num = sub.length();
             
          }
         
        }
		return num;
     
    }
    
    
    public static void main(String[] args){
        
    	SubString s = new SubString();
        int len =s.lengthOfLongestSubstring("pwwkew");
        System.out.println(len);
    }
}