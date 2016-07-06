package com.example.providermodule;

import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class ProviderInstrumentationTest extends BaseInstrumentationTest {
//  @Test
//  public void useAppContext() throws Exception {
//    // Context of the app under test.
//    Context appContext = InstrumentationRegistry.getTargetContext();
//
//    assertEquals("com.example.providermodule.test", appContext.getPackageName());
//  }

  @Test
  public void addition_isCorrect() throws Exception {
    Assert.assertEquals(5, add(2, 3));
  }

  @Test
  public void subtract_isCorrect() {
    Assert.assertEquals(1, subtract(3, 2));
  }


  public static int add(int a, int b) {
    return a + b;
  }

}