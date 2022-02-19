package com.andersen.pre_intensive;

import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Assert;

public class LinkedListImplementationTest {

    private final LinkedListImplementation<String> emptyList = new LinkedListImplementation<>();
    private LinkedListImplementation<String> headList;
    private LinkedListImplementation<String> tailList;


    private final String[] headAr = {"Hello", "World", "Test"};
    private final String[] tailAr = {"Hello111", "World111", "Test111"};

    LinkedListImplementation<String> list = new LinkedListImplementation<>();

    @Before
    public void createTestList() {

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    }

    @Test
    public void add() {
    	
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
			Assert.assertEquals(inArray[i], arrayFromList[i]);
		}
		
    }
    
    @Test
    public void addWithIndex () {
    	
    	LinkedListImplementation<Integer> linkList = new LinkedListImplementation<Integer>();
    	Integer [] inArray = {0, 1, 2, 3};
		for (Integer i : inArray) {
			linkList.add(i);
		}
		
		Integer ins = 5;
		linkList.add(ins, 1);
		Assert.assertEquals(ins, linkList.get(1));
		
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void sort() {
    }

    @Test
    public void concat() {

        headList = new LinkedListImplementation<>(headAr);
        headList.concat(emptyList);
        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length)
                .containsAll(Arrays.asList(headAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);

        tailList = new LinkedListImplementation<>(tailAr);
        emptyList.concat(tailList);
        assertThat(emptyList.getArrayOfValues())
                .hasSize(tailAr.length)
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);

        headList.concat(tailList);
        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length + tailAr.length)
                .containsAll(Arrays.asList(headAr))
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);
    }

    @Test
    public void deleteElementByIndexMiddle() {
        list.delete(2);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexMiddle2() {
        list.delete(2);
        String[] expectedArray = {"1", "2", "4"};
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexFirst() {
        list.delete(0);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexFirst2() {
        list.delete(0);
        String[] expectedArray = {"2", "3", "4"};
        assertArrayEquals(expectedArray, list.getArrayOfValues());
    }

    @Test
    public void deleteElementByIndexLast() {
        list.delete(list.size() - 1);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexLast2() {
        list.delete(list.size() - 1);
        String[] expectedArray = {"1", "2", "3"};
        assertArrayEquals(expectedArray, list.getArrayOfValues());
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
        assertEquals("1", list.get(0));
    }

    @Test
    public void size() {
    	
    	LinkedListImplementation<Integer> linkList = new LinkedListImplementation<Integer>();
		
		linkList.add(0);
		linkList.add(1);
		linkList.add(2);
		
		int size = linkList.size();
		Assert.assertEquals(3, size);
    }

    @Test
    public void addAll() {

        emptyList.addAll(tailAr);
        assertThat(emptyList.getArrayOfValues())
                .hasSize(tailAr.length)
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);

        headList = new LinkedListImplementation<>(headAr);
        headList.addAll(tailAr);

        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length + tailAr.length)
                .containsAll(Arrays.asList(headAr))
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);
    }

    @Test
    public void getArrayOfValues() {
        assertThat(emptyList.getArrayOfValues())
                .hasSize(0)
                .doesNotContain("ERROR")
                .doesNotContain(666);

        headList = new LinkedListImplementation<>(headAr);
        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length)
                .containsAll(Arrays.asList(headAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);
    }
}