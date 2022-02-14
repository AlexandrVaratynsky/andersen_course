package com.andersen.pre_intensive;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Assert;

public class LinkedListImplementationTest {

    @Test
    public void add() {
    	
    	LinkedListImplementation<Integer> linkList = new LinkedListImplementation<Integer>();
		
		linkList.add(0);
		linkList.add(1);
		linkList.add(2);
		
		
		
		
		
    	Assert.assertEquals(linkList, linkList);
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

    @Test
    public void delete() {
    }

    @Test
    public void get() {
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
}