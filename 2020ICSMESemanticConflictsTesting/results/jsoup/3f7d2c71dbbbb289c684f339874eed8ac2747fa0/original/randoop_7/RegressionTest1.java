import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
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
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!");
        java.lang.Class<?> wildcardClass8 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!" + "'", str3.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal11.key("hi!=hi!=hi!==");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=" + "'", str13.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=hi!==hi!==");
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
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!==hi!==hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!==hi!");
        java.lang.String str7 = keyVal6.toString();
        java.lang.Class<?> wildcardClass8 = keyVal6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!==hi!=hi!=hi!" + "'", str7.equals("hi!==hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!==hi!=hi!==");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!==hi!==");
        java.lang.Class<?> wildcardClass16 = keyVal15.getClass();
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.toString();
        java.lang.Class<?> wildcardClass9 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.value("hi!=hi!=hi!==");
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
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=");
        java.lang.Class<?> wildcardClass14 = keyVal13.getClass();
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str10 = keyVal9.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!==hi!==hi!==hi!" + "'", str10.equals("hi!=hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=", "hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!="));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass19 = keyVal18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!==");
        java.lang.String str6 = keyVal5.toString();
        java.lang.Class<?> wildcardClass7 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!==hi!=hi!==" + "'", str6.equals("hi!=hi!==hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal4.toString();
        java.lang.String str6 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal6.key();
        java.lang.String str10 = keyVal6.value();
        java.lang.String str11 = keyVal6.toString();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=" + "'", str11.equals("hi!=hi!="));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("hi!=hi!");
        java.lang.String str10 = keyVal4.value();
        java.lang.String str11 = keyVal4.toString();
        java.lang.String str12 = keyVal4.toString();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=");
        java.lang.String str8 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=" + "'", str5.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!==hi!=hi!=" + "'", str8.equals("hi!==hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.key();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!" + "'", str17.equals("hi!=hi!"));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        java.lang.String str5 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!==hi!==hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!==hi!==hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        java.lang.String str11 = keyVal8.value();
        java.lang.String str12 = keyVal8.key();
        java.lang.String str13 = keyVal8.toString();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.key("hi!=hi!==");
        java.lang.String str14 = keyVal13.key();
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!==" + "'", str14.equals("hi!=hi!=="));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal6.toString();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!==hi!=", "hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!==hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!==hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("hi!=hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal7.value();
        java.lang.Class<?> wildcardClass11 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!=hi!=hi!");
        java.lang.String str8 = keyVal7.key();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!==hi!=hi!=hi!" + "'", str8.equals("hi!==hi!=hi!=hi!"));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!=hi!=hi!=" + "'", str3.equals("hi!==hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=" + "'", str4.equals("hi!=hi!=hi!="));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.key();
        java.lang.String str8 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!");
        java.lang.Class<?> wildcardClass13 = keyVal10.getClass();
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.toString();
        java.lang.String str11 = keyVal8.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=" + "'", str10.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!="));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.key();
        java.lang.String str10 = keyVal2.key();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=", "hi!==hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=hi!=", "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!==hi!");
        java.lang.String str15 = keyVal9.value();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!==hi!" + "'", str15.equals("hi!==hi!"));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.key("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str11 = keyVal10.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!==hi!==hi!==hi!" + "'", str11.equals("hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!");
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
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
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!==hi!=");
        java.lang.Class<?> wildcardClass16 = keyVal15.getClass();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=" + "'", str13.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str8 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str11 = keyVal10.value();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str19 = keyVal14.key();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str19.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("");
        java.lang.String str13 = keyVal10.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=" + "'", str13.equals("hi!="));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==hi!" + "'", str10.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!==hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!==hi!=hi!=");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=");
        java.lang.String str10 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==hi!=hi!=hi!=hi!=" + "'", str10.equals("hi!==hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass13 = keyVal10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        java.lang.String str18 = keyVal6.toString();
        java.lang.String str19 = keyVal6.key();
        java.lang.String str20 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal6.key("hi!=hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!" + "'", str18.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!" + "'", str19.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!" + "'", str20.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.key("hi!==hi!=hi!==");
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=hi!=", "hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=");
        java.lang.String str11 = keyVal10.toString();
        java.lang.String str12 = keyVal10.key();
        java.lang.String str13 = keyVal10.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.value();
        java.lang.String str14 = keyVal12.value();
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.value();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.key("hi!==hi!=hi!=hi!");
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
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!==hi!=hi!=");
        java.lang.String str14 = keyVal2.value();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!==hi!=hi!=" + "'", str14.equals("hi!==hi!=hi!="));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.value();
        java.lang.String str8 = keyVal4.toString();
        java.lang.String str9 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass14 = keyVal11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.value("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str18 = keyVal17.toString();
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!" + "'", str18.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=" + "'", str5.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!==hi!=" + "'", str9.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str8 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!==hi!=hi!");
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
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.String str15 = keyVal9.key();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!" + "'", str15.equals("hi!=hi!"));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.value("hi!==hi!=");
        java.lang.Class<?> wildcardClass13 = keyVal12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!");
        java.lang.Class<?> wildcardClass14 = keyVal11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal2.value();
        java.lang.String str11 = keyVal2.key();
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!", "hi!==hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!==hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!" + "'", str3.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=" + "'", str4.equals("hi!="));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=");
        java.lang.String str10 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.toString();
        java.lang.String str14 = keyVal12.key();
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
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==hi!=hi!=hi!=hi!=" + "'", str10.equals("hi!==hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.lang.Class<?> wildcardClass19 = keyVal6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("hi!=hi!");
        java.lang.String str10 = keyVal4.value();
        java.lang.String str11 = keyVal4.toString();
        java.lang.Class<?> wildcardClass12 = keyVal4.getClass();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!=hi!=");
        java.lang.String str18 = keyVal15.key();
        java.lang.Class<?> wildcardClass19 = keyVal15.getClass();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!=" + "'", str18.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=");
        java.lang.String str14 = keyVal13.key();
        java.lang.String str15 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!==hi!=" + "'", str15.equals("hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal9.value("hi!==hi!");
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
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!==hi!=hi!=");
        java.lang.String str5 = keyVal4.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!==hi!" + "'", str5.equals("hi!==hi!"));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!==hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==");
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
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=", "hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!", "hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!==");
        java.lang.String str13 = keyVal12.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!===hi!=" + "'", str13.equals("hi!===hi!="));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        java.lang.String str10 = keyVal2.key();
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!==", "hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!=hi!==" + "'", str3.equals("hi!==hi!=hi!=="));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!==hi!");
        java.lang.String str5 = keyVal2.value();
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!==hi!==");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!==hi!==" + "'", str7.equals("hi!=hi!==hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!==hi!===hi!=hi!=hi!" + "'", str8.equals("hi!=hi!==hi!===hi!=hi!=hi!"));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.key();
        java.lang.String str5 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=" + "'", str4.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.key();
        java.lang.String str8 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.key("hi!==hi!=hi!==");
        java.lang.Class<?> wildcardClass11 = keyVal6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!==hi!=hi!=");
        java.lang.String str5 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!==hi!=hi!==hi!==hi!" + "'", str5.equals("hi!==hi!=hi!==hi!==hi!"));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal7.key();
        java.lang.String str9 = keyVal7.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!" + "'", str3.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!==hi!=hi!=hi!=" + "'", str4.equals("hi!==hi!=hi!=hi!="));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.toString();
        java.lang.String str11 = keyVal9.toString();
        java.lang.String str12 = keyVal9.value();
        java.lang.String str13 = keyVal9.key();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str9 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!" + "'", str9.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.String str14 = keyVal13.key();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        java.lang.String str15 = keyVal6.toString();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        java.lang.Class<?> wildcardClass15 = keyVal6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.value("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal2.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal8.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.String str8 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str11 = keyVal7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=", "hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.toString();
        java.lang.Class<?> wildcardClass12 = keyVal9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=", "");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=hi!==hi!");
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("");
        java.lang.String str9 = keyVal6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!==" + "'", str9.equals("hi!=hi!=hi!=="));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=");
        java.lang.String str11 = keyVal10.toString();
        java.lang.String str12 = keyVal10.toString();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=hi!", "hi!=hi!=hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal15.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal15.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass22 = keyVal21.getClass();
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
        org.junit.Assert.assertNotNull(keyVal21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        java.lang.String str11 = keyVal8.value();
        java.lang.Class<?> wildcardClass12 = keyVal8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.value();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!==hi!==hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.value("hi!==hi!=");
        java.lang.String str13 = keyVal12.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!==hi!=" + "'", str13.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.toString();
        java.lang.String str8 = keyVal6.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str7 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        java.lang.String str7 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.value("hi!=hi!=hi!==");
        java.lang.String str10 = keyVal9.value();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!==" + "'", str10.equals("hi!=hi!=hi!=="));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!===hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!===hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=");
        java.lang.String str12 = keyVal11.key();
        java.lang.String str13 = keyVal11.toString();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str13.equals("hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal6.value("hi!=hi!==hi!=");
        java.lang.String str20 = keyVal19.value();
        java.lang.Class<?> wildcardClass21 = keyVal19.getClass();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!==hi!=" + "'", str20.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal14.value();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!" + "'", str12.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass13 = keyVal10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.key("hi!=hi!");
        java.lang.String str11 = keyVal6.key();
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
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=hi!=");
        java.lang.String str17 = keyVal14.key();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal14.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!");
        java.lang.String str8 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!==hi!=hi!==");
        java.lang.Class<?> wildcardClass11 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=" + "'", str5.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=" + "'", str8.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.key("hi!=hi!=hi!==");
        java.lang.String str14 = keyVal2.value();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=" + "'", str14.equals("hi!=hi!="));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str7 = keyVal4.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str7.equals("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!==hi!=hi!=hi!=");
        java.lang.String str14 = keyVal13.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=" + "'", str5.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!==hi!==hi!==hi!" + "'", str14.equals("hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.key("hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=");
        java.lang.String str14 = keyVal13.key();
        java.lang.String str15 = keyVal13.value();
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!=hi!=");
        java.lang.String str14 = keyVal13.value();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal2.value("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal2.value("hi!==");
        java.lang.String str18 = keyVal2.key();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str18.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal9.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=hi!=" + "'", str13.equals("hi!=hi!==hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.toString();
        java.lang.String str13 = keyVal11.toString();
        java.lang.Class<?> wildcardClass14 = keyVal11.getClass();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!==hi!=" + "'", str13.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!==");
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!==hi!=hi!==" + "'", str6.equals("hi!=hi!==hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!==" + "'", str7.equals("hi!=hi!=="));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!=hi!=");
        java.lang.String str8 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!==hi!=");
        java.lang.String str6 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!==hi!=" + "'", str6.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.String str8 = keyVal7.toString();
        java.lang.String str9 = keyVal7.value();
        java.lang.String str10 = keyVal7.value();
        java.lang.String str11 = keyVal7.value();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!" + "'", str11.equals("hi!=hi!"));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=", "hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.toString();
        java.lang.String str8 = keyVal6.value();
        java.lang.String str9 = keyVal6.toString();
        java.lang.String str10 = keyVal6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.value("hi!==hi!");
        java.lang.String str14 = keyVal9.value();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!==hi!" + "'", str14.equals("hi!==hi!"));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.value("hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass12 = keyVal4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!===hi!=hi!", "hi!==hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!==hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!" + "'", str3.equals("hi!==hi!"));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.toString();
        java.lang.String str13 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!==");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!==hi!=" + "'", str13.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!==");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==" + "'", str3.equals("hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!==" + "'", str4.equals("hi!=hi!=="));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!==", "hi!==hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!", "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str15 = keyVal14.toString();
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.key();
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.value();
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!==hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=" + "'", str4.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.toString();
        java.lang.String str9 = keyVal4.value();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!==hi!");
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.value("hi!=hi!==");
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
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!==hi!=", "hi!=");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!==hi!==hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!==hi!==hi!="));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.key();
        java.lang.String str9 = keyVal4.toString();
        java.lang.String str10 = keyVal4.toString();
        java.lang.String str11 = keyVal4.key();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!");
        java.lang.String str10 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!==hi!");
        java.lang.String str11 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass13 = keyVal9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!===hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!==", "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!==hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!==hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass12 = keyVal2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.key("hi!=hi!=hi!=hi!==hi!=");
        java.lang.Class<?> wildcardClass11 = keyVal10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!==hi!", "hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str4.equals("hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass8 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        java.lang.String str11 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.value("");
        java.lang.Class<?> wildcardClass14 = keyVal13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal4.key();
        java.lang.String str6 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!==" + "'", str5.equals("hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!==" + "'", str6.equals("hi!=="));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!===hi!=hi!=hi!", "hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!=hi!=hi!");
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
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!===hi!=hi!=hi!", "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        java.lang.String str15 = keyVal6.key();
        java.lang.String str16 = keyVal6.value();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal2.key("hi!=hi!=hi!==hi!==hi!==hi!");
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
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.value();
        java.lang.String str8 = keyVal4.toString();
        java.lang.String str9 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str12 = keyVal11.value();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        java.lang.String str7 = keyVal4.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!=hi!=");
        java.lang.String str18 = keyVal15.key();
        java.lang.String str19 = keyVal15.key();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!=" + "'", str18.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!=hi!=" + "'", str19.equals("hi!=hi!=hi!="));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal2.value("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal2.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.key("hi!=hi!=hi!");
        java.lang.String str20 = keyVal17.key();
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!=hi!" + "'", str20.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=");
        java.lang.Class<?> wildcardClass12 = keyVal9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal15.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal15.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass22 = keyVal15.getClass();
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
        org.junit.Assert.assertNotNull(keyVal21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal11.key();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!" + "'", str12.equals("hi!=hi!"));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!" + "'", str3.equals("hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!==hi!");
        java.lang.String str9 = keyVal6.value();
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.key();
        java.lang.String str11 = keyVal8.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=" + "'", str11.equals("hi!=hi!="));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.key();
        java.lang.Class<?> wildcardClass12 = keyVal9.getClass();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        java.lang.String str11 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.value("");
        java.lang.String str14 = keyVal8.value();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=", "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str9 = keyVal6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!" + "'", str9.equals("hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str7 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!");
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
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.String str8 = keyVal7.toString();
        java.lang.String str9 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass12 = keyVal11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=hi!=hi!=", "hi!=hi!=hi!=hi!==hi!=");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!=" + "'", str3.equals("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal8.key();
        java.lang.String str12 = keyVal8.toString();
        java.lang.String str13 = keyVal8.key();
        java.lang.String str14 = keyVal8.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=" + "'", str14.equals("hi!="));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!=hi!=");
        java.lang.String str10 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!==hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        java.lang.String str18 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal6.value("hi!=hi!==hi!=hi!=hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!" + "'", str18.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=" + "'", str4.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!");
        java.lang.String str10 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!");
        java.lang.Class<?> wildcardClass13 = keyVal6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.key();
        java.lang.String str10 = keyVal2.value();
        java.lang.String str11 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!");
        java.lang.String str10 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass17 = keyVal16.getClass();
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
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal6.value("hi!=hi!==hi!=");
        java.lang.String str20 = keyVal19.value();
        java.lang.String str21 = keyVal19.key();
        java.lang.String str22 = keyVal19.value();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!==hi!=" + "'", str20.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!=hi!" + "'", str21.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!=hi!==hi!=" + "'", str22.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!");
        java.lang.String str14 = keyVal13.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str7 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!");
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("");
        java.lang.String str14 = keyVal11.key();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!" + "'", str14.equals("hi!=hi!"));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal9.key("hi!=hi!=hi!==hi!");
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
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.value("hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass21 = keyVal20.getClass();
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
        org.junit.Assert.assertNotNull(keyVal20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.Class<?> wildcardClass8 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!==hi!==hi!=", "hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str13 = keyVal10.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass14 = keyVal9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=hi!=hi!=hi!=hi!==hi!=hi!");
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
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str8 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!==" + "'", str5.equals("hi!=hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str8.equals("hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.value("hi!===hi!=hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str12 = keyVal9.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!==hi!" + "'", str12.equals("hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=");
        java.lang.String str10 = keyVal9.key();
        java.lang.String str11 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==hi!" + "'", str10.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!==hi!=hi!=hi!=hi!=" + "'", str11.equals("hi!==hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("hi!=hi!");
        java.lang.String str15 = keyVal14.value();
        java.lang.String str16 = keyVal14.key();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=" + "'", str15.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!" + "'", str16.equals("hi!=hi!"));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.toString();
        java.lang.Class<?> wildcardClass6 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("");
        java.lang.String str17 = keyVal14.toString();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str17.equals("hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal12.key("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal12.key("hi!=hi!==hi!=hi!==");
        java.lang.String str21 = keyVal20.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal20.value("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str24 = keyVal20.key();
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
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!==hi!" + "'", str21.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!=hi!==hi!=hi!==" + "'", str24.equals("hi!=hi!==hi!=hi!=="));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=");
        java.lang.String str10 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==hi!=hi!=hi!=hi!=" + "'", str10.equals("hi!==hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!===hi!=hi!", "hi!=hi!=hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!=hi!=hi!==hi!");
        java.lang.String str10 = keyVal9.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!==hi!" + "'", str10.equals("hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal6.value("hi!=hi!==hi!=");
        java.lang.String str20 = keyVal19.value();
        java.lang.String str21 = keyVal19.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal19.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal19.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!==hi!=" + "'", str20.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!=hi!" + "'", str21.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal25);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!");
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=", "hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!=hi!=hi!=" + "'", str3.equals("hi!==hi!=hi!=hi!="));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
        java.lang.String str9 = keyVal8.key();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!==hi!=" + "'", str10.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!==hi!=hi!=");
        java.lang.String str12 = keyVal6.key();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=hi!==hi!=");
        java.lang.String str13 = keyVal12.key();
        java.lang.String str14 = keyVal12.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.value("");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!==hi!=" + "'", str14.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=", "hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal11.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("hi!=hi!==hi!=");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.key();
        java.lang.String str7 = keyVal2.value();
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
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal11.toString();
        java.lang.String str13 = keyVal11.value();
        java.lang.String str14 = keyVal11.key();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=" + "'", str13.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!" + "'", str14.equals("hi!=hi!"));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=hi!=");
        java.lang.String str9 = keyVal8.toString();
        java.lang.String str10 = keyVal8.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=" + "'", str10.equals("hi!=hi!=hi!="));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=hi!=hi!=");
        java.lang.String str8 = keyVal7.value();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!" + "'", str3.equals("hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!===hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.toString();
        java.lang.Class<?> wildcardClass12 = keyVal9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str11 = keyVal5.toString();
        java.lang.String str12 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.value();
        java.lang.String str14 = keyVal12.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.value("hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!");
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
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str12 = keyVal11.toString();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!=hi!==hi!=hi!"));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!==hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.key("hi!=hi!=hi!=hi!=hi!==hi!=hi!");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!");
        java.lang.String str8 = keyVal2.key();
        java.lang.String str9 = keyVal2.key();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!" + "'", str9.equals("hi!=hi!"));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=");
        java.lang.String str12 = keyVal11.toString();
        java.lang.String str13 = keyVal11.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!=hi!==hi!=hi!=hi!=hi!");
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==", "hi!==hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!");
        java.lang.String str8 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.key("hi!==hi!=hi!=hi!=");
        java.lang.String str11 = keyVal2.value();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!" + "'", str11.equals("hi!=hi!"));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str16 = keyVal2.toString();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str16.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!=hi!=");
        java.lang.Class<?> wildcardClass18 = keyVal17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!==hi!=hi!=");
        java.lang.String str14 = keyVal2.toString();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!=hi!=" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!==hi!=hi!="));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.toString();
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal2.toString();
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
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=");
        java.lang.String str12 = keyVal8.value();
        java.lang.String str13 = keyVal8.key();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=" + "'", str13.equals("hi!=hi!="));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal9.toString();
        java.lang.Class<?> wildcardClass13 = keyVal9.getClass();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal14.value();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!==hi!=hi!=");
        java.lang.String str7 = keyVal6.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal4.toString();
        java.lang.Class<?> wildcardClass6 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!==hi!" + "'", str3.equals("hi!==hi!"));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal6.key("hi!=hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal6.key("hi!=hi!==hi!===hi!=hi!=hi!");
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
        org.junit.Assert.assertNotNull(keyVal21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!===hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str14 = keyVal13.key();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!" + "'", str14.equals("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal10.toString();
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=");
        java.lang.String str14 = keyVal13.toString();
        java.lang.String str15 = keyVal13.value();
        java.lang.String str16 = keyVal13.toString();
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!==" + "'", str14.equals("hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!==" + "'", str16.equals("hi!=="));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!==hi!=");
        java.lang.String str16 = keyVal11.key();
        java.lang.Class<?> wildcardClass17 = keyVal11.getClass();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=" + "'", str13.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!" + "'", str16.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!=", "hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!", "hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str15 = keyVal9.value();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!==");
        java.lang.String str7 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        java.lang.String str18 = keyVal6.toString();
        java.lang.String str19 = keyVal6.key();
        java.lang.Class<?> wildcardClass20 = keyVal6.getClass();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!" + "'", str18.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!" + "'", str19.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.key();
        java.lang.String str5 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!==hi!=hi!", "hi!==hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        java.lang.String str7 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!" + "'", str7.equals("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str19 = keyVal18.value();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str19.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!==hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        java.lang.String str14 = keyVal11.toString();
        java.lang.String str15 = keyVal11.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal11.value("hi!=hi!==hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!" + "'", str14.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!==hi!=");
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==hi!=");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.lang.String str20 = keyVal18.value();
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!==hi!=hi!=hi!==hi!=hi!");
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.key();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        java.lang.String str9 = keyVal8.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str9.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        java.lang.String str13 = keyVal6.key();
        java.lang.String str14 = keyVal6.value();
        java.lang.String str15 = keyVal6.value();
        java.lang.Class<?> wildcardClass16 = keyVal6.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=" + "'", str3.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
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
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!==hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.value();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str10.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==");
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!");
        java.lang.String str8 = keyVal7.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!=hi!=");
        java.lang.String str16 = keyVal15.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal15.value("");
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=" + "'", str16.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        java.lang.String str13 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal6.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!==hi!==hi!=hi!=hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!=hi!=hi!");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!=hi!=hi!=hi!");
        java.lang.String str15 = keyVal9.value();
        java.lang.Class<?> wildcardClass16 = keyVal9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!===hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!===hi!=hi!" + "'", str4.equals("hi!=hi!===hi!=hi!"));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!==hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str4.equals("hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        java.lang.String str9 = keyVal8.value();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        java.lang.String str8 = keyVal2.toString();
        java.lang.Class<?> wildcardClass9 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!==hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=hi!");
        java.lang.String str13 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal8.key("hi!==hi!=hi!=hi!==hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!=hi!=hi!=hi!=hi!=hi!=");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!==");
        java.lang.Class<?> wildcardClass13 = keyVal8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!==hi!=hi!=");
        java.lang.String str9 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!==hi!=hi!=" + "'", str9.equals("hi!==hi!=hi!="));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!" + "'", str3.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!"));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal11.key();
        java.lang.Class<?> wildcardClass13 = keyVal11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!===hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass9 = keyVal8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.value();
        java.lang.String str8 = keyVal6.value();
        java.lang.Class<?> wildcardClass9 = keyVal6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=");
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.key();
        java.lang.String str5 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!=hi!" + "'", str4.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass8 = keyVal7.getClass();
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!==hi!=hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!=hi!=");
        java.lang.String str16 = keyVal15.toString();
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!==hi!=hi!=" + "'", str16.equals("hi!==hi!=hi!="));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!==hi!=");
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("hi!=hi!==hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!");
        java.lang.String str14 = keyVal13.toString();
        java.lang.Class<?> wildcardClass15 = keyVal13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=" + "'", str5.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!==hi!==hi!==hi!" + "'", str14.equals("hi!=hi!=hi!==hi!==hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!==hi!=hi!==hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!", "");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!==hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=");
        java.lang.String str6 = keyVal2.key();
        java.lang.String str7 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=" + "'", str6.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=" + "'", str7.equals("hi!=hi!="));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!==hi!=hi!=hi!" + "'", str3.equals("hi!=hi!==hi!=hi!=hi!"));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!=hi!=");
        java.lang.String str7 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.value("hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.value("hi!=hi!=hi!=hi!");
        java.lang.String str14 = keyVal13.toString();
        java.lang.Class<?> wildcardClass15 = keyVal13.getClass();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!==hi!==hi!==hi!");
        java.lang.String str8 = keyVal7.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!==hi!=" + "'", str5.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!==hi!=" + "'", str8.equals("hi!=hi!==hi!="));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!", "hi!=hi!==hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=hi!==hi!=hi!=");
        java.lang.Class<?> wildcardClass8 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.value("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.value("hi!==hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal4.value("");
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=hi!==hi!=");
        java.lang.Class<?> wildcardClass11 = keyVal10.getClass();
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
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=hi!=hi!==hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=hi!=hi!==hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        java.lang.String str12 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.key();
        java.lang.String str8 = keyVal6.key();
        java.lang.String str9 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.key("hi!=hi!=hi!=hi!=hi!==hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str9.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!==hi!");
        java.lang.String str11 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.key();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.String str8 = keyVal7.toString();
        java.lang.String str9 = keyVal7.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.key("hi!==hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!==hi!=" + "'", str8.equals("hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!==hi!=" + "'", str9.equals("hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.value("hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str13 = keyVal12.toString();
        java.lang.String str14 = keyVal12.key();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!==hi!=", "hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal4.key();
        java.lang.Class<?> wildcardClass6 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!==" + "'", str5.equals("hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        java.lang.String str11 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!=hi!" + "'", str11.equals("hi!=hi!=hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=");
        java.lang.String str7 = keyVal6.value();
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal6.value("hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.value("");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal21);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!==");
        java.lang.String str10 = keyVal6.key();
        java.lang.String str11 = keyVal6.key();
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!===hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!==hi!");
        java.lang.Class<?> wildcardClass14 = keyVal13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.key();
        java.lang.String str6 = keyVal4.toString();
        java.lang.Class<?> wildcardClass7 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=" + "'", str6.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!");
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=" + "'", str14.equals("hi!=hi!=hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!=hi!=hi!==");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=hi!=hi!=");
        java.lang.String str12 = keyVal8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!==" + "'", str9.equals("hi!=hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!==hi!==hi!" + "'", str12.equals("hi!=hi!=hi!=hi!==hi!==hi!"));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!==");
        java.lang.String str7 = keyVal6.toString();
        java.lang.Class<?> wildcardClass8 = keyVal6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!==" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.lang.String str12 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!=hi!==hi!==hi!=hi!=hi!");
        java.lang.String str15 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal9.key("hi!=hi!==hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str12.equals("hi!=hi!=hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!==hi!==hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=hi!==hi!==hi!=hi!==hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!");
        java.lang.String str11 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.value("hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!");
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
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==hi!=hi!=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!==hi!=");
        java.lang.String str5 = keyVal4.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=hi!=hi!==hi!==hi!==hi!");
        java.lang.String str8 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!==hi!=" + "'", str5.equals("hi!=hi!==hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!==hi!==hi!==hi!=hi!=hi!==hi!=" + "'", str8.equals("hi!=hi!=hi!==hi!==hi!==hi!=hi!=hi!==hi!="));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=hi!==", "hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        java.lang.String str13 = keyVal12.toString();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=", "hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==");
        java.lang.Class<?> wildcardClass5 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!", "hi!===hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!", "hi!=hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!==hi!=hi!=");
        java.lang.String str7 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!==hi!" + "'", str7.equals("hi!=hi!=hi!==hi!=hi!==hi!=hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!==hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!==hi!==hi!=", "hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!=hi!=hi!==hi!==hi!==hi!=hi!=hi!==hi!=");
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
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal8.key();
        java.lang.String str12 = keyVal8.toString();
        java.lang.String str13 = keyVal8.key();
        java.lang.String str14 = keyVal8.key();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!===hi!=hi!", "hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!===hi!=hi!" + "'", str3.equals("hi!=hi!===hi!=hi!"));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
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
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!==hi!");
        java.lang.String str8 = keyVal7.key();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!==hi!" + "'", str8.equals("hi!==hi!"));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!");
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("hi!===hi!=hi!=hi!=");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=hi!=hi!");
        java.lang.String str7 = keyVal6.key();
        java.lang.String str8 = keyVal6.value();
        java.lang.Class<?> wildcardClass9 = keyVal6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal2.key();
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!" + "'", str5.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=");
        java.lang.String str8 = keyVal5.toString();
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!=hi!=hi!==");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!=hi!=hi!=hi!==hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=hi!=hi!==" + "'", str9.equals("hi!=hi!=hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=", "hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str3.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!=hi!=hi!==hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!==hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str5 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str5.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        java.lang.String str14 = keyVal11.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
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
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!==hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!===hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=");
        java.lang.String str5 = keyVal4.toString();
        java.lang.Class<?> wildcardClass6 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!==hi!=hi!=" + "'", str5.equals("hi!=hi!==hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!===hi!=hi!" + "'", str3.equals("hi!=hi!===hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!===hi!=hi!" + "'", str4.equals("hi!=hi!===hi!=hi!"));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!==hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.key("hi!=hi!==hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!=hi!==");
        java.lang.String str10 = keyVal9.key();
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=", "hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("hi!=hi!=hi!=hi!=hi!==hi!");
        java.lang.String str7 = keyVal4.key();
        java.lang.String str8 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!" + "'", str7.equals("hi!=hi!=hi!=hi!=hi!==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=hi!=hi!=hi!==hi!" + "'", str8.equals("hi!=hi!=hi!=hi!=hi!==hi!"));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        java.lang.String str7 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("hi!==hi!=hi!=hi!");
        java.lang.Class<?> wildcardClass10 = keyVal4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal6.value("hi!");
        java.lang.String str17 = keyVal6.toString();
        java.lang.String str18 = keyVal6.toString();
        java.lang.String str19 = keyVal6.key();
        java.lang.String str20 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal6.value("hi!===hi!=hi!=hi!=");
        java.lang.String str23 = keyVal22.key();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=hi!=hi!" + "'", str17.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!=hi!=hi!" + "'", str18.equals("hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!=hi!" + "'", str19.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!=hi!" + "'", str20.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!=hi!" + "'", str23.equals("hi!=hi!"));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.value();
        java.lang.String str14 = keyVal11.value();
        java.lang.String str15 = keyVal11.toString();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str12.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str13.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str14.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=hi!=hi!=");
        java.lang.String str5 = keyVal4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!==hi!=hi!=hi!=hi!=" + "'", str5.equals("hi!=hi!==hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=hi!==hi!==hi!=hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=hi!==hi!==hi!=hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

