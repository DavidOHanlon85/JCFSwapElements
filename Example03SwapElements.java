package slideDeckChallenges;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example03SwapElements {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		Collections.addAll(linkedList, "I", "dream", "have", "a");
		
		Collections.swap(linkedList, 1, 2);
		
		//swap(linkedList, 1, 2);
		
		System.out.println(linkedList);
		
		Collections.swap(linkedList, 2, 3);
		
		
		//swap(linkedList, 2, 3);
		
		System.out.println(linkedList);

	}
	
	public static void swap(List<String> list, int position1, int position2) {
		String temp = list.get(position2);
		list.set(position2, list.get(position1));
		list.set(position1, temp);
		
	}

}
