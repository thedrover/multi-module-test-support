package com.example.providermodule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ProviderUnitTest extends TestBaseClass {

  @Test
  public void addition_isCorrect() throws Exception {
    assertEquals(5, add(2, 3));
  }

  @Test
  public void subtract_isCorrect() {
    assertEquals(1, substract(3, 2));
  }


  public static int add(int a, int b) {
    return a + b;
  }
}