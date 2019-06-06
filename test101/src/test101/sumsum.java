package test101;

import java.util.ArrayList;

public class sumsum {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();

		list.add("pen");
		list.add("pineapple");
		list.add("apple");
		list.add("pen");
		list.add("ah!");
		list.add("PPAP");
		
		//System.out.print(list.size());
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		list.remove(0);
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		int num1 = list.indexOf("pineapple");
		System.out.println(num1);
		
		
	}

}
