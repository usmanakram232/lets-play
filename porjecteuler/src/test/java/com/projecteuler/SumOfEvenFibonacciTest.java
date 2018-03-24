package com.projecteuler;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOfEvenFibonacciTest {

  @DisplayName("Problem 2: sum of even numbers in fibonacci sequence, under 4 million = ")
  @Test
  void testSolution1() {
    long[] fib = new long[]{1, 2};
    long sumEven = 2;
    while (fib[1] <= 4000000) {
      long tmp = fib[0] + fib[1];
      fib[0] = fib[1];
      fib[1] = tmp;
      if (tmp % 2 == 0) {
        sumEven += tmp;
      }
    }
    System.out.println(sumEven);
  }

}
