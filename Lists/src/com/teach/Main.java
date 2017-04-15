package com.teach;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static <E> void printList(List<E> theList) {
		for (E i : theList) {
			System.out.println(i);
		}
	}

    public static void main(String[] args) {
	    List<Integer> integerList = new ArrayList<Integer>();

	    integerList.add(1);
	    integerList.add(2);
	    integerList.add(4);
	    integerList.add(2, 3);
	    System.out.println("Size of list is " + integerList.size());
	    for (int i = 0; i < integerList.size(); i++) {
	    	System.out.println(integerList.get(i));
		}

		for (Integer i : integerList) {
	    	System.out.println(i);
		}

		Iterator<Integer> it = integerList.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		integerList.remove(2);
		printList(integerList);

		List<String> myList = new ArrayList<String>();
		myList.add("Bread");
		myList.add("Eggs");
		myList.add("Bacon");
		printList(myList);

		String [] shoppingList = {
				"Bread", "Eggs", "Bacon"
		};
		for (String s: shoppingList) {
			System.out.println("Item " + s);
		}
		myList.add("Milk");
		printList(myList);
		myList.add("Candy Bar");
		printList(myList);

		myList.remove("Candy Bar");
		printList(myList);

		List< List <String>> twodimlist = new ArrayList<List<String>>();
		twodimlist.add(new ArrayList<String>());
		twodimlist.get(0).add("Akshay");
		twodimlist.add(new ArrayList<String>());
		twodimlist.get(1).add("Abhinav");
		twodimlist.get(1).add("Shivani");
		printList(twodimlist);
    }
}
