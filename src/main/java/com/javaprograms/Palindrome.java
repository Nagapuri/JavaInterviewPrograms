package com.javaprograms;

public class Palindrome {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        int num = 3456542;
        temp = num;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = (sum * 10) + r;

        }
        if (sum == temp)
            System.out.println("The number given is a palindrome: " + temp);
        else
            System.out.println("The given number is not palindrome");
    }
}
