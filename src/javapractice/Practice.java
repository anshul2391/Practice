package javapractice;

import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {
		
		String str = "abcabcabcaa";
		HashMap<Character, Integer> hm = new HashMap<>();
		
	/*	for (int i = 0; i < ch.length; i++) {
			if (hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i]) + 1);
			}

			else
				hm.put(ch[i], 1); */

		
		for(int i=0; i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1 );
			}
			else
			hm.put(str.charAt(i), 1);	
		}
		
		System.out.println(hm);
		
		
		
}}

