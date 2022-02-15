package com.andersen.pre_intensive;



public class LinkedListImplementation<T> implements MyLinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size = 0;

	@Override
	public void add(Object o) {

		Node<T> nod;
		if (size == 0) {
			nod = new Node((T) o, null, null);
			firstNode = nod;
			lastNode = nod;
			System.out.println(firstNode + " " + lastNode);
			size ++;
		}
		else {
			nod = new Node((T) o, null, lastNode);
			lastNode.next = nod;
			lastNode = nod;
			size ++;
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
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
		}

		Node<T> foundListElement = findListElementByIndex(index);
		final Node<T> next = foundListElement.next;
		final Node<T> prev = foundListElement.prev;

		if (prev == null) {
			firstNode = next;
		} else {
			prev.next = next;
			foundListElement.prev = null;
		}

		if (next == null) {
			lastNode = prev;
		} else {
			next.prev = prev;
			foundListElement.next = null;
		}

		foundListElement.value = null;
		size--;
		return true;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return findListElementByIndex(index).value;
	}

	@Override
	public int size() {
		return size;
	}

    @Override
    public Object[] getArrayOfValues() {
        Object[] ar = new Object[size];

        Node<T> current = firstNode;
        int i = 0;
        while (current != null) {
            ar[i] = current.value;
            current = current.next;
            i++;
        }

        return ar;
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
