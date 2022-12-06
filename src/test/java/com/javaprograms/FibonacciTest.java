package com.javaprograms;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public static void main(String[] args) {
        int n1=0, n2 =1, n3, count =15;
        for(int k=1;k<=count;k++)
        {
            n3=n1+n2;
            System.out.println(n1 + " ");
            n1=n2;
            n2=n3;
        }
    }
}
