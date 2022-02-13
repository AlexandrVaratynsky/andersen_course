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

	Node<T> findListElementByIndex(int index) {

		if (index < (size / 2)) {
			Node<T> node = firstNode;
			for (int i = 0; i < index; i++)
				node = node.next;
			return node;
		} else {
			Node<T> node = lastNode;
			for (int i = size - 1; i > index; i--)
				node = node.prev;
			return node;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 && index >= size) {
			throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
		}

		Node<T> findedListElement = findListElementByIndex(index);
		final Node<T> next = findedListElement.next;
		final Node<T> prev = findedListElement.prev;

		if (prev == null) {
			firstNode = next;
		} else {
			prev.next = next;
			findedListElement.prev = null;
		}

		if (next == null) {
			lastNode = prev;
		} else {
			next.prev = prev;
			findedListElement.next = null;
		}

		findedListElement.value = null;
		size--;
		return true;
	}

	@Override
	public T get(int index) {
		if (index < 0 && index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}

		return findListElementByIndex(index).value;
	}

}
