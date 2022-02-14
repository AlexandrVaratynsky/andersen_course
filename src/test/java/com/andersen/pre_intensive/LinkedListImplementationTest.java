package com.andersen.pre_intensive;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListImplementationTest {

    @Test
    public void add() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void sort() {
    }

    @Test
    public void concat() {
    }

    LinkedListImplementation<String> list=new LinkedListImplementation<>();

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
        assertEquals(list.size(), 3);
    }

    @Test
    public void deleteElementByIndexFirst() {
        list.delete(2);
        assertEquals(list.size(), 3);
    }

    @Test
    public void deleteElementByIndexLast() {
        list.delete(list.size()-1);
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

    @Test
    public void size() {
    }
}