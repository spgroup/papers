import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str1 = org.jsoup.helper.HttpConnection.encodeMimeName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA = "hi!";
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory0 = null;
        org.jsoup.helper.HttpConnection.Response.sslSocketFactory = sSLSocketFactory0;
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jsoup.helper.HttpConnection.CONTENT_ENCODING = "hi!";
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jsoup.helper.HttpConnection.CONTENT_TYPE = "hi!";
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = keyVal0.value("");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection1 = org.jsoup.helper.HttpConnection.Response.createConnection(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = keyVal0.inputStream(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data input stream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jsoup.helper.HttpConnection.Response.initUnSecureSSL();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = org.jsoup.helper.HttpConnection.HTTP_TEMP_REDIR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 307 + "'", int0 == 307);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jsoup.helper.HttpConnection.CONTENT_ENCODING = "";
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        javax.net.ssl.HostnameVerifier hostnameVerifier0 = org.jsoup.helper.HttpConnection.Response.getInsecureVerifier();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hostnameVerifier0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response1 = org.jsoup.helper.HttpConnection.Response.execute(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.value;
        java.lang.String str2 = keyVal0.toString();
        java.io.InputStream inputStream3 = null;
        keyVal0.stream = inputStream3;
        java.lang.Class<?> wildcardClass5 = keyVal0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null=null" + "'", str2.equals("null=null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.jsoup.helper.HttpConnection.CONTENT_TYPE = "";
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA = "";
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = keyVal0.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) 100;
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(pattern0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(pattern0.toString(), "application/\\w+\\+xml.*");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response2 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.jsoup.helper.HttpConnection.HTTP_TEMP_REDIR = (short) 10;
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.key();
        java.lang.String str2 = keyVal0.toString();
        boolean boolean3 = keyVal0.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null=null" + "'", str2.equals("null=null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.value;
        java.lang.String str2 = keyVal0.toString();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal0.inputStream(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data input stream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null=null" + "'", str2.equals("null=null"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.jsoup.helper.HttpConnection.CONTENT_TYPE = "null=null";
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA = "null=null";
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.value();
        java.io.InputStream inputStream2 = keyVal0.stream;
        java.lang.String str3 = keyVal0.value;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str5 = response1.header("");
        java.net.URL uRL6 = response1.url();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = keyVal0.value("");
        keyVal0.value = "null=null";
        java.lang.String str5 = keyVal0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null=null=null" + "'", str5.equals("null=null=null"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = keyVal0.value("null=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null=null" + "'", str1.equals("null=null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeHeader("null=null");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.value();
        java.lang.String str2 = keyVal0.value;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal0.value("null=null=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.header("", "null=null=null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = keyVal0.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null=null" + "'", str1.equals("null=null"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.value();
        java.lang.String str2 = keyVal0.value;
        keyVal0.value = "null=null";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null", inputStream2);
        java.lang.String str4 = keyVal3.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null=null" + "'", str4.equals("null=null"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request8 = response1.req;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeHeader("null=null");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        response1.charset = "null=null";
        org.jsoup.Connection.Method method8 = response1.method();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.helper.HttpConnection.Response.setupMultipartModeIfNeeded(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.CONTENT_ENCODING;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.cookie("null=null");
        response2.numRedirects = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        int int0 = org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.cookie("null=null");
        int int4 = response1.numRedirects;
        org.jsoup.Connection.Request request5 = response1.req;
        org.jsoup.Connection.Response response7 = response1.removeCookie("null=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        response1.charset = "null=null";
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeHeader("null=null");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeHeader("null=null");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = response1.req;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.CONTENT_TYPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "null=null" + "'", str0.equals("null=null"));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        org.jsoup.Connection.Response response5 = response1.removeCookie("null=null");
        response1.charset = "null=null=null";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str5 = response1.header("");
        java.lang.String str6 = response1.charset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }
}

