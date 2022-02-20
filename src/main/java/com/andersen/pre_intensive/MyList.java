package com.andersen.pre_intensive;

public interface MyList<T> {

    void add(Object o);

    void add(Object o, int index);

    void sort();

    void concat(MyList<T> newList);

    boolean delete(int index);

    T get(int index);

    int size();

    Object[] getArrayOfValues();
}
