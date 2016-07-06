package com.example.dependentmodule;


import com.example.providermodule.ModuleAUnitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ModuleBUnitTest {
  @Test
  public void addition_isCorrect() throws Exception {
    assertEquals(7, ModuleAUnitTest.add(4, 3));
  }
}