package com.example.dependentmodule;


import com.example.providermodule.ProviderUnitTest;
import com.example.providermodule.TestBaseClass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class DependentUnitTest extends TestBaseClass {
  @Test
  public void addition_isCorrect() throws Exception {
    assertEquals(7, ProviderUnitTest.add(4, 3));
  }

  @Test
  public void subtract_isCorrect() {
    assertEquals(1, substract(3, 2));
  }
}