package com.andersen.pre_intensive;


import java.util.LinkedList;
import java.util.List;

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

    public T[] getArrayOfValues() {
        Object[] ar = new Object[size];

        Node<T> current = firstNode;
        int i = 0;
        while (current != null) {
            ar[i] = current;
            current = current.next;
            i++;
        }
        return (T[]) ar;
    }

    @Override
    public void concat(MyLinkedList<T> newList) {

        // TODO: 12.02.2022 need to extract as toArray()
        Object[] ar = new Object[newList.size()];
        int i = 0;
        while (i < newList.size()) {
            ar[i] = newList.get(i);
        }

        for (Object o : ar) {
            T el = (T) o;
            Node<T> node = new Node<>(el, null, lastNode);
            lastNode.next = node;
            lastNode = node;
        }
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
