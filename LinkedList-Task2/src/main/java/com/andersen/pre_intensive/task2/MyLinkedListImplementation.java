package com.andersen.pre_intensive.task2;



public class MyLinkedListImplementation<T> implements MyLinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size = 0;

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
