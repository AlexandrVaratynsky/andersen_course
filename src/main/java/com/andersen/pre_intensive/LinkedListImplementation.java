package com.andersen.pre_intensive;


public class LinkedListImplementation<T> implements MyLinkedList<Object> {

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
    public void add(Object o) {

    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public void sort() {


    }

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
    public void concat(MyLinkedList<Object> newList) {
        addAll((T[]) newList.getArrayOfValues());
    }

    public void addAll(T[] arrray) {
        int sizeBeforeAdding = size;
        int i = 0;
        while (i < arrray.length) {
            addItemToTail(arrray[i]);
            i++;
        }
    }

    public void addItemToTail(T item) {
        Node<T> node = new Node<>(item, null, lastNode);
        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        }
        lastNode.next = node;
        lastNode = node;
        size++;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public Object get(int index) {
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
