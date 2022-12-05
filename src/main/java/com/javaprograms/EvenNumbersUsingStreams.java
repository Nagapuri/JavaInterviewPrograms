package com.javaprograms;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersUsingStreams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 17, 19, 21, 23, 25, 50);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
