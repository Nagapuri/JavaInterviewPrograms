package com.javaprograms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNCollectTest {
    @Test
    public void filterOddEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Even list:: " + even);
        System.out.println("Odd list:: " + odd);

    }
}
