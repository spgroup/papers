/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 11:18:23 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      String string0 = "";
      String string1 = "";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      boolean boolean0 = pipedInputStream0.markSupported();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string0, string1, (InputStream) bufferedInputStream0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HttpConnection.Response httpConnection_Response1 = new HttpConnection.Response(httpConnection_Response0);
      int int0 = httpConnection_Response1.statusCode();
      HttpConnection.KeyVal httpConnection_KeyVal0 = new HttpConnection.KeyVal();
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      Collection<Connection.KeyVal> collection0 = httpConnection_Request0.data();
  }
}
