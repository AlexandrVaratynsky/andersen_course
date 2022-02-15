package com.andersen.pre_intensive;

import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListImplementationTest {

    LinkedListImplementation<String> list=new LinkedListImplementation<>();

    @Before
    public void createTestList() {

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    }
    @Test
    public void addToList() {
        LinkedListImplementation<String> addList=new LinkedListImplementation<>();
        addList.add("1");
        addList.add("2");
        String[] expectedArray = {"1", "2"};
        assertArrayEquals(expectedArray, addList.getArrayOfValues());
    }

    @Test
    public void addToListByIndex() {
        LinkedListImplementation<String> addList=new LinkedListImplementation<>();
        addList.add("1");
        addList.add("2");
        addList.add("3", 1);
        String[] expectedArray = {"1", "3", "2"};
        System.out.println(Arrays.toString(addList.getArrayOfValues()));
        assertArrayEquals(expectedArray, addList.getArrayOfValues());
    }

    @Test
    public void sort() {

    }

    @Test
    public void concat() {
        LinkedListImplementation<String> addList=new LinkedListImplementation<>();
        addList.add("11");
        addList.add("22");
        list.concat(addList);
        String[] expectedArray = {"1", "2", "3", "4", "11", "22"};
        System.out.println(Arrays.toString(list.getArrayOfValues()));
        System.out.println(Arrays.toString(addList.getArrayOfValues()));
        assertArrayEquals(expectedArray, list.getArrayOfValues());
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
        list.delete(list.size()-1);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexLast2() {
        list.delete(list.size()-1);
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
        assertEquals("1",list.get(0));
    }

    @Test
    public void size() {
    }
}