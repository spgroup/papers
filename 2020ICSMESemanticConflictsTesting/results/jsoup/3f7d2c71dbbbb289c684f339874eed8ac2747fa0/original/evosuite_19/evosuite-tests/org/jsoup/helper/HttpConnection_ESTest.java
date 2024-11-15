/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 19:25:08 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Document document0 = Parser.parse("K/\"pZbl", "K/\"pZbl");
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      document0.cssSelector();
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     org.jsoup.select.Selector$SelectorParseException : Could not parse query '!': unexpected token at '!'
      // Undeclared exception!
      try { 
        document0.select("!");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '!': unexpected token at '!'
         //
         verifyException("org.jsoup.select.QueryParser", e);
         assertTrue(e.getMessage().equals("Could not parse query '!': unexpected token at '!'"));   
      }
  }
}
