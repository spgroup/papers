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
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean21 = request20.ignoreContentType;
        request20.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request25 = request20.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request27 = request20.data((org.jsoup.Connection.KeyVal) keyVal26);
        org.jsoup.helper.HttpConnection.Request request28 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean29 = request28.ignoreContentType;
        request28.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request34 = request28.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy35 = request34.proxy;
        org.jsoup.helper.HttpConnection.Request request36 = request20.proxy(proxy35);
        org.jsoup.Connection.Method method37 = request36.method();
        org.jsoup.Connection connection38 = httpConnection0.method(method37);
        org.jsoup.Connection.Response response39 = httpConnection0.response();
        org.jsoup.Connection connection41 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection43 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection.Request request44 = httpConnection0.req;
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertTrue("'" + method37 + "' != '" + org.jsoup.Connection.Method.GET + "'", method37.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request44);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean7 = response6.executed;
        java.net.URL uRL8 = response6.url();
        boolean boolean9 = response6.executed;
        response6.executed = false;
        httpConnection0.res = response6;
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection0.proxy(proxy13);
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.numRedirects = '4';
        org.jsoup.Connection.Method method19 = response16.method();
        boolean boolean21 = response16.hasHeader("hi!");
        org.jsoup.Connection.Response response23 = response16.removeHeader("null=Content-Encoding");
        org.jsoup.Connection connection24 = httpConnection0.response(response23);
        org.jsoup.Connection connection26 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection connection28 = httpConnection0.referrer("null=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.String str13 = response8.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response8.cookies();
        org.jsoup.Connection.Response response17 = response8.header("UTF-8", "application/x-www-form-urlencoded");
        java.lang.String str19 = response8.cookie("hi!=Content-Encoding=UTF-8");
        response8.statusMessage = "Content-Encoding";
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
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=UTF-8", "");
        keyVal2.key = "multipart/form-data";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) '#');
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.Connection connection9 = httpConnection7.parser(parser8);
        org.jsoup.Connection connection11 = httpConnection7.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean14 = response13.executed;
        java.net.URL uRL15 = response13.url();
        boolean boolean16 = response13.executed;
        response13.executed = false;
        httpConnection7.res = response13;
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        int int21 = request20.timeout();
        request20.parserDefined = true;
        request20.maxBodySizeBytes = (-1);
        httpConnection7.req = request20;
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser28 = null;
        org.jsoup.Connection connection29 = httpConnection27.parser(parser28);
        org.jsoup.Connection connection31 = httpConnection27.userAgent("hi!");
        org.jsoup.Connection connection33 = httpConnection27.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str35 = keyVal34.key();
        keyVal34.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal38.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray41 = new org.jsoup.Connection.KeyVal[] { keyVal34, keyVal38 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList42 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList42, keyValArray41);
        org.jsoup.Connection connection44 = httpConnection27.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList42);
        org.jsoup.helper.HttpConnection.Request request45 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser46 = request45.parser();
        org.jsoup.Connection connection47 = httpConnection27.parser(parser46);
        java.io.InputStream inputStream50 = null;
        org.jsoup.Connection connection51 = httpConnection27.data("hi!", "application/x-www-form-urlencoded", inputStream50);
        org.jsoup.Connection connection53 = httpConnection27.userAgent("hi!");
        org.jsoup.helper.HttpConnection.Request request54 = new org.jsoup.helper.HttpConnection.Request();
        int int55 = request54.timeout();
        request54.parserDefined = true;
        request54.maxBodySizeBytes = (-1);
        org.jsoup.helper.HttpConnection.Request request60 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean61 = request60.ignoreContentType;
        request60.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request65 = request60.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal66 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request67 = request60.data((org.jsoup.Connection.KeyVal) keyVal66);
        org.jsoup.helper.HttpConnection.Request request68 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean69 = request68.ignoreContentType;
        request68.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request74 = request68.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy75 = request74.proxy;
        org.jsoup.helper.HttpConnection.Request request76 = request60.proxy(proxy75);
        request54.proxy = proxy75;
        org.jsoup.Connection connection78 = httpConnection27.proxy(proxy75);
        org.jsoup.Connection connection79 = httpConnection7.proxy(proxy75);
        org.jsoup.helper.HttpConnection.Request request80 = request0.proxy(proxy75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3000 + "'", int21 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3000 + "'", int55 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request80);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = 1;
        java.net.URL uRL7 = response1.url();
        boolean boolean10 = response1.hasHeaderWithValue("multipart/form-data", "null=multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.lang.String str12 = response1.contentType();
        response1.charset = "hi!";
        response1.statusCode = '4';
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.Connection.Response response19 = response1.removeCookie("null=null=Content-Encoding");
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
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        java.lang.String str6 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal7.value = "Content-Encoding";
        java.lang.String str10 = keyVal7.toString();
        java.io.InputStream inputStream11 = keyVal7.stream;
        java.io.InputStream inputStream12 = keyVal7.stream;
        org.jsoup.helper.HttpConnection.Request request13 = request0.data((org.jsoup.Connection.KeyVal) keyVal7);
        request13.followRedirects = false;
        request13.postDataCharset = "";
        org.jsoup.Connection.Request request19 = request13.maxBodySize((int) (short) 0);
        request13.parserDefined = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3000 + "'", int5 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null=Content-Encoding" + "'", str10.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Response response16 = response1.removeHeader("application/x-www-form-urlencoded=application/x-www-form-urlencoded");
        int int17 = response1.numRedirects;
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
        org.junit.Assert.assertNotNull(response12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean19 = response18.executed;
        java.net.URL uRL20 = response18.url();
        int int21 = response18.statusCode;
        org.jsoup.Connection.Response response24 = response18.header("null=Content-Encoding", "null=Content-Encoding");
        java.lang.String str26 = response18.getHeaderCaseInsensitive("");
        response18.executed = false;
        java.lang.String str30 = response18.cookie("hi!=Content-Encoding");
        httpConnection0.res = response18;
        org.jsoup.Connection connection33 = httpConnection0.timeout(100);
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
        org.junit.Assert.assertNotNull(connection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser4 = null;
        org.jsoup.Connection connection5 = httpConnection3.parser(parser4);
        org.jsoup.Connection connection7 = httpConnection3.referrer("multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection3.cookie("Content-Encoding", "");
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser12 = null;
        org.jsoup.Connection connection13 = httpConnection11.parser(parser12);
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean16 = response15.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response15.headers();
        org.jsoup.Connection connection18 = httpConnection11.data(strMap17);
        org.jsoup.Connection connection19 = httpConnection3.cookies(strMap17);
        org.jsoup.Connection connection20 = httpConnection0.cookies(strMap17);
        org.jsoup.Connection connection22 = httpConnection0.referrer("hi!=Content-Encoding");
        java.io.InputStream inputStream25 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("Content-Encoding=hi!", "null=multipart/form-data", inputStream25);
        org.jsoup.Connection connection28 = httpConnection0.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean30 = request29.ignoreContentType;
        request29.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request34 = request29.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request36 = request29.data((org.jsoup.Connection.KeyVal) keyVal35);
        org.jsoup.helper.HttpConnection.Request request37 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean38 = request37.ignoreContentType;
        request37.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request43 = request37.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy44 = request43.proxy;
        org.jsoup.helper.HttpConnection.Request request45 = request29.proxy(proxy44);
        boolean boolean48 = request29.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal51 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request52 = request29.data((org.jsoup.Connection.KeyVal) keyVal51);
        boolean boolean53 = request29.followRedirects;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection54 = request29.data();
        org.jsoup.Connection connection55 = httpConnection0.data(keyValCollection54);
        org.jsoup.Connection connection58 = httpConnection0.data("null=hi!", "Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection58);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.key();
        keyVal0.key = "Content-Encoding";
        boolean boolean4 = keyVal0.hasInputStream();
        keyVal0.value = "null=null=Content-Encoding";
        java.io.InputStream inputStream7 = keyVal0.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        org.jsoup.Connection.Request request7 = request0.ignoreHttpErrors(false);
        boolean boolean10 = request0.hasHeaderWithValue("null=null", "UTF-8=multipart/form-data");
        request0.parserDefined = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean8 = response1.hasHeaderWithValue("multipart/form-data", "");
        java.net.URL uRL9 = response1.url();
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean11 = request10.ignoreContentType;
        request10.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request16 = request10.proxy("hi!", (int) (short) 0);
        request10.validateTSLCertificates = false;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal19.value = "Content-Encoding";
        java.lang.String str22 = keyVal19.key();
        java.io.InputStream inputStream23 = keyVal19.stream;
        org.jsoup.helper.HttpConnection.Request request24 = request10.data((org.jsoup.Connection.KeyVal) keyVal19);
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean26 = request25.ignoreContentType;
        request25.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request30 = request25.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser31 = request25.parser();
        request24.parser = parser31;
        response1.req = request24;
        java.net.URL uRL34 = response1.url();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL34);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Response response5 = response1.cookie("application/x-www-form-urlencoded", "");
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("multipart/form-data");
        org.jsoup.Connection.Response response12 = response1.cookie("null=Content-Encoding", "UTF-8=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean8 = response1.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.Connection.Response response10 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response13 = response1.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("UTF-8");
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        int int17 = request16.timeout();
        boolean boolean18 = request16.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request20 = request16.timeout(0);
        boolean boolean22 = request20.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection23 = request20.data();
        request20.postDataCharset = "";
        org.jsoup.Connection.Method method26 = request20.method();
        org.jsoup.Connection.Response response27 = response1.method(method26);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3000 + "'", int17 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection23);
        org.junit.Assert.assertTrue("'" + method26 + "' != '" + org.jsoup.Connection.Method.GET + "'", method26.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.maxBodySize(52);
        boolean boolean12 = request0.ignoreHttpErrors();
        boolean boolean14 = request0.hasCookie("UTF-8=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request16 = request0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(false);
        request0.validateTLSCertificates(true);
        int int7 = request0.timeoutMilliseconds;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request0.cookies();
        org.jsoup.Connection.Request request10 = request0.ignoreContentType(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3000 + "'", int7 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request10);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        response1.statusMessage = "UTF-8";
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        response1.contentType = "UTF-8=multipart/form-data";
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
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        response1.statusMessage = "UTF-8";
        org.jsoup.Connection.Response response11 = response1.removeCookie("null=Content-Encoding");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response15 = response1.header("hi!=Content-Encoding=UTF-8=null", "UTF-8");
        java.lang.String str17 = response1.header("multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean8 = response1.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.Connection.Response response10 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response13 = response1.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        java.lang.String str15 = response1.cookie("application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str18 = response1.cookie("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response20 = response1.removeHeader("null=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "multipart/form-data" + "'", str15.equals("multipart/form-data"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "multipart/form-data" + "'", str18.equals("multipart/form-data"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        int int5 = request0.maxBodySizeBytes;
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean7 = request6.ignoreContentType;
        request6.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request11 = request6.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request13 = request6.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean15 = request14.ignoreContentType;
        request14.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request20 = request14.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy21 = request20.proxy;
        org.jsoup.helper.HttpConnection.Request request22 = request6.proxy(proxy21);
        boolean boolean25 = request6.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        request6.ignoreContentType = false;
        org.jsoup.parser.Parser parser28 = request6.parser();
        request0.parser = parser28;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection30 = request0.data();
        java.net.Proxy proxy31 = request0.proxy();
        org.jsoup.helper.HttpConnection.Response response32 = null;
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        boolean boolean34 = response33.executed;
        java.net.URL uRL35 = response33.url();
        int int36 = response33.statusCode;
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response38 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1048576 + "'", int5 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.followRedirects(true);
        request0.ignoreHttpErrors = true;
        org.jsoup.Connection.Request request15 = request0.removeHeader("hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response7 = response1.removeHeader("UTF-8");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("application/x-www-form-urlencoded=null=Content-Encoding");
        boolean boolean10 = response1.executed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        org.jsoup.Connection.Response response10 = response1.removeHeader("multipart/form-data");
        response1.contentType = "application/x-www-form-urlencoded";
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean14 = request13.ignoreContentType;
        request13.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request19 = request13.proxy("hi!", (int) (short) 0);
        org.jsoup.Connection.Request request21 = request19.followRedirects(true);
        response1.req = request19;
        org.jsoup.Connection.Response response24 = response1.removeCookie("null=null");
        boolean boolean27 = response1.hasHeaderWithValue("null=application/x-www-form-urlencoded", "multipart/form-data");
        java.lang.String str28 = response1.charset;
        response1.executed = false;
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.ignoreContentType = true;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection4 = request0.data();
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean6 = request5.ignoreContentType;
        request5.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request10 = request5.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request12 = request5.data((org.jsoup.Connection.KeyVal) keyVal11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request12.data((org.jsoup.Connection.KeyVal) keyVal15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = request12.headers();
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean19 = request18.ignoreContentType;
        request18.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request23 = request18.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser24 = request18.parser();
        request12.parser = parser24;
        request0.parser = parser24;
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        int int28 = request27.timeout();
        boolean boolean29 = request27.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request31 = request27.timeout(0);
        java.net.Proxy proxy32 = request27.proxy;
        java.lang.String str34 = request27.header("hi!");
        boolean boolean35 = request27.parserDefined;
        org.jsoup.parser.Parser parser36 = request27.parser();
        org.jsoup.helper.HttpConnection.Request request37 = request0.parser(parser36);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection38 = request37.data;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3000 + "'", int28 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection38);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        int int26 = request0.maxBodySize();
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost((org.jsoup.Connection.Request) request0, outputStream27, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.String str13 = response8.charset();
        boolean boolean14 = response8.executed;
        org.jsoup.Connection.Response response17 = response8.cookie("hi!", "hi!=Content-Encoding");
        org.jsoup.Connection.Request request18 = response8.req;
        org.jsoup.Connection.Request request19 = response8.req;
        java.lang.String str21 = response8.header("null=application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response8.headers();
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
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("null=multipart/form-data");
        int int6 = response1.statusCode();
        boolean boolean7 = response1.executed;
        org.jsoup.Connection.Response response10 = response1.header("UTF-8=multipart/form-data", "Content-Encoding=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser19 = request18.parser();
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("hi!", "application/x-www-form-urlencoded", inputStream23);
        org.jsoup.Connection connection26 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection29 = httpConnection0.header("application/x-www-form-urlencoded=null=Content-Encoding", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection httpConnection30 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser31 = null;
        org.jsoup.Connection connection32 = httpConnection30.parser(parser31);
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        boolean boolean35 = response34.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response34.headers();
        org.jsoup.Connection connection37 = httpConnection30.data(strMap36);
        org.jsoup.Connection connection39 = httpConnection30.ignoreContentType(false);
        org.jsoup.Connection connection41 = httpConnection30.referrer("hi!=Content-Encoding");
        java.lang.String[] strArray46 = new java.lang.String[] { "null=Content-Encoding", "", "UTF-8", "null=Content-Encoding" };
        org.jsoup.Connection connection47 = httpConnection30.data(strArray46);
        org.jsoup.Connection connection48 = httpConnection0.data(strArray46);
        org.jsoup.Connection.Response response49 = httpConnection0.response();
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
        org.junit.Assert.assertNotNull(parser19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response49);
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
        response1.statusMessage = "hi!";
        java.net.URL uRL7 = response1.url();
        int int8 = response1.statusCode;
        response1.contentType = "UTF-8";
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
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.jsoup.Connection.Response response20 = httpConnection0.res;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.url("null=null=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: null=null=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request6.parserDefined = false;
        java.lang.String str10 = request6.header("null=null=Content-Encoding");
        java.lang.String str12 = request6.cookie("null=application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request14 = request6.postDataCharset("application/x-www-form-urlencoded=null=Content-Encoding=null=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded=null=Content-Encoding=null=Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        java.lang.String str7 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request6);
        org.jsoup.Connection.Request request9 = request6.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request11 = request6.timeout((int) (byte) 0);
        boolean boolean14 = request11.hasHeaderWithValue("null=application/x-www-form-urlencoded", "null=application/x-www-form-urlencoded");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        java.lang.String str6 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal7.value = "Content-Encoding";
        java.lang.String str10 = keyVal7.toString();
        java.io.InputStream inputStream11 = keyVal7.stream;
        java.io.InputStream inputStream12 = keyVal7.stream;
        org.jsoup.helper.HttpConnection.Request request13 = request0.data((org.jsoup.Connection.KeyVal) keyVal7);
        boolean boolean15 = request13.hasHeader("application/x-www-form-urlencoded=application/x-www-form-urlencoded");
        boolean boolean17 = request13.hasHeader("Content-Encoding=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3000 + "'", int5 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null=Content-Encoding" + "'", str10.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean9 = request8.ignoreContentType;
        request8.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request14 = request8.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy15 = request14.proxy;
        org.jsoup.helper.HttpConnection.Request request16 = request0.proxy(proxy15);
        request16.ignoreHttpErrors = true;
        java.net.Proxy proxy19 = request16.proxy;
        org.jsoup.Connection.Request request21 = request16.removeHeader("application/x-www-form-urlencoded=null=Content-Encoding");
        request16.followRedirects = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request21);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean9 = request8.ignoreContentType;
        request8.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request14 = request8.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy15 = request14.proxy;
        org.jsoup.helper.HttpConnection.Request request16 = request0.proxy(proxy15);
        org.jsoup.Connection.Request request18 = request16.removeCookie("hi!");
        java.net.URL uRL19 = request16.url();
        boolean boolean22 = request16.hasHeaderWithValue("null=application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request23 = new org.jsoup.helper.HttpConnection.Request();
        int int24 = request23.timeout();
        boolean boolean25 = request23.ignoreContentType;
        org.jsoup.Connection.Request request27 = request23.ignoreHttpErrors(false);
        java.lang.String str28 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request23);
        org.jsoup.Connection.Request request31 = request23.cookie("UTF-8", "multipart/form-data");
        org.jsoup.parser.Parser parser32 = request23.parser();
        boolean boolean33 = request23.ignoreContentType;
        org.jsoup.Connection.Request request35 = request23.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean37 = request36.ignoreContentType;
        request36.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request41 = request36.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal42 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request43 = request36.data((org.jsoup.Connection.KeyVal) keyVal42);
        org.jsoup.helper.HttpConnection.Request request44 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean45 = request44.ignoreContentType;
        request44.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request50 = request44.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy51 = request50.proxy;
        org.jsoup.helper.HttpConnection.Request request52 = request36.proxy(proxy51);
        request23.proxy = proxy51;
        java.lang.String str54 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request23);
        org.jsoup.parser.Parser parser55 = request23.parser();
        org.jsoup.helper.HttpConnection.Request request56 = request16.parser(parser55);
        org.jsoup.Connection.Request request58 = request16.ignoreContentType(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3000 + "'", int24 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "UTF-8=multipart/form-data" + "'", str54.equals("UTF-8=multipart/form-data"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        java.net.Proxy proxy5 = request0.proxy;
        java.lang.String str7 = request0.header("hi!");
        boolean boolean8 = request0.parserDefined;
        java.lang.String str9 = request0.postDataCharset;
        boolean boolean10 = request0.ignoreContentType();
        request0.validateTSLCertificates = true;
        request0.parserDefined = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTF-8" + "'", str9.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.helper.HttpConnection.CONTENT_ENCODING = "Content-Encoding";
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("null=application/x-www-form-urlencoded", "null=multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null=application/x-www-form-urlencoded=null=multipart/form-data" + "'", str4.equals("null=application/x-www-form-urlencoded=null=multipart/form-data"));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        int int40 = request39.timeoutMilliseconds;
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal41.value = "Content-Encoding";
        java.lang.String str44 = keyVal41.key();
        java.io.InputStream inputStream45 = keyVal41.stream;
        java.io.InputStream inputStream46 = null;
        keyVal41.stream = inputStream46;
        java.lang.String str48 = keyVal41.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = keyVal41.key("null=null");
        java.io.InputStream inputStream51 = keyVal41.inputStream();
        org.jsoup.helper.HttpConnection.Request request52 = request39.data((org.jsoup.Connection.KeyVal) keyVal41);
        org.jsoup.helper.HttpConnection.KeyVal keyVal54 = keyVal41.key("UTF-8");
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3000 + "'", int40 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal54);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.header("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        boolean boolean33 = response1.hasHeaderWithValue("hi!", "Content-Encoding");
        response1.statusMessage = "application/x-www-form-urlencoded=application/x-www-form-urlencoded";
        java.lang.String str37 = response1.header("UTF-8");
        java.lang.String str38 = response1.contentType;
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "UTF-8", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        java.lang.String str2 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        org.jsoup.helper.HttpConnection.Response response3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response7 = response4.cookie("null=Content-Encoding", "multipart/form-data");
        int int8 = response4.statusCode();
        boolean boolean11 = response4.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean14 = response13.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response13.cookies();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str18 = keyVal17.key();
        keyVal17.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal21.value = "Content-Encoding";
        java.lang.String str24 = keyVal21.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal25.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream29 = keyVal28.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal30 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream31 = keyVal30.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray32 = new org.jsoup.Connection.KeyVal[] { keyVal17, keyVal21, keyVal25, keyVal28, keyVal30 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList33 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList33, keyValArray32);
        org.jsoup.Connection connection35 = httpConnection16.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList33);
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean37 = request36.ignoreContentType;
        request36.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request41 = request36.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal42 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request43 = request36.data((org.jsoup.Connection.KeyVal) keyVal42);
        org.jsoup.helper.HttpConnection.Request request44 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean45 = request44.ignoreContentType;
        request44.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request50 = request44.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy51 = request50.proxy;
        org.jsoup.helper.HttpConnection.Request request52 = request36.proxy(proxy51);
        org.jsoup.Connection.Method method53 = request52.method();
        org.jsoup.Connection connection54 = httpConnection16.method(method53);
        org.jsoup.Connection.Response response55 = response13.method(method53);
        org.jsoup.Connection.Response response56 = response4.method(method53);
        org.jsoup.Connection.Request request57 = request0.method(method53);
        boolean boolean58 = request0.ignoreContentType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null=Content-Encoding" + "'", str24.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertTrue("'" + method53 + "' != '" + org.jsoup.Connection.Method.GET + "'", method53.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("null=Content-Encoding");
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str12 = response1.cookie("hi!=Content-Encoding=UTF-8=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.net.Proxy proxy22 = null;
        org.jsoup.Connection connection23 = httpConnection0.proxy(proxy22);
        org.jsoup.Connection.Response response24 = httpConnection0.response();
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        int int26 = request25.timeout();
        boolean boolean27 = request25.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request29 = request25.timeout(0);
        boolean boolean31 = request29.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection32 = request29.data();
        org.jsoup.Connection connection33 = httpConnection0.data(keyValCollection32);
        org.jsoup.Connection connection35 = httpConnection0.timeout((int) (byte) 100);
        org.jsoup.helper.HttpConnection.Response response36 = null;
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response36);
        org.jsoup.Connection.Response response40 = response37.cookie("null=Content-Encoding", "multipart/form-data");
        int int41 = response37.statusCode();
        boolean boolean44 = response37.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.Connection.Response response46 = response37.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response49 = response37.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        java.lang.String str51 = response37.cookie("application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = response37.cookies();
        org.jsoup.Connection connection53 = httpConnection0.response((org.jsoup.Connection.Response) response37);
        org.jsoup.Connection connection55 = httpConnection0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.Request request56 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean57 = request56.ignoreContentType;
        request56.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request62 = request56.proxy("hi!", (int) (short) 0);
        boolean boolean63 = request56.validateTSLCertificates;
        org.jsoup.parser.Parser parser64 = null;
        org.jsoup.helper.HttpConnection.Request request65 = request56.parser(parser64);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection66 = request65.data;
        httpConnection0.req = request65;
        org.jsoup.Connection connection69 = httpConnection0.maxBodySize(0);
        org.jsoup.Connection connection71 = httpConnection0.userAgent("hi!=Content-Encoding");
        org.jsoup.Connection connection74 = httpConnection0.cookie("null=application/x-www-form-urlencoded", "hi!");
        org.jsoup.helper.HttpConnection.Response response75 = null;
        org.jsoup.helper.HttpConnection.Response response76 = new org.jsoup.helper.HttpConnection.Response(response75);
        org.jsoup.Connection.Response response79 = response76.cookie("null=Content-Encoding", "multipart/form-data");
        int int80 = response76.statusCode();
        boolean boolean81 = response76.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap82 = response76.cookies();
        java.lang.String str83 = response76.contentType;
        org.jsoup.helper.HttpConnection.Response response84 = new org.jsoup.helper.HttpConnection.Response(response76);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = response76.cookies();
        java.lang.String str86 = response76.statusMessage();
        org.jsoup.Connection.Method method87 = response76.method();
        httpConnection0.res = response76;
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
        org.junit.Assert.assertNotNull(connection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3000 + "'", int26 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "multipart/form-data" + "'", str51.equals("multipart/form-data"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method87);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        java.net.Proxy proxy2 = request0.proxy();
        request0.timeoutMilliseconds = (byte) 10;
        org.jsoup.Connection.Request request6 = request0.ignoreHttpErrors(true);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request8 = request0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean4 = request3.ignoreContentType;
        request3.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request8 = request3.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request10 = request3.data((org.jsoup.Connection.KeyVal) keyVal9);
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean12 = request11.ignoreContentType;
        request11.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request17 = request11.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy18 = request17.proxy;
        org.jsoup.helper.HttpConnection.Request request19 = request3.proxy(proxy18);
        boolean boolean22 = request3.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request26 = request3.data((org.jsoup.Connection.KeyVal) keyVal25);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = request26.cookies();
        org.jsoup.Connection connection28 = httpConnection0.request((org.jsoup.Connection.Request) request26);
        java.lang.String str29 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request26);
        org.jsoup.Connection.Request request31 = request26.ignoreContentType(true);
        java.net.Proxy proxy32 = null;
        org.jsoup.helper.HttpConnection.Request request33 = request26.proxy(proxy32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request35 = request33.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request33);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreHttpErrors;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        java.lang.String str4 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.cookie("application/x-www-form-urlencoded", "");
        java.lang.String str8 = response1.charset;
        org.jsoup.Connection.Response response11 = response1.cookie("Content-Encoding", "null=application/x-www-form-urlencoded");
        org.jsoup.Connection.Request request12 = response1.req;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean7 = response6.executed;
        java.net.URL uRL8 = response6.url();
        boolean boolean9 = response6.executed;
        response6.executed = false;
        httpConnection0.res = response6;
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection0.proxy(proxy13);
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.numRedirects = '4';
        org.jsoup.Connection.Method method19 = response16.method();
        boolean boolean21 = response16.hasHeader("hi!");
        org.jsoup.Connection.Response response23 = response16.removeHeader("null=Content-Encoding");
        org.jsoup.Connection connection24 = httpConnection0.response(response23);
        org.jsoup.Connection connection26 = httpConnection0.validateTLSCertificates(false);
        org.jsoup.Connection connection28 = httpConnection0.userAgent("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request7.data((org.jsoup.Connection.KeyVal) keyVal10);
        boolean boolean12 = request7.validateTLSCertificates();
        org.jsoup.helper.HttpConnection.Request request14 = request7.timeout((int) 'a');
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = request14.scanHeaders("hi!");
        org.jsoup.Connection.Request request18 = request14.followRedirects(true);
        boolean boolean19 = request14.ignoreContentType();
        boolean boolean20 = request14.followRedirects();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.followRedirects(true);
        org.jsoup.parser.Parser parser12 = request0.parser();
        int int13 = request0.maxBodySize();
        int int14 = request0.maxBodySize();
        boolean boolean16 = request0.hasHeader("null=application/x-www-form-urlencoded");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response1.headers();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response1.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection7 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.Connection connection9 = httpConnection0.maxBodySize(0);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.numRedirects = '4';
        org.jsoup.Connection.Method method14 = response11.method();
        response11.statusCode = 1;
        java.net.URL uRL17 = response11.url();
        org.jsoup.Connection.Request request18 = response11.req;
        org.jsoup.Connection.Response response20 = response11.removeCookie("multipart/form-data");
        org.jsoup.Connection connection21 = httpConnection0.response((org.jsoup.Connection.Response) response11);
        java.lang.String str22 = response11.statusMessage;
        java.lang.String str24 = response11.header("UTF-8");
        java.net.URL uRL25 = response11.url();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL25);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        request39.followRedirects = false;
        org.jsoup.helper.HttpConnection.Request request43 = request39.timeout(20);
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
        org.junit.Assert.assertNotNull(request43);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        java.net.Proxy proxy3 = request0.proxy();
        int int4 = request0.maxBodySize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.data("application/x-www-form-urlencoded=null=Content-Encoding=null=Content-Encoding", "application/x-www-form-urlencoded=null=Content-Encoding=null=Content-Encoding");
        java.lang.Class<?> wildcardClass10 = connection9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str1 = keyVal0.key();
        keyVal0.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal0.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        boolean boolean8 = keyVal7.hasInputStream();
        java.io.InputStream inputStream9 = keyVal7.inputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        boolean boolean17 = response1.hasCookie("null=application/x-www-form-urlencoded=null=multipart/form-data");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        int int40 = request39.timeoutMilliseconds;
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal41.value = "Content-Encoding";
        java.lang.String str44 = keyVal41.key();
        java.io.InputStream inputStream45 = keyVal41.stream;
        java.io.InputStream inputStream46 = null;
        keyVal41.stream = inputStream46;
        java.lang.String str48 = keyVal41.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = keyVal41.key("null=null");
        java.io.InputStream inputStream51 = keyVal41.inputStream();
        org.jsoup.helper.HttpConnection.Request request52 = request39.data((org.jsoup.Connection.KeyVal) keyVal41);
        java.lang.String str53 = keyVal41.key();
        java.io.InputStream inputStream54 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal55 = keyVal41.inputStream(inputStream54);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3000 + "'", int40 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "null=null" + "'", str53.equals("null=null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal55);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.validateTLSCertificates(true);
        org.jsoup.Connection.Response response7 = httpConnection0.res;
        org.jsoup.Connection connection10 = httpConnection0.proxy("", (int) (byte) 10);
        org.jsoup.Connection.Response response11 = null;
        org.jsoup.Connection connection12 = httpConnection0.response(response11);
        org.jsoup.Connection.Request request13 = httpConnection0.req;
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        int int15 = request14.timeout();
        boolean boolean16 = request14.ignoreContentType;
        org.jsoup.Connection.Request request18 = request14.ignoreHttpErrors(false);
        java.lang.String str19 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request14);
        org.jsoup.Connection.Request request22 = request14.cookie("UTF-8", "multipart/form-data");
        request14.validateTSLCertificates = true;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = request14.headers();
        request14.timeoutMilliseconds = (byte) 0;
        org.jsoup.Connection connection28 = httpConnection0.request((org.jsoup.Connection.Request) request14);
        java.lang.String str29 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3000 + "'", int15 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Response response9 = response1.removeHeader("UTF-8");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal0.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        keyVal5.value = "hi!";
        java.lang.String str9 = keyVal5.value();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null=Content-Encoding" + "'", str6.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.jsoup.Connection.Request request41 = httpConnection0.req;
        org.jsoup.Connection.Response response42 = httpConnection0.res;
        org.jsoup.Connection connection45 = httpConnection0.data("application/x-www-form-urlencoded=application/x-www-form-urlencoded", "UTF-8");
        org.jsoup.Connection connection47 = httpConnection0.maxBodySize((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        boolean boolean6 = request4.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection7 = request4.data();
        java.lang.String str8 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request4);
        boolean boolean9 = request4.validateTLSCertificates();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request4.cookies();
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean12 = request11.ignoreContentType;
        request11.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request16 = request11.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request18 = request11.timeout((int) (byte) 10);
        request18.followRedirects = false;
        boolean boolean21 = request18.followRedirects();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection22 = request18.data();
        request4.data = keyValCollection22;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection22);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str5 = response1.statusMessage();
        boolean boolean8 = response1.hasHeaderWithValue("UTF-8", "");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.lang.String str2 = request0.cookie("Content-Encoding");
        java.lang.String str3 = request0.postDataCharset();
        org.jsoup.helper.HttpConnection.Request request5 = request0.timeout((int) (short) 0);
        boolean boolean6 = request5.ignoreContentType;
        int int7 = request5.timeoutMilliseconds;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8" + "'", str3.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        java.lang.String str6 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        org.jsoup.Connection.Request request8 = request0.maxBodySize((int) (byte) 0);
        int int9 = request0.timeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3000 + "'", int5 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3000 + "'", int9 == 3000);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean7 = response6.executed;
        java.net.URL uRL8 = response6.url();
        boolean boolean9 = response6.executed;
        response6.executed = false;
        httpConnection0.res = response6;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response17 = response14.cookie("null=Content-Encoding", "multipart/form-data");
        int int18 = response14.statusCode();
        boolean boolean21 = response14.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        boolean boolean24 = response23.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response23.cookies();
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str28 = keyVal27.key();
        keyVal27.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal31.value = "Content-Encoding";
        java.lang.String str34 = keyVal31.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal35.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream39 = keyVal38.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream41 = keyVal40.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray42 = new org.jsoup.Connection.KeyVal[] { keyVal27, keyVal31, keyVal35, keyVal38, keyVal40 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList43 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList43, keyValArray42);
        org.jsoup.Connection connection45 = httpConnection26.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList43);
        org.jsoup.helper.HttpConnection.Request request46 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean47 = request46.ignoreContentType;
        request46.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request51 = request46.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal52 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request53 = request46.data((org.jsoup.Connection.KeyVal) keyVal52);
        org.jsoup.helper.HttpConnection.Request request54 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean55 = request54.ignoreContentType;
        request54.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request60 = request54.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy61 = request60.proxy;
        org.jsoup.helper.HttpConnection.Request request62 = request46.proxy(proxy61);
        org.jsoup.Connection.Method method63 = request62.method();
        org.jsoup.Connection connection64 = httpConnection26.method(method63);
        org.jsoup.Connection.Response response65 = response23.method(method63);
        org.jsoup.Connection.Response response66 = response14.method(method63);
        org.jsoup.Connection connection67 = httpConnection0.method(method63);
        org.jsoup.Connection connection70 = httpConnection0.cookie("hi!=Content-Encoding", "hi!=Content-Encoding");
        org.jsoup.Connection connection72 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection.Request request73 = httpConnection0.request();
        org.jsoup.Connection connection75 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.helper.HttpConnection.Response response76 = null;
        org.jsoup.helper.HttpConnection.Response response77 = new org.jsoup.helper.HttpConnection.Response(response76);
        boolean boolean78 = response77.executed;
        java.net.URL uRL79 = response77.url();
        org.jsoup.Connection.Response response82 = response77.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str83 = response77.contentType();
        java.lang.String str84 = response77.statusMessage;
        java.net.URL uRL85 = response77.url();
        org.jsoup.Connection.Response response87 = response77.removeCookie("hi!=Content-Encoding");
        org.jsoup.Connection connection88 = httpConnection0.response((org.jsoup.Connection.Response) response77);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = response77.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "null=Content-Encoding" + "'", str34.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request62);
        org.junit.Assert.assertTrue("'" + method63 + "' != '" + org.jsoup.Connection.Method.GET + "'", method63.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection88);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage();
        response1.numRedirects = (byte) -1;
        java.lang.String str10 = response1.statusMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request7.data((org.jsoup.Connection.KeyVal) keyVal10);
        boolean boolean12 = request7.validateTLSCertificates();
        org.jsoup.helper.HttpConnection.Request request14 = request7.timeout((int) 'a');
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = request14.scanHeaders("hi!");
        org.jsoup.parser.Parser parser17 = request14.parser;
        boolean boolean18 = request14.ignoreContentType();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = 1;
        java.lang.String str8 = response1.cookie("application/x-www-form-urlencoded=null=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.statusMessage;
        java.net.URL uRL9 = response1.url();
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response13.numRedirects = '4';
        org.jsoup.Connection.Method method16 = response13.method();
        response13.statusCode = 1;
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
        org.jsoup.Connection.Method method36 = request35.method();
        org.jsoup.Connection.Response response37 = response13.method(method36);
        org.jsoup.Connection.Response response38 = response11.method(method36);
        org.jsoup.Connection.Response response39 = response1.method(method36);
        org.jsoup.Connection.Response response42 = response1.cookie("UTF-8", "hi!=Content-Encoding=UTF-8");
        org.jsoup.Connection.Response response44 = response1.removeCookie("multipart/form-data");
        org.jsoup.Connection.Response response47 = response1.cookie("hi!", "UTF-8=multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method16);
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
        org.junit.Assert.assertTrue("'" + method36 + "' != '" + org.jsoup.Connection.Method.GET + "'", method36.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response47);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.value();
        java.lang.String str4 = keyVal0.value();
        keyVal0.key = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding" + "'", str3.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.cookie("multipart/form-data", "null=null");
        org.jsoup.Connection.Method method15 = response1.method();
        response1.charset = "Content-Encoding";
        java.lang.String str18 = response1.charset();
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
        org.junit.Assert.assertNotNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Content-Encoding" + "'", str18.equals("Content-Encoding"));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean7 = response6.executed;
        java.net.URL uRL8 = response6.url();
        boolean boolean9 = response6.executed;
        response6.executed = false;
        httpConnection0.res = response6;
        org.jsoup.Connection.Response response15 = response6.cookie("application/x-www-form-urlencoded", "");
        org.jsoup.Connection.Response response17 = response6.removeHeader("application/x-www-form-urlencoded=null=Content-Encoding");
        boolean boolean20 = response6.hasHeaderWithValue("Content-Encoding=hi!", "null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        int int40 = request39.timeout();
        request39.parserDefined = false;
        boolean boolean43 = request39.validateTSLCertificates;
        org.jsoup.helper.HttpConnection.Request request45 = request39.timeout((int) (byte) 0);
        request45.postDataCharset = "null=Content-Encoding";
        int int48 = request45.timeoutMilliseconds;
        int int49 = request45.timeout();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3000 + "'", int40 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = request0.scanHeaders("application/x-www-form-urlencoded=application/x-www-form-urlencoded");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry7);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.io.InputStream inputStream4 = keyVal0.stream;
        java.io.InputStream inputStream5 = null;
        keyVal0.stream = inputStream5;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal0.value("application/x-www-form-urlencoded");
        java.io.InputStream inputStream9 = keyVal0.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal0.value("UTF-8");
        java.lang.String str12 = keyVal11.key();
        java.io.InputStream inputStream13 = null;
        keyVal11.stream = inputStream13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Response response9 = response1.removeHeader("UTF-8");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response12 = response1.removeCookie("null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Request request4 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean5 = request4.ignoreContentType;
        request4.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request9 = request4.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request11 = request4.data((org.jsoup.Connection.KeyVal) keyVal10);
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean13 = request12.ignoreContentType;
        request12.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request18 = request12.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy19 = request18.proxy;
        org.jsoup.helper.HttpConnection.Request request20 = request4.proxy(proxy19);
        request20.ignoreHttpErrors = true;
        java.net.Proxy proxy23 = request20.proxy;
        request0.proxy = proxy23;
        org.jsoup.Connection.Request request26 = request0.removeCookie("null=null=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request26);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.net.URL uRL14 = response1.url();
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
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.io.InputStream inputStream42 = null;
        org.jsoup.Connection connection43 = httpConnection0.data("null=null=Content-Encoding", "null=null", inputStream42);
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
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.jsoup.Connection connection15 = httpConnection0.proxy("", 0);
        org.jsoup.Connection connection17 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection19 = httpConnection0.userAgent("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.url("null=application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: null=application/x-www-form-urlencoded");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        java.lang.String str5 = request0.cookie("UTF-8");
        request0.parserDefined = true;
        request0.maxBodySizeBytes = 10;
        request0.postDataCharset = "hi!=Content-Encoding=UTF-8";
        boolean boolean12 = request0.followRedirects();
        org.jsoup.Connection.Request request14 = request0.removeHeader("application/x-www-form-urlencoded");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        response1.statusMessage = "hi!";
        java.net.URL uRL7 = response1.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean10 = request9.ignoreContentType;
        request9.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request15 = request9.proxy("hi!", (int) (short) 0);
        request9.validateTSLCertificates = false;
        boolean boolean18 = request9.ignoreContentType;
        int int19 = request9.maxBodySize();
        boolean boolean20 = request9.followRedirects;
        java.net.Proxy proxy21 = null;
        org.jsoup.helper.HttpConnection.Request request22 = request9.proxy(proxy21);
        request9.ignoreHttpErrors = true;
        org.jsoup.helper.HttpConnection.Request request26 = request9.timeout((int) (byte) 10);
        response1.req = request9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request26);
    }
}

