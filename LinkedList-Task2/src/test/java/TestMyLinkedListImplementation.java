package com.andersen.pre_intensive.task2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class TestMyLinkedListImplementation {

	@Test
	void findListElementByIndexTest() {
		LinkedList<String> list = new LinkedList<>(); 
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("first");
		String[] res = {"first","second","third","first"};
		assertEquals(list.toArray(), res);
		
	}

}
