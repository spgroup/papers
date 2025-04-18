/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 07:25:26 GMT 2020
 */

package org.jboss.netty.handler.codec.frame;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LengthFieldBasedFrameDecoder_ESTest extends LengthFieldBasedFrameDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : lengthFieldLength must be either 1, 2, 3, 4, or 8: 1121
      // Modified Version:
      //     java.lang.IllegalArgumentException : The constructor public org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(int,int,int,int,int,boolean) is not a member of type class org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(1121, 1121, 1121, 1121, 4, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldLength must be either 1, 2, 3, 4, or 8: 1121
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
         assertTrue(e.getMessage().equals("lengthFieldLength must be either 1, 2, 3, 4, or 8: 1121"));   
      }
  }
}
