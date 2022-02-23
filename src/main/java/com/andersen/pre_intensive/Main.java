package com.andersen.pre_intensive;


public class Main {

	public static void main(String[] args) {
		
		LinkedListImplementation<Integer> linkList = new LinkedListImplementation<Integer>();
		
		
		Integer [] inArray = {0, 1, 2, 3};
		for (Integer i : inArray) {
			linkList.add(i);
		}
		
		Integer [] arrayFromList = new Integer [inArray.length]; 
		for (int i = 0; i < inArray.length; i++) {
			arrayFromList [i] = linkList.get(i);
		}
		
		for (int i = 0; i < inArray.length; i++) {
			System.out.println((inArray [i]) == linkList.get(i));
		}
		
		for (int i = 0; i < inArray.length; i++) {
			System.out.println(arrayFromList[i]);
		}
		
		System.out.println(inArray == arrayFromList);
		//System.out.println(linkList.listSize);
		
		//linkList.printOut();
		//System.out.println();
		
		
		linkList.add(5, 1);
		
		for (int i = 0; i < inArray.length; i++) {
			System.out.println(linkList.get(i));
		}
		
		System.out.println(linkList.get(1));
		//linkList.printOut();
		//System.out.println(linkList.listSize);
		//System.out.println(linkList.size());
		int sz = linkList.size();
		//System.out.println(linkList.getLastNode());
		System.out.println("----------------------------");


	}

}
