package com.letsplay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPlay {

  @DisplayName("Try to use Play abstract class")
  @Test
  void creatPlayTest(){
    Play play = Play.createPlayWith("Cricket", 666);
    System.out.println(play.game());
  }
}
