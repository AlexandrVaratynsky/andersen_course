package com.andersen.pre_intensive;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LinkedListImplementationTest {

    private MyList<Integer> emptyList = new LinkedListImplementation<>();
    private MyList<Integer> headList;
    private MyList<Integer> tailList;
    private LinkedListImplementation<Integer> emptyLinkedList = new LinkedListImplementation<>();
    private LinkedListImplementation<Integer> headLinkedList = new LinkedListImplementation<>();
    private LinkedListImplementation<Integer> tailLinkedList = new LinkedListImplementation<>();

    private final Integer[] headAr = {10, 30, 20};
    private final Integer[] tailAr = {50, 70, 60};
    private final Integer[] unsortedAr = {10, 30, 20};

    LinkedListImplementation<String> list;

    @Before
    public void createTestList() {
        list = new LinkedListImplementation<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
            }
        };
    }

    @Test
    public void add() {
        MyList<Integer> linkList = new LinkedListImplementation<>();

        int[] inArray = {0, 1, 2, 3};
        for (Integer i : inArray) {
            linkList.add(i);
        }

        int[] arrayFromList = new int[inArray.length];
        for (int i = 0; i < inArray.length; i++) {
            arrayFromList[i] = linkList.get(i);
        }

        Assert.assertArrayEquals(inArray, arrayFromList);
    }

    @Test
    public void addWithIndex() {
        MyList<Integer> linkList = new LinkedListImplementation<>();

        int[] inArray = {0, 1, 2, 3};
        for (Integer i : inArray) {
            linkList.add(i);
        }

        int ins = 5;
        linkList.add(ins, 1);
        Assert.assertEquals(ins, (int) linkList.get(1));
    }

    @Test
    public void sort() {
        headList = new LinkedListImplementation<>(unsortedAr);
        headList.sort();
        Integer[] actual = Arrays.stream(headList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isSorted();
    }

    @Test
    public void concatNotEmptyListWithEmptyList() {
        headList = new LinkedListImplementation<>(headAr);
        headList.concat(emptyList);
        Integer[] actual = Arrays.stream(headList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .containsExactlyInAnyOrder(headAr);
    }

    @Test
    public void concatEmptyListWithNotEmptyList() {
        tailList = new LinkedListImplementation<>(tailAr);
        emptyList.concat(tailList);
        Integer[] actual = Arrays.stream(emptyList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(tailAr);
    }

    @Test
    public void concatNotEmptyLists() {
        headList = new LinkedListImplementation<>(headAr);
        tailList = new LinkedListImplementation<>(tailAr);
        headList.concat(tailList);
        Integer[] expectedAr = Stream.concat(Arrays.stream(headAr), Arrays.stream(tailAr))
                .toArray(Integer[]::new);
        Integer[] actual = Arrays.stream(headList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(expectedAr);
    }

    @Test
    public void deleteElementByIndexMiddle() {
        list.delete(2);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexMiddle2() {
        list.delete(2);
        String[] expectedArray = {"1", "2", "4"};
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexFirst() {
        list.delete(0);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexFirst2() {
        list.delete(0);
        String[] expectedArray = {"2", "3", "4"};
        assertArrayEquals(expectedArray, list.getArrayOfValues());
    }

    @Test
    public void deleteElementByIndexLast() {
        list.delete(list.size() - 1);
        assertEquals(3, list.size());
    }

    @Test
    public void deleteElementByIndexLast2() {
        list.delete(list.size() - 1);
        String[] expectedArray = {"1", "2", "3"};
        assertArrayEquals(expectedArray, list.getArrayOfValues());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteElementByWrongIndex() {
        list.delete(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByWrongIndex() {
        int index = -1;
        list.get(index);
    }

    @Test
    public void getElementByIndex() {
        String expected = "1";
        assertEquals(expected, list.get(0));
    }

    @Test
    public void size() {
        MyList<Integer> linkList = new LinkedListImplementation<>();
        linkList.add(0);
        linkList.add(1);
        linkList.add(2);
        int expected = 3;
        Assert.assertEquals(expected, linkList.size());
    }

    @Test
    public void addAllToEmptyList() {
        emptyLinkedList.addAll(tailAr);
        Integer[] actual = Arrays.stream(emptyLinkedList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(tailAr);
    }

    @Test
    public void addAllToNotEmptyList() {
        headLinkedList = new LinkedListImplementation<>();
        headLinkedList.addAll(tailAr);
        headLinkedList.addAll(tailAr);
        Integer[] expected = Stream.concat(Arrays.stream(tailAr), Arrays.stream(tailAr))
                .toArray(Integer[]::new);
        Integer[] actual = Arrays.stream(headLinkedList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    public void constructorWithInput() {
        headLinkedList = new LinkedListImplementation<>(headAr);
        Integer[] actual = Arrays.stream(headLinkedList.getArrayOfValues())
                .map(o -> (Integer)o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(headAr);
    }

    @Test
    public void getArrayOfValuesFromEmptyList() {
        Integer[] expected = new Integer[0];
        Integer[] actual = Arrays.stream(emptyList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    public void getArrayOfValuesFromNotEmptyList() {
        headList = new LinkedListImplementation<>(headAr);
        Integer[] expected = headAr;
        Integer[] actual = Arrays.stream(headList.getArrayOfValues())
                .map(o -> (Integer)o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    public void isEmptyListEmpty() {
        assertThat(emptyList.isEmpty())
                .isTrue();
    }

    @Test
    public void isNotEmptyListEmpty() {
        headList = new LinkedListImplementation<>(headAr);
        assertThat(headList.isEmpty())
                .isFalse();
    }
}