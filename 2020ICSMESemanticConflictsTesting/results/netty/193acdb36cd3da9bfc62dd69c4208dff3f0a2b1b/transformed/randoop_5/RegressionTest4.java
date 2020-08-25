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
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        long long8 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int18 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 10;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelDisconnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int13 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext17, channelStateEvent18);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.lengthAdjustment = (byte) 0;
        int int8 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        long long9 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '4';
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        long long16 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 1;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 100;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext14, exceptionEvent15);
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        boolean boolean5 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) -1;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer14, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = ' ';
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.MessageEvent messageEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext18, messageEvent19);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 35;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        int int7 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 100;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        int int8 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext14, channelStateEvent15);
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        long long9 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
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
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        long long16 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer17, (int) (byte) 0, 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 1;
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int6 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext17, exceptionEvent18);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 100;
        int int12 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 97;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 10;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '#';
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int8 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext19, channelStateEvent20);
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (-1), (int) (byte) 10, 52, 35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        int int7 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
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
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, 35, 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (byte) 100, (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
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
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) -1;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long9 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 'a';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext19, channelStateEvent20);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext18, childChannelStateEvent19);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 1, 10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 0, 1, (-1), (int) 'a');
        lengthFieldBasedFrameDecoder5.maxFrameLength = 1;
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 100;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer6, 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int19 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = '4';
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        int int14 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int16 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) -1;
        int int7 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        long long8 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = ' ';
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext11, (long) (short) 0);
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext9);
        int int11 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        long long13 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        boolean boolean10 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
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
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = '#';
        long long13 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 10;
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 10;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int18 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext16, channelStateEvent17);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = '#';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext16, (long) '4');
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean16 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 1;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer20, (int) ' ', (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        int int5 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
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
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = ' ';
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 97;
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 100;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 10, 1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 0, (int) (byte) 0, (int) (short) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        int int5 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        long long6 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 52;
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 0;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 52;
        lengthFieldBasedFrameDecoder0.maxFrameLength = ' ';
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext15, channelStateEvent16);
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        int int8 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext18, channelStateEvent19);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 10;
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
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int15 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '4';
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 35;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        int int19 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int20 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) -1, (int) (short) 1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 10;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = ' ';
        int int14 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int15 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        long long16 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        long long17 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int18 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 52;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long15 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext14, exceptionEvent15);
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext18, childChannelStateEvent19);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long15 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 0, 1, (-1), (int) 'a');
        lengthFieldBasedFrameDecoder5.lengthFieldOffset = 35;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int6 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        long long9 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
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
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
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
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 35;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '4';
        int int17 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 0;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 0;
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (-1);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 100, (int) (byte) 1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 35;
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 10;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = ' ';
        int int14 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long15 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 0);
        lengthFieldBasedFrameDecoder5.tooLongFrameLength = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext8, channel9, channelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (short) 1;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) -1, (int) (byte) 0, (int) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 97;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext21);
        long long23 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long24 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext16, childChannelStateEvent17);
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 100;
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 'a';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext21, writeCompletionEvent22);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) -1;
        int int14 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        int int15 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (-1);
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        boolean boolean13 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = ' ';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 35;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext18, channelStateEvent19);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 1L;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = '#';
        long long13 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int14 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 1;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 100;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        int int8 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        boolean boolean16 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (32) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '4';
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        long long14 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 97;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '#';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = '#';
        int int14 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '4';
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 1;
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
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.Channel channel19 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext18, channel19, channelBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 10, (-1), (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '4';
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long15 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        int int16 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 100;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 10;
        int int20 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
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
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.lengthAdjustment = (byte) 0;
        int int8 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer10, (int) (short) 1, (int) (byte) 10);
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long15 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer16, 0, 100);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 0;
        int int16 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext18);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 'a';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext15, (long) ' ');
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 35;
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 0;
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int13 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (short) 100;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(52, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (-1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int21 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) 1, (int) (short) -1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        int int6 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 1;
        long long10 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext15, channelStateEvent16);
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
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) -1;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '4';
        int int14 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        boolean boolean9 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        int int7 = lengthFieldBasedFrameDecoder0.maxFrameLength;
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        long long10 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int11 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        int int3 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 0;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer6, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int19 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int20 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext23, childChannelStateEvent24);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        long long11 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }
}

