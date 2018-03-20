package com.letsplay;

import com.google.auto.value.AutoValue;
import org.checkerframework.checker.nullness.qual.Nullable;

@AutoValue
public abstract class Play {
  abstract public String game();
  abstract public long gameId();

  public static Play createPlayWith(String game, long gameId){
    return new AutoValue_Play(game, gameId);
  }

  @Override abstract public boolean equals(@Nullable Object o);

}
