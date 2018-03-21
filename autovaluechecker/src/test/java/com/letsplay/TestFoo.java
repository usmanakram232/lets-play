package com.letsplay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFoo {

    @DisplayName("Try to use Play abstract class")
    @Test
    void creatFoo(){
      Foo foo = Foo.createFooWith("bar");

      foo.equals(null);
      System.out.println(foo.bar());
    }

}
