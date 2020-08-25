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
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource1 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater2 = null;
        gzipSource1.inflater = inflater2;
        int int4 = gzipSource1.section;
        gzipSource1.section = (byte) -1;
        java.util.zip.CRC32 cRC32_7 = null;
        gzipSource1.crc = cRC32_7;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource9 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_10 = null;
        gzipSource9.crc = cRC32_10;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource12 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater13 = null;
        gzipSource12.inflater = inflater13;
        int int15 = gzipSource12.section;
        gzipSource12.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource18 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource12);
        java.util.zip.Inflater inflater19 = gzipSource18.inflater;
        gzipSource9.inflater = inflater19;
        gzipSource1.inflater = inflater19;
        gzipSource0.inflater = inflater19;
        int int23 = gzipSource0.section;
        int int24 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.Source source25 = gzipSource0.source;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer26 = gzipSource0.buffer;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer26);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_1 = null;
        gzipSource0.crc = cRC32_1;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource3 = gzipSource0.inflaterSource;
        java.util.zip.CRC32 cRC32_4 = gzipSource0.crc;
        java.util.zip.Inflater inflater5 = gzipSource0.inflater;
        gzipSource0.checkEqual("", 100, 100);
        java.util.zip.Inflater inflater10 = gzipSource0.inflater;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource11 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource0);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource12 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource11);
        com.squareup.okhttp.internal.bytes.Source source13 = null;
        gzipSource12.source = source13;
        java.util.zip.Inflater inflater15 = gzipSource12.inflater;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_1 = null;
        gzipSource0.crc = cRC32_1;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource3 = gzipSource0.inflaterSource;
        java.util.zip.CRC32 cRC32_4 = gzipSource0.crc;
        java.util.zip.Inflater inflater5 = gzipSource0.inflater;
        gzipSource0.section = 100;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource8 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_9 = null;
        gzipSource8.crc = cRC32_9;
        java.util.zip.CRC32 cRC32_11 = null;
        gzipSource8.crc = cRC32_11;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource13 = gzipSource8.inflaterSource;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource14 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource8);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource15 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_16 = null;
        gzipSource15.crc = cRC32_16;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource18 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater19 = null;
        gzipSource18.inflater = inflater19;
        int int21 = gzipSource18.section;
        gzipSource18.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource24 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource18);
        java.util.zip.Inflater inflater25 = gzipSource24.inflater;
        gzipSource15.inflater = inflater25;
        java.util.zip.CRC32 cRC32_27 = gzipSource15.crc;
        com.squareup.okhttp.internal.bytes.Source source28 = gzipSource15.source;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource29 = new com.squareup.okhttp.internal.bytes.GzipSource();
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource30 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_31 = null;
        gzipSource30.crc = cRC32_31;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource33 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater34 = null;
        gzipSource33.inflater = inflater34;
        int int36 = gzipSource33.section;
        gzipSource33.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource39 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource33);
        java.util.zip.Inflater inflater40 = gzipSource39.inflater;
        gzipSource30.inflater = inflater40;
        gzipSource29.inflater = inflater40;
        gzipSource15.inflater = inflater40;
        gzipSource8.inflater = inflater40;
        gzipSource0.inflater = inflater40;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater40);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource4 = gzipSource0.inflaterSource;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer5 = null;
        gzipSource0.buffer = okBuffer5;
        int int7 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.Source source8 = null;
        gzipSource0.source = source8;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource10 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource0);
        java.util.zip.CRC32 cRC32_11 = gzipSource0.crc;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource12 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater13 = null;
        gzipSource12.inflater = inflater13;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource15 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource12);
        java.util.zip.CRC32 cRC32_16 = gzipSource15.crc;
        gzipSource0.crc = cRC32_16;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource18 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_19 = null;
        gzipSource18.crc = cRC32_19;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource21 = gzipSource18.inflaterSource;
        java.util.zip.CRC32 cRC32_22 = gzipSource18.crc;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource23 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater24 = null;
        gzipSource23.inflater = inflater24;
        int int26 = gzipSource23.section;
        gzipSource23.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource29 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource23);
        java.util.zip.Inflater inflater30 = gzipSource29.inflater;
        gzipSource29.section = (byte) -1;
        java.util.zip.Inflater inflater33 = gzipSource29.inflater;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource34 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater35 = null;
        gzipSource34.inflater = inflater35;
        int int37 = gzipSource34.section;
        gzipSource34.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource40 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource34);
        java.util.zip.Inflater inflater41 = gzipSource40.inflater;
        gzipSource40.section = (byte) -1;
        java.util.zip.Inflater inflater44 = gzipSource40.inflater;
        gzipSource29.inflater = inflater44;
        gzipSource18.inflater = inflater44;
        gzipSource0.inflater = inflater44;
        com.squareup.okhttp.internal.bytes.Deadline deadline49 = null;
        // The following exception was thrown during execution in test generation
        try {
            gzipSource0.require((int) (short) 1, deadline49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater33);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater44);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource4 = null;
        gzipSource0.inflaterSource = inflaterSource4;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource6 = gzipSource0.inflaterSource;
        int int7 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.Source source8 = gzipSource0.source;
        int int9 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource10 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_11 = null;
        gzipSource10.crc = cRC32_11;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource13 = gzipSource10.inflaterSource;
        java.util.zip.CRC32 cRC32_14 = gzipSource10.crc;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource15 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater16 = null;
        gzipSource15.inflater = inflater16;
        int int18 = gzipSource15.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource19 = gzipSource15.inflaterSource;
        gzipSource15.section = (byte) 100;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource22 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater23 = null;
        gzipSource22.inflater = inflater23;
        int int25 = gzipSource22.section;
        gzipSource22.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource28 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource22);
        java.util.zip.Inflater inflater29 = gzipSource28.inflater;
        gzipSource15.inflater = inflater29;
        gzipSource10.inflater = inflater29;
        com.squareup.okhttp.internal.bytes.Source source32 = gzipSource10.source;
        int int33 = gzipSource10.section;
        gzipSource0.source = gzipSource10;
        com.squareup.okhttp.internal.bytes.Deadline deadline35 = null;
        // The following exception was thrown during execution in test generation
        try {
            gzipSource0.consumeTrailer(deadline35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_1 = null;
        gzipSource0.crc = cRC32_1;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource3 = gzipSource0.inflaterSource;
        java.util.zip.CRC32 cRC32_4 = gzipSource0.crc;
        java.util.zip.Inflater inflater5 = gzipSource0.inflater;
        gzipSource0.checkEqual("", 100, 100);
        com.squareup.okhttp.internal.bytes.Source source10 = gzipSource0.source;
        com.squareup.okhttp.internal.bytes.Source source11 = gzipSource0.source;
        com.squareup.okhttp.internal.bytes.Source source12 = gzipSource0.source;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer13 = gzipSource0.buffer;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource14 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer13);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        gzipSource0.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource6 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource0);
        com.squareup.okhttp.internal.bytes.Deadline deadline8 = null;
        gzipSource6.require((-1), deadline8);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource10 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater11 = null;
        gzipSource10.inflater = inflater11;
        int int13 = gzipSource10.section;
        gzipSource10.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource16 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource10);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource17 = null;
        gzipSource10.inflaterSource = inflaterSource17;
        gzipSource6.source = inflaterSource17;
        java.util.zip.CRC32 cRC32_20 = gzipSource6.crc;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer21 = gzipSource6.buffer;
        int int22 = gzipSource6.section;
        java.util.zip.CRC32 cRC32_23 = gzipSource6.crc;
        com.squareup.okhttp.internal.bytes.Source source24 = gzipSource6.source;
        int int25 = gzipSource6.section;
        java.util.zip.CRC32 cRC32_26 = gzipSource6.crc;
        java.lang.Class<?> wildcardClass27 = gzipSource6.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource4 = null;
        gzipSource0.inflaterSource = inflaterSource4;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource6 = gzipSource0.inflaterSource;
        com.squareup.okhttp.internal.bytes.Deadline deadline8 = null;
        gzipSource0.require((int) (short) -1, deadline8);
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer10 = gzipSource0.buffer;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource1 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_2 = null;
        gzipSource1.crc = cRC32_2;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource4 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater5 = null;
        gzipSource4.inflater = inflater5;
        int int7 = gzipSource4.section;
        gzipSource4.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource10 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource4);
        java.util.zip.Inflater inflater11 = gzipSource10.inflater;
        gzipSource1.inflater = inflater11;
        gzipSource0.inflater = inflater11;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer14 = gzipSource0.buffer;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource15 = null;
        gzipSource0.inflaterSource = inflaterSource15;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource17 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater18 = null;
        gzipSource17.inflater = inflater18;
        int int20 = gzipSource17.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource21 = null;
        gzipSource17.inflaterSource = inflaterSource21;
        com.squareup.okhttp.internal.bytes.Source source23 = gzipSource17.source;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource24 = new com.squareup.okhttp.internal.bytes.GzipSource();
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource25 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater26 = null;
        gzipSource25.inflater = inflater26;
        int int28 = gzipSource25.section;
        gzipSource25.section = (byte) -1;
        java.util.zip.CRC32 cRC32_31 = null;
        gzipSource25.crc = cRC32_31;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource33 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_34 = null;
        gzipSource33.crc = cRC32_34;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource36 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater37 = null;
        gzipSource36.inflater = inflater37;
        int int39 = gzipSource36.section;
        gzipSource36.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource42 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource36);
        java.util.zip.Inflater inflater43 = gzipSource42.inflater;
        gzipSource33.inflater = inflater43;
        gzipSource25.inflater = inflater43;
        gzipSource24.inflater = inflater43;
        java.util.zip.CRC32 cRC32_47 = gzipSource24.crc;
        gzipSource17.crc = cRC32_47;
        gzipSource0.crc = cRC32_47;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource50 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater51 = null;
        gzipSource50.inflater = inflater51;
        int int53 = gzipSource50.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource54 = gzipSource50.inflaterSource;
        gzipSource50.section = (byte) 100;
        com.squareup.okhttp.internal.bytes.Deadline deadline58 = null;
        gzipSource50.require((int) (short) -1, deadline58);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource60 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater61 = null;
        gzipSource60.inflater = inflater61;
        int int63 = gzipSource60.section;
        gzipSource60.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource66 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource60);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource67 = null;
        gzipSource60.inflaterSource = inflaterSource67;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource69 = gzipSource60.inflaterSource;
        gzipSource50.source = gzipSource60;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer71 = gzipSource60.buffer;
        gzipSource0.buffer = okBuffer71;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource54);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer71);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        gzipSource0.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource6 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource0);
        java.util.zip.Inflater inflater7 = gzipSource6.inflater;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource8 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource6);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource9 = null;
        gzipSource8.inflaterSource = inflaterSource9;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource11 = gzipSource8.inflaterSource;
        com.squareup.okhttp.internal.bytes.Deadline deadline13 = null;
        // The following exception was thrown during execution in test generation
        try {
            gzipSource8.require((int) '4', deadline13);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource11);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource4 = gzipSource0.inflaterSource;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer5 = null;
        gzipSource0.buffer = okBuffer5;
        int int7 = gzipSource0.section;
        java.util.zip.Inflater inflater8 = gzipSource0.inflater;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource9 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_10 = null;
        gzipSource9.crc = cRC32_10;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource12 = gzipSource9.inflaterSource;
        java.util.zip.CRC32 cRC32_13 = gzipSource9.crc;
        java.util.zip.Inflater inflater14 = gzipSource9.inflater;
        java.util.zip.CRC32 cRC32_15 = null;
        gzipSource9.crc = cRC32_15;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource17 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater18 = null;
        gzipSource17.inflater = inflater18;
        int int20 = gzipSource17.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource21 = gzipSource17.inflaterSource;
        gzipSource17.section = (byte) 100;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource24 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater25 = null;
        gzipSource24.inflater = inflater25;
        int int27 = gzipSource24.section;
        gzipSource24.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource30 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource24);
        java.util.zip.Inflater inflater31 = gzipSource30.inflater;
        gzipSource17.inflater = inflater31;
        gzipSource9.inflater = inflater31;
        gzipSource0.source = gzipSource9;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource35 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater36 = null;
        gzipSource35.inflater = inflater36;
        int int38 = gzipSource35.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource39 = gzipSource35.inflaterSource;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource40 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_41 = null;
        gzipSource40.crc = cRC32_41;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource43 = gzipSource40.inflaterSource;
        java.util.zip.CRC32 cRC32_44 = gzipSource40.crc;
        java.util.zip.Inflater inflater45 = gzipSource40.inflater;
        gzipSource40.checkEqual("", 100, 100);
        com.squareup.okhttp.internal.bytes.Source source50 = gzipSource40.source;
        gzipSource35.source = source50;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource52 = gzipSource35.inflaterSource;
        int int53 = gzipSource35.section;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource54 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater55 = null;
        gzipSource54.inflater = inflater55;
        int int57 = gzipSource54.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource58 = gzipSource54.inflaterSource;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer59 = null;
        gzipSource54.buffer = okBuffer59;
        int int61 = gzipSource54.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource62 = gzipSource54.inflaterSource;
        gzipSource35.source = gzipSource54;
        java.util.zip.Inflater inflater64 = gzipSource54.inflater;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource65 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater66 = null;
        gzipSource65.inflater = inflater66;
        int int68 = gzipSource65.section;
        gzipSource65.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource71 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource65);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource72 = null;
        gzipSource65.inflaterSource = inflaterSource72;
        java.util.zip.CRC32 cRC32_74 = gzipSource65.crc;
        gzipSource54.crc = cRC32_74;
        gzipSource0.crc = cRC32_74;
        com.squareup.okhttp.internal.bytes.Source source77 = gzipSource0.source;
        com.squareup.okhttp.internal.bytes.Deadline deadline79 = null;
        // The following exception was thrown during execution in test generation
        try {
            gzipSource0.require((int) '4', deadline79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater31);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource52);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource58);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater64);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(source77);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater1 = null;
        gzipSource0.inflater = inflater1;
        int int3 = gzipSource0.section;
        gzipSource0.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource6 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource0);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource7 = null;
        gzipSource0.inflaterSource = inflaterSource7;
        java.util.zip.CRC32 cRC32_9 = gzipSource0.crc;
        gzipSource0.section = (short) 0;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource1 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_2 = null;
        gzipSource1.crc = cRC32_2;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource4 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater5 = null;
        gzipSource4.inflater = inflater5;
        int int7 = gzipSource4.section;
        gzipSource4.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource10 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource4);
        java.util.zip.Inflater inflater11 = gzipSource10.inflater;
        gzipSource1.inflater = inflater11;
        gzipSource0.inflater = inflater11;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer14 = gzipSource0.buffer;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource15 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater16 = null;
        gzipSource15.inflater = inflater16;
        int int18 = gzipSource15.section;
        gzipSource15.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource21 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource15);
        java.util.zip.Inflater inflater22 = gzipSource21.inflater;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource23 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource21);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource24 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource23);
        java.util.zip.CRC32 cRC32_25 = gzipSource24.crc;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource26 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater27 = null;
        gzipSource26.inflater = inflater27;
        int int29 = gzipSource26.section;
        gzipSource26.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource32 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource26);
        com.squareup.okhttp.internal.bytes.Deadline deadline34 = null;
        gzipSource32.require((-1), deadline34);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource36 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater37 = null;
        gzipSource36.inflater = inflater37;
        int int39 = gzipSource36.section;
        gzipSource36.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource42 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource36);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource43 = null;
        gzipSource36.inflaterSource = inflaterSource43;
        gzipSource32.source = inflaterSource43;
        java.util.zip.CRC32 cRC32_46 = gzipSource32.crc;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer47 = gzipSource32.buffer;
        int int48 = gzipSource32.section;
        java.util.zip.CRC32 cRC32_49 = gzipSource32.crc;
        com.squareup.okhttp.internal.bytes.Source source50 = gzipSource32.source;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource51 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater52 = null;
        gzipSource51.inflater = inflater52;
        int int54 = gzipSource51.section;
        gzipSource51.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource57 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource51);
        com.squareup.okhttp.internal.bytes.Deadline deadline59 = null;
        gzipSource57.require((-1), deadline59);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource61 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater62 = null;
        gzipSource61.inflater = inflater62;
        int int64 = gzipSource61.section;
        gzipSource61.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource67 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource61);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource68 = null;
        gzipSource61.inflaterSource = inflaterSource68;
        gzipSource57.source = inflaterSource68;
        java.util.zip.CRC32 cRC32_71 = gzipSource57.crc;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer72 = gzipSource57.buffer;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource73 = gzipSource57.inflaterSource;
        gzipSource32.inflaterSource = inflaterSource73;
        gzipSource24.inflaterSource = inflaterSource73;
        java.util.zip.CRC32 cRC32_76 = gzipSource24.crc;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource77 = new com.squareup.okhttp.internal.bytes.GzipSource();
        int int78 = gzipSource77.section;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource79 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_80 = null;
        gzipSource79.crc = cRC32_80;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource82 = gzipSource79.inflaterSource;
        java.util.zip.CRC32 cRC32_83 = gzipSource79.crc;
        java.util.zip.Inflater inflater84 = gzipSource79.inflater;
        java.util.zip.CRC32 cRC32_85 = null;
        gzipSource79.crc = cRC32_85;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer87 = gzipSource79.buffer;
        gzipSource77.updateCrc(okBuffer87, (long) '4', (long) (-1));
        java.util.zip.CRC32 cRC32_91 = gzipSource77.crc;
        gzipSource24.crc = cRC32_91;
        gzipSource0.crc = cRC32_91;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_25);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source50);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflaterSource73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_76);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_91);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource0 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_1 = null;
        gzipSource0.crc = cRC32_1;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource3 = gzipSource0.inflaterSource;
        java.util.zip.CRC32 cRC32_4 = gzipSource0.crc;
        java.util.zip.Inflater inflater5 = gzipSource0.inflater;
        java.util.zip.CRC32 cRC32_6 = null;
        gzipSource0.crc = cRC32_6;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer8 = null;
        gzipSource0.buffer = okBuffer8;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource10 = gzipSource0.inflaterSource;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource11 = gzipSource0.inflaterSource;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource12 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_13 = null;
        gzipSource12.crc = cRC32_13;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource15 = gzipSource12.inflaterSource;
        java.util.zip.CRC32 cRC32_16 = gzipSource12.crc;
        java.util.zip.Inflater inflater17 = gzipSource12.inflater;
        gzipSource12.checkEqual("", 100, 100);
        com.squareup.okhttp.internal.bytes.Source source22 = gzipSource12.source;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource23 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater24 = null;
        gzipSource23.inflater = inflater24;
        int int26 = gzipSource23.section;
        gzipSource23.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource29 = gzipSource23.inflaterSource;
        gzipSource12.source = gzipSource23;
        com.squareup.okhttp.internal.bytes.Source source31 = gzipSource12.source;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource32 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater33 = null;
        gzipSource32.inflater = inflater33;
        int int35 = gzipSource32.section;
        gzipSource32.section = (byte) -1;
        java.util.zip.CRC32 cRC32_38 = null;
        gzipSource32.crc = cRC32_38;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource40 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.CRC32 cRC32_41 = null;
        gzipSource40.crc = cRC32_41;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource43 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater44 = null;
        gzipSource43.inflater = inflater44;
        int int46 = gzipSource43.section;
        gzipSource43.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource49 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource43);
        java.util.zip.Inflater inflater50 = gzipSource49.inflater;
        gzipSource40.inflater = inflater50;
        gzipSource32.inflater = inflater50;
        gzipSource12.inflater = inflater50;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource54 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater55 = null;
        gzipSource54.inflater = inflater55;
        int int57 = gzipSource54.section;
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource58 = gzipSource54.inflaterSource;
        gzipSource54.section = (byte) 100;
        com.squareup.okhttp.internal.bytes.Deadline deadline62 = null;
        gzipSource54.require((int) (short) -1, deadline62);
        com.squareup.okhttp.internal.bytes.Source source64 = gzipSource54.source;
        int int65 = gzipSource54.section;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer66 = null;
        gzipSource54.buffer = okBuffer66;
        gzipSource12.source = okBuffer66;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer69 = gzipSource12.buffer;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource70 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater71 = null;
        gzipSource70.inflater = inflater71;
        int int73 = gzipSource70.section;
        gzipSource70.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource76 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource70);
        com.squareup.okhttp.internal.bytes.Deadline deadline78 = null;
        gzipSource76.require((-1), deadline78);
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource80 = new com.squareup.okhttp.internal.bytes.GzipSource();
        java.util.zip.Inflater inflater81 = null;
        gzipSource80.inflater = inflater81;
        int int83 = gzipSource80.section;
        gzipSource80.section = (byte) -1;
        com.squareup.okhttp.internal.bytes.GzipSource gzipSource86 = new com.squareup.okhttp.internal.bytes.GzipSource((com.squareup.okhttp.internal.bytes.Source) gzipSource80);
        com.squareup.okhttp.internal.bytes.InflaterSource inflaterSource87 = null;
        gzipSource80.inflaterSource = inflaterSource87;
        gzipSource76.source = inflaterSource87;
        java.util.zip.CRC32 cRC32_90 = gzipSource76.crc;
        com.squareup.okhttp.internal.bytes.OkBuffer okBuffer91 = gzipSource76.buffer;
        int int92 = gzipSource76.section;
        java.util.zip.CRC32 cRC32_93 = gzipSource76.crc;
        com.squareup.okhttp.internal.bytes.Source source94 = gzipSource76.source;
        java.util.zip.CRC32 cRC32_95 = gzipSource76.crc;
        gzipSource12.crc = cRC32_95;
        gzipSource0.crc = cRC32_95;
        com.squareup.okhttp.internal.bytes.Deadline deadline98 = null;
        // The following exception was thrown during execution in test generation
        try {
            gzipSource0.consumeHeader(deadline98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cRC32_16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflater17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(source31);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inflater50);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inflaterSource58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer69);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okBuffer91);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cRC32_95);
    }
}
