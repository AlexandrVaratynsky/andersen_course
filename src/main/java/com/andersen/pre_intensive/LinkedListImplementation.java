package com.andersen.pre_intensive;



public class LinkedListImplementation<T> implements MyLinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size = 0;

	@Override
	public void add(Object o) {

	}

	@Override
	public void add(Object o, int index) {

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
		return 0;
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
	}
}
