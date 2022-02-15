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