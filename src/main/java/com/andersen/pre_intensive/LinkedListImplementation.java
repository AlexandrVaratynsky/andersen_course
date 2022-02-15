package com.andersen.pre_intensive;


public class LinkedListImplementation<T> implements MyLinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size = 0;

	// Method for print MyLinkedList elements to console
	public void printOut() {

		Node<T> element = firstNode;
		System.out.print(element + " ");
		for (int i = 0; i < size - 1; i++) {
			element = element.next;
			System.out.print(element + " ");
		}
		System.out.println();

	}

	// Add element to end of list
	@Override
	public void add(Object o) {

		Node<T> nod;
		if (size == 0) {
			nod = new Node((T) o, null, null);
			firstNode = nod;
			lastNode = nod;
			size++;
		} else {
			nod = new Node((T) o, null, lastNode);
			lastNode.next = nod;
			lastNode = nod;
			size++;
		}

	}

	@Override
	public void add(Object o, int index) {
		
		if (index > size-1) {
    		throw new IndexOutOfBoundsException();
    	}
    	
    	if (index == size-1) {
    		this.add(o);
    	}
    	
    	if (index < size-1) {
    		
    		System.out.println("вставляем перед " + index);
    		Node<T> replaceElement = firstNode;
    		for (int i = 0; i < index; i++) {
    			replaceElement = replaceElement.next;
    		}
    		
    		Node<T> newElement = new Node<> ((T) o, replaceElement, replaceElement.prev);
    		replaceElement.prev.next = newElement;
    		replaceElement.prev = newElement;
    		size ++;
    	
    	}

	}

	@Override
	public void sort() {

	}

	@Override
	public void concat(MyLinkedList<T> newList) {

	}

	@Override
	public boolean delete(int index) {
		return false;
	}

	@Override
	public T get(int index) {
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	private static class Node<T> {
		T value;
		Node<T> next;
		Node<T> prev;

		public Node(T value, Node<T> next, Node<T> prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

		// toString for Node class
		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
	}
}
