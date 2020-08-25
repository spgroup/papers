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
        boolean boolean13 = keyVal12.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("Content-Encoding=hi!=hi!");
        java.lang.String str6 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=Content-Encoding=hi!=hi!" + "'", str6.equals("hi!=Content-Encoding=hi!=hi!"));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        java.lang.String str5 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=" + "'", str3.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=Content-Encoding=" + "'", str5.equals("hi!=Content-Encoding="));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding==Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        boolean boolean5 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding=", "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("");
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
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
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
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==");
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
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "hi!=Content-Encoding=hi!=hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.value("Content-Encoding");
        java.lang.String str14 = keyVal13.value();
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
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        boolean boolean8 = keyVal5.hasInputStream();
        java.lang.String str9 = keyVal5.toString();
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
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding===");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====Content-Encoding==Content-Encoding", "");
        java.lang.String str3 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding====Content-Encoding==Content-Encoding=" + "'", str3.equals("Content-Encoding====Content-Encoding==Content-Encoding="));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        java.lang.String str18 = keyVal5.value();
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal5.inputStream(inputStream19);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!==");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        java.lang.String str8 = keyVal5.key();
        java.lang.String str9 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!==hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding==hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding=");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=Content-Encoding");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
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
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.toString();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=" + "'", str3.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        boolean boolean10 = keyVal7.hasInputStream();
        boolean boolean11 = keyVal7.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.value("Content-Encoding=hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        boolean boolean6 = keyVal5.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=Content-Encoding");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.lang.String str6 = keyVal4.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding====Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=", "Content-Encoding====Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!");
        java.lang.String str10 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("Content-Encoding=Content-Encoding");
        java.lang.String str13 = keyVal12.value();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding" + "'", str10.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str13.equals("Content-Encoding=Content-Encoding"));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
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
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        boolean boolean8 = keyVal5.hasInputStream();
        java.lang.String str9 = keyVal5.value();
        java.lang.Class<?> wildcardClass10 = keyVal5.getClass();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        java.lang.String str7 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding", "Content-Encoding===Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.toString();
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding" + "'", str3.equals("hi!=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal5.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.key("hi!=hi!");
        boolean boolean22 = keyVal19.hasInputStream();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.lang.String str13 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal9.value("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal9.key("Content-Encoding=");
        java.lang.String str18 = keyVal9.key();
        java.lang.String str19 = keyVal9.key();
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
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Content-Encoding=" + "'", str18.equals("Content-Encoding="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Content-Encoding=" + "'", str19.equals("Content-Encoding="));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!");
        java.lang.String str8 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal7.key("Content-Encoding===");
        java.lang.Class<?> wildcardClass13 = keyVal7.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=hi!");
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        boolean boolean11 = keyVal8.hasInputStream();
        java.lang.String str12 = keyVal8.toString();
        boolean boolean13 = keyVal8.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding=hi!=" + "'", str12.equals("Content-Encoding=hi!="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!");
        java.lang.String str13 = keyVal5.toString();
        boolean boolean14 = keyVal5.hasInputStream();
        java.io.InputStream inputStream15 = keyVal5.inputStream();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!=hi!");
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
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!");
        java.lang.String str11 = keyVal8.toString();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Content-Encoding=hi!=" + "'", str11.equals("Content-Encoding=hi!="));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str4.equals("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.inputStream(inputStream14);
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.key("hi!=Content-Encoding=");
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
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
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
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===Content-Encoding==Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        boolean boolean10 = keyVal9.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=", "hi!=hi!=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=" + "'", str4.equals("Content-Encoding=hi!="));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding==");
        java.lang.String str13 = keyVal9.toString();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal9.inputStream(inputStream14);
        java.io.InputStream inputStream16 = keyVal9.inputStream();
        boolean boolean17 = keyVal9.hasInputStream();
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
        org.junit.Assert.assertNull(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        boolean boolean4 = keyVal2.hasInputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=Content-Encoding==");
        java.lang.String str9 = keyVal6.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding" + "'", str3.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!=Content-Encoding==" + "'", str9.equals("hi!=Content-Encoding=="));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=hi!=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=hi!=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding===");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=");
        java.lang.String str5 = keyVal4.key();
        java.io.InputStream inputStream6 = keyVal4.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
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
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=hi!=hi!", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=Content-Encoding==Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding=hi!=Content-Encoding==Content-Encoding" + "'", str4.equals("Content-Encoding=hi!=Content-Encoding==Content-Encoding"));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "hi!=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4.equals("hi!=Content-Encoding="));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=hi!==hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding====Content-Encoding==Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding====Content-Encoding==Content-Encoding");
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
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        java.lang.String str3 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "hi!==Content-Encoding==Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=hi!=hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding==Content-Encoding" + "'", str3.equals("Content-Encoding==Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!=Content-Encoding=hi!=hi!" + "'", str6.equals("hi!=Content-Encoding=hi!=hi!"));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "Content-Encoding==Content-Encoding", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=hi!", "hi!=Content-Encoding=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
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
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        java.lang.String str8 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!=Content-Encoding=" + "'", str8.equals("hi!=Content-Encoding="));
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.key();
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
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        java.lang.String str6 = keyVal5.toString();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.key();
        java.lang.String str10 = keyVal5.key();
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
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.lang.String str7 = keyVal2.key();
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
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.lang.String str5 = keyVal4.key();
        java.lang.String str6 = keyVal4.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding==");
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!==");
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
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding====Content-Encoding==Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding====Content-Encoding==Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
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
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
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
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "hi!=hi!=hi!", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=" + "'", str3.equals("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding="));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
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
        java.lang.String str9 = keyVal5.key();
        boolean boolean10 = keyVal5.hasInputStream();
        java.lang.String str11 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=");
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
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding====Content-Encoding==Content-Encoding=", "Content-Encoding==Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
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
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
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
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
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
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!");
        java.lang.String str8 = keyVal7.value();
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
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "hi!=Content-Encoding=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!=Content-Encoding=" + "'", str5.equals("hi!=Content-Encoding="));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
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
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
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
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding====hi!=Content-Encoding==hi!=Content-Encoding==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding===");
        java.lang.String str3 = keyVal2.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=" + "'", str3.equals("hi!="));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
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
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding==" + "'", str4.equals("Content-Encoding=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        boolean boolean10 = keyVal7.hasInputStream();
        java.lang.String str11 = keyVal7.key();
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
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!==");
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.key();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
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
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
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
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding==Content-Encoding");
        java.lang.String str8 = keyVal5.toString();
        java.io.InputStream inputStream9 = keyVal5.inputStream();
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
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!=hi!==");
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
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==Content-Encoding==Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==Content-Encoding==Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "Content-Encoding==Content-Encoding=Content-Encoding", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==", "Content-Encoding==hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
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
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
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
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        boolean boolean3 = keyVal2.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
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
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding==", "Content-Encoding=hi!=hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding===Content-Encoding=Content-Encoding", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding==");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding===Content-Encoding=Content-Encoding", "hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
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
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
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
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding==", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
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
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal2.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal8.inputStream();
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
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
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
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("Content-Encoding==Content-Encoding");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
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
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!==Content-Encoding==Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
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
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
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
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!", "Content-Encoding=hi!=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding====Content-Encoding==Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=Content-Encoding==hi!=Content-Encoding==");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
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
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=Content-Encoding=hi!=hi!");
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
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=", "Content-Encoding====Content-Encoding==Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==Content-Encoding", "Content-Encoding=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding==Content-Encoding=");
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
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!=Content-Encoding=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
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
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
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
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("Content-Encoding==hi!");
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
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
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
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!", "Content-Encoding=hi!=hi!=Content-Encoding=", inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
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
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("hi!=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding===hi!=Content-Encoding==hi!=Content-Encoding=", "hi!=Content-Encoding==hi!=Content-Encoding==Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

