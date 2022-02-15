package com.andersen.pre_intensive;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class LinkedListImplementationTest {

    @Test
    public void add() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void sort() {
    }

    @Test
    public void concat() {
        String[] array = {"Hello", "World", "Test"};
        LinkedListImplementation<String> list = new LinkedListImplementation<>(array);

        String[] addingAr = {"Hello11", "World11"};
        LinkedListImplementation<String> addingList = new LinkedListImplementation<>(addingAr);

        list.concat(addingList);
        assertThat(list.getArrayOfValues())
                .hasSize(array.length + addingAr.length)
                .containsAll(Arrays.asList(array))
                .containsAll(Arrays.asList(addingAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void size() {
    }

    @Test
    public void addAll() {
        String[] array = {"Hello", "World", "Test"};
        LinkedListImplementation<String> list = new LinkedListImplementation<>(array);

        assertThat(list.getArrayOfValues())
                .hasSize(array.length)
                .containsAll(Arrays.asList(array))
                .doesNotContain("ERROR")
                .doesNotContain(666);
    }
}