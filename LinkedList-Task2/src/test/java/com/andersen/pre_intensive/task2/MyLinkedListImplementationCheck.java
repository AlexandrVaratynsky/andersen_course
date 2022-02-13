package com.andersen.pre_intensive.task2;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class MyLinkedListImplementationCheck {
	
	MyLinkedListImplementation<String> list=new MyLinkedListImplementation<String>();
	
	@Before
	public void createTestList() {
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
	}	

	@Test
	public void deleteElementByIndexMiddle() {
		list.delete(0);
		System.out.println("size: "+list.size()+ " mid");
		assertEquals(list.size(), 3);
	}

	@Test
	public void deleteElementByIndexFirst() {
		list.delete(2);
		//System.out.println("size: "+list.size()+ " first");
		assertEquals(list.size(), 3);
	}

	@Test
	public void deleteElementByIndexLast() {
		list.delete(list.size()-1);
		//System.out.println("size: "+list.size()+ " last");
		assertEquals(list.size(), 3);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void deleteElementByWrongIndex() {
		list.delete(-1);
		}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void getElementByWrongIndex() {
		list.get(-1);
		}
	
	@Test
	public void getElementByIndex() {
		assertEquals(list.get(0), "1");
		}
}
