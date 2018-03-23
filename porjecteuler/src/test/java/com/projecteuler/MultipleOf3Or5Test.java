package com.projecteuler;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultipleOf3Or5Test {

  @DisplayName("Lazy solution")
  @Test
  void testRunBasic() {
//    fn = (num) -> { num};
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Integer i = Integer.valueOf(1);
    while (i < 1000) {
      if (i * 3 < 1000) {
        map.put(i * 3, 3);
      }

      if (i * 5 < 1000) {
        map.put(i * 5, 5);
      }
      i++;
    }

    System.out.print(map.keySet().stream().mapToInt(a -> a).sum());
  }

  @DisplayName("try solution with streams")
  @Test
  void teatBasic() {
    System.out.println(
        IntStream.iterate(1, i -> i+1).limit(999)
            .filter(num -> num % 3 == 0 || num % 5 == 0)
            .sum()
    );
  }
}
