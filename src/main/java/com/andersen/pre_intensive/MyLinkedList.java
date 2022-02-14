package com.andersen.pre_intensive;

public interface MyLinkedList<T> {
	
	void add(Object o);

	void add(Object o, int index);

	void sort();

	void concat(MyLinkedList<T> newList);

	boolean delete(int index);

	T get(int index);

	int size();

	public T[] getArrayOfValues();
}
