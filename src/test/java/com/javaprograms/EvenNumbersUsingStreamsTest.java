package com.javaprograms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersUsingStreamsTest {
static Logger log = LoggerFactory.getLogger(EvenNumbersUsingStreamsTest.class);

    @BeforeAll
    static void setup() {

//        log.info(new String("@BeforeAll - executes once before all test methods in this class"));
    }

    @BeforeEach
    void init() {
//        log.info(new String("@BeforeEach - executes before each test method in this class");
    }
        @Test
        public void filter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 17, 19, 21, 23, 25, 50);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
