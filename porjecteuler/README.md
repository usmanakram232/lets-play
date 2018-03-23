# Project Euler

## Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

### Solution

``` java
  System.out.println(
    IntStream.iterate(1, i -> i+1).limit(999)
      .filter(num -> num % 3 == 0 || num % 5 == 0)
      .sum()
  );
  
```

*Result* 233168
