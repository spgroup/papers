import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 1;
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 100, (int) (short) 100, 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 1;
        int int13 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, 97, (int) '#', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean16 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int5 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long20 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 52;
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 1;
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        boolean boolean16 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '4';
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.maxFrameLength = ' ';
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        long long16 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = '4';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext19);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer21, (int) (byte) -1, 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100;
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (byte) 10, 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean18 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, (int) (short) 100, 1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (35) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        long long4 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, (int) (short) 0, (-1));
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int13 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 100;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '4';
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        int int8 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) ' ', (int) (byte) 0, 35, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        long long1 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int6 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext7);
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int18 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '4';
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        int int19 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 1;
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        int int15 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int15 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int7 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 10;
        int int17 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer18, (int) 'a', 100);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (-1);
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 10;
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
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
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = '#';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 1;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = '4';
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long20 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext21, channelStateEvent22);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long5 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int15 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        long long6 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 0;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 10;
        int int11 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        boolean boolean5 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext11);
        int int13 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) -1;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int7 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 35;
        int int12 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        long long10 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) -1;
        boolean boolean13 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(97, (int) 'a', 10, (-1), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 52;
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext16, channelStateEvent17);
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean19 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 35, (int) (byte) -1, (int) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        long long6 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.fail(channelHandlerContext7, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 0);
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = true;
        int int8 = lengthFieldBasedFrameDecoder5.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext11, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100;
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
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
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
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (byte) 100, (int) (short) 1, (int) 'a', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (35) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        long long16 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 35;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) -1;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext7);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 97;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (-1);
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int14 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 97;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        int int10 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) -1;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        long long20 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        int int14 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 97;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext22, channelEvent23);
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 0, (int) (short) 100, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
        int int15 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext10);
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = ' ';
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 10;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = ' ';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.MessageEvent messageEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext17, messageEvent18);
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 97;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext22, childChannelStateEvent23);
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
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (-1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) -1;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, (int) (byte) 0, (int) (short) -1);
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
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer18, (int) (byte) -1, (int) (short) 100);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext7, channel8, channelBuffer9);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) 100;
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 0;
        long long16 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long5 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 1;
        int int9 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 100;
        long long14 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int15 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int16 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        int int19 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 10, (int) (short) 1, (-1), (int) (short) 10);
        lengthFieldBasedFrameDecoder5.lengthFieldOffset = (byte) 1;
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (-1);
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer16, 1, (int) (byte) 0);
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 1;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 0);
        lengthFieldBasedFrameDecoder5.lengthFieldEndOffset = (short) 10;
        int int8 = lengthFieldBasedFrameDecoder5.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '#';
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        boolean boolean4 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int7 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        int int8 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        int int5 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (byte) 100, 0, (int) (byte) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = ' ';
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) -1;
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext13, channelStateEvent14);
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
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 10;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.writeComplete(channelHandlerContext7, writeCompletionEvent8);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = ' ';
        boolean boolean11 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '#';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer19, (int) '#', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        long long10 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer12, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 35;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
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
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int19 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        boolean boolean5 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer9, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        int int19 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext20, exceptionEvent21);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 10;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        int int15 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 100;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer12, (int) (short) 10, 35);
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        int int12 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 0;
        int int15 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 100;
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 10;
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) 10;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext21, (long) (-1));
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 100;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 35;
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext16);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer11, (int) 'a', (int) (short) 0);
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
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext5, channelStateEvent6);
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long5 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 100;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 100;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) '4', 0, (int) (short) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 'a';
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (-1);
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '4';
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        long long8 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext18, channelStateEvent19);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 10;
        boolean boolean18 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 97L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (short) -1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 100;
        boolean boolean10 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (-1L);
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        int int18 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int13 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        boolean boolean19 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int20 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int21 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long22 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        java.lang.Class<?> wildcardClass23 = lengthFieldBasedFrameDecoder3.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (short) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = ' ';
        boolean boolean11 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        int int13 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext18, exceptionEvent19);
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 1L;
        lengthFieldBasedFrameDecoder3.maxFrameLength = ' ';
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelBound(channelHandlerContext11, channelStateEvent12);
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
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 97;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 1L;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long10 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        boolean boolean19 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int20 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int21 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent25 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext24, channelEvent25);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 10;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 'a';
        int int19 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        long long15 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 35, (int) (byte) 10, 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 100;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        long long19 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext20, channelEvent21);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long15 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (-1);
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 35;
        int int12 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        int int13 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) 100, (int) (short) 100, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '#';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 1;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long6 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 1, (int) (short) 1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 1;
        int int16 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 97;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 52, (int) (byte) -1, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (-1);
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        long long18 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '4';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer18, 52, (int) (short) 100);
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
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 10;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 1;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 0;
        int int6 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long18 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 1;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 32L;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        boolean boolean19 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext20);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext22, channelStateEvent23);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int13 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
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
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 0;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 32L;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        long long20 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext21);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '#';
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int13 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long15 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 0);
        lengthFieldBasedFrameDecoder5.initialBytesToStrip = (short) -1;
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer12, 1, 97);
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        int int17 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = (short) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext9);
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext16);
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder0.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 100L;
        int int14 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 1;
        int int10 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        int int11 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 35;
        long long16 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        lengthFieldBasedFrameDecoder3.maxFrameLength = 35;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelDisconnected(channelHandlerContext18, channelStateEvent19);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelOpen(channelHandlerContext8, channelStateEvent9);
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
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        int int4 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext20, channelStateEvent21);
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int8 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) -1;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext14, (long) '4');
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 1;
        int int16 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int18 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext3, channelEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        long long16 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 10L;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 1;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer13, (int) (short) 1, (int) ' ');
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext9, channelStateEvent10);
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        boolean boolean3 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = ' ';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 0);
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = true;
        boolean boolean8 = lengthFieldBasedFrameDecoder5.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        long long15 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 1, (int) (short) 0, 97, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (-1);
        long long11 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long15 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        long long7 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 10;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (short) 0;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        boolean boolean13 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        int int7 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
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
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 0, 52, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (byte) 1, (int) '4', (int) (short) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 0;
        int int6 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 100L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        int int9 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext14, channel15, channelBuffer16);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer14, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldEndOffset;
        long long10 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int15 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        boolean boolean19 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long20 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0L;
        int int16 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (-1);
        int int13 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) -1, (int) (byte) 100, 97, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) -1;
        long long13 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = ' ';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 35;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        int int12 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 10;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 'a';
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
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 1;
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
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthAdjustment = (byte) 10;
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 0;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (-1);
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
        long long14 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 1;
        int int16 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 35;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        boolean boolean3 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext20, childChannelStateEvent21);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        long long4 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 97;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext16, (long) 52);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 10;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = '#';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer15, (int) (byte) 100, (int) (byte) 1);
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
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 0);
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = true;
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
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        long long6 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int7 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 35;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 35;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext19, exceptionEvent20);
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = '4';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 100;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.Channel channel14 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext13, channel14, channelBuffer15);
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
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(52, 1, (-1), (int) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext13, 100L);
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
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 35, 52, 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long5 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (-1);
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
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        long long9 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 0L;
        boolean boolean13 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        int int6 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
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
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int19 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        long long16 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int17 = lengthFieldBasedFrameDecoder3.maxFrameLength;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder3.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext17, channelStateEvent18);
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
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        int int1 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean2 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int3 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 0;
        int int6 = lengthFieldBasedFrameDecoder0.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = 10;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (short) 1;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = (-1);
        int int11 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext18, channelStateEvent19);
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        boolean boolean14 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 52;
        long long17 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 0;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 35;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (byte) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext13, (long) (byte) 100);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = ' ';
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) -1;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext15, 100L);
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
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 0, 0, 1, 35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = '4';
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext13, (long) '#');
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
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext10);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 100;
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
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        boolean boolean19 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int20 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean21 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        int int14 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int15 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 1;
        boolean boolean15 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (short) 1;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = true;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
        boolean boolean13 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int14 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (short) 10;
        long long13 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (short) 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder0.lengthFieldOffset = 'a';
        int int9 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        lengthFieldBasedFrameDecoder0.failIfNecessary(channelHandlerContext10);
        boolean boolean12 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        boolean boolean7 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) 0, (-1), 35, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean13 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = ' ';
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        long long3 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = (short) 10;
        int int8 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) -1;
        boolean boolean7 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long8 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        int int10 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = '#';
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer13, 1, (int) (short) 0);
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
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
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 10;
        int int17 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) 10;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer14, (int) ' ', 97);
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 100L;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext18, channelStateEvent19);
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
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        long long17 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        lengthFieldBasedFrameDecoder3.lengthFieldLength = '#';
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer19, (-1), (int) (byte) 100);
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
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        long long5 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 1L;
        boolean boolean8 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean9 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.handleUpstream(channelHandlerContext12, channelEvent13);
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
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        long long3 = lengthFieldBasedFrameDecoder0.bytesToDiscard;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        boolean boolean7 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        int int8 = lengthFieldBasedFrameDecoder0.lengthFieldOffset;
        boolean boolean9 = lengthFieldBasedFrameDecoder0.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (-1);
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, (int) '4', (int) ' ', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        boolean boolean12 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = 0;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = '4';
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
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        boolean boolean5 = lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 0L;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 1L;
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int12 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = '#';
        int int16 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext17, writeCompletionEvent18);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = '#';
        int int5 = lengthFieldBasedFrameDecoder0.initialBytesToStrip;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (byte) 100;
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.initialBytesToStrip = 1;
        long long12 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (byte) 1;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext15, 10L);
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
        int int20 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext23, channelStateEvent24);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long11 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer12, (int) (byte) 10, (int) (short) 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.maxFrameLength = 1;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 32L;
        boolean boolean17 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.bytesToDiscard = (byte) 10;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = true;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 100;
        int int12 = lengthFieldBasedFrameDecoder0.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (byte) 10;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 97;
        int int16 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 10, 1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 10, (int) (short) 1, (-1), (int) (short) 10);
        lengthFieldBasedFrameDecoder5.lengthFieldOffset = (byte) 1;
        lengthFieldBasedFrameDecoder5.initialBytesToStrip = (byte) 10;
        lengthFieldBasedFrameDecoder5.tooLongFrameLength = (short) 100;
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, (int) (short) 100, (-1), (int) (short) -1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 1, 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 10;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder3.extractFrame(channelBuffer12, (int) (short) -1, 1);
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 'a';
        lengthFieldBasedFrameDecoder3.lengthFieldOffset = (byte) 100;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = (short) 10;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) -1;
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 10;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = 10;
        int int17 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        long long5 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 100;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.bytesToDiscard = 0L;
        int int5 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        int int6 = lengthFieldBasedFrameDecoder0.lengthAdjustment;
        long long7 = lengthFieldBasedFrameDecoder0.tooLongFrameLength;
        lengthFieldBasedFrameDecoder0.maxFrameLength = 'a';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = 0;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int14 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (byte) 1;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 10;
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
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 100L;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int13 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
        lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength = false;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        long long12 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        long long13 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) 1;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 52;
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long6 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (short) 1;
        int int11 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (-1);
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = '#';
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = 100;
        lengthFieldBasedFrameDecoder0.lengthFieldLength = (byte) 0;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = 100;
        lengthFieldBasedFrameDecoder0.tooLongFrameLength = (-1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder0.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (byte) 0;
        lengthFieldBasedFrameDecoder3.lengthFieldEndOffset = 1;
        int int11 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthFieldLength = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.initialBytesToStrip = (-1);
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        long long11 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        int int12 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.maxFrameLength = (byte) 0;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        boolean boolean9 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = 0;
        long long14 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long17 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder();
        lengthFieldBasedFrameDecoder0.lengthAdjustment = 1;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (byte) 1;
        lengthFieldBasedFrameDecoder0.lengthFieldEndOffset = (-1);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 1);
        int int4 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        boolean boolean5 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (short) 1;
        int int8 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = 'a';
        boolean boolean11 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.lengthAdjustment = '#';
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

