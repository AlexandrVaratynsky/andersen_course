package com.andersen.pre_intensive;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class LinkedListImplementationTest {

    private final LinkedListImplementation<String> emptyList = new LinkedListImplementation<>();
    private LinkedListImplementation<String> headList;
    private LinkedListImplementation<String> tailList;


    private final String[] headAr = {"Hello", "World", "Test"};
    private final String[] tailAr = {"Hello111", "World111", "Test111"};



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

        headList = new LinkedListImplementation<>(headAr);
        headList.concat(emptyList);
        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length)
                .containsAll(Arrays.asList(headAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);

        tailList = new LinkedListImplementation<>(tailAr);
        emptyList.concat(tailList);
        assertThat(emptyList.getArrayOfValues())
                .hasSize(tailAr.length)
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);

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

        emptyList.addAll(tailAr);
        assertThat(emptyList.getArrayOfValues())
                .hasSize(tailAr.length)
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);

        headList = new LinkedListImplementation<>(headAr);
        headList.addAll(tailAr);

        assertThat(headList.getArrayOfValues())
                .hasSize(headAr.length + tailAr.length)
                .containsAll(Arrays.asList(headAr))
                .containsAll(Arrays.asList(tailAr))
                .doesNotContain("ERROR")
                .doesNotContain(666);
    }
}