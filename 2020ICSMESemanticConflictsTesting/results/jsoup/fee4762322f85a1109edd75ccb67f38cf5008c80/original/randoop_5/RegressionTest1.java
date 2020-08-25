import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        java.lang.String str15 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal5.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal5.key("hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Content-Encoding==" + "'", str15.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        java.lang.String str11 = keyVal10.value();
        boolean boolean12 = keyVal10.hasInputStream();
        java.lang.String str13 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("");
        java.lang.Class<?> wildcardClass16 = keyVal10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal12.value("Content-Encoding==Content-Encoding=");
        java.lang.String str18 = keyVal17.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!==Content-Encoding==Content-Encoding=" + "'", str18.equals("hi!==Content-Encoding==Content-Encoding="));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=" + "'", str3.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=hi!");
        java.lang.String str5 = keyVal4.value();
        boolean boolean6 = keyVal4.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal4.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.Class<?> wildcardClass12 = keyVal11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        java.lang.String str7 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding=" + "'", str7.equals("Content-Encoding="));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=hi!=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = keyVal11.inputStream();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=hi!=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        java.lang.String str11 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding===");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!=hi!", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        java.lang.String str11 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Content-Encoding" + "'", str11.equals("Content-Encoding"));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str3.equals("Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal7.hasInputStream();
        java.lang.String str9 = keyVal7.key();
        java.lang.String str10 = keyVal7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=hi!");
        boolean boolean6 = keyVal3.hasInputStream();
        java.lang.String str7 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding=hi!" + "'", str7.equals("Content-Encoding=hi!"));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.lang.String str13 = keyVal12.value();
        java.lang.String str14 = keyVal12.key();
        java.io.InputStream inputStream15 = keyVal12.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding=" + "'", str14.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=");
        java.lang.String str13 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        java.io.InputStream inputStream13 = keyVal10.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal16.key("hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("Content-Encoding=");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Content-Encoding==" + "'", str11.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding=" + "'", str12.equals("Content-Encoding="));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=Content-Encoding==Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=Content-Encoding==Content-Encoding" + "'", str4.equals("Content-Encoding=hi!=Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str6 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.toString();
        java.lang.Class<?> wildcardClass10 = keyVal8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        java.lang.String str8 = keyVal5.toString();
        java.lang.String str9 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=Content-Encoding" + "'", str8.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.lang.String str17 = keyVal14.key();
        java.lang.Class<?> wildcardClass18 = keyVal14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Content-Encoding=" + "'", str17.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("Content-Encoding===");
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "hi!=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!=Content-Encoding=hi!=hi!");
        boolean boolean16 = keyVal10.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!");
        java.io.InputStream inputStream15 = keyVal12.inputStream();
        boolean boolean16 = keyVal12.hasInputStream();
        java.io.InputStream inputStream17 = keyVal12.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=hi!=hi!=Content-Encoding=");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
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
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("");
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        java.lang.String str12 = keyVal10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=" + "'", str12.equals("hi!="));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        java.lang.String str11 = keyVal10.value();
        boolean boolean12 = keyVal10.hasInputStream();
        java.lang.String str13 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("");
        java.lang.Class<?> wildcardClass16 = keyVal15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding====Content-Encoding==Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        java.lang.String str7 = keyVal4.toString();
        java.lang.String str8 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding=hi!=hi!=Content-Encoding=" + "'", str7.equals("Content-Encoding=hi!=hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str8.equals("Content-Encoding=hi!=hi!"));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===", "hi!=Content-Encoding==hi!=Content-Encoding==");
        boolean boolean3 = keyVal2.hasInputStream();
        boolean boolean4 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = inputStream8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "hi!==Content-Encoding==Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!");
        java.lang.String str7 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!" + "'", str4.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=hi!=hi!" + "'", str7.equals("hi!=hi!=hi!"));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        java.lang.String str11 = keyVal10.value();
        boolean boolean12 = keyVal10.hasInputStream();
        java.lang.String str13 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.key("Content-Encoding=hi!");
        java.lang.Class<?> wildcardClass16 = keyVal10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=Content-Encoding");
        java.lang.String str10 = keyVal5.toString();
        java.lang.String str11 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=Content-Encoding" + "'", str10.equals("hi!=hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=hi!=Content-Encoding" + "'", str11.equals("hi!=hi!=Content-Encoding"));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=hi!", "hi!=Content-Encoding=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "hi!=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=hi!=Content-Encoding=" + "'", str4.equals("Content-Encoding=hi!=hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding=hi!=hi!=Content-Encoding=" + "'", str5.equals("Content-Encoding=hi!=hi!=Content-Encoding="));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!" + "'", str10.equals("hi!=hi!"));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal2.toString();
        boolean boolean10 = keyVal2.hasInputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.inputStream(inputStream11);
        java.lang.String str13 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding" + "'", str13.equals("Content-Encoding"));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.lang.Class<?> wildcardClass7 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding=Content-Encoding");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding==" + "'", str3.equals("hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding===Content-Encoding=Content-Encoding" + "'", str4.equals("hi!=Content-Encoding===Content-Encoding=Content-Encoding"));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.lang.String str13 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.key("hi!==");
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        java.lang.Class<?> wildcardClass5 = keyVal3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!==" + "'", str6.equals("hi!=="));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding====Content-Encoding==Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding====Content-Encoding==Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=hi!=Content-Encoding=" + "'", str6.equals("Content-Encoding=hi!=Content-Encoding="));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
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
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding==Content-Encoding=");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        java.io.InputStream inputStream11 = keyVal9.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding" + "'", str7.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.value();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.inputStream(inputStream11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "hi!=hi!=hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=Content-Encoding" + "'", str8.equals("hi!=Content-Encoding"));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str3.equals("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("");
        java.lang.String str17 = keyVal16.key();
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.inputStream(inputStream18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
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
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====Content-Encoding==Content-Encoding=", "Content-Encoding==Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        boolean boolean7 = keyVal2.hasInputStream();
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.lang.String str9 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = keyVal5.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        boolean boolean8 = keyVal7.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===", "hi!=Content-Encoding==hi!=Content-Encoding==");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.toString();
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==" + "'", str4.equals("Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding===");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("Content-Encoding=hi!=Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.lang.String str9 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=");
        boolean boolean13 = keyVal8.hasInputStream();
        java.lang.String str14 = keyVal8.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding=hi!" + "'", str14.equals("Content-Encoding=hi!"));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=hi!");
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=");
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding==hi!" + "'", str6.equals("Content-Encoding==hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.inputStream(inputStream12);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("Content-Encoding=Content-Encoding");
        java.lang.String str16 = keyVal15.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Content-Encoding==Content-Encoding=Content-Encoding" + "'", str16.equals("Content-Encoding==Content-Encoding=Content-Encoding"));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding" + "'", str3.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str4.equals("Content-Encoding=Content-Encoding"));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding==Content-Encoding");
        java.lang.String str10 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding==Content-Encoding=" + "'", str10.equals("Content-Encoding==Content-Encoding="));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        java.io.InputStream inputStream8 = keyVal5.inputStream();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.key();
        java.lang.String str10 = keyVal5.value();
        java.io.InputStream inputStream11 = keyVal5.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str7 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str7.equals("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!");
        java.lang.String str15 = keyVal12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        boolean boolean15 = keyVal14.hasInputStream();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal14.inputStream(inputStream16);
        java.lang.String str18 = keyVal14.value();
        java.lang.String str19 = keyVal14.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.Class<?> wildcardClass10 = keyVal9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        java.lang.String str11 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!=" + "'", str11.equals("hi!="));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=Content-Encoding");
        java.lang.String str10 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=Content-Encoding" + "'", str10.equals("hi!=Content-Encoding"));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("hi!=Content-Encoding");
        java.lang.String str13 = keyVal12.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=Content-Encoding" + "'", str13.equals("hi!=Content-Encoding"));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==Content-Encoding==Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==Content-Encoding==Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!=Content-Encoding=hi!=hi!");
        java.io.InputStream inputStream16 = keyVal10.inputStream();
        java.io.InputStream inputStream17 = keyVal10.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "Content-Encoding==Content-Encoding=Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.value();
        java.lang.String str16 = keyVal14.toString();
        java.lang.String str17 = keyVal14.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=" + "'", str16.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.inputStream(inputStream14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.key();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        boolean boolean7 = keyVal2.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("Content-Encoding");
        boolean boolean12 = keyVal2.hasInputStream();
        boolean boolean13 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding===Content-Encoding=Content-Encoding", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=" + "'", str3.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding===Content-Encoding=Content-Encoding", "hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal12.value("Content-Encoding==Content-Encoding=");
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal12.inputStream(inputStream18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.lang.String str8 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!", inputStream2);
        java.lang.String str4 = keyVal3.value();
        boolean boolean5 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!" + "'", str4.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.Class<?> wildcardClass9 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.lang.String str13 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal9.value("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.Class<?> wildcardClass16 = keyVal15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding===" + "'", str13.equals("Content-Encoding==="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("Content-Encoding===");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding====Content-Encoding==Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==" + "'", str4.equals("Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding==Content-Encoding=");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        java.lang.String str11 = keyVal9.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding" + "'", str7.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Content-Encoding==Content-Encoding=" + "'", str11.equals("Content-Encoding==Content-Encoding="));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding=" + "'", str14.equals("Content-Encoding="));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.value("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding=hi!=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=Content-Encoding=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!=Content-Encoding===Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.inputStream(inputStream14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str12 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=Content-Encoding==hi!=Content-Encoding==" + "'", str12.equals("hi!=Content-Encoding==hi!=Content-Encoding=="));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=", "Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==hi!");
        boolean boolean5 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.lang.Class<?> wildcardClass8 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        boolean boolean8 = keyVal5.hasInputStream();
        java.lang.String str9 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.key();
        java.io.InputStream inputStream10 = keyVal8.inputStream();
        java.lang.String str11 = keyVal8.toString();
        java.lang.String str12 = keyVal8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Content-Encoding=" + "'", str11.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding=" + "'", str12.equals("Content-Encoding="));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "Content-Encoding=hi!=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!");
        boolean boolean15 = keyVal14.hasInputStream();
        java.lang.String str16 = keyVal14.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str16.equals("hi!=hi!=hi!=hi!"));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        java.io.InputStream inputStream5 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.value("Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str4.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding===");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        boolean boolean7 = keyVal5.hasInputStream();
        java.lang.String str8 = keyVal5.toString();
        java.lang.String str9 = keyVal5.toString();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Content-Encoding=" + "'", str8.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("Content-Encoding==Content-Encoding");
        boolean boolean13 = keyVal8.hasInputStream();
        java.io.InputStream inputStream14 = keyVal8.inputStream();
        java.lang.String str15 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str15.equals("Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====Content-Encoding==Content-Encoding", "hi!=hi!=Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("Content-Encoding=hi!=hi!");
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal5.inputStream(inputStream17);
        java.lang.String str19 = keyVal18.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal18.key("hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str19.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal21);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding==");
        java.lang.String str13 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=Content-Encoding==hi!=Content-Encoding=");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding=Content-Encoding");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=hi!==hi!");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!" + "'", str3.equals("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!"));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal12.value("Content-Encoding==Content-Encoding=");
        java.lang.String str18 = keyVal17.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Content-Encoding==Content-Encoding=" + "'", str18.equals("Content-Encoding==Content-Encoding="));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.value();
        java.lang.String str16 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.key("hi!=Content-Encoding");
        java.lang.String str19 = keyVal14.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=" + "'", str16.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding=", "hi!=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream15 = keyVal14.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!");
        java.lang.String str8 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal7.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
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
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding==Content-Encoding=", "Content-Encoding=hi!=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.value();
        boolean boolean16 = keyVal14.hasInputStream();
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.inputStream(inputStream17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str17 = keyVal14.toString();
        java.lang.String str18 = keyVal14.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str17.equals("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Content-Encoding==" + "'", str18.equals("Content-Encoding=="));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding===Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding===Content-Encoding=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        java.io.InputStream inputStream10 = keyVal8.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=hi!=" + "'", str5.equals("hi!=hi!="));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.value("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!", "Content-Encoding==hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.lang.String str6 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=Content-Encoding=" + "'", str6.equals("hi!=hi!=Content-Encoding="));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.lang.String str13 = keyVal9.key();
        java.lang.String str14 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal9.value("Content-Encoding====Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal9.inputStream(inputStream17);
        java.lang.String str19 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding==" + "'", str13.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding==" + "'", str14.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding" + "'", str19.equals("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=Content-Encoding");
        java.lang.String str9 = keyVal8.key();
        java.lang.String str10 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=Content-Encoding===Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=Content-Encoding" + "'", str10.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.key();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        boolean boolean7 = keyVal2.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        java.lang.String str10 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!=Content-Encoding=");
        java.lang.String str6 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=hi!=hi!=Content-Encoding=" + "'", str6.equals("Content-Encoding=hi!=hi!=Content-Encoding="));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding=" + "'", str10.equals("Content-Encoding="));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.inputStream(inputStream12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        java.lang.String str11 = keyVal9.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding", "hi!=Content-Encoding=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding==Content-Encoding");
        java.lang.String str10 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.lang.String str13 = keyVal12.key();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.inputStream(inputStream14);
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        java.io.InputStream inputStream18 = keyVal15.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding=" + "'", str13.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream18);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        boolean boolean4 = keyVal2.hasInputStream();
        java.lang.String str5 = keyVal2.toString();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding" + "'", str3.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5.equals("Content-Encoding=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=Content-Encoding=hi!=hi!" + "'", str6.equals("hi!=Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.key();
        java.io.InputStream inputStream8 = keyVal5.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding=");
        java.lang.String str12 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!=Content-Encoding=" + "'", str12.equals("hi!=Content-Encoding="));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("hi!=hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        boolean boolean5 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.value();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding==Content-Encoding");
        java.lang.String str10 = keyVal9.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str10.equals("Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====Content-Encoding==Content-Encoding=", "Content-Encoding====Content-Encoding==Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding=hi!=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=Content-Encoding=" + "'", str4.equals("Content-Encoding=hi!=Content-Encoding="));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.Class<?> wildcardClass5 = keyVal4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!=Content-Encoding=hi!=hi!");
        java.io.InputStream inputStream16 = keyVal10.inputStream();
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal10.inputStream(inputStream17);
        java.lang.String str19 = keyVal10.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Content-Encoding===" + "'", str19.equals("Content-Encoding==="));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding====Content-Encoding==Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        java.lang.String str13 = keyVal12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!" + "'", str13.equals("hi!=hi!"));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.Class<?> wildcardClass7 = keyVal2.getClass();
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
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal7.hasInputStream();
        java.lang.String str9 = keyVal7.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("hi!=Content-Encoding=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str17 = keyVal16.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.key("hi!");
        boolean boolean20 = keyVal19.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str17.equals("hi!=Content-Encoding==hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.key("hi!=hi!=Content-Encoding");
        boolean boolean17 = keyVal12.hasInputStream();
        java.lang.Class<?> wildcardClass18 = keyVal12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "Content-Encoding==Content-Encoding", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=hi!");
        boolean boolean6 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding=Content-Encoding", "Content-Encoding==hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = keyVal3.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.key();
        java.lang.String str16 = keyVal14.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!" + "'", str15.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=" + "'", str16.equals("hi!=hi!="));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        boolean boolean11 = keyVal8.hasInputStream();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.inputStream(inputStream12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.value();
        java.lang.String str16 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.key("hi!=Content-Encoding");
        java.lang.String str19 = keyVal18.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=" + "'", str16.equals("hi!=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding==Content-Encoding", "hi!=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding===", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.value("");
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal12.inputStream(inputStream17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        boolean boolean13 = keyVal12.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("Content-Encoding===");
        java.lang.Class<?> wildcardClass14 = keyVal10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.Class<?> wildcardClass10 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==");
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding===Content-Encoding==Content-Encoding" + "'", str5.equals("Content-Encoding===Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "Content-Encoding==Content-Encoding", inputStream2);
        java.lang.Class<?> wildcardClass4 = keyVal3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.lang.String str13 = keyVal5.toString();
        java.lang.String str14 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Content-Encoding" + "'", str8.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding=hi!" + "'", str13.equals("Content-Encoding=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding=hi!" + "'", str14.equals("Content-Encoding=hi!"));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.inputStream(inputStream17);
        java.io.InputStream inputStream19 = keyVal16.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertNull(inputStream19);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!=Content-Encoding=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.value();
        boolean boolean6 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=Content-Encoding=" + "'", str5.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==Content-Encoding");
        java.lang.Class<?> wildcardClass8 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.lang.String str13 = keyVal12.key();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.inputStream(inputStream14);
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal15.value("hi!=Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal15.key("Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding=" + "'", str13.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal21);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!");
        java.lang.String str7 = keyVal6.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str3.equals("Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding=" + "'", str7.equals("Content-Encoding="));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=Content-Encoding===Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===", "", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str7 = keyVal2.value();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding==" + "'", str4.equals("hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding==" + "'", str7.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("Content-Encoding=hi!=hi!");
        java.lang.String str17 = keyVal5.value();
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal5.inputStream(inputStream18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str17.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.inputStream(inputStream12);
        java.io.InputStream inputStream14 = keyVal13.inputStream();
        java.lang.String str15 = keyVal13.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===Content-Encoding==Content-Encoding", "Content-Encoding==Content-Encoding=Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        boolean boolean10 = keyVal7.hasInputStream();
        java.lang.String str11 = keyVal7.key();
        java.lang.String str12 = keyVal7.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding" + "'", str12.equals("Content-Encoding"));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        java.io.InputStream inputStream7 = keyVal5.inputStream();
        java.io.InputStream inputStream8 = keyVal5.inputStream();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        boolean boolean10 = keyVal5.hasInputStream();
        boolean boolean11 = keyVal5.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str12 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str12.equals("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "Content-Encoding=hi!=hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=hi!");
        boolean boolean6 = keyVal3.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=hi!=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.lang.String str13 = keyVal12.key();
        java.lang.String str14 = keyVal12.toString();
        java.lang.String str15 = keyVal12.value();
        java.io.InputStream inputStream16 = keyVal12.inputStream();
        java.lang.String str17 = keyVal12.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding=" + "'", str13.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding==" + "'", str14.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!==Content-Encoding==Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.inputStream(inputStream14);
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal12.value("Content-Encoding===");
        java.io.InputStream inputStream18 = keyVal12.inputStream();
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal12.inputStream(inputStream19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        boolean boolean5 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding==hi!" + "'", str6.equals("Content-Encoding==hi!"));
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.value("hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        java.lang.String str11 = keyVal5.value();
        boolean boolean12 = keyVal5.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
        java.lang.String str10 = keyVal9.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!" + "'", str10.equals("hi!=hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!"));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "Content-Encoding=hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("hi!=Content-Encoding==hi!=Content-Encoding==");
        boolean boolean8 = keyVal7.hasInputStream();
        java.lang.String str9 = keyVal7.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=" + "'", str4.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding=" + "'", str5.equals("Content-Encoding="));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream10 = keyVal7.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding=hi!=hi!");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!", "hi!=hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding" + "'", str7.equals("Content-Encoding"));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding", "Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=Content-Encoding==Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "Content-Encoding=hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("hi!=Content-Encoding==hi!=Content-Encoding==");
        boolean boolean8 = keyVal7.hasInputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.inputStream(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        java.lang.Class<?> wildcardClass7 = keyVal5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        java.lang.String str4 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding==" + "'", str4.equals("hi!=Content-Encoding=="));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding====Content-Encoding==Content-Encoding");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=hi!=hi!", inputStream2);
        java.lang.Class<?> wildcardClass4 = keyVal3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=hi!=hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.key("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str3.equals("Content-Encoding==Content-Encoding"));
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
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = keyVal16.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding====Content-Encoding==Content-Encoding");
        java.lang.Class<?> wildcardClass14 = keyVal13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.inputStream(inputStream14);
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal12.value("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal12.key("Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
        java.lang.String str20 = keyVal19.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding===Content-Encoding===" + "'", str20.equals("Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding===Content-Encoding==="));
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding==hi!=Content-Encoding=Content-Encoding" + "'", str3.equals("Content-Encoding==hi!=Content-Encoding=Content-Encoding"));
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal14.value("Content-Encoding====Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.inputStream(inputStream12);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("Content-Encoding=Content-Encoding");
        boolean boolean16 = keyVal15.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding==hi!=Content-Encoding=Content-Encoding", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=hi!");
        java.lang.String str6 = keyVal3.toString();
        boolean boolean7 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str6.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding===");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding=", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=");
        java.lang.String str5 = keyVal4.key();
        java.io.InputStream inputStream6 = keyVal4.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.lang.String str6 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!=Content-Encoding=" + "'", str6.equals("hi!=hi!=Content-Encoding="));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===", "Content-Encoding==hi!=Content-Encoding=Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=hi!" + "'", str3.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!" + "'", str4.equals("hi!=hi!"));
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding====Content-Encoding==Content-Encoding=");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!=Content-Encoding==hi!=Content-Encoding==");
        java.io.InputStream inputStream10 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.value("hi!=Content-Encoding=");
        java.lang.String str16 = keyVal15.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=Content-Encoding==Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("hi!=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==" + "'", str4.equals("Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=hi!");
        java.io.InputStream inputStream13 = keyVal10.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        boolean boolean8 = keyVal5.hasInputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        java.lang.String str11 = keyVal10.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        java.lang.String str6 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6.equals("Content-Encoding=="));
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!=Content-Encoding===Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.value("Content-Encoding=hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
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
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "Content-Encoding=hi!=hi!=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding==Content-Encoding=");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.inputStream(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding=Content-Encoding");
        boolean boolean3 = keyVal2.hasInputStream();
        boolean boolean4 = keyVal2.hasInputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "Content-Encoding=hi!=hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("Content-Encoding==Content-Encoding");
        java.lang.String str12 = keyVal11.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding=" + "'", str12.equals("Content-Encoding="));
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.key("hi!=hi!=Content-Encoding=");
        java.lang.Class<?> wildcardClass16 = keyVal15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
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
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("Content-Encoding====Content-Encoding==Content-Encoding");
        boolean boolean8 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal8.value("hi!=Content-Encoding===Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
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
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        java.io.InputStream inputStream11 = keyVal9.inputStream();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.inputStream(inputStream12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("Content-Encoding=hi!=hi!");
        java.lang.String str6 = keyVal2.key();
        java.lang.String str7 = keyVal2.value();
        java.lang.String str8 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str7.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==");
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream8 = keyVal4.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding===Content-Encoding==Content-Encoding" + "'", str5.equals("Content-Encoding===Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding===Content-Encoding===");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding===Content-Encoding===", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!", "hi!=Content-Encoding=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str17 = keyVal16.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.key("hi!");
        java.io.InputStream inputStream20 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal16.inputStream(inputStream20);
        java.io.InputStream inputStream22 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal21.inputStream(inputStream22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str17.equals("hi!=Content-Encoding==hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("Content-Encoding==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding==" + "'", str4.equals("hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Content-Encoding==" + "'", str7.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding====Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding", "Content-Encoding==hi!=Content-Encoding=Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=hi!", "Content-Encoding=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding==", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=Content-Encoding==" + "'", str7.equals("hi!=Content-Encoding=="));
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("Content-Encoding=hi!");
        boolean boolean7 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str4.equals("Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding=hi!=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("Content-Encoding");
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
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        java.lang.String str9 = keyVal7.toString();
        java.lang.Class<?> wildcardClass10 = keyVal7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=" + "'", str9.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "Content-Encoding==Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!=");
        boolean boolean16 = keyVal13.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.key("Content-Encoding=hi!");
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal13.inputStream(inputStream19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.key();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        boolean boolean7 = keyVal2.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("Content-Encoding==hi!=Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        boolean boolean5 = keyVal4.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        java.lang.String str13 = keyVal5.toString();
        java.lang.String str14 = keyVal5.toString();
        java.lang.String str15 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!=hi!" + "'", str13.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!=hi!" + "'", str14.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "Content-Encoding=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("Content-Encoding==");
        java.lang.String str17 = keyVal16.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Content-Encoding===Content-Encoding==" + "'", str17.equals("Content-Encoding===Content-Encoding=="));
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.key("Content-Encoding=hi!=hi!");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        boolean boolean17 = keyVal14.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "Content-Encoding=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("Content-Encoding=hi!=hi!=Content-Encoding=");
        java.lang.String str17 = keyVal16.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Content-Encoding===" + "'", str17.equals("Content-Encoding==="));
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("Content-Encoding==hi!");
        java.lang.String str14 = keyVal11.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding=" + "'", str14.equals("Content-Encoding="));
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!");
        java.lang.String str15 = keyVal14.toString();
        boolean boolean16 = keyVal14.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        boolean boolean4 = keyVal2.hasInputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding" + "'", str3.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.lang.String str5 = keyVal4.key();
        java.lang.String str6 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.lang.String str13 = keyVal9.key();
        java.lang.String str14 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal9.value("Content-Encoding====Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream17 = keyVal9.inputStream();
        boolean boolean18 = keyVal9.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding==" + "'", str13.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding==" + "'", str14.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!");
        boolean boolean12 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        boolean boolean12 = keyVal5.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.key();
        boolean boolean10 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==Content-Encoding");
        java.lang.String str8 = keyVal5.toString();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Content-Encoding===Content-Encoding==Content-Encoding" + "'", str8.equals("Content-Encoding===Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding===Content-Encoding==Content-Encoding" + "'", str10.equals("Content-Encoding===Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.lang.String str7 = keyVal2.key();
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!=Content-Encoding" + "'", str7.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=hi!=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.lang.String str7 = keyVal5.key();
        java.lang.String str8 = keyVal5.toString();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!" + "'", str8.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.key("hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str4.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=hi!" + "'", str4.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=");
        java.lang.String str5 = keyVal4.key();
        java.io.InputStream inputStream6 = keyVal4.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal4.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal4.key("Content-Encoding==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.value();
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding" + "'", str6.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.toString();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.inputStream(inputStream10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding====Content-Encoding==Content-Encoding");
        java.lang.String str14 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.key("hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        java.lang.String str8 = keyVal3.key();
        boolean boolean9 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=Content-Encoding=" + "'", str8.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===Content-Encoding==Content-Encoding", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal2.toString();
        java.lang.String str10 = keyVal2.toString();
        java.lang.String str11 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding=" + "'", str10.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=hi!=hi!=hi!");
        java.lang.String str16 = keyVal13.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!=" + "'", str16.equals("hi!=hi!=hi!=hi!="));
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        java.lang.String str11 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
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
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=Content-Encoding");
        java.lang.String str5 = keyVal4.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=Content-Encoding" + "'", str5.equals("hi!=Content-Encoding"));
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!==");
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.key();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
        java.lang.String str10 = keyVal9.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!==" + "'", str7.equals("hi!=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!==" + "'", str10.equals("hi!=="));
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.lang.String str8 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        java.lang.Class<?> wildcardClass10 = keyVal9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding===Content-Encoding====Content-Encoding==Content-Encoding", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==", "hi!=hi!=Content-Encoding");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.key();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.io.InputStream inputStream7 = keyVal2.inputStream();
        boolean boolean8 = keyVal2.hasInputStream();
        java.lang.String str9 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.lang.String str7 = keyVal6.value();
        java.io.InputStream inputStream8 = keyVal6.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("Content-Encoding=hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding==" + "'", str4.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=hi!");
        java.lang.String str5 = keyVal2.toString();
        boolean boolean6 = keyVal2.hasInputStream();
        java.lang.String str7 = keyVal2.value();
        java.lang.String str8 = keyVal2.toString();
        boolean boolean9 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str5.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str8.equals("Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.lang.String str6 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=hi!=hi!=Content-Encoding=");
        boolean boolean7 = keyVal6.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("Content-Encoding=hi!=hi!");
        java.lang.String str9 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding==" + "'", str4.equals("hi!=Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding=hi!=hi!=Content-Encoding==" + "'", str9.equals("Content-Encoding=hi!=hi!=Content-Encoding=="));
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("Content-Encoding=hi!=hi!");
        java.lang.Class<?> wildcardClass17 = keyVal16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
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
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding===Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==");
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!==");
        java.lang.String str8 = keyVal7.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Content-Encoding===Content-Encoding==Content-Encoding" + "'", str5.equals("Content-Encoding===Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Content-Encoding==" + "'", str8.equals("Content-Encoding=="));
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.key();
        java.lang.String str10 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=hi!=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding" + "'", str10.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        boolean boolean6 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("hi!=");
        java.lang.Class<?> wildcardClass16 = keyVal15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.key("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!==");
        java.lang.Class<?> wildcardClass17 = keyVal14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
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
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("Content-Encoding=");
        boolean boolean9 = keyVal5.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=hi!" + "'", str6.equals("hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("hi!=hi!=hi!");
        java.lang.String str15 = keyVal14.toString();
        java.lang.String str16 = keyVal14.toString();
        java.io.InputStream inputStream17 = keyVal14.inputStream();
        boolean boolean18 = keyVal14.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str15.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!=hi!=hi!=hi!" + "'", str16.equals("hi!=hi!=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "hi!", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        java.lang.Class<?> wildcardClass5 = keyVal3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        java.lang.String str10 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.key("hi!=Content-Encoding");
        java.lang.String str15 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!=Content-Encoding" + "'", str15.equals("hi!=Content-Encoding"));
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!===hi!=Content-Encoding=hi!=hi!" + "'", str6.equals("hi!===hi!=Content-Encoding=hi!=hi!"));
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=hi!=hi!" + "'", str3.equals("hi!=Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==hi!=Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("Content-Encoding==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.value("");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.inputStream(inputStream15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        boolean boolean8 = keyVal5.hasInputStream();
        java.lang.String str9 = keyVal5.toString();
        java.lang.String str10 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("hi!=Content-Encoding=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=Content-Encoding" + "'", str9.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding" + "'", str10.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        boolean boolean8 = keyVal5.hasInputStream();
        boolean boolean9 = keyVal5.hasInputStream();
        java.lang.String str10 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding" + "'", str10.equals("Content-Encoding"));
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.io.InputStream inputStream15 = keyVal14.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.value();
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.lang.String str13 = keyVal12.key();
        java.lang.Class<?> wildcardClass14 = keyVal12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!=" + "'", str10.equals("hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=Content-Encoding=Content-Encoding==");
        boolean boolean8 = keyVal7.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        java.lang.Class<?> wildcardClass4 = keyVal3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        java.lang.String str12 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("Content-Encoding====Content-Encoding==Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.key("Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding==hi!=Content-Encoding==hi!=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.key();
        boolean boolean10 = keyVal5.hasInputStream();
        java.lang.String str11 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str14 = keyVal13.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding==Content-Encoding", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.value("Content-Encoding");
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding==Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding" + "'", str14.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test967");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("hi!");
        java.lang.String str12 = keyVal11.key();
        java.io.InputStream inputStream13 = keyVal11.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("Content-Encoding====Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal11.key("Content-Encoding=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test968");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!");
        java.lang.String str6 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str6.equals("hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test969");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding=");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.inputStream(inputStream12);
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.inputStream(inputStream14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test970");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=hi!", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test971");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding" + "'", str4.equals("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test972");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!=Content-Encoding==hi!=Content-Encoding=");
        java.lang.String str5 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test973");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=");
        java.lang.String str8 = keyVal7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=hi!=" + "'", str8.equals("hi!=hi!="));
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test974");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding==");
        java.lang.String str6 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=hi!=hi!" + "'", str3.equals("hi!=Content-Encoding=hi!=hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6.equals("Content-Encoding=="));
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test975");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.lang.String str13 = keyVal9.key();
        java.lang.String str14 = keyVal9.toString();
        java.lang.String str15 = keyVal9.toString();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal9.inputStream(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding==" + "'", str13.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Content-Encoding===" + "'", str14.equals("Content-Encoding==="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Content-Encoding===" + "'", str15.equals("Content-Encoding==="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test976");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        java.lang.String str8 = keyVal5.key();
        java.lang.String str9 = keyVal5.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test977");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.lang.String str13 = keyVal12.key();
        java.lang.String str14 = keyVal12.value();
        boolean boolean15 = keyVal12.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding=" + "'", str13.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test978");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test979");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.inputStream(inputStream14);
        java.lang.String str16 = keyVal15.toString();
        java.lang.String str17 = keyVal15.key();
        java.lang.Class<?> wildcardClass18 = keyVal15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Content-Encoding==" + "'", str16.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Content-Encoding=" + "'", str17.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }
}

