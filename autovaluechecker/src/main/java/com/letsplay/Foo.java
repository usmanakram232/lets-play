package com.letsplay;

import com.google.auto.value.AutoValue;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@AutoValue
@AutoValue.CopyAnnotations
public abstract class Foo {
  abstract public String bar();

  public static Foo createFooWith(String bar){
    return new AutoValue_Foo(bar);
  }
  @Target(ElementType.TYPE_USE)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Nullable {}

  @Override abstract public boolean equals(@Nullable Object x);
}
