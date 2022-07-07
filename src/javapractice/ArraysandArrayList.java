package javapractice;

import java.util.Arrays;

public class ArraysandArrayList {

	
	public static void main(String[] args) {
		
		String[] str1 = {"ans", "andd","data"};
		String[] str2 = {"dataa","check","conflict"};
		
		int aLen = str1.length;
		int bLen = str2.length;
		
		String[] str3 = new String[aLen+bLen];
		
		System.arraycopy(str1, 0, str3, 0, aLen);
		System.arraycopy(str2, 0, str3, aLen, bLen);
		
		System.out.println(Arrays.toString(str3));
		
		
		
		
	}
}
