package com.example.dependentmodule;

import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import com.example.providermodule.BaseInstrumentationTest;
import com.example.providermodule.ProviderTestHelper;

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
public class DependentInstrumentationTest extends BaseInstrumentationTest {

  /**
   * Use a method from a test helper class in the provider module.
   */
  @Test
  public void addition_isCorrect() {
    Assert.assertEquals(5, ProviderTestHelper.add(2, 3));
  }

  /**
   * Use a method from the base instrumentation test class in the provider module.
   */
  @Test
  public void subtract_isCorrect() {
    Assert.assertEquals(1, subtract(3, 2));
  }


}