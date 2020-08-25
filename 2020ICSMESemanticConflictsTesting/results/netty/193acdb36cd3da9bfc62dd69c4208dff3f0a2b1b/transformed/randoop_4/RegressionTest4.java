import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (-1);
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0;
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        int int5 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext13, channelStateEvent14);
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 10, (int) (short) 1, (-1), (int) (short) 10);
        lengthFieldBasedFrameDecoder5.lengthFieldOffset = (byte) 1;
        lengthFieldBasedFrameDecoder5.initialBytesToStrip = (byte) 10;
        lengthFieldBasedFrameDecoder5.tooLongFrameLength = (short) 100;
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = '4';
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        int int17 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 97;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, (int) (short) 100, (-1), (int) (short) -1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = '4';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer12, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 1;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 100;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100L;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer9, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 1, 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) -1;
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (-1);
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = ' ';
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean16 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext19, channelEvent20);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 1;
        int int9 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long10 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        long long11 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int12 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        int int15 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '#';
        int int19 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 10;
        boolean boolean18 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext15, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.MessageEvent messageEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.messageReceived(channelHandlerContext5, messageEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 1;
        boolean boolean10 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int11 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int17 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }
}

