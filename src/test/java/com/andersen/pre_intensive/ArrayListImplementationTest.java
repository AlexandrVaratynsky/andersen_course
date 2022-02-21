package com.andersen.pre_intensive;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListImplementationTest {

    private MyList<Integer> emptyDefaultInitedArList;
    private MyList<Integer> emptyCapacityInitedArList;
    private MyList<Integer> notEmptyList;

    List<Integer> shouldBeNotEmptyList;

    Integer[] sampleAr = new Integer[]{10, 30, 20};

    private int initialCapacity;
    private int toRemoveIndexNegative;
    private int toRemoveZeroIndex;
    private int toRemoveIndexGreaterSize;

    @Before
    public void setUp() throws Exception {
        toRemoveIndexNegative = -5;
        toRemoveZeroIndex = 0;
        toRemoveIndexGreaterSize = 5;

        shouldBeNotEmptyList = new ArrayList<>();
        IntStream.range(0, sampleAr.length)
                .forEach(i -> shouldBeNotEmptyList.add(sampleAr[i]));

        emptyDefaultInitedArList = new ArrayListImplementation<>();

        initialCapacity = 20;
        emptyCapacityInitedArList = new ArrayListImplementation<>(initialCapacity);

        notEmptyList = new ArrayListImplementation<>();
        IntStream.range(0, shouldBeNotEmptyList.size())
                .forEach(i -> notEmptyList.add(shouldBeNotEmptyList.get(i)));
    }

    @Test
    public void isEmptyDefaultInitedListEmpty() {
        assertThat(emptyDefaultInitedArList.isEmpty())
                .isTrue();
    }

    @Test
    public void isEmptyCapacityInitedListEmpty() {
        assertThat(emptyCapacityInitedArList.isEmpty())
                .isTrue();
    }

    @Test
    public void isNotEmptyListEmpty() {
        assertThat(notEmptyList.isEmpty())
                .isFalse();
    }

    @Test
    public void addToEmptyList() {
        int addedNum = 50;
        emptyDefaultInitedArList.add(addedNum);
        assertThat(emptyDefaultInitedArList.get(emptyDefaultInitedArList.size() - 1))
                .isEqualTo(addedNum);
    }


    @Test
    public void addToNotEmptyList() {
        int addedNum = 50;
        notEmptyList.add(addedNum);
        assertThat(notEmptyList.get(notEmptyList.size() - 1))
                .isEqualTo(addedNum);
    }

    @Test
    public void sort() {
        notEmptyList.sort();
        Integer[] actual = Arrays.stream(notEmptyList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        assertThat(actual)
                .isSorted();
    }

    @Test
    public void concatNotEmptyToEmptyList(){
        MyList<Integer> concated = new ArrayListImplementation<>();
        concated.concat(notEmptyList);
        Integer[] actual = Arrays.stream(concated.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        Integer[] expected = shouldBeNotEmptyList.toArray(new Integer[0]);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    public void concatNotEmptyToNotEmptyList(){
        notEmptyList.concat(notEmptyList);
        Integer[] actual = Arrays.stream(notEmptyList.getArrayOfValues())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);
        Integer[] expected = Stream.concat(Arrays.stream(sampleAr), Arrays.stream(sampleAr))
                .toArray(Integer[]::new);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    public void delete() {

        assertThat(emptyDefaultInitedArList.delete(toRemoveIndexNegative))
                .isFalse();
        assertThat(emptyDefaultInitedArList.delete(toRemoveIndexGreaterSize))
                .isFalse();
        assertThat(emptyDefaultInitedArList.delete(toRemoveZeroIndex))
                .isFalse();


        assertThat(notEmptyList.delete(toRemoveIndexNegative))
                .isFalse();
        assertThat(notEmptyList.delete(toRemoveIndexGreaterSize))
                .isFalse();
        assertThat(notEmptyList.delete(toRemoveZeroIndex))
                .isTrue();
        assertThat(notEmptyList.size())
                .isEqualTo(shouldBeNotEmptyList.size() - 1);
    }

    @Test
    public void size() {
        assertThat(emptyDefaultInitedArList.size())
                .isZero();
        assertThat(emptyCapacityInitedArList.size())
                .isZero();
        assertThat(notEmptyList.size())
                .isEqualTo(shouldBeNotEmptyList.size());
    }

    @Test
    public void get() {
        IntStream.range(0, shouldBeNotEmptyList.size())
                .forEach(i -> assertThat(notEmptyList.get(i))
                        .isEqualTo(shouldBeNotEmptyList.get(i)));
    }

    @Test
    public void getArrayOfValuesFromEmptyList(){
        assertThat(emptyDefaultInitedArList.getArrayOfValues())
                .isEmpty();
    }

    @Test
    public void getArrayOfValues() {
        assertThat(notEmptyList.getArrayOfValues())
                .isNotEmpty()
                .containsExactlyInAnyOrder(shouldBeNotEmptyList.toArray());
    }
}