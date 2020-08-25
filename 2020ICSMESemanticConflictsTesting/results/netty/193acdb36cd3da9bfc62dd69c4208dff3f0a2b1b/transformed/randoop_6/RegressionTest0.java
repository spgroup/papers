import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 10, (int) (byte) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 10, (int) ' ', (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) 0, (int) (short) 100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 0, 100, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext1, childChannelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext7, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 10, (int) '4', (int) (short) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        java.lang.Class<?> wildcardClass1 = lengthFieldBasedFrameDecoder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer3, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) '#', (int) (byte) -1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 100, 1, (int) (byte) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (32) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 100, (int) (short) 100, 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer7, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext4, channelEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 0, (int) '#', (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) '4', 1, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (32) must be equal to or greater than lengthFieldOffset (52) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext12, exceptionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer11, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.fail(channelHandlerContext10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) '#', 10, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext3, exceptionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer11, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer13, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) '#', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (-1), (-1), (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer11, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer13, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.fail(channelHandlerContext6, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.Channel channel2 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext1, channel2, channelBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 1, (int) (byte) 10, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 10, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext12, exceptionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) -1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer8, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 0, 0, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, channelBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 100, 0, 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = (byte) 100;
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 10, 1, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer11, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext15, exceptionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) ' ', (int) ' ', (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 0, 100, (int) (byte) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer3, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, (int) 'a', (int) (short) 0, 35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) '#', (int) '#', (int) (byte) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '4', (int) (short) 10, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 1, 0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext1, childChannelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) 'a', (int) (byte) 10, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.MessageEvent messageEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext14, messageEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long10 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 1, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext17, channel18, channelBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, (-1), (int) (byte) 100, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext13, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long10 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.fail(channelHandlerContext5, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext16, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer5, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext15, exceptionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.MessageEvent messageEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext16, messageEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        int int6 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext12, exceptionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 35;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 0, 35, (int) (short) -1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = ' ';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 0;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        int int7 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 0, (int) (short) 0, (int) (short) 0, 35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.MessageEvent messageEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext8, messageEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer8, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) -1, 0, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        long long4 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer5, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 35;
        int int16 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (-1L);
        int int16 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 10;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer10, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.fail(channelHandlerContext4, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 1, (int) (byte) -1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 0, (int) 'a', (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext15, channelEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        long long15 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer13, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = ' ';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.MessageEvent messageEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext19, messageEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext14, channel15, channelBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        long long9 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer13, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long5 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = '4';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 10, 0, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 10, (int) (byte) -1, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '4';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.Channel channel16 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext15, channel16, channelBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, 1, 100, (int) 'a', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '4';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) -1, 0, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext17, childChannelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.MessageEvent messageEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext8, messageEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 10, 100, (int) 'a', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer4, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int6 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.fail(channelHandlerContext7, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.MessageEvent messageEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext15, messageEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 100, 0, (int) (short) 1, 35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 1;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 35;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 0, (int) (short) 100, 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer11, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 10, (int) (short) 1, (-1), (int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 100;
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int7 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelDisconnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        long long4 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '4';
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.Channel channel17 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext16, channel17, channelBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext14, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext17);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.MessageEvent messageEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext19, messageEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 100, 100, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 10;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer8, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext14, channel15, channelBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext12, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (short) 1, (int) (byte) -1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext16, exceptionEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) -1;
        int int14 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 35;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (short) 1, 1, (int) (short) -1, 1, true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder6.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long14 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 0, 0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 100, (int) (short) 1, 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (100) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        long long11 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 10, 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.Channel channel17 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext16, channel17, channelBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer6, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) ' ', (int) (byte) 0, (int) ' ', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 35;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext15, channelEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext18, channelEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext15, exceptionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer14, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long10 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 1;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
        long long17 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 97;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) -1;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext11, exceptionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) -1, (int) (short) 100, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int8 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer9, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 100, (int) (short) 10, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer10, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        int int5 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer10, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (-1L);
        int int16 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) -1, 10, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) 10;
        int int8 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 97L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long10 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int12 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long10 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext11, exceptionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long14 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.MessageEvent messageEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.messageReceived(channelHandlerContext14, messageEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 100, (int) (short) 100, 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }
}

