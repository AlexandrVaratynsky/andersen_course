package com.andersen.pre_intensive;


import java.util.Arrays;

public class LinkedListImplementation<T> implements MyList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedListImplementation() {
    }

    public LinkedListImplementation(T[] arrray) {
        this();
        addAll(arrray);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Object o) {
        T value = (T) o;
        Node<T> node = new Node<>(value, null, null);
        if (size == 0) {
            firstNode = node;
        } else {
            node.setPrev(lastNode);
            lastNode.next = node;
        }
        lastNode = node;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        if (!isCorrectPosition(index)) {
            throw new IndexOutOfBoundsException(index + " position is outbound");
        }

        if (index == size - 1) {
            this.add(o);
        }

        if (index < size - 1) {
            Node<T> replaceElement = firstNode;
            for (int i = 0; i < index; i++) {
                replaceElement = replaceElement.next;
            }

            Node<T> newElement = new Node<>((T) o, replaceElement, replaceElement.prev);
            replaceElement.prev.next = newElement;
            replaceElement.prev = newElement;
            size++;
        }
    }

    private boolean isCorrectPosition(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public void sort() {
        T[] tempAr = (T[]) this.getArrayOfValues();
        Arrays.sort(tempAr);
        Node<T> node = firstNode;
        int i = 0;
        while (node != null) {
            node.value = tempAr[i];
            node = node.next;
            i++;
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
        if (!isCorrectPosition(index)) {
            throw new IndexOutOfBoundsException(index + " position is outbound");
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
        if (!isCorrectPosition(index)) {
            throw new IndexOutOfBoundsException(index + " position is outbound");
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
    public void concat(MyList<T> newList) {
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
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

