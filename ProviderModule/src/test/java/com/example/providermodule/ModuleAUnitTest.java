package com.example.providermodule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ModuleAUnitTest {
  @Test
  public void addition_isCorrect() throws Exception {
    assertEquals(5, add(2, 3));
  }

  public static int add(int a, int b) {
    return a + b;
  }
}