package javapractice;

import java.util.ArrayList;

public class AddingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		
		al1.add("add");
		al1.add("new");
		al1.add("data");
		al2.add("adding");
		al2.add("details");
		al2.add("to");
		
		al1.addAll(al2);
		
		System.out.println(al1);
	}

}
