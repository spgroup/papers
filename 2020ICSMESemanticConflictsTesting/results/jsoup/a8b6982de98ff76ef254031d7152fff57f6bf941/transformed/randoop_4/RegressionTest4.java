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
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection5 = request0.data;
        int int6 = request0.maxBodySizeBytes;
        java.lang.String str7 = request0.postDataCharset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8" + "'", str7.equals("UTF-8"));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request9.data;
        org.jsoup.Connection.Request request12 = request9.removeCookie("null=Content-Encoding");
        java.net.Proxy proxy13 = request9.proxy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy13);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        java.lang.String str7 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request6);
        org.jsoup.Connection.Request request9 = request6.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request11 = request6.timeout((int) (byte) 0);
        org.jsoup.parser.Parser parser12 = request11.parser;
        org.jsoup.Connection.Request request15 = request11.cookie("Content-Encoding", "hi!=Content-Encoding=UTF-8");
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean18 = response17.executed;
        java.net.URL uRL19 = response17.url();
        int int20 = response17.statusCode;
        boolean boolean22 = response17.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response17.scanHeaders("Content-Encoding");
        response17.contentType = "";
        java.lang.String str27 = response17.charset();
        boolean boolean29 = response17.hasCookie("null=Content-Encoding");
        org.jsoup.Connection.Response response32 = response17.header("null=null", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response33 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request11, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("UTF-8", "Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.key;
        java.io.InputStream inputStream5 = null;
        keyVal3.stream = inputStream5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UTF-8" + "'", str4.equals("UTF-8"));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        int int6 = request0.maxBodySizeBytes;
        boolean boolean8 = request0.hasHeader("multipart/form-data");
        boolean boolean10 = request0.hasHeader("multipart/form-data");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = request0.scanHeaders("UTF-8");
        java.lang.String str13 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        int int14 = request0.maxBodySize();
        boolean boolean15 = request0.followRedirects();
        request0.ignoreHttpErrors = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3000 + "'", int5 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        java.lang.String str5 = response1.getHeaderCaseInsensitive("multipart/form-data");
        response1.contentType = "";
        java.lang.String str9 = response1.getHeaderCaseInsensitive("application/x-www-form-urlencoded=null=Content-Encoding=null=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str8 = keyVal7.key();
        keyVal7.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal11.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray14 = new org.jsoup.Connection.KeyVal[] { keyVal7, keyVal11 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList15 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList15, keyValArray14);
        org.jsoup.Connection connection17 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList15);
        org.jsoup.parser.Parser parser18 = null;
        org.jsoup.Connection connection19 = httpConnection0.parser(parser18);
        org.jsoup.Connection connection21 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser23 = null;
        org.jsoup.Connection connection24 = httpConnection22.parser(parser23);
        org.jsoup.Connection connection26 = httpConnection22.userAgent("hi!");
        org.jsoup.Connection connection28 = httpConnection22.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str30 = keyVal29.key();
        keyVal29.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal33.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray36 = new org.jsoup.Connection.KeyVal[] { keyVal29, keyVal33 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList37 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37, keyValArray36);
        org.jsoup.Connection connection39 = httpConnection22.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37);
        org.jsoup.helper.HttpConnection.Request request40 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser41 = request40.parser();
        org.jsoup.Connection connection42 = httpConnection22.parser(parser41);
        org.jsoup.Connection connection43 = httpConnection0.parser(parser41);
        org.jsoup.Connection.Request request44 = null;
        httpConnection0.req = request44;
        org.jsoup.helper.HttpConnection.Request request46 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean47 = request46.ignoreContentType;
        request46.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request52 = request46.proxy("hi!", (int) (short) 0);
        boolean boolean53 = request46.validateTSLCertificates;
        org.jsoup.parser.Parser parser54 = null;
        org.jsoup.helper.HttpConnection.Request request55 = request46.parser(parser54);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection56 = request55.data;
        httpConnection0.req = request55;
        org.jsoup.Connection.Request request58 = httpConnection0.request();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request7.data((org.jsoup.Connection.KeyVal) keyVal10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request7.headers();
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean14 = request13.ignoreContentType;
        request13.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request18 = request13.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser19 = request13.parser();
        request7.parser = parser19;
        request7.postDataCharset = "null=Content-Encoding";
        boolean boolean23 = request7.ignoreHttpErrors;
        request7.timeoutMilliseconds = (short) -1;
        org.jsoup.helper.HttpConnection.Request request27 = request7.timeout((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize(0);
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean8 = request7.ignoreContentType;
        request7.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request13 = request7.proxy("hi!", (int) (short) 0);
        boolean boolean14 = request7.validateTSLCertificates;
        org.jsoup.parser.Parser parser15 = null;
        org.jsoup.helper.HttpConnection.Request request16 = request7.parser(parser15);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection17 = request16.data;
        org.jsoup.Connection connection18 = httpConnection0.data(keyValCollection17);
        org.jsoup.Connection connection20 = httpConnection0.referrer("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        java.lang.String str10 = request0.header("application/x-www-form-urlencoded");
        request0.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response17 = response14.cookie("null=Content-Encoding", "multipart/form-data");
        int int18 = response14.statusCode();
        boolean boolean21 = response14.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.Connection.Response response23 = response14.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response26 = response14.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        java.lang.String str27 = response14.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        response1.statusMessage = "UTF-8";
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.cookie("UTF-8=multipart/form-data", "multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean9 = response8.executed;
        java.net.URL uRL10 = response8.url();
        boolean boolean11 = response8.executed;
        httpConnection0.res = response8;
        org.jsoup.Connection connection14 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        request15.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request19 = request15.ignoreContentType(true);
        java.net.Proxy proxy20 = request15.proxy();
        org.jsoup.helper.HttpConnection.Request request21 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean22 = request21.ignoreContentType;
        java.lang.String str23 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request21);
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Response response28 = response25.cookie("null=Content-Encoding", "multipart/form-data");
        int int29 = response25.statusCode();
        boolean boolean32 = response25.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        boolean boolean35 = response34.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response34.cookies();
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str39 = keyVal38.key();
        keyVal38.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal42 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal42.value = "Content-Encoding";
        java.lang.String str45 = keyVal42.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal46.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal49 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream50 = keyVal49.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal51 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream52 = keyVal51.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray53 = new org.jsoup.Connection.KeyVal[] { keyVal38, keyVal42, keyVal46, keyVal49, keyVal51 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList54 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54, keyValArray53);
        org.jsoup.Connection connection56 = httpConnection37.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54);
        org.jsoup.helper.HttpConnection.Request request57 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean58 = request57.ignoreContentType;
        request57.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request62 = request57.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal63 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request64 = request57.data((org.jsoup.Connection.KeyVal) keyVal63);
        org.jsoup.helper.HttpConnection.Request request65 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean66 = request65.ignoreContentType;
        request65.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request71 = request65.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy72 = request71.proxy;
        org.jsoup.helper.HttpConnection.Request request73 = request57.proxy(proxy72);
        org.jsoup.Connection.Method method74 = request73.method();
        org.jsoup.Connection connection75 = httpConnection37.method(method74);
        org.jsoup.Connection.Response response76 = response34.method(method74);
        org.jsoup.Connection.Response response77 = response25.method(method74);
        org.jsoup.Connection.Request request78 = request21.method(method74);
        org.jsoup.Connection.Request request79 = request15.method(method74);
        org.jsoup.Connection connection80 = httpConnection0.request(request79);
        org.jsoup.helper.HttpConnection.Response response81 = null;
        org.jsoup.helper.HttpConnection.Response response82 = new org.jsoup.helper.HttpConnection.Response(response81);
        boolean boolean83 = response82.executed;
        java.net.URL uRL84 = response82.url();
        org.jsoup.Connection.Response response87 = response82.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str88 = response82.contentType();
        java.lang.String str89 = response82.statusMessage;
        org.jsoup.Connection.Response response91 = response82.removeCookie("hi!=Content-Encoding");
        org.jsoup.Connection connection92 = httpConnection0.response((org.jsoup.Connection.Response) response82);
        java.util.Map<java.lang.String, java.lang.String> strMap93 = response82.cookies();
        org.jsoup.Connection.Request request94 = response82.req;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "null=Content-Encoding" + "'", str45.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request73);
        org.junit.Assert.assertTrue("'" + method74 + "' != '" + org.jsoup.Connection.Method.GET + "'", method74.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request94);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        java.lang.String str5 = request0.cookie("UTF-8");
        request0.parserDefined = true;
        request0.maxBodySizeBytes = 10;
        request0.postDataCharset = "hi!=Content-Encoding=UTF-8";
        boolean boolean12 = request0.followRedirects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        org.jsoup.parser.Parser parser2 = request0.parser();
        boolean boolean3 = request0.ignoreHttpErrors;
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request5 = request0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        java.lang.String str10 = request0.header("application/x-www-form-urlencoded");
        java.net.Proxy proxy11 = request0.proxy;
        java.lang.String str12 = request0.postDataCharset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "UTF-8" + "'", str12.equals("UTF-8"));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response1.headers();
        java.lang.String str4 = response1.contentType;
        org.jsoup.Connection.Response response6 = response1.removeHeader("null=Content-Encoding");
        java.lang.String str8 = response1.cookie("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response1.removeCookie("UTF-8=multipart/form-data");
        int int14 = response1.statusCode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean9 = response8.executed;
        java.net.URL uRL10 = response8.url();
        boolean boolean11 = response8.executed;
        httpConnection0.res = response8;
        org.jsoup.Connection connection15 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean18 = response17.executed;
        java.net.URL uRL19 = response17.url();
        boolean boolean20 = response17.executed;
        org.jsoup.Connection.Response response22 = response17.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request23 = response17.req;
        org.jsoup.Connection.Request request24 = null;
        response17.req = request24;
        org.jsoup.Connection connection26 = httpConnection0.response((org.jsoup.Connection.Response) response17);
        org.jsoup.Connection connection28 = httpConnection0.referrer("null=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        boolean boolean31 = response30.executed;
        java.net.URL uRL32 = response30.url();
        org.jsoup.Connection.Response response35 = response30.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str36 = response30.contentType();
        org.jsoup.Connection.Response response39 = response30.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        org.jsoup.Connection connection40 = httpConnection0.response(response39);
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser42 = null;
        org.jsoup.Connection connection43 = httpConnection41.parser(parser42);
        org.jsoup.Connection connection45 = httpConnection41.userAgent("hi!");
        org.jsoup.Connection connection47 = httpConnection41.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal48 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str49 = keyVal48.key();
        keyVal48.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal52 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal52.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray55 = new org.jsoup.Connection.KeyVal[] { keyVal48, keyVal52 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList56 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList56, keyValArray55);
        org.jsoup.Connection connection58 = httpConnection41.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList56);
        org.jsoup.Connection.Request request59 = httpConnection41.request();
        org.jsoup.Connection connection60 = httpConnection0.request(request59);
        org.jsoup.Connection connection62 = httpConnection0.referrer("hi!=Content-Encoding=UTF-8");
        org.jsoup.Connection.Request request63 = httpConnection0.req;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request63);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response1.headers();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str8 = response1.cookie("hi!=Content-Encoding=UTF-8=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.followRedirects(true);
        org.jsoup.parser.Parser parser12 = request0.parser();
        int int13 = request0.timeout();
        request0.ignoreHttpErrors = false;
        java.net.URL uRL16 = request0.url();
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean18 = request17.ignoreContentType;
        request17.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request22 = request17.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request24 = request17.data((org.jsoup.Connection.KeyVal) keyVal23);
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean26 = request25.ignoreContentType;
        request25.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request31 = request25.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy32 = request31.proxy;
        org.jsoup.helper.HttpConnection.Request request33 = request17.proxy(proxy32);
        org.jsoup.Connection.Request request35 = request33.removeCookie("hi!");
        java.net.URL uRL36 = request33.url();
        boolean boolean39 = request33.hasHeaderWithValue("null=application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request40 = new org.jsoup.helper.HttpConnection.Request();
        int int41 = request40.timeout();
        boolean boolean42 = request40.ignoreContentType;
        org.jsoup.Connection.Request request44 = request40.ignoreHttpErrors(false);
        java.lang.String str45 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request40);
        org.jsoup.Connection.Request request48 = request40.cookie("UTF-8", "multipart/form-data");
        org.jsoup.parser.Parser parser49 = request40.parser();
        boolean boolean50 = request40.ignoreContentType;
        org.jsoup.Connection.Request request52 = request40.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request53 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean54 = request53.ignoreContentType;
        request53.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request58 = request53.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal59 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request60 = request53.data((org.jsoup.Connection.KeyVal) keyVal59);
        org.jsoup.helper.HttpConnection.Request request61 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean62 = request61.ignoreContentType;
        request61.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request67 = request61.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy68 = request67.proxy;
        org.jsoup.helper.HttpConnection.Request request69 = request53.proxy(proxy68);
        request40.proxy = proxy68;
        java.lang.String str71 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request40);
        org.jsoup.parser.Parser parser72 = request40.parser();
        org.jsoup.helper.HttpConnection.Request request73 = request33.parser(parser72);
        org.jsoup.helper.HttpConnection.Request request74 = request0.parser(parser72);
        org.jsoup.helper.HttpConnection.Request request75 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean76 = request75.ignoreContentType;
        request75.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request80 = request75.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal81 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request82 = request75.data((org.jsoup.Connection.KeyVal) keyVal81);
        request82.followRedirects = false;
        java.net.Proxy proxy85 = request82.proxy();
        org.jsoup.Connection.Request request87 = request82.ignoreContentType(true);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection88 = request82.data();
        request74.data = keyValCollection88;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3000 + "'", int13 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3000 + "'", int41 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "UTF-8=multipart/form-data" + "'", str71.equals("UTF-8=multipart/form-data"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection88);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str11 = response1.cookie("multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        request12.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request16 = request12.ignoreContentType(true);
        java.net.Proxy proxy17 = request12.proxy();
        response1.req = request12;
        int int19 = response1.numRedirects;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = null;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        response3.numRedirects = '4';
        org.jsoup.Connection.Method method6 = response3.method();
        response3.statusCode = 1;
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean10 = request9.ignoreContentType;
        request9.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request14 = request9.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request16 = request9.data((org.jsoup.Connection.KeyVal) keyVal15);
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean18 = request17.ignoreContentType;
        request17.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request23 = request17.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy24 = request23.proxy;
        org.jsoup.helper.HttpConnection.Request request25 = request9.proxy(proxy24);
        org.jsoup.Connection.Method method26 = request25.method();
        org.jsoup.Connection.Response response27 = response3.method(method26);
        org.jsoup.Connection.Response response28 = response1.method(method26);
        int int29 = response1.statusCode;
        java.lang.String str30 = response1.statusMessage;
        java.lang.String str31 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry33 = response1.scanHeaders("null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + method26 + "' != '" + org.jsoup.Connection.Method.GET + "'", method26.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry33);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal1 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str2 = keyVal1.key();
        keyVal1.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal5.value = "Content-Encoding";
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal9.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream15 = keyVal14.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray16 = new org.jsoup.Connection.KeyVal[] { keyVal1, keyVal5, keyVal9, keyVal12, keyVal14 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList17 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList17, keyValArray16);
        org.jsoup.Connection connection19 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList17);
        org.jsoup.Connection connection22 = httpConnection0.header("hi!", "multipart/form-data");
        org.jsoup.Connection connection24 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        request25.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request29 = request25.ignoreContentType(true);
        int int30 = request25.timeoutMilliseconds;
        int int31 = request25.maxBodySizeBytes;
        boolean boolean33 = request25.hasHeader("multipart/form-data");
        boolean boolean35 = request25.hasHeader("multipart/form-data");
        boolean boolean36 = request25.validateTSLCertificates;
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser38 = null;
        org.jsoup.Connection connection39 = httpConnection37.parser(parser38);
        org.jsoup.Connection connection41 = httpConnection37.referrer("multipart/form-data");
        org.jsoup.Connection connection44 = httpConnection37.cookie("Content-Encoding", "");
        org.jsoup.Connection connection47 = httpConnection37.header("multipart/form-data", "multipart/form-data");
        org.jsoup.Connection connection49 = httpConnection37.maxBodySize(1048576);
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser51 = request50.parser();
        org.jsoup.Connection connection52 = httpConnection37.parser(parser51);
        org.jsoup.helper.HttpConnection.Request request53 = request25.parser(parser51);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection54 = request53.data;
        org.jsoup.Connection connection55 = httpConnection0.data(keyValCollection54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null=Content-Encoding" + "'", str8.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3000 + "'", int30 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1048576 + "'", int31 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection55);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        int int10 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser12 = null;
        org.jsoup.Connection connection13 = httpConnection11.parser(parser12);
        org.jsoup.Connection connection15 = httpConnection11.referrer("multipart/form-data");
        org.jsoup.Connection connection18 = httpConnection11.cookie("Content-Encoding", "");
        org.jsoup.Connection connection21 = httpConnection11.header("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean23 = request22.ignoreContentType;
        request22.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request27 = request22.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request29 = request22.data((org.jsoup.Connection.KeyVal) keyVal28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request36 = request30.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy37 = request36.proxy;
        org.jsoup.helper.HttpConnection.Request request38 = request22.proxy(proxy37);
        boolean boolean41 = request22.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        request22.ignoreContentType = false;
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser45 = null;
        org.jsoup.Connection connection46 = httpConnection44.parser(parser45);
        org.jsoup.Connection connection48 = httpConnection44.userAgent("hi!");
        org.jsoup.Connection connection50 = httpConnection44.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal51 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str52 = keyVal51.key();
        keyVal51.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal55 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal55.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray58 = new org.jsoup.Connection.KeyVal[] { keyVal51, keyVal55 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList59 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList59, keyValArray58);
        org.jsoup.Connection connection61 = httpConnection44.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList59);
        org.jsoup.parser.Parser parser62 = null;
        org.jsoup.Connection connection63 = httpConnection44.parser(parser62);
        org.jsoup.Connection connection65 = httpConnection44.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection66 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser67 = null;
        org.jsoup.Connection connection68 = httpConnection66.parser(parser67);
        org.jsoup.Connection connection70 = httpConnection66.userAgent("hi!");
        org.jsoup.Connection connection72 = httpConnection66.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal73 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str74 = keyVal73.key();
        keyVal73.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal77 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal77.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray80 = new org.jsoup.Connection.KeyVal[] { keyVal73, keyVal77 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList81 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList81, keyValArray80);
        org.jsoup.Connection connection83 = httpConnection66.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList81);
        org.jsoup.helper.HttpConnection.Request request84 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser85 = request84.parser();
        org.jsoup.Connection connection86 = httpConnection66.parser(parser85);
        org.jsoup.Connection connection87 = httpConnection44.parser(parser85);
        request22.parser = parser85;
        org.jsoup.Connection connection89 = httpConnection11.parser(parser85);
        request0.parser = parser85;
        org.jsoup.parser.Parser parser91 = request0.parser;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser91);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.io.InputStream inputStream4 = keyVal0.stream;
        java.io.InputStream inputStream5 = null;
        keyVal0.stream = inputStream5;
        java.lang.String str7 = keyVal0.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal0.key("null=null");
        java.lang.String str10 = keyVal0.value;
        boolean boolean11 = keyVal0.hasInputStream();
        java.lang.String str12 = keyVal0.value;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Content-Encoding" + "'", str10.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Content-Encoding" + "'", str12.equals("Content-Encoding"));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection1 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str3 = keyVal2.key();
        keyVal2.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal6.value = "Content-Encoding";
        java.lang.String str9 = keyVal6.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal10.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream14 = keyVal13.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream16 = keyVal15.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray17 = new org.jsoup.Connection.KeyVal[] { keyVal2, keyVal6, keyVal10, keyVal13, keyVal15 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList18 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList18, keyValArray17);
        org.jsoup.Connection connection20 = httpConnection1.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList18);
        request0.data = keyValList18;
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean23 = request22.ignoreContentType;
        request22.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request27 = request22.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request29 = request22.data((org.jsoup.Connection.KeyVal) keyVal28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request36 = request30.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy37 = request36.proxy;
        org.jsoup.helper.HttpConnection.Request request38 = request22.proxy(proxy37);
        org.jsoup.helper.HttpConnection.Request request39 = request0.proxy(proxy37);
        boolean boolean40 = request0.followRedirects();
        request0.maxBodySizeBytes = (short) 100;
        request0.ignoreHttpErrors = true;
        org.jsoup.parser.Parser parser45 = request0.parser;
        org.jsoup.helper.HttpConnection.Request request47 = request0.timeout(10);
        boolean boolean48 = request0.followRedirects;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null=Content-Encoding" + "'", str9.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean6 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.lang.String str8 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        int int5 = request0.maxBodySizeBytes;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal6.value = "Content-Encoding";
        java.lang.String str9 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("null=Content-Encoding");
        boolean boolean12 = keyVal11.hasInputStream();
        org.jsoup.helper.HttpConnection.Request request13 = request0.data((org.jsoup.Connection.KeyVal) keyVal11);
        org.jsoup.parser.Parser parser14 = request0.parser;
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean16 = request15.ignoreContentType;
        request15.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean20 = request19.ignoreContentType;
        request19.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request24 = request19.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request26 = request19.data((org.jsoup.Connection.KeyVal) keyVal25);
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean28 = request27.ignoreContentType;
        request27.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request33 = request27.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy34 = request33.proxy;
        org.jsoup.helper.HttpConnection.Request request35 = request19.proxy(proxy34);
        request35.ignoreHttpErrors = true;
        java.net.Proxy proxy38 = request35.proxy;
        request15.proxy = proxy38;
        org.jsoup.helper.HttpConnection.Request request40 = request0.proxy(proxy38);
        org.jsoup.Connection.Request request42 = request40.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request43 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean44 = request43.ignoreContentType;
        request43.ignoreContentType = true;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection47 = request43.data();
        org.jsoup.parser.Parser parser48 = request43.parser;
        org.jsoup.parser.Parser parser49 = request43.parser();
        request40.parser = parser49;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection51 = request40.data();
        java.lang.String str52 = request40.postDataCharset;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1048576 + "'", int5 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Content-Encoding" + "'", str9.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "UTF-8" + "'", str52.equals("UTF-8"));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        response1.statusMessage = "hi!";
        java.net.URL uRL7 = response1.url();
        int int8 = response1.statusCode;
        java.lang.String str10 = response1.cookie("null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        org.jsoup.Connection.Response response10 = response1.removeHeader("multipart/form-data");
        org.jsoup.Connection.Response response12 = response1.removeHeader("UTF-8");
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusMessage = "application/x-www-form-urlencoded";
        org.jsoup.Connection.Response response17 = response1.removeHeader("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response20 = response1.header("Content-Encoding", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str11 = response1.cookie("multipart/form-data");
        java.lang.String str13 = response1.header("multipart/form-data");
        response1.contentType = "UTF-8";
        response1.contentType = "hi!=Content-Encoding";
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String str1 = org.jsoup.helper.HttpConnection.encodeUrl("null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null=hi!" + "'", str1.equals("null=hi!"));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.key();
        keyVal0.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal0.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal0.key("hi!=Content-Encoding");
        java.io.InputStream inputStream8 = null;
        keyVal0.stream = inputStream8;
        java.io.InputStream inputStream10 = keyVal0.stream;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str6 = response1.cookie("hi!=Content-Encoding");
        java.lang.String str7 = response1.contentType();
        boolean boolean9 = response1.hasCookie("hi!=Content-Encoding=UTF-8=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        org.jsoup.Connection.Request request4 = request0.cookie("null=Content-Encoding", "hi!");
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser6 = null;
        org.jsoup.Connection connection7 = httpConnection5.parser(parser6);
        org.jsoup.Connection connection9 = httpConnection5.userAgent("hi!");
        org.jsoup.Connection connection11 = httpConnection5.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str13 = keyVal12.key();
        keyVal12.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal16.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray19 = new org.jsoup.Connection.KeyVal[] { keyVal12, keyVal16 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList20 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList20, keyValArray19);
        org.jsoup.Connection connection22 = httpConnection5.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList20);
        request0.data = keyValList20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = request0.scanHeaders("multipart/form-data");
        int int26 = request0.maxBodySizeBytes;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1048576 + "'", int26 == 1048576);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.followRedirects(true);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = request0.scanHeaders("hi!");
        org.jsoup.Connection.Request request15 = request0.maxBodySize(100);
        java.net.Proxy proxy16 = request0.proxy;
        boolean boolean18 = request0.hasCookie("UTF-8=multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str8 = keyVal7.key();
        keyVal7.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal11.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray14 = new org.jsoup.Connection.KeyVal[] { keyVal7, keyVal11 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList15 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList15, keyValArray14);
        org.jsoup.Connection connection17 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList15);
        org.jsoup.parser.Parser parser18 = null;
        org.jsoup.Connection connection19 = httpConnection0.parser(parser18);
        org.jsoup.Connection connection21 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser23 = null;
        org.jsoup.Connection connection24 = httpConnection22.parser(parser23);
        org.jsoup.Connection connection26 = httpConnection22.referrer("multipart/form-data");
        org.jsoup.Connection connection29 = httpConnection22.cookie("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response30 = null;
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response30);
        response31.numRedirects = '4';
        org.jsoup.Connection.Method method34 = response31.method();
        response31.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = response31.cookies();
        org.jsoup.Connection connection38 = httpConnection22.cookies(strMap37);
        org.jsoup.Connection connection39 = httpConnection0.data(strMap37);
        org.jsoup.helper.HttpConnection.Request request40 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean41 = request40.ignoreContentType;
        request40.ignoreContentType = true;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection44 = request40.data();
        org.jsoup.Connection connection45 = httpConnection0.data(keyValCollection44);
        org.jsoup.helper.HttpConnection.Response response46 = null;
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response(response46);
        org.jsoup.Connection.Response response50 = response47.cookie("null=Content-Encoding", "multipart/form-data");
        org.jsoup.Connection.Response response52 = response47.removeHeader("multipart/form-data");
        response47.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response(response47);
        java.nio.ByteBuffer byteBuffer56 = response47.byteData;
        boolean boolean58 = response47.hasCookie("application/x-www-form-urlencoded");
        org.jsoup.Connection connection59 = httpConnection0.response((org.jsoup.Connection.Response) response47);
        org.jsoup.Connection connection62 = httpConnection0.data("hi!=Content-Encoding", "UTF-8");
        org.jsoup.Connection connection64 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Request request65 = null;
        httpConnection0.req = request65;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteBuffer56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection64);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str8 = keyVal7.key();
        keyVal7.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal11.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray14 = new org.jsoup.Connection.KeyVal[] { keyVal7, keyVal11 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList15 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList15, keyValArray14);
        org.jsoup.Connection connection17 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList15);
        org.jsoup.parser.Parser parser18 = null;
        org.jsoup.Connection connection19 = httpConnection0.parser(parser18);
        org.jsoup.Connection connection21 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser23 = null;
        org.jsoup.Connection connection24 = httpConnection22.parser(parser23);
        org.jsoup.Connection connection26 = httpConnection22.referrer("multipart/form-data");
        org.jsoup.Connection connection29 = httpConnection22.cookie("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response30 = null;
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response30);
        response31.numRedirects = '4';
        org.jsoup.Connection.Method method34 = response31.method();
        response31.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = response31.cookies();
        org.jsoup.Connection connection38 = httpConnection22.cookies(strMap37);
        org.jsoup.Connection connection39 = httpConnection0.data(strMap37);
        org.jsoup.helper.HttpConnection.Response response40 = null;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.Connection.Response response44 = response41.cookie("null=Content-Encoding", "multipart/form-data");
        int int45 = response41.statusCode();
        boolean boolean48 = response41.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.Connection.Response response50 = response41.removeCookie("Content-Encoding");
        org.jsoup.Connection connection51 = httpConnection0.response(response50);
        org.jsoup.helper.HttpConnection.Response response52 = null;
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response52);
        response53.numRedirects = '4';
        org.jsoup.Connection.Method method56 = response53.method();
        response53.statusCode = 1;
        org.jsoup.helper.HttpConnection.Request request59 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean60 = request59.ignoreContentType;
        request59.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request64 = request59.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal65 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request66 = request59.data((org.jsoup.Connection.KeyVal) keyVal65);
        org.jsoup.helper.HttpConnection.Request request67 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean68 = request67.ignoreContentType;
        request67.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request73 = request67.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy74 = request73.proxy;
        org.jsoup.helper.HttpConnection.Request request75 = request59.proxy(proxy74);
        org.jsoup.Connection.Method method76 = request75.method();
        org.jsoup.Connection.Response response77 = response53.method(method76);
        org.jsoup.Connection connection78 = httpConnection0.response(response77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request75);
        org.junit.Assert.assertTrue("'" + method76 + "' != '" + org.jsoup.Connection.Method.GET + "'", method76.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection78);
    }
}

