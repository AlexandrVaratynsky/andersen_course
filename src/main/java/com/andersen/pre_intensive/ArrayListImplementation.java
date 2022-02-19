package com.andersen.pre_intensive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListImplementation<T> implements MyList<T> {

    private T[] internalArray;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayListImplementation() {
        Object[] newArray = new Object[INITIAL_CAPACITY];
        this.internalArray = (T[]) newArray;
    }

    public ArrayListImplementation(int inputCapacity) {
        Object[] newArray = new Object[inputCapacity];
        this.internalArray = (T[]) newArray;
    }

    public ArrayListImplementation(Class<T> type) {
        this.internalArray = (T[]) Array.newInstance(type, INITIAL_CAPACITY);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void growInternalArray(int newElementsCount) {
        if (isEmpty()) {
            Object[] newInternalArray = new Object[INITIAL_CAPACITY];
            this.internalArray = (T[]) newInternalArray;
        } else {
            int newSize = internalArray.length + newElementsCount;
            Object[] newInternalArray;
            newInternalArray = Arrays.copyOf(internalArray, newSize);
            this.internalArray = (T[]) newInternalArray;
        }
    }

    private void growInternalArray() {
        growInternalArray(1);
    }

    @Override
    public void add(Object o) {
        if (o == null) {
            return;
        }

        if (size() >= internalArray.length) {
            growInternalArray();
        }
        internalArray[(size() - 1) + 1] = (T) o;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        if ((o == null) || (index < 0)) {
            return;
        }
        if ((size() - 1) < index) {
            add(o);
            return;
        }
        int newSize = size() + 1;

        if (size() >= internalArray.length) {
            growInternalArray();
        }

        Object[] newInternalArray = new Object[newSize];
        if (index == 0) {
            newInternalArray[0] = o;
            System.arraycopy(internalArray, 0, newInternalArray, 1, size());
        } else {
            System.arraycopy(internalArray, 0, newInternalArray, 0, index);
            System.arraycopy(internalArray, index, newInternalArray, index + 1, size() - index);
            newInternalArray[index] = o;
        }
        internalArray = (T[]) newInternalArray;
        size++;
    }

    @Override
    public void sort() {
        Arrays.sort(internalArray, 0, size);
    }

    @Override
    public void concat(MyList<T> newList) {
        if (internalArray.length < size + newList.size()) {
            growInternalArray(newList.size() - (internalArray.length - size));
        }

        for (int i = 0; i < newList.size(); i++) {
            internalArray[size + i] = newList.get(i);
        }
        size += newList.size();
    }

    @Override
    public boolean delete(int index) {
        if ((isEmpty()) || (index < 0) || (index >= size())) return false;

        System.arraycopy(internalArray, index + 1, internalArray, index, size() - 1 - index);
        internalArray[size() - 1] = null;
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if ((isEmpty()) || (index < 0) || (index >= size())) {
            return null;
        }
        return internalArray[index];
    }

    @Override
    public Object[] getArrayOfValues() {
        return Arrays.copyOf(internalArray, size);
    }
}
