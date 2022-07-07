package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {

		String s = "googledata";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i]) + 1);
			}

			else
				hm.put(ch[i], 1);

		}
		 Set<Map.Entry<Character, Integer>> se =hm.entrySet();
		 
		
		for(Map.Entry<Character, Integer> en: se) {
			if(en.getValue() > 1)
				System.out.println(en.getKey());
			
			 
		 }

	}

}
