/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 05:45:38 GMT 2020
 */

package com.zaxxer.hikari;

import org.junit.Test;
import static org.junit.Assert.*;
import com.zaxxer.hikari.HikariConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HikariConfig_ESTest extends HikariConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HikariConfig hikariConfig0 = new HikariConfig();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      hikariConfig0.getJdbcUrl();
  }
}
