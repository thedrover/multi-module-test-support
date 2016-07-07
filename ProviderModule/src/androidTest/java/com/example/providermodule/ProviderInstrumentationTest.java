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


  @Test
  public void addition_isCorrect() throws Exception {
    Assert.assertEquals(5, ProviderTestHelper.add(2, 3));
  }

  @Test
  public void subtract_isCorrect() {
    Assert.assertEquals(1, subtract(3, 2));
  }


}