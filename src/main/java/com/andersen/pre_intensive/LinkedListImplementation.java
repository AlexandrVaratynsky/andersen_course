package com.andersen.pre_intensive;


public class LinkedListImplementation<T> implements MyLinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

<<<<<<< HEAD
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
=======
    public LinkedListImplementation() {
    }
>>>>>>> refs/heads/main

<<<<<<< HEAD
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
=======
    public LinkedListImplementation(T[] arrray) {
        this();
        addAll(arrray);
    }
>>>>>>> refs/heads/main

<<<<<<< HEAD
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
=======
    @Override
    public void add(Object o) {
>>>>>>> refs/heads/main

        Node<T> nod;
        if (size == 0) {
            nod = new Node((T) o, null, null);
            firstNode = nod;
            lastNode = nod;
            System.out.println(firstNode + " " + lastNode);
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

    }

    @Override
    public void sort() {

    }

    Node<T> findListElementByIndex(int index) {

<<<<<<< HEAD
	@Override
	public int size() {
		return size;
	}
=======
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
>>>>>>> refs/heads/main

    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }

<<<<<<< HEAD
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
=======
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

    @Override
    public void concat(MyLinkedList<T> newList) {
        addAll((T[]) newList.getArrayOfValues());
    }

    public void addAll(T[] arrray) {
        int i = 0;
        while (i < arrray.length) {
            addItemToTail(arrray[i]);
            i++;
        }
    }

    private void addItemToTail(T item) {
        Node<T> node = new Node<>(item, null, lastNode);
        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        }
        lastNode.next = node;
        lastNode = node;
        size++;
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
>>>>>>> refs/heads/main
}
