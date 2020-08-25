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
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        java.lang.String str9 = keyVal4.value();
        java.lang.String str10 = keyVal4.toString();
        java.lang.String str11 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.value("hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass14 = keyVal13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!" + "'", str11.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
        java.lang.String str9 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!==hi!=" + "'", str9.equals("hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.value();
        java.lang.String str8 = keyVal4.toString();
        java.lang.String str9 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=" + "'", str7.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=" + "'", str9.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str15 = keyVal12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!==hi!=hi!"));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!=hi!==hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=" + "'", str5.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal9.key("hi!=hi!=hi!==hi!=hi!=");
        java.lang.Class<?> wildcardClass16 = keyVal9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("hi!=hi!=hi!=hi!=");
        java.lang.String str12 = keyVal7.value();
        java.lang.String str13 = keyVal7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!==hi!=hi!=hi!=hi!=hi!=" + "'", str13.equals("hi!==hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==");
        java.lang.Class<?> wildcardClass8 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal2.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.key("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str20 = keyVal19.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str20.equals("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        java.lang.String str17 = keyVal16.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str20 = keyVal16.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!=hi!==hi!==hi!==hi!" + "'", str20.equals("hi!=hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        java.lang.String str12 = keyVal10.toString();
        java.lang.String str13 = keyVal10.key();
        java.lang.String str14 = keyVal10.toString();
        java.lang.String str15 = keyVal10.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=" + "'", str11.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=" + "'", str14.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str7 = keyVal6.key();
        java.lang.String str8 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=" + "'", str4.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        java.lang.Class<?> wildcardClass11 = keyVal10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=hi!=", "hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=hi!=");
        java.lang.String str9 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str14 = keyVal6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=" + "'", str9.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!==hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.Class<?> wildcardClass5 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!==hi!==hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!==hi!==hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str7 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass12 = keyVal9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=hi!=");
        java.lang.String str9 = keyVal8.toString();
        java.lang.String str10 = keyVal8.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=" + "'", str9.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.value();
        java.lang.String str8 = keyVal4.toString();
        java.lang.String str9 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.key("hi!==hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=" + "'", str7.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=" + "'", str9.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=", "hi!==hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!==hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!==hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=" + "'", str15.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!==hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!==hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=" + "'", str4.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!="));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("hi!=hi!");
        java.lang.String str10 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal4.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!==hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("hi!=hi!=hi!===hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=");
        java.lang.String str5 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!==hi!=hi!=" + "'", str5.equals("hi!==hi!=hi!="));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==", "hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.value();
        java.lang.String str12 = keyVal10.value();
        java.lang.String str13 = keyVal10.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.key("hi!==hi!=hi!=hi!");
        java.lang.String str16 = keyVal10.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!==hi!=hi!=hi!=");
        java.lang.String str8 = keyVal7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str8.equals("hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!===hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!===hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!=hi!===hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!");
        java.lang.Class<?> wildcardClass8 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=hi!==hi!=");
        java.lang.String str13 = keyVal12.key();
        java.lang.String str14 = keyVal12.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.key("hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!==hi!=" + "'", str14.equals("hi!=hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass6 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        java.lang.String str13 = keyVal12.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!" + "'", str13.equals("hi!=hi!"));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!==");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!==" + "'", str3.equals("hi!=hi!==hi!=="));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!==hi!=hi!=hi!");
        java.lang.String str19 = keyVal18.value();
        java.lang.Class<?> wildcardClass20 = keyVal18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!===hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!", "hi!=hi!==hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!" + "'", str7.equals("hi!=hi!"));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!==");
        java.lang.String str6 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!==" + "'", str6.equals("hi!=hi!=="));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=" + "'", str9.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!==hi!=" + "'", str12.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.key("hi!=hi!=hi!=hi!=hi!");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=hi!==hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        java.lang.String str15 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str18 = keyVal17.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal17.key("hi!==hi!=hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal20.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal20.key("hi!=hi!=hi!==hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!" + "'", str15.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!" + "'", str18.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal24);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.value("hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=");
        java.lang.String str14 = keyVal13.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.value();
        java.lang.String str8 = keyVal4.toString();
        java.lang.String str9 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!==hi!=hi!=hi!");
        java.lang.String str16 = keyVal13.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=" + "'", str7.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=" + "'", str9.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str16.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=");
        java.lang.String str8 = keyVal5.toString();
        java.lang.String str9 = keyVal5.key();
        java.lang.String str10 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!==hi!" + "'", str8.equals("hi!=hi!=hi!=hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str9.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!" + "'", str4.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        java.lang.String str11 = keyVal10.toString();
        java.lang.String str12 = keyVal10.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.key("hi!==hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal10.key("hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!==hi!==" + "'", str11.equals("hi!=hi!==hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!==hi!=" + "'", str12.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!==hi!" + "'", str4.equals("hi!==hi!"));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!==hi!=hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("hi!=hi!=hi!=hi!=hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!==hi!=hi!=" + "'", str12.equals("hi!=hi!==hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!==hi!");
        java.lang.String str6 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!" + "'", str3.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal11.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.value("hi!===hi!=");
        java.lang.String str17 = keyVal11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!==hi!==hi!===hi!=" + "'", str17.equals("hi!=hi!==hi!==hi!===hi!="));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!==hi!=hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.Class<?> wildcardClass7 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.toString();
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!");
        java.lang.String str11 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.key("hi!=hi!==hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!" + "'", str11.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        java.lang.String str12 = keyVal10.toString();
        java.lang.String str13 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.key("hi!==hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=" + "'", str11.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!==hi!=");
        java.lang.String str15 = keyVal11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=" + "'", str9.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!==hi!=" + "'", str12.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!==hi!=hi!==hi!=" + "'", str15.equals("hi!=hi!==hi!=hi!==hi!="));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!=hi!=");
        java.lang.String str11 = keyVal10.key();
        java.lang.Class<?> wildcardClass12 = keyVal10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!==hi!==hi!==hi!" + "'", str9.equals("hi!=hi!==hi!==hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!==hi!==hi!==hi!" + "'", str10.equals("hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=");
        java.lang.String str7 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        java.lang.String str12 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal2.value("hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!==hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=hi!==hi!=hi!=");
        java.lang.String str8 = keyVal7.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=" + "'", str8.equals("hi!="));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.key();
        java.lang.String str6 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!===hi!", "hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!==hi!==hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=");
        java.lang.String str14 = keyVal13.key();
        java.lang.String str15 = keyVal13.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=" + "'", str14.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=" + "'", str15.equals("hi!="));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=hi!");
        java.lang.String str13 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal8.key("hi!==hi!=hi!=hi!==hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!==hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!");
        java.lang.String str8 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.key("hi!==hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        java.lang.String str13 = keyVal12.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str16 = keyVal12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!" + "'", str13.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!" + "'", str16.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!"));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.value("hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str14 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=" + "'", str7.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!=hi!==hi!");
        java.lang.String str11 = keyVal10.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!=hi!=hi!" + "'", str3.equals("hi!=hi!==hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal4.toString();
        java.lang.String str6 = keyVal4.value();
        java.lang.String str7 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==", "hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass9 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.key("hi!=hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.value("hi!==hi!");
        java.lang.String str19 = keyVal16.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal16.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal21.value("hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.String str24 = keyVal21.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=" + "'", str9.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!==hi!=" + "'", str12.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!=hi!=hi!==hi!" + "'", str19.equals("hi!=hi!=hi!=hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!" + "'", str24.equals("hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!"));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.toString();
        java.lang.String str12 = keyVal9.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!" + "'", str12.equals("hi!=hi!"));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str14 = keyVal13.key();
        java.lang.String str15 = keyVal13.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!=hi!=="));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=");
        java.lang.String str7 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=" + "'", str7.equals("hi!="));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!==hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=");
        java.lang.String str11 = keyVal10.toString();
        java.lang.String str12 = keyVal10.key();
        java.lang.String str13 = keyVal10.key();
        java.lang.String str14 = keyVal10.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal12.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=" + "'", str6.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        java.lang.String str7 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal4.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!==hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=hi!=hi!=hi!==hi!=");
        java.lang.String str8 = keyVal5.key();
        java.lang.String str9 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!==hi!=" + "'", str9.equals("hi!=hi!=hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!=hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.key("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal4.key("hi!=hi!=hi!==hi!");
        java.lang.String str13 = keyVal12.value();
        java.lang.String str14 = keyVal12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!==hi!=hi!" + "'", str14.equals("hi!=hi!=hi!==hi!=hi!"));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!");
        java.lang.String str8 = keyVal7.value();
        java.lang.String str9 = keyVal7.key();
        java.lang.String str10 = keyVal7.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!" + "'", str3.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.toString();
        java.lang.String str13 = keyVal11.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("hi!==hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!" + "'", str9.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!==hi!=" + "'", str9.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!==hi!=" + "'", str10.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal14.key();
        java.lang.String str16 = keyVal14.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!" + "'", str9.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str16.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!=hi!=hi!=hi!==hi!==hi!=");
        java.lang.String str15 = keyVal14.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==");
        java.lang.Class<?> wildcardClass5 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal9.value();
        java.lang.String str16 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal9.value("hi!=hi!==hi!===hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str16.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!", "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!===hi!=hi!=hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.value("hi!=hi!===hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.value("hi!==hi!");
        java.lang.String str17 = keyVal16.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=" + "'", str6.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!" + "'", str17.equals("hi!=hi!=hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=" + "'", str5.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal6.value("");
        java.lang.String str20 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!" + "'", str20.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str8 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.key("hi!=hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=" + "'", str5.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!==hi!==hi!=hi!=hi!" + "'", str8.equals("hi!=hi!==hi!==hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.key("hi!=hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!===hi!=hi!", "hi!=hi!=hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.key();
        java.lang.String str7 = keyVal2.key();
        java.lang.String str8 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!===hi!=hi!=hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.value();
        java.lang.String str13 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=" + "'", str13.equals("hi!=hi!="));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!==hi!" + "'", str3.equals("hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        java.lang.String str9 = keyVal4.toString();
        java.lang.String str10 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal4.key("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!" + "'", str9.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal14.value("hi!=hi!==hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!" + "'", str9.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str15 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal14.value("hi!=hi!==");
        java.lang.String str18 = keyVal17.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!" + "'", str15.equals("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str18.equals("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!===hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!==hi!=hi!==hi!==hi!");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=", "hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!==hi!=" + "'", str3.equals("hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass6 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!==hi!==hi!", "hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!==hi!==hi!==hi!" + "'", str3.equals("hi!=hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.value("hi!==hi!");
        java.lang.String str17 = keyVal16.value();
        java.lang.String str18 = keyVal16.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal16.value("hi!=hi!==hi!=hi!===hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=" + "'", str6.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!==hi!" + "'", str17.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!" + "'", str18.equals("hi!=hi!=hi!=hi!=hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str8 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!==" + "'", str5.equals("hi!=hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.key();
        java.lang.String str11 = keyVal8.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.value("hi!=hi!=hi!=hi!=hi!==hi!=");
        java.lang.String str14 = keyVal8.key();
        java.lang.String str15 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!==hi!" + "'", str9.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==hi!" + "'", str10.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!==hi!=" + "'", str11.equals("hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!==hi!" + "'", str14.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.String str8 = keyVal7.toString();
        java.lang.String str9 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal11.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!==hi!=hi!=hi!" + "'", str8.equals("hi!==hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!" + "'", str9.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!==hi!" + "'", str12.equals("hi!==hi!"));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.toString();
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.toString();
        java.lang.Class<?> wildcardClass11 = keyVal9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!==hi!==hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!==hi!==hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=hi!==hi!=hi!=");
        java.lang.String str13 = keyVal10.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!==hi!=hi!=" + "'", str13.equals("hi!=hi!==hi!=hi!="));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!", "hi!===hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!==hi!");
        java.lang.String str14 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=" + "'", str5.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        java.lang.String str9 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.value("hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.value("hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=", "hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal8.key();
        java.lang.String str12 = keyVal8.toString();
        java.lang.String str13 = keyVal8.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal8.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str16 = keyVal8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=" + "'", str13.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str16.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.value();
        java.lang.String str7 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!" + "'", str7.equals("hi!=hi!"));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal6.key("hi!===hi!=hi!=hi!=");
        java.lang.String str19 = keyVal6.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!==" + "'", str5.equals("hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal2.key();
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal2.value();
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!" + "'", str11.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal2.value("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal2.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal2.value("hi!==hi!=hi!===hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!==hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str11 = keyVal10.toString();
        java.lang.Class<?> wildcardClass12 = keyVal10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str6.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!");
        java.lang.String str10 = keyVal9.key();
        java.lang.String str11 = keyVal9.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.value("hi!=hi!==hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal2.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal2.key("hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass17 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=" + "'", str10.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

