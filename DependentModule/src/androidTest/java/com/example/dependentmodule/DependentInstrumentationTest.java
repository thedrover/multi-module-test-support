package com.example.dependentmodule;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import com.example.providermodule.BaseInstrumentationTest;
import com.example.providermodule.ProviderInstrumentationTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class DependentInstrumentationTest extends BaseInstrumentationTest{
  @Test
  public void useAppContext() throws Exception {
    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getTargetContext();

    assertEquals("com.example.dependentmodule", appContext.getPackageName());
  }

  @Test
  public void addition_isCorrect() throws Exception {
    Assert.assertEquals(5, ProviderInstrumentationTest.add(2, 3));
  }

  @Test
  public void subtract_isCorrect() {
    Assert.assertEquals(1, subtract(3, 2));
  }



}