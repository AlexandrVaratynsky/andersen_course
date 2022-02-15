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

        LinkedListImplementation<String> emptyList = new LinkedListImplementation<>();

        String[] headAr = {"Hello", "World", "Test"};
        LinkedListImplementation<String> headList = new LinkedListImplementation<>(headAr);

        headList.concat(emptyList);
        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length)
                .containsAll(Arrays.asList(headAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);


        String[] tailAr = {"Hello11", "World11"};
        LinkedListImplementation<String> tailList = new LinkedListImplementation<>(tailAr);

        emptyList.concat(tailList);
        assertThat(emptyList.getArrayOfValues())
                .hasSize(tailAr.length);


        headList.concat(tailList);
        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length + tailAr.length)
                .containsAll(Arrays.asList(headAr))
                .containsAll(Arrays.asList(tailAr))
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