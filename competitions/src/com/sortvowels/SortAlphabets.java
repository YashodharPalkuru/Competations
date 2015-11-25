package com.sortvowels;

import java.util.LinkedList;
import java.util.ListIterator;


public class SortAlphabets {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("k");
		list.add("g");
		list.add("e");
		list.add("o");
		list.add("t");
		list.add("u");
		list.add("i");
		SortAlphabets.display(list);
		SortAlphabets.vowelsort(list);
		SortAlphabets.display(list);
		
		

	}

	private static void display(LinkedList<String> list) {
        ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()){
		System.out.print(itr.next());
		}
		System.out.println();
		
	}

	private static void vowelsort(LinkedList<String> list) {
		ListIterator<String> itr = list.listIterator();
	/*	list.re
		
		if(list.contains("u")){
			Object temp = list.remove("u");
			 list.addFirst("u");
		}
		if(list.contains("o")){
			Object temp = list.remove("o");
			 list.addFirst("o");
		}
		if(list.contains("i")){
			Object temp = list.remove("i");
			 list.addFirst("i");
		}
		if(list.contains("e")){
			Object temp = list.remove("e");
			 list.addFirst("e");
		}
		if(list.contains("a")){
			Object temp = list.remove("a");
			 list.addFirst("a");
		}
		*/
        String vowels = "";
        
		while(itr.hasNext()){
			String str =itr.next();
			if("a".equalsIgnoreCase(str) || "e".equalsIgnoreCase(str) || "i".equalsIgnoreCase(str) || "o".equalsIgnoreCase(str) || "u".equalsIgnoreCase(str) ){
				vowels =vowels+ str;
			}
		}
		for(int i=vowels.length()-1; i>=0;i--)
		{
			String temp ="" +vowels.charAt(i);
			boolean removed = list.remove(temp);
			//list.remove(temp);
			list.addFirst(temp);
		}
				
		
		

		
		}
		
				
	}


