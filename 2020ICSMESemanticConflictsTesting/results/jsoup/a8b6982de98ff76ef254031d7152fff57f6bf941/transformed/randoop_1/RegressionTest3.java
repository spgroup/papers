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
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        request7.followRedirects = false;
        java.net.Proxy proxy10 = request7.proxy();
        org.jsoup.Connection.Request request12 = request7.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser14 = request13.parser();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = request13.headers();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser17 = null;
        org.jsoup.Connection connection18 = httpConnection16.parser(parser17);
        org.jsoup.Connection connection20 = httpConnection16.referrer("multipart/form-data");
        org.jsoup.Connection connection23 = httpConnection16.cookie("Content-Encoding", "");
        org.jsoup.Connection connection26 = httpConnection16.header("multipart/form-data", "multipart/form-data");
        org.jsoup.Connection connection28 = httpConnection16.maxBodySize(1048576);
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser30 = request29.parser();
        org.jsoup.Connection connection31 = httpConnection16.parser(parser30);
        org.jsoup.helper.HttpConnection.Request request32 = request13.parser(parser30);
        org.jsoup.helper.HttpConnection.Request request33 = request7.parser(parser30);
        boolean boolean34 = request7.ignoreHttpErrors;
        java.net.URL uRL35 = request7.url();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL35);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        response1.statusMessage = "hi!";
        java.net.URL uRL7 = response1.url();
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean10 = response9.executed;
        java.net.URL uRL11 = response9.url();
        boolean boolean12 = response9.executed;
        org.jsoup.Connection.Response response14 = response9.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request15 = response9.req;
        org.jsoup.Connection.Request request16 = null;
        response9.req = request16;
        java.lang.String str19 = response9.cookie("multipart/form-data");
        java.lang.String str21 = response9.header("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        boolean boolean24 = response23.executed;
        java.net.URL uRL25 = response23.url();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response23.cookies();
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser28 = null;
        org.jsoup.Connection connection29 = httpConnection27.parser(parser28);
        org.jsoup.Connection connection31 = httpConnection27.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response32 = null;
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        boolean boolean34 = response33.executed;
        java.net.URL uRL35 = response33.url();
        boolean boolean36 = response33.executed;
        response33.executed = false;
        httpConnection27.res = response33;
        org.jsoup.helper.HttpConnection.Response response40 = null;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.Connection.Response response44 = response41.cookie("null=Content-Encoding", "multipart/form-data");
        int int45 = response41.statusCode();
        boolean boolean48 = response41.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response49 = null;
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response49);
        boolean boolean51 = response50.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap52 = response50.cookies();
        org.jsoup.helper.HttpConnection httpConnection53 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal54 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str55 = keyVal54.key();
        keyVal54.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal58 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal58.value = "Content-Encoding";
        java.lang.String str61 = keyVal58.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal62 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal62.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal65 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream66 = keyVal65.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal67 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream68 = keyVal67.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray69 = new org.jsoup.Connection.KeyVal[] { keyVal54, keyVal58, keyVal62, keyVal65, keyVal67 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList70 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList70, keyValArray69);
        org.jsoup.Connection connection72 = httpConnection53.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList70);
        org.jsoup.helper.HttpConnection.Request request73 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean74 = request73.ignoreContentType;
        request73.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request78 = request73.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal79 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request80 = request73.data((org.jsoup.Connection.KeyVal) keyVal79);
        org.jsoup.helper.HttpConnection.Request request81 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean82 = request81.ignoreContentType;
        request81.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request87 = request81.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy88 = request87.proxy;
        org.jsoup.helper.HttpConnection.Request request89 = request73.proxy(proxy88);
        org.jsoup.Connection.Method method90 = request89.method();
        org.jsoup.Connection connection91 = httpConnection53.method(method90);
        org.jsoup.Connection.Response response92 = response50.method(method90);
        org.jsoup.Connection.Response response93 = response41.method(method90);
        org.jsoup.Connection connection94 = httpConnection27.method(method90);
        org.jsoup.Connection.Response response95 = response23.method(method90);
        org.jsoup.Connection.Response response96 = response9.method(method90);
        org.jsoup.Connection.Response response97 = response1.method(method90);
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
        org.junit.Assert.assertNull(uRL11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "null=Content-Encoding" + "'", str61.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request89);
        org.junit.Assert.assertTrue("'" + method90 + "' != '" + org.jsoup.Connection.Method.GET + "'", method90.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response97);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = 1;
        java.net.URL uRL7 = response1.url();
        org.jsoup.Connection.Request request8 = response1.req;
        response1.charset = "";
        java.lang.String str11 = response1.statusMessage;
        boolean boolean14 = response1.hasHeaderWithValue("Content-Encoding", "hi!=Content-Encoding=UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        boolean boolean20 = request0.ignoreHttpErrors();
        int int21 = request0.maxBodySize();
        boolean boolean24 = request0.hasHeaderWithValue("Content-Encoding", "null=Content-Encoding");
        boolean boolean25 = request0.validateTLSCertificates();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        response82.charset = "multipart/form-data";
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
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        int int6 = request0.maxBodySizeBytes;
        boolean boolean8 = request0.hasHeader("multipart/form-data");
        boolean boolean10 = request0.hasHeader("multipart/form-data");
        boolean boolean11 = request0.validateTSLCertificates;
        int int12 = request0.timeout();
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean14 = request13.ignoreContentType;
        request13.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request19 = request13.proxy("hi!", (int) (short) 0);
        request13.validateTSLCertificates = false;
        boolean boolean22 = request13.ignoreContentType;
        int int23 = request13.maxBodySize();
        boolean boolean24 = request13.followRedirects;
        java.net.Proxy proxy25 = null;
        org.jsoup.helper.HttpConnection.Request request26 = request13.proxy(proxy25);
        org.jsoup.parser.Parser parser27 = request26.parser;
        org.jsoup.Connection.Method method28 = request26.method();
        org.jsoup.Connection.Request request29 = request0.method(method28);
        org.jsoup.Connection.Request request32 = request0.cookie("hi!=Content-Encoding=UTF-8", "UTF-8");
        java.net.Proxy proxy33 = request0.proxy();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3000 + "'", int12 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertTrue("'" + method28 + "' != '" + org.jsoup.Connection.Method.GET + "'", method28.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy33);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        request7.followRedirects = false;
        java.net.Proxy proxy10 = request7.proxy;
        request7.postDataCharset = "UTF-8";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.cookie("hi!=Content-Encoding=UTF-8", "application/x-www-form-urlencoded=null=Content-Encoding");
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
        org.junit.Assert.assertNull(byteBuffer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection7 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.Connection connection9 = httpConnection0.maxBodySize(0);
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean11 = request10.ignoreContentType;
        request10.ignoreContentType = true;
        httpConnection0.req = request10;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean17 = response16.executed;
        java.net.URL uRL18 = response16.url();
        int int19 = response16.statusCode;
        boolean boolean21 = response16.hasHeader("null=Content-Encoding");
        org.jsoup.Connection.Response response24 = response16.header("hi!", "multipart/form-data");
        response16.statusCode = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request10, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.jsoup.parser.Parser parser20 = null;
        org.jsoup.Connection connection21 = httpConnection0.parser(parser20);
        org.jsoup.Connection connection23 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        response25.numRedirects = '4';
        org.jsoup.Connection.Method method28 = response25.method();
        java.lang.String str29 = response25.statusMessage();
        boolean boolean32 = response25.hasHeaderWithValue("UTF-8", "");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = response25.cookies();
        org.jsoup.Connection connection34 = httpConnection0.data(strMap33);
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
        org.junit.Assert.assertNull(method28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.helper.HttpConnection.CONTENT_TYPE = "null=null=Content-Encoding";
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        response1.statusMessage = "UTF-8";
        org.jsoup.Connection.Response response11 = response1.removeCookie("null=Content-Encoding");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response15 = response1.header("application/x-www-form-urlencoded=null=Content-Encoding", "hi!=Content-Encoding=UTF-8");
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
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        boolean boolean8 = request0.hasHeaderWithValue("Content-Encoding", "null=Content-Encoding");
        java.net.URL uRL9 = request0.url();
        request0.validateTLSCertificates(false);
        boolean boolean12 = request0.ignoreContentType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        int int14 = request13.timeout();
        request13.parserDefined = true;
        request13.maxBodySizeBytes = (-1);
        httpConnection0.req = request13;
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser21 = null;
        org.jsoup.Connection connection22 = httpConnection20.parser(parser21);
        org.jsoup.Connection connection24 = httpConnection20.userAgent("hi!");
        org.jsoup.Connection connection26 = httpConnection20.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        boolean boolean29 = response28.executed;
        java.net.URL uRL30 = response28.url();
        boolean boolean31 = response28.executed;
        httpConnection20.res = response28;
        java.lang.String str33 = response28.statusMessage;
        java.lang.String str35 = response28.header("hi!");
        httpConnection0.res = response28;
        java.lang.String str37 = response28.charset();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3000 + "'", int14 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.jsoup.Connection.Request request34 = request0.cookie("application/x-www-form-urlencoded", "UTF-8");
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
        org.junit.Assert.assertNotNull(request34);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.jsoup.Connection connection36 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList33);
        org.jsoup.Connection connection39 = httpConnection0.proxy("null=Content-Encoding", (int) (short) 10);
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
        org.junit.Assert.assertNotNull(connection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal0.inputStream(inputStream4);
        keyVal0.value = "hi!";
        boolean boolean8 = keyVal0.hasInputStream();
        java.lang.String str9 = keyVal0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null=hi!" + "'", str9.equals("null=hi!"));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "null=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        keyVal2.stream = inputStream3;
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "application/x-www-form-urlencoded=null=Content-Encoding" + "'", str5.equals("application/x-www-form-urlencoded=null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "application/x-www-form-urlencoded=null=Content-Encoding" + "'", str6.equals("application/x-www-form-urlencoded=null=Content-Encoding"));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.io.InputStream inputStream4 = keyVal0.stream;
        java.io.InputStream inputStream5 = null;
        keyVal0.stream = inputStream5;
        java.lang.String str7 = keyVal0.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal0.key("null=null");
        java.io.InputStream inputStream10 = keyVal0.stream;
        java.lang.String str11 = keyVal0.key;
        java.lang.String str12 = keyVal0.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null=null" + "'", str11.equals("null=null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null=null" + "'", str12.equals("null=null"));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        java.lang.String str10 = request0.header("application/x-www-form-urlencoded");
        request0.followRedirects = false;
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost((org.jsoup.Connection.Request) request0, outputStream13, "null=null");
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
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.jsoup.Connection.Request request28 = request0.cookie("null=hi!", "hi!=Content-Encoding=UTF-8");
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
        org.junit.Assert.assertNotNull(request28);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        java.lang.String str10 = request0.header("application/x-www-form-urlencoded");
        request0.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Request request14 = request0.timeout((int) (byte) 10);
        boolean boolean15 = request14.followRedirects;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.lang.String str2 = request0.cookie("Content-Encoding");
        org.jsoup.Connection.Request request4 = request0.maxBodySize((int) (byte) 0);
        boolean boolean7 = request0.hasHeaderWithValue("null=application/x-www-form-urlencoded", "Content-Encoding=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("null=Content-Encoding");
        response1.numRedirects = 0;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.jsoup.helper.HttpConnection.Request request49 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean50 = request49.ignoreContentType;
        request49.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request54 = request49.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request56 = request49.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection httpConnection57 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser58 = null;
        org.jsoup.Connection connection59 = httpConnection57.parser(parser58);
        org.jsoup.Connection connection61 = httpConnection57.userAgent("hi!");
        org.jsoup.Connection connection63 = httpConnection57.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal64 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str65 = keyVal64.key();
        keyVal64.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal68 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal68.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray71 = new org.jsoup.Connection.KeyVal[] { keyVal64, keyVal68 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList72 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList72, keyValArray71);
        org.jsoup.Connection connection74 = httpConnection57.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList72);
        org.jsoup.helper.HttpConnection.Request request75 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser76 = request75.parser();
        org.jsoup.Connection connection77 = httpConnection57.parser(parser76);
        org.jsoup.helper.HttpConnection.Request request78 = request56.parser(parser76);
        org.jsoup.helper.HttpConnection.Request request79 = request45.parser(parser76);
        request79.followRedirects = false;
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request79);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        boolean boolean16 = response1.hasHeader("multipart/form-data");
        org.jsoup.Connection.Response response18 = response1.removeHeader("Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        org.jsoup.Connection.Method method13 = response8.method();
        boolean boolean15 = response8.hasCookie("null=null=Content-Encoding");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response8.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(method13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        int int6 = request0.maxBodySizeBytes;
        boolean boolean8 = request0.hasHeader("multipart/form-data");
        boolean boolean10 = request0.hasHeader("multipart/form-data");
        boolean boolean11 = request0.validateTSLCertificates;
        int int12 = request0.timeout();
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean14 = request13.ignoreContentType;
        request13.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request19 = request13.proxy("hi!", (int) (short) 0);
        request13.validateTSLCertificates = false;
        boolean boolean22 = request13.ignoreContentType;
        int int23 = request13.maxBodySize();
        boolean boolean24 = request13.followRedirects;
        java.net.Proxy proxy25 = null;
        org.jsoup.helper.HttpConnection.Request request26 = request13.proxy(proxy25);
        org.jsoup.parser.Parser parser27 = request26.parser;
        org.jsoup.Connection.Method method28 = request26.method();
        org.jsoup.Connection.Request request29 = request0.method(method28);
        org.jsoup.Connection.Request request32 = request0.cookie("hi!=Content-Encoding=UTF-8", "UTF-8");
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        int int34 = request33.timeout();
        boolean boolean35 = request33.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request37 = request33.timeout(0);
        java.net.Proxy proxy38 = request33.proxy;
        java.lang.String str40 = request33.header("hi!");
        java.lang.String str41 = request33.postDataCharset;
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean43 = request42.ignoreContentType;
        request42.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request47 = request42.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request49 = request42.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal52 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str53 = keyVal52.key();
        keyVal52.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal56 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal56.value = "Content-Encoding";
        java.lang.String str59 = keyVal56.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal60 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal60.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal63 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream64 = keyVal63.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal65 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream66 = keyVal65.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray67 = new org.jsoup.Connection.KeyVal[] { keyVal52, keyVal56, keyVal60, keyVal63, keyVal65 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList68 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList68, keyValArray67);
        org.jsoup.Connection connection70 = httpConnection51.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList68);
        request50.data = keyValList68;
        org.jsoup.helper.HttpConnection.Request request72 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean73 = request72.ignoreContentType;
        request72.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request77 = request72.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal78 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request79 = request72.data((org.jsoup.Connection.KeyVal) keyVal78);
        org.jsoup.helper.HttpConnection.Request request80 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean81 = request80.ignoreContentType;
        request80.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request86 = request80.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy87 = request86.proxy;
        org.jsoup.helper.HttpConnection.Request request88 = request72.proxy(proxy87);
        org.jsoup.helper.HttpConnection.Request request89 = request50.proxy(proxy87);
        org.jsoup.helper.HttpConnection.Request request90 = request42.proxy(proxy87);
        request33.proxy = proxy87;
        org.jsoup.helper.HttpConnection.Request request92 = request0.proxy(proxy87);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry94 = request0.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap95 = request0.cookies();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3000 + "'", int12 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertTrue("'" + method28 + "' != '" + org.jsoup.Connection.Method.GET + "'", method28.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3000 + "'", int34 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "UTF-8" + "'", str41.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "null=Content-Encoding" + "'", str59.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap95);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        org.jsoup.Connection connection59 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection61 = httpConnection0.maxBodySize(10);
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
        org.junit.Assert.assertNotNull(connection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection61);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        response28.numRedirects = '4';
        org.jsoup.Connection.Method method31 = response28.method();
        response28.statusCode = 1;
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean35 = request34.ignoreContentType;
        request34.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request39 = request34.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request41 = request34.data((org.jsoup.Connection.KeyVal) keyVal40);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean43 = request42.ignoreContentType;
        request42.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request48 = request42.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy49 = request48.proxy;
        org.jsoup.helper.HttpConnection.Request request50 = request34.proxy(proxy49);
        org.jsoup.Connection.Method method51 = request50.method();
        org.jsoup.Connection.Response response52 = response28.method(method51);
        org.jsoup.Connection.Response response53 = response26.method(method51);
        int int54 = response26.statusCode;
        java.lang.String str56 = response26.header("hi!=Content-Encoding");
        java.lang.String str58 = response26.header("null=null");
        org.jsoup.Connection.Response response60 = response26.removeCookie("application/x-www-form-urlencoded=application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = response26.cookies();
        httpConnection0.res = response26;
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
        org.junit.Assert.assertNull(method31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertTrue("'" + method51 + "' != '" + org.jsoup.Connection.Method.GET + "'", method51.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap61);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        java.net.Proxy proxy10 = request9.proxy;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = request9.scanHeaders("multipart/form-data");
        request9.ignoreContentType = false;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = request9.headers();
        boolean boolean16 = request9.parserDefined;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.helper.HttpConnection.Response response3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean5 = response4.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response4.headers();
        org.jsoup.Connection connection7 = httpConnection0.data(strMap6);
        org.jsoup.Connection connection9 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection11 = httpConnection0.referrer("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean13 = request12.ignoreContentType;
        java.lang.String str14 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request12);
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response19 = response16.cookie("null=Content-Encoding", "multipart/form-data");
        int int20 = response16.statusCode();
        boolean boolean23 = response16.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        boolean boolean26 = response25.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response25.cookies();
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str30 = keyVal29.key();
        keyVal29.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal33.value = "Content-Encoding";
        java.lang.String str36 = keyVal33.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal37 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal37.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream41 = keyVal40.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal42 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream43 = keyVal42.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray44 = new org.jsoup.Connection.KeyVal[] { keyVal29, keyVal33, keyVal37, keyVal40, keyVal42 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList45 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList45, keyValArray44);
        org.jsoup.Connection connection47 = httpConnection28.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList45);
        org.jsoup.helper.HttpConnection.Request request48 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean49 = request48.ignoreContentType;
        request48.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request53 = request48.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal54 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request55 = request48.data((org.jsoup.Connection.KeyVal) keyVal54);
        org.jsoup.helper.HttpConnection.Request request56 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean57 = request56.ignoreContentType;
        request56.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request62 = request56.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy63 = request62.proxy;
        org.jsoup.helper.HttpConnection.Request request64 = request48.proxy(proxy63);
        org.jsoup.Connection.Method method65 = request64.method();
        org.jsoup.Connection connection66 = httpConnection28.method(method65);
        org.jsoup.Connection.Response response67 = response25.method(method65);
        org.jsoup.Connection.Response response68 = response16.method(method65);
        org.jsoup.Connection.Request request69 = request12.method(method65);
        org.jsoup.Connection connection70 = httpConnection0.method(method65);
        org.jsoup.helper.HttpConnection.Response response71 = null;
        org.jsoup.helper.HttpConnection.Response response72 = new org.jsoup.helper.HttpConnection.Response(response71);
        java.lang.String str74 = response72.getHeaderCaseInsensitive("Content-Encoding");
        java.lang.String str76 = response72.header("multipart/form-data");
        int int77 = response72.statusCode;
        httpConnection0.res = response72;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "null=Content-Encoding" + "'", str36.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request64);
        org.junit.Assert.assertTrue("'" + method65 + "' != '" + org.jsoup.Connection.Method.GET + "'", method65.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        int int10 = request0.maxBodySize();
        boolean boolean11 = request0.followRedirects;
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request0.proxy(proxy12);
        org.jsoup.parser.Parser parser14 = request13.parser;
        boolean boolean15 = request13.validateTSLCertificates;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request6.parserDefined = false;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request6.cookies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.header("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.lang.String str5 = request0.postDataCharset;
        int int6 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean8 = request7.ignoreContentType;
        request7.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request12 = request7.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request14 = request7.data((org.jsoup.Connection.KeyVal) keyVal13);
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean16 = request15.ignoreContentType;
        request15.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request21 = request15.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy22 = request21.proxy;
        org.jsoup.helper.HttpConnection.Request request23 = request7.proxy(proxy22);
        boolean boolean26 = request7.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request30 = request7.data((org.jsoup.Connection.KeyVal) keyVal29);
        boolean boolean31 = request7.followRedirects;
        java.net.Proxy proxy32 = request7.proxy;
        org.jsoup.helper.HttpConnection.Request request33 = request0.proxy(proxy32);
        java.lang.String str34 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "multipart/form-data" + "'", str5.equals("multipart/form-data"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.maxBodySize(52);
        int int12 = request0.timeoutMilliseconds;
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost((org.jsoup.Connection.Request) request0, outputStream13, "application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3000 + "'", int12 == 3000);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.nio.ByteBuffer byteBuffer54 = response37.byteData;
        response37.statusCode = 0;
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
        org.junit.Assert.assertNull(byteBuffer54);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        org.jsoup.helper.HttpConnection.Request request23 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean24 = request23.ignoreContentType;
        request23.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request28 = request23.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request30 = request23.data((org.jsoup.Connection.KeyVal) keyVal29);
        org.jsoup.helper.HttpConnection.Request request31 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean32 = request31.ignoreContentType;
        request31.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request37 = request31.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy38 = request37.proxy;
        org.jsoup.helper.HttpConnection.Request request39 = request23.proxy(proxy38);
        org.jsoup.Connection.Method method40 = request39.method();
        org.jsoup.Connection.Response response41 = response11.method(method40);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertTrue("'" + method40 + "' != '" + org.jsoup.Connection.Method.GET + "'", method40.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response41);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset;
        org.jsoup.Connection.Response response10 = response1.header("Content-Encoding=hi!", "null=null=Content-Encoding");
        org.jsoup.Connection.Response response12 = response1.removeHeader("null=null=Content-Encoding");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!=Content-Encoding", "application/x-www-form-urlencoded=application/x-www-form-urlencoded");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.validateTLSCertificates(true);
        org.jsoup.Connection.Response response7 = httpConnection0.res;
        org.jsoup.Connection.Response response8 = httpConnection0.res;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        java.lang.String str4 = response1.contentType;
        response1.charset = "null=Content-Encoding";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        java.lang.String str4 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        request0.parserDefined = true;
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean8 = request7.ignoreContentType;
        request7.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request13 = request7.proxy("hi!", (int) (short) 0);
        request7.validateTSLCertificates = false;
        boolean boolean16 = request7.ignoreContentType;
        org.jsoup.Connection.Request request18 = request7.followRedirects(true);
        org.jsoup.parser.Parser parser19 = request7.parser();
        int int20 = request7.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request21 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean22 = request21.ignoreContentType;
        request21.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request27 = request21.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy28 = request27.proxy;
        org.jsoup.helper.HttpConnection.Request request29 = request7.proxy(proxy28);
        org.jsoup.helper.HttpConnection.Request request30 = request0.proxy(proxy28);
        org.jsoup.helper.HttpConnection.Request request32 = request30.timeout((int) (short) 100);
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        int int34 = request33.timeout();
        boolean boolean35 = request33.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request37 = request33.timeout(0);
        boolean boolean39 = request37.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection40 = request37.data();
        request30.data = keyValCollection40;
        org.jsoup.Connection.Request request43 = request30.removeCookie("null=null=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3000 + "'", int34 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request43);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        request0.ignoreContentType = false;
        org.jsoup.Connection.Request request23 = request0.removeCookie("null=hi!");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        int int45 = request0.maxBodySizeBytes;
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.helper.HttpConnection.Response response3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean5 = response4.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response4.headers();
        org.jsoup.Connection connection7 = httpConnection0.data(strMap6);
        org.jsoup.Connection connection9 = httpConnection0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean12 = response11.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response11.cookies();
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str16 = keyVal15.key();
        keyVal15.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal19.value = "Content-Encoding";
        java.lang.String str22 = keyVal19.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal23.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream27 = keyVal26.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream29 = keyVal28.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray30 = new org.jsoup.Connection.KeyVal[] { keyVal15, keyVal19, keyVal23, keyVal26, keyVal28 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList31 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList31, keyValArray30);
        org.jsoup.Connection connection33 = httpConnection14.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList31);
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean35 = request34.ignoreContentType;
        request34.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request39 = request34.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request41 = request34.data((org.jsoup.Connection.KeyVal) keyVal40);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean43 = request42.ignoreContentType;
        request42.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request48 = request42.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy49 = request48.proxy;
        org.jsoup.helper.HttpConnection.Request request50 = request34.proxy(proxy49);
        org.jsoup.Connection.Method method51 = request50.method();
        org.jsoup.Connection connection52 = httpConnection14.method(method51);
        org.jsoup.Connection.Response response53 = response11.method(method51);
        org.jsoup.Connection connection54 = httpConnection0.method(method51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null=Content-Encoding" + "'", str22.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertTrue("'" + method51 + "' != '" + org.jsoup.Connection.Method.GET + "'", method51.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        boolean boolean55 = response37.hasHeader("application/x-www-form-urlencoded");
        java.lang.String str56 = response37.contentType();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        boolean boolean46 = request45.validateTLSCertificates();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        response1.contentType = "";
        java.lang.String str11 = response1.charset();
        boolean boolean13 = response1.hasCookie("null=Content-Encoding");
        response1.charset = "";
        java.lang.String str17 = response1.cookie("UTF-8");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        int int19 = request18.timeout();
        request18.parserDefined = true;
        request18.maxBodySizeBytes = (-1);
        request18.parserDefined = true;
        response1.req = request18;
        boolean boolean27 = request18.followRedirects;
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
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3000 + "'", int19 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request9.data;
        boolean boolean11 = request9.ignoreContentType;
        java.lang.String str13 = request9.header("null=null");
        boolean boolean14 = request9.ignoreHttpErrors();
        int int15 = request9.timeoutMilliseconds;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3000 + "'", int15 == 3000);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        org.jsoup.Connection.Response response10 = response1.removeHeader("multipart/form-data");
        org.jsoup.Connection.Response response12 = response1.removeHeader("UTF-8");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "null=Content-Encoding");
        int int16 = response1.numRedirects;
        java.lang.String str18 = response1.cookie("null=multipart/form-data");
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
        org.junit.Assert.assertNotNull(response15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal0.value("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("null=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("null=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("null=Content-Encoding");
        java.io.InputStream inputStream11 = keyVal10.stream;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.key("Content-Encoding=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        request0.followRedirects = true;
        boolean boolean45 = request0.ignoreContentType;
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        request0.ignoreContentType = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        int int8 = request7.timeout();
        boolean boolean9 = request7.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request11 = request7.timeout(0);
        boolean boolean13 = request11.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection14 = request11.data();
        request11.ignoreHttpErrors = false;
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
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        int int35 = request34.timeout();
        boolean boolean36 = request34.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request38 = request34.timeout(0);
        java.net.Proxy proxy39 = request34.proxy;
        java.lang.String str41 = request34.header("hi!");
        java.lang.String str42 = request34.postDataCharset;
        org.jsoup.helper.HttpConnection.Request request43 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean44 = request43.ignoreContentType;
        request43.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request48 = request43.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request50 = request43.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request51 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection52 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal53 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str54 = keyVal53.key();
        keyVal53.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal57 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal57.value = "Content-Encoding";
        java.lang.String str60 = keyVal57.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal61 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal61.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal64 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream65 = keyVal64.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal66 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream67 = keyVal66.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray68 = new org.jsoup.Connection.KeyVal[] { keyVal53, keyVal57, keyVal61, keyVal64, keyVal66 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList69 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList69, keyValArray68);
        org.jsoup.Connection connection71 = httpConnection52.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList69);
        request51.data = keyValList69;
        org.jsoup.helper.HttpConnection.Request request73 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean74 = request73.ignoreContentType;
        request73.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request78 = request73.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal79 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request80 = request73.data((org.jsoup.Connection.KeyVal) keyVal79);
        org.jsoup.helper.HttpConnection.Request request81 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean82 = request81.ignoreContentType;
        request81.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request87 = request81.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy88 = request87.proxy;
        org.jsoup.helper.HttpConnection.Request request89 = request73.proxy(proxy88);
        org.jsoup.helper.HttpConnection.Request request90 = request51.proxy(proxy88);
        org.jsoup.helper.HttpConnection.Request request91 = request43.proxy(proxy88);
        request34.proxy = proxy88;
        request17.proxy = proxy88;
        org.jsoup.helper.HttpConnection.Request request94 = request11.proxy(proxy88);
        request0.proxy = proxy88;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3000 + "'", int8 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection14);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3000 + "'", int35 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "UTF-8" + "'", str42.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "null=Content-Encoding" + "'", str60.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request94);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.jsoup.Connection.Method method19 = response1.method();
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
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.jsoup.Connection connection24 = httpConnection0.referrer("hi!");
        org.jsoup.Connection connection26 = httpConnection0.referrer("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.lang.String str30 = response28.getHeaderCaseInsensitive("Content-Encoding");
        java.lang.String str32 = response28.header("multipart/form-data");
        int int33 = response28.statusCode;
        org.jsoup.Connection.Response response36 = response28.cookie("Content-Encoding", "null=application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response39 = response28.cookie("application/x-www-form-urlencoded=null=Content-Encoding", "application/x-www-form-urlencoded=null=Content-Encoding");
        java.lang.String str41 = response28.header("UTF-8=multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = response28.headers();
        org.jsoup.Connection connection43 = httpConnection0.cookies(strMap42);
        org.jsoup.Connection connection45 = httpConnection0.ignoreContentType(false);
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
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection45);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request23 = request0.data((org.jsoup.Connection.KeyVal) keyVal22);
        int int24 = request0.timeoutMilliseconds;
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        response26.numRedirects = '4';
        java.lang.String str30 = response26.getHeaderCaseInsensitive("multipart/form-data");
        response26.contentType = "";
        org.jsoup.Connection.Response response34 = response26.removeHeader("application/x-www-form-urlencoded=null=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response35 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3000 + "'", int24 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        keyVal6.key = "";
        java.io.InputStream inputStream10 = keyVal6.stream;
        java.lang.String str11 = keyVal6.key;
        boolean boolean12 = keyVal6.hasInputStream();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        response1.contentType = "";
        java.lang.String str12 = response1.header("null=null=Content-Encoding");
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser25 = null;
        org.jsoup.Connection connection26 = httpConnection24.parser(parser25);
        org.jsoup.Connection connection28 = httpConnection24.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        boolean boolean31 = response30.executed;
        java.net.URL uRL32 = response30.url();
        boolean boolean33 = response30.executed;
        response30.executed = false;
        httpConnection24.res = response30;
        org.jsoup.Connection.Response response39 = response30.cookie("Content-Encoding", "");
        org.jsoup.Connection.Response response42 = response30.header("null=null", "application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response42);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        java.lang.String str2 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        boolean boolean3 = request0.ignoreHttpErrors;
        boolean boolean4 = request0.ignoreContentType;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
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
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        boolean boolean24 = request0.ignoreContentType();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection25 = request0.data();
        java.lang.String str26 = request0.postDataCharset;
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "UTF-8" + "'", str26.equals("UTF-8"));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection5 = httpConnection0.data("null=application/x-www-form-urlencoded", "null=null");
        org.jsoup.Connection.Response response6 = httpConnection0.response();
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean8 = request7.ignoreContentType;
        request7.maxBodySizeBytes = (byte) -1;
        java.lang.String str11 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request7);
        request7.parserDefined = true;
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean15 = request14.ignoreContentType;
        request14.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request20 = request14.proxy("hi!", (int) (short) 0);
        request14.validateTSLCertificates = false;
        boolean boolean23 = request14.ignoreContentType;
        org.jsoup.Connection.Request request25 = request14.followRedirects(true);
        org.jsoup.parser.Parser parser26 = request14.parser();
        int int27 = request14.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request28 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean29 = request28.ignoreContentType;
        request28.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request34 = request28.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy35 = request34.proxy;
        org.jsoup.helper.HttpConnection.Request request36 = request14.proxy(proxy35);
        org.jsoup.helper.HttpConnection.Request request37 = request7.proxy(proxy35);
        org.jsoup.Connection connection38 = httpConnection0.proxy(proxy35);
        org.jsoup.helper.HttpConnection.Request request39 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str42 = keyVal41.key();
        keyVal41.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal45.value = "Content-Encoding";
        java.lang.String str48 = keyVal45.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal49 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal49.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal52 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream53 = keyVal52.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal54 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream55 = keyVal54.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray56 = new org.jsoup.Connection.KeyVal[] { keyVal41, keyVal45, keyVal49, keyVal52, keyVal54 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList57 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList57, keyValArray56);
        org.jsoup.Connection connection59 = httpConnection40.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList57);
        request39.data = keyValList57;
        org.jsoup.helper.HttpConnection.Request request61 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean62 = request61.ignoreContentType;
        request61.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request66 = request61.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal67 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request68 = request61.data((org.jsoup.Connection.KeyVal) keyVal67);
        org.jsoup.helper.HttpConnection.Request request69 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean70 = request69.ignoreContentType;
        request69.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request75 = request69.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy76 = request75.proxy;
        org.jsoup.helper.HttpConnection.Request request77 = request61.proxy(proxy76);
        org.jsoup.helper.HttpConnection.Request request78 = request39.proxy(proxy76);
        request78.followRedirects = false;
        org.jsoup.parser.Parser parser81 = request78.parser();
        httpConnection0.req = request78;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection85 = httpConnection0.data("", "Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "null=Content-Encoding" + "'", str48.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser81);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.jsoup.Connection.Response response40 = httpConnection0.response();
        org.jsoup.Connection.Request request41 = httpConnection0.req;
        org.jsoup.Connection connection43 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document44 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser6 = request0.parser();
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
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response8.headers();
        boolean boolean17 = response8.hasCookie("Content-Encoding=hi!");
        boolean boolean19 = response8.hasCookie("null=multipart/form-data");
        org.jsoup.Connection.Response response21 = response8.removeCookie("multipart/form-data");
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
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        org.jsoup.Connection connection53 = httpConnection0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.Request request54 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean55 = request54.ignoreContentType;
        request54.maxBodySizeBytes = (byte) -1;
        java.lang.String str58 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request54);
        request54.parserDefined = true;
        org.jsoup.helper.HttpConnection.Request request61 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean62 = request61.ignoreContentType;
        request61.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request67 = request61.proxy("hi!", (int) (short) 0);
        request61.validateTSLCertificates = false;
        boolean boolean70 = request61.ignoreContentType;
        org.jsoup.Connection.Request request72 = request61.followRedirects(true);
        org.jsoup.parser.Parser parser73 = request61.parser();
        int int74 = request61.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request75 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean76 = request75.ignoreContentType;
        request75.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request81 = request75.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy82 = request81.proxy;
        org.jsoup.helper.HttpConnection.Request request83 = request61.proxy(proxy82);
        org.jsoup.helper.HttpConnection.Request request84 = request54.proxy(proxy82);
        org.jsoup.Connection connection85 = httpConnection0.request((org.jsoup.Connection.Request) request84);
        org.jsoup.helper.HttpConnection.Request request86 = new org.jsoup.helper.HttpConnection.Request();
        int int87 = request86.timeout();
        boolean boolean88 = request86.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request90 = request86.timeout(0);
        boolean boolean91 = request86.ignoreHttpErrors;
        java.net.Proxy proxy92 = request86.proxy();
        httpConnection0.req = request86;
        boolean boolean94 = request86.ignoreHttpErrors();
        java.lang.String str95 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request86);
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
        org.junit.Assert.assertNotNull(connection53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 3000 + "'", int87 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request7.data((org.jsoup.Connection.KeyVal) keyVal10);
        java.lang.String str12 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.value("multipart/form-data");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal10.inputStream(inputStream15);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.jsoup.Connection.Method method13 = response8.method();
        response8.statusCode = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response8.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response8.cookies();
        int int19 = response8.statusCode;
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
        org.junit.Assert.assertNull(method13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.jsoup.Connection connection24 = httpConnection0.referrer("hi!");
        org.jsoup.Connection connection26 = httpConnection0.maxBodySize((int) ' ');
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
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        response1.charset = "hi!";
        int int15 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
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
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        int int13 = response8.statusCode();
        boolean boolean16 = response8.hasHeaderWithValue("null=null", "application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response8.cookies();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("null=application/x-www-form-urlencoded");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry7);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        java.lang.String str4 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.cookie("application/x-www-form-urlencoded", "");
        java.lang.String str8 = response1.charset;
        org.jsoup.Connection.Response response10 = response1.removeHeader("null=multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        org.jsoup.Connection connection42 = httpConnection0.ignoreContentType(true);
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
        org.junit.Assert.assertNotNull(connection42);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String str1 = org.jsoup.helper.HttpConnection.encodeMimeName("null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null=hi!" + "'", str1.equals("null=hi!"));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response1.headers();
        java.lang.String str4 = response1.contentType;
        org.jsoup.Connection.Response response6 = response1.removeHeader("null=Content-Encoding");
        java.lang.String str8 = response1.cookie("Content-Encoding=hi!");
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        boolean boolean6 = request4.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection7 = request4.data();
        request4.ignoreHttpErrors = false;
        int int10 = request4.timeoutMilliseconds;
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        boolean boolean8 = response1.hasCookie("null=null");
        boolean boolean10 = response1.hasCookie("hi!=Content-Encoding");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("multipart/form-data");
        boolean boolean14 = response1.hasHeader("multipart/form-data");
        org.jsoup.Connection.Response response17 = response1.header("application/x-www-form-urlencoded=null=Content-Encoding", "application/x-www-form-urlencoded=application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        response24.numRedirects = '4';
        org.jsoup.Connection.Method method27 = response24.method();
        response24.statusCode = 1;
        java.net.URL uRL30 = response24.url();
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str33 = keyVal32.key();
        keyVal32.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal36.value = "Content-Encoding";
        java.lang.String str39 = keyVal36.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal40.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal43 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream44 = keyVal43.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream46 = keyVal45.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray47 = new org.jsoup.Connection.KeyVal[] { keyVal32, keyVal36, keyVal40, keyVal43, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList48 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList48, keyValArray47);
        org.jsoup.Connection connection50 = httpConnection31.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList48);
        org.jsoup.helper.HttpConnection.Request request51 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean52 = request51.ignoreContentType;
        request51.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request56 = request51.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal57 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request58 = request51.data((org.jsoup.Connection.KeyVal) keyVal57);
        org.jsoup.helper.HttpConnection.Request request59 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean60 = request59.ignoreContentType;
        request59.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request65 = request59.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy66 = request65.proxy;
        org.jsoup.helper.HttpConnection.Request request67 = request51.proxy(proxy66);
        org.jsoup.Connection.Method method68 = request67.method();
        org.jsoup.Connection connection69 = httpConnection31.method(method68);
        org.jsoup.Connection.Response response70 = response24.method(method68);
        org.jsoup.Connection connection71 = httpConnection0.method(method68);
        org.jsoup.Connection connection73 = httpConnection0.ignoreContentType(false);
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
        org.junit.Assert.assertNull(method27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "null=Content-Encoding" + "'", str39.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertTrue("'" + method68 + "' != '" + org.jsoup.Connection.Method.GET + "'", method68.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection73);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.cookie("Content-Encoding", "hi!=Content-Encoding");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("null=Content-Encoding");
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
        org.junit.Assert.assertNull(byteBuffer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=UTF-8", "", inputStream2);
        java.lang.String str4 = keyVal3.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!=Content-Encoding=UTF-8" + "'", str4.equals("hi!=Content-Encoding=UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        java.lang.String str5 = request0.cookie("UTF-8");
        java.lang.String str6 = request0.postDataCharset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "UTF-8" + "'", str6.equals("UTF-8"));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection7 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser9 = null;
        org.jsoup.Connection connection10 = httpConnection8.parser(parser9);
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean13 = response12.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.Connection connection15 = httpConnection8.data(strMap14);
        org.jsoup.Connection connection16 = httpConnection0.cookies(strMap14);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser18 = null;
        org.jsoup.Connection connection19 = httpConnection17.parser(parser18);
        org.jsoup.Connection connection21 = httpConnection17.userAgent("hi!");
        org.jsoup.Connection connection23 = httpConnection17.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        boolean boolean26 = response25.executed;
        java.net.URL uRL27 = response25.url();
        boolean boolean28 = response25.executed;
        httpConnection17.res = response25;
        org.jsoup.Connection connection32 = httpConnection17.header("Content-Encoding", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        boolean boolean35 = response34.executed;
        java.net.URL uRL36 = response34.url();
        boolean boolean37 = response34.executed;
        org.jsoup.Connection.Response response39 = response34.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request40 = response34.req;
        org.jsoup.Connection.Request request41 = null;
        response34.req = request41;
        org.jsoup.Connection connection43 = httpConnection17.response((org.jsoup.Connection.Response) response34);
        org.jsoup.Connection.Response response45 = response34.removeCookie("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response47 = response34.removeHeader("application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = response34.headers();
        httpConnection0.res = response34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        int int48 = request45.maxBodySizeBytes;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection49 = request45.data();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection50 = request45.data;
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1048576 + "'", int48 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection50);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        request0.followRedirects = true;
        java.lang.String str45 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
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
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        response1.statusMessage = "UTF-8";
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        int int15 = request7.timeout();
        request7.validateTSLCertificates = true;
        org.jsoup.Connection.Request request19 = request7.followRedirects(false);
        java.lang.String str20 = request7.postDataCharset();
        request7.ignoreContentType = false;
        boolean boolean23 = request7.followRedirects;
        org.jsoup.Connection.Request request25 = request7.ignoreHttpErrors(false);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "UTF-8" + "'", str20.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request25);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean17 = request16.ignoreContentType;
        java.net.Proxy proxy18 = request16.proxy();
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str22 = keyVal21.key();
        keyVal21.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal25.value = "Content-Encoding";
        java.lang.String str28 = keyVal25.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal29.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream33 = keyVal32.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream35 = keyVal34.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray36 = new org.jsoup.Connection.KeyVal[] { keyVal21, keyVal25, keyVal29, keyVal32, keyVal34 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList37 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37, keyValArray36);
        org.jsoup.Connection connection39 = httpConnection20.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37);
        request19.data = keyValList37;
        org.jsoup.helper.HttpConnection.Request request41 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean42 = request41.ignoreContentType;
        request41.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request46 = request41.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal47 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request48 = request41.data((org.jsoup.Connection.KeyVal) keyVal47);
        org.jsoup.helper.HttpConnection.Request request49 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean50 = request49.ignoreContentType;
        request49.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request55 = request49.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy56 = request55.proxy;
        org.jsoup.helper.HttpConnection.Request request57 = request41.proxy(proxy56);
        org.jsoup.helper.HttpConnection.Request request58 = request19.proxy(proxy56);
        request58.followRedirects = false;
        org.jsoup.parser.Parser parser61 = request58.parser();
        org.jsoup.helper.HttpConnection.Request request62 = request16.parser(parser61);
        org.jsoup.Connection connection63 = httpConnection0.parser(parser61);
        org.jsoup.Connection connection65 = httpConnection0.userAgent("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null=Content-Encoding" + "'", str28.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection65);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.jsoup.Connection.Response response15 = response8.removeHeader("null=application/x-www-form-urlencoded");
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean8 = response1.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.Connection.Response response10 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response13 = response1.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        response1.statusCode = (short) 10;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!=Content-Encoding");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
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
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        boolean boolean6 = request4.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection7 = request4.data();
        java.lang.String str8 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request4);
        java.lang.String str9 = request4.postDataCharset();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTF-8" + "'", str9.equals("UTF-8"));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        java.lang.String str10 = request0.header("application/x-www-form-urlencoded");
        request0.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Request request14 = request0.timeout((int) (byte) 10);
        org.jsoup.parser.Parser parser15 = null;
        org.jsoup.helper.HttpConnection.Request request16 = request14.parser(parser15);
        request16.validateTLSCertificates(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal0.value("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("null=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("null=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("null=Content-Encoding");
        keyVal8.key = "null=hi!";
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        org.jsoup.Connection connection36 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList33);
        org.jsoup.helper.HttpConnection.Response response37 = null;
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response37);
        boolean boolean39 = response38.executed;
        java.net.URL uRL40 = response38.url();
        int int41 = response38.statusCode;
        boolean boolean43 = response38.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry45 = response38.scanHeaders("Content-Encoding");
        org.jsoup.Connection.Response response47 = response38.removeHeader("multipart/form-data");
        org.jsoup.Connection.Response response49 = response38.removeHeader("UTF-8");
        org.jsoup.Connection.Request request50 = response38.req;
        response38.statusMessage = "application/x-www-form-urlencoded";
        org.jsoup.Connection.Response response54 = response38.removeHeader("application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = response38.headers();
        org.jsoup.Connection connection56 = httpConnection0.data(strMap55);
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
        org.junit.Assert.assertNotNull(connection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection56);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.jsoup.Connection connection21 = httpConnection0.timeout((int) (short) 0);
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str25 = keyVal24.key();
        keyVal24.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal28.value = "Content-Encoding";
        java.lang.String str31 = keyVal28.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal32.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream36 = keyVal35.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal37 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream38 = keyVal37.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray39 = new org.jsoup.Connection.KeyVal[] { keyVal24, keyVal28, keyVal32, keyVal35, keyVal37 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList40 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40, keyValArray39);
        org.jsoup.Connection connection42 = httpConnection23.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40);
        request22.data = keyValList40;
        org.jsoup.helper.HttpConnection.Request request44 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean45 = request44.ignoreContentType;
        request44.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request49 = request44.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request51 = request44.data((org.jsoup.Connection.KeyVal) keyVal50);
        org.jsoup.helper.HttpConnection.Request request52 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean53 = request52.ignoreContentType;
        request52.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request58 = request52.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy59 = request58.proxy;
        org.jsoup.helper.HttpConnection.Request request60 = request44.proxy(proxy59);
        org.jsoup.helper.HttpConnection.Request request61 = request22.proxy(proxy59);
        request61.followRedirects = false;
        org.jsoup.parser.Parser parser64 = request61.parser();
        org.jsoup.Connection connection65 = httpConnection0.parser(parser64);
        org.jsoup.Connection connection67 = httpConnection0.maxBodySize(1048576);
        org.jsoup.Connection connection70 = httpConnection0.data("null=null", "UTF-8=multipart/form-data");
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
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null=Content-Encoding" + "'", str31.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection70);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        java.net.Proxy proxy5 = request0.proxy;
        java.lang.String str6 = request0.postDataCharset;
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.Connection.Method method8 = request0.method();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "UTF-8" + "'", str6.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        java.lang.String str6 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean8 = request7.ignoreContentType;
        request7.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request12 = request7.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request14 = request7.data((org.jsoup.Connection.KeyVal) keyVal13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request18 = request14.data((org.jsoup.Connection.KeyVal) keyVal17);
        boolean boolean19 = request14.validateTLSCertificates();
        org.jsoup.helper.HttpConnection.Request request21 = request14.timeout((int) 'a');
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = request21.scanHeaders("hi!");
        org.jsoup.parser.Parser parser24 = request21.parser;
        request0.parser = parser24;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3000 + "'", int5 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser24);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        java.lang.String str7 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request6);
        java.lang.String str8 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.net.Proxy proxy19 = request16.proxy();
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response24 = response21.cookie("null=Content-Encoding", "multipart/form-data");
        int int25 = response21.statusCode();
        response21.numRedirects = 0;
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser29 = null;
        org.jsoup.Connection connection30 = httpConnection28.parser(parser29);
        org.jsoup.Connection connection32 = httpConnection28.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        boolean boolean35 = response34.executed;
        java.net.URL uRL36 = response34.url();
        boolean boolean37 = response34.executed;
        response34.executed = false;
        httpConnection28.res = response34;
        org.jsoup.helper.HttpConnection.Response response41 = null;
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response41);
        org.jsoup.Connection.Response response45 = response42.cookie("null=Content-Encoding", "multipart/form-data");
        int int46 = response42.statusCode();
        boolean boolean49 = response42.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response50 = null;
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response50);
        boolean boolean52 = response51.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap53 = response51.cookies();
        org.jsoup.helper.HttpConnection httpConnection54 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal55 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str56 = keyVal55.key();
        keyVal55.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal59 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal59.value = "Content-Encoding";
        java.lang.String str62 = keyVal59.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal63 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal63.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal66 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream67 = keyVal66.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal68 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream69 = keyVal68.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray70 = new org.jsoup.Connection.KeyVal[] { keyVal55, keyVal59, keyVal63, keyVal66, keyVal68 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList71 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71, keyValArray70);
        org.jsoup.Connection connection73 = httpConnection54.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.jsoup.helper.HttpConnection.Request request74 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean75 = request74.ignoreContentType;
        request74.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request79 = request74.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal80 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request81 = request74.data((org.jsoup.Connection.KeyVal) keyVal80);
        org.jsoup.helper.HttpConnection.Request request82 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean83 = request82.ignoreContentType;
        request82.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request88 = request82.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy89 = request88.proxy;
        org.jsoup.helper.HttpConnection.Request request90 = request74.proxy(proxy89);
        org.jsoup.Connection.Method method91 = request90.method();
        org.jsoup.Connection connection92 = httpConnection54.method(method91);
        org.jsoup.Connection.Response response93 = response51.method(method91);
        org.jsoup.Connection.Response response94 = response42.method(method91);
        org.jsoup.Connection connection95 = httpConnection28.method(method91);
        org.jsoup.Connection.Response response96 = response21.method(method91);
        org.jsoup.Connection.Request request97 = request16.method(method91);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection98 = request16.data;
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
        org.junit.Assert.assertNotNull(proxy19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "null=Content-Encoding" + "'", str62.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request90);
        org.junit.Assert.assertTrue("'" + method91 + "' != '" + org.jsoup.Connection.Method.GET + "'", method91.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection98);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.helper.HttpConnection.FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.lang.String str4 = keyVal0.value();
        keyVal0.key = "hi!=Content-Encoding=UTF-8";
        keyVal0.value = "hi!=Content-Encoding=UTF-8";
        keyVal0.key = "hi!=Content-Encoding=UTF-8";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Content-Encoding" + "'", str4.equals("Content-Encoding"));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        boolean boolean17 = request16.ignoreContentType;
        org.jsoup.parser.Parser parser18 = request16.parser();
        java.lang.String str19 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request16);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        boolean boolean6 = request0.followRedirects();
        java.lang.String str8 = request0.header("UTF-8");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request0.headers();
        org.jsoup.Connection.Request request12 = request0.cookie("application/x-www-form-urlencoded", "hi!=Content-Encoding");
        int int13 = request0.timeout();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = request0.scanHeaders("UTF-8");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection16 = request0.data;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3000 + "'", int13 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection16);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        java.lang.String str4 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        int int5 = request0.timeoutMilliseconds;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3000 + "'", int5 == 3000);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request23 = request0.data((org.jsoup.Connection.KeyVal) keyVal22);
        int int24 = request23.timeoutMilliseconds;
        boolean boolean25 = request23.ignoreHttpErrors();
        boolean boolean27 = request23.hasHeader("hi!=Content-Encoding");
        java.lang.String str28 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request23);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3000 + "'", int24 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        java.lang.String str5 = response1.getHeaderCaseInsensitive("multipart/form-data");
        response1.contentType = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("application/x-www-form-urlencoded=null=Content-Encoding");
        java.lang.String str11 = response1.header("null=multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "UTF-8");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!=Content-Encoding=UTF-8" + "'", str3.equals("hi!=Content-Encoding=UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        boolean boolean7 = request0.hasCookie("application/x-www-form-urlencoded");
        java.net.Proxy proxy8 = request0.proxy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        org.jsoup.Connection connection24 = httpConnection0.referrer("hi!");
        org.jsoup.Connection connection26 = httpConnection0.referrer("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean28 = request27.ignoreContentType;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = request27.headers();
        java.net.Proxy proxy30 = request27.proxy();
        org.jsoup.Connection connection31 = httpConnection0.request((org.jsoup.Connection.Request) request27);
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
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        request9.ignoreContentType = false;
        org.jsoup.Connection.Request request13 = request9.removeHeader("UTF-8");
        request9.followRedirects = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        int int28 = request27.timeout();
        boolean boolean29 = request27.ignoreContentType;
        org.jsoup.Connection.Request request31 = request27.ignoreHttpErrors(false);
        org.jsoup.Connection connection32 = httpConnection0.request((org.jsoup.Connection.Request) request27);
        org.jsoup.Connection connection35 = httpConnection0.proxy("Content-Encoding=hi!", 97);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3000 + "'", int28 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.jsoup.Connection connection47 = httpConnection0.validateTLSCertificates(true);
        org.jsoup.Connection connection50 = httpConnection0.cookie("null=null=Content-Encoding", "hi!=Content-Encoding=UTF-8");
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
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.jsoup.Connection.Response response24 = response8.cookie("hi!=Content-Encoding=UTF-8", "null=Content-Encoding");
        response8.executed = true;
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
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        boolean boolean6 = request4.hasCookie("application/x-www-form-urlencoded");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection7 = request4.data();
        java.lang.String str8 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request4);
        boolean boolean9 = request4.validateTLSCertificates();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request4.cookies();
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
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response12 = response1.cookie("Content-Encoding", "null=null");
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str16 = response1.cookie("UTF-8=multipart/form-data");
        java.lang.String str17 = response1.charset();
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
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        org.jsoup.Connection connection26 = httpConnection0.header("application/x-www-form-urlencoded", "");
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str30 = keyVal29.key();
        keyVal29.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal33.value = "Content-Encoding";
        java.lang.String str36 = keyVal33.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal37 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal37.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream41 = keyVal40.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal42 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream43 = keyVal42.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray44 = new org.jsoup.Connection.KeyVal[] { keyVal29, keyVal33, keyVal37, keyVal40, keyVal42 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList45 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList45, keyValArray44);
        org.jsoup.Connection connection47 = httpConnection28.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList45);
        request27.data = keyValList45;
        org.jsoup.helper.HttpConnection.Request request49 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean50 = request49.ignoreContentType;
        request49.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request54 = request49.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal55 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request56 = request49.data((org.jsoup.Connection.KeyVal) keyVal55);
        org.jsoup.helper.HttpConnection.Request request57 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean58 = request57.ignoreContentType;
        request57.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request63 = request57.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy64 = request63.proxy;
        org.jsoup.helper.HttpConnection.Request request65 = request49.proxy(proxy64);
        org.jsoup.helper.HttpConnection.Request request66 = request27.proxy(proxy64);
        int int67 = request66.timeoutMilliseconds;
        int int68 = request66.maxBodySizeBytes;
        java.util.Map<java.lang.String, java.lang.String> strMap69 = request66.headers();
        int int70 = request66.maxBodySize();
        httpConnection0.req = request66;
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
        org.junit.Assert.assertNotNull(connection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "null=Content-Encoding" + "'", str36.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3000 + "'", int67 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1048576 + "'", int68 == 1048576);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1048576 + "'", int70 == 1048576);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        java.lang.String str6 = response1.header("null=Content-Encoding");
        boolean boolean8 = response1.hasHeader("hi!=Content-Encoding=UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!=Content-Encoding", "multipart/form-data");
        org.jsoup.Connection.Response response19 = response1.header("hi!=Content-Encoding", "");
        int int20 = response1.statusCode;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
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
        org.junit.Assert.assertNotNull(response16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        java.lang.String str31 = response1.header("hi!=Content-Encoding");
        org.jsoup.Connection.Response response33 = response1.removeCookie("hi!=Content-Encoding");
        java.nio.ByteBuffer byteBuffer34 = response1.byteData;
        int int35 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response1.cookies();
        int int37 = response1.statusCode;
        org.jsoup.Connection.Response response40 = response1.cookie("Content-Encoding", "null=Content-Encoding");
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
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteBuffer34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA = "UTF-8=multipart/form-data";
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection7 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.Connection connection9 = httpConnection0.userAgent("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.numRedirects = '4';
        org.jsoup.Connection.Method method14 = response11.method();
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        org.jsoup.Connection connection17 = httpConnection0.response((org.jsoup.Connection.Response) response11);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection18.parser(parser19);
        org.jsoup.Connection connection22 = httpConnection18.userAgent("hi!");
        org.jsoup.Connection connection24 = httpConnection18.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str26 = keyVal25.key();
        keyVal25.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal29.value = "Content-Encoding";
        org.jsoup.Connection.KeyVal[] keyValArray32 = new org.jsoup.Connection.KeyVal[] { keyVal25, keyVal29 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList33 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList33, keyValArray32);
        org.jsoup.Connection connection35 = httpConnection18.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList33);
        org.jsoup.parser.Parser parser36 = null;
        org.jsoup.Connection connection37 = httpConnection18.parser(parser36);
        org.jsoup.Connection connection39 = httpConnection18.userAgent("Content-Encoding");
        java.net.Proxy proxy40 = null;
        org.jsoup.Connection connection41 = httpConnection18.proxy(proxy40);
        org.jsoup.Connection.Response response42 = httpConnection18.response();
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser44 = null;
        org.jsoup.Connection connection45 = httpConnection43.parser(parser44);
        org.jsoup.Connection connection47 = httpConnection43.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response48 = null;
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response48);
        boolean boolean50 = response49.executed;
        java.net.URL uRL51 = response49.url();
        boolean boolean52 = response49.executed;
        response49.executed = false;
        httpConnection43.res = response49;
        org.jsoup.Connection.Response response58 = response49.cookie("Content-Encoding", "");
        org.jsoup.Connection connection59 = httpConnection18.response(response58);
        org.jsoup.Connection connection60 = httpConnection0.response(response58);
        org.jsoup.Connection connection62 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Request request63 = httpConnection0.req;
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
        org.junit.Assert.assertNotNull(response16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request63);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean6 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        response1.contentType = "Content-Encoding=hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("null=null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection21 = request7.data;
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
        org.junit.Assert.assertNotNull(keyValCollection21);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        boolean boolean22 = response8.executed;
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!=Content-Encoding=UTF-8");
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
        org.junit.Assert.assertNull(byteBuffer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!=Content-Encoding", "multipart/form-data");
        boolean boolean19 = response1.hasHeaderWithValue("null=Content-Encoding", "application/x-www-form-urlencoded=null=Content-Encoding");
        org.jsoup.Connection.Request request20 = response1.req;
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
        org.junit.Assert.assertNotNull(response16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        request9.ignoreContentType = false;
        org.jsoup.Connection.Request request13 = request9.removeHeader("UTF-8");
        org.jsoup.Connection.Request request16 = request9.header("null=Content-Encoding", "UTF-8");
        org.jsoup.Connection.Request request18 = request9.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Request request20 = request9.ignoreHttpErrors(false);
        java.lang.String str21 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request9);
        int int22 = request9.maxBodySize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = request9.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTLSCertificates();
        request0.timeoutMilliseconds = (short) -1;
        boolean boolean10 = request0.followRedirects;
        boolean boolean11 = request0.ignoreHttpErrors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasHeader("hi!");
        int int7 = response1.statusCode;
        boolean boolean8 = response1.executed;
        org.jsoup.Connection.Request request9 = response1.req;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request9.data;
        org.jsoup.Connection.Request request12 = request9.removeCookie("null=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request14 = request9.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Content-Encoding");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response13 = response1.removeHeader("multipart/form-data");
        boolean boolean15 = response1.hasHeader("hi!");
        java.net.URL uRL16 = response1.url();
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
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("UTF-8", "hi!=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("null=Content-Encoding");
        java.lang.String str11 = response1.getHeaderCaseInsensitive("Content-Encoding");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.net.URL uRL13 = response1.url();
        response1.statusCode = 1;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
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
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response8.headers();
        response8.executed = false;
        java.lang.String str18 = response8.header("hi!=Content-Encoding=UTF-8");
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        request7.followRedirects = false;
        request7.parserDefined = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Request request14 = request7.proxy("application/x-www-form-urlencoded", 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:1048576");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.key();
        java.io.InputStream inputStream4 = keyVal0.stream;
        java.io.InputStream inputStream5 = null;
        keyVal0.stream = inputStream5;
        java.lang.String str7 = keyVal0.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal0.key("null=null");
        java.io.InputStream inputStream10 = keyVal0.inputStream();
        java.lang.String str11 = keyVal0.key();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null=null" + "'", str11.equals("null=null"));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(false);
        java.lang.String str5 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        org.jsoup.Connection.Request request8 = request0.cookie("UTF-8", "multipart/form-data");
        org.jsoup.parser.Parser parser9 = request0.parser();
        boolean boolean10 = request0.ignoreContentType;
        org.jsoup.Connection.Request request12 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean14 = request13.ignoreContentType;
        request13.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request18 = request13.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request20 = request13.data((org.jsoup.Connection.KeyVal) keyVal19);
        org.jsoup.helper.HttpConnection.Request request21 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean22 = request21.ignoreContentType;
        request21.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request27 = request21.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy28 = request27.proxy;
        org.jsoup.helper.HttpConnection.Request request29 = request13.proxy(proxy28);
        request0.proxy = proxy28;
        org.jsoup.Connection.Request request32 = request0.followRedirects(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        java.lang.String str6 = request0.postDataCharset;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request0.cookies();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection8 = request0.data;
        request0.maxBodySizeBytes = ' ';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "UTF-8" + "'", str6.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection8);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        org.jsoup.Connection.Response response7 = response1.header("null=Content-Encoding", "null=Content-Encoding");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str12 = response1.contentType;
        boolean boolean14 = response1.hasHeader("application/x-www-form-urlencoded=null=Content-Encoding");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        boolean boolean8 = response1.hasCookie("null=null");
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.numRedirects = '4';
        org.jsoup.Connection.Method method15 = response12.method();
        response12.statusCode = 1;
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean19 = request18.ignoreContentType;
        request18.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request23 = request18.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request25 = request18.data((org.jsoup.Connection.KeyVal) keyVal24);
        org.jsoup.helper.HttpConnection.Request request26 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean27 = request26.ignoreContentType;
        request26.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request32 = request26.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy33 = request32.proxy;
        org.jsoup.helper.HttpConnection.Request request34 = request18.proxy(proxy33);
        org.jsoup.Connection.Method method35 = request34.method();
        org.jsoup.Connection.Response response36 = response12.method(method35);
        org.jsoup.Connection.Response response37 = response10.method(method35);
        org.jsoup.Connection.Response response38 = response1.method(method35);
        org.jsoup.Connection.Response response41 = response1.cookie("Content-Encoding", "Content-Encoding");
        response1.charset = "hi!=Content-Encoding=UTF-8";
        java.lang.String str45 = response1.header("UTF-8");
        java.lang.String str46 = response1.statusMessage;
        response1.charset = "hi!=Content-Encoding";
        org.jsoup.helper.HttpConnection.Response response49 = null;
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response49);
        boolean boolean51 = response50.executed;
        java.net.URL uRL52 = response50.url();
        int int53 = response50.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap54 = response50.cookies();
        org.jsoup.Connection.Request request55 = response50.req;
        boolean boolean57 = response50.hasCookie("null=null");
        org.jsoup.helper.HttpConnection.Response response58 = null;
        org.jsoup.helper.HttpConnection.Response response59 = new org.jsoup.helper.HttpConnection.Response(response58);
        org.jsoup.helper.HttpConnection.Response response60 = null;
        org.jsoup.helper.HttpConnection.Response response61 = new org.jsoup.helper.HttpConnection.Response(response60);
        response61.numRedirects = '4';
        org.jsoup.Connection.Method method64 = response61.method();
        response61.statusCode = 1;
        org.jsoup.helper.HttpConnection.Request request67 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean68 = request67.ignoreContentType;
        request67.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request72 = request67.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal73 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request74 = request67.data((org.jsoup.Connection.KeyVal) keyVal73);
        org.jsoup.helper.HttpConnection.Request request75 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean76 = request75.ignoreContentType;
        request75.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request81 = request75.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy82 = request81.proxy;
        org.jsoup.helper.HttpConnection.Request request83 = request67.proxy(proxy82);
        org.jsoup.Connection.Method method84 = request83.method();
        org.jsoup.Connection.Response response85 = response61.method(method84);
        org.jsoup.Connection.Response response86 = response59.method(method84);
        org.jsoup.Connection.Response response87 = response50.method(method84);
        org.jsoup.Connection.Response response88 = response1.method(method84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertTrue("'" + method35 + "' != '" + org.jsoup.Connection.Method.GET + "'", method35.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request83);
        org.junit.Assert.assertTrue("'" + method84 + "' != '" + org.jsoup.Connection.Method.GET + "'", method84.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response88);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTLSCertificates();
        java.lang.String str8 = request0.postDataCharset();
        request0.validateTLSCertificates(false);
        boolean boolean11 = request0.followRedirects;
        boolean boolean12 = request0.parserDefined;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8" + "'", str8.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!=Content-Encoding");
        java.lang.String str8 = response1.header("hi!=Content-Encoding");
        response1.executed = false;
        java.lang.String str12 = response1.cookie("null=null");
        response1.contentType = "Content-Encoding=hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        response14.numRedirects = '4';
        org.jsoup.Connection.Method method17 = response14.method();
        response14.statusCode = 1;
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
        org.jsoup.Connection.Response response38 = response14.method(method37);
        org.jsoup.Connection connection39 = httpConnection0.method(method37);
        org.jsoup.helper.HttpConnection.Response response40 = null;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response40);
        boolean boolean42 = response41.executed;
        java.net.URL uRL43 = response41.url();
        int int44 = response41.statusCode;
        boolean boolean46 = response41.hasHeader("null=Content-Encoding");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry48 = response41.scanHeaders("Content-Encoding");
        response41.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap51 = response41.headers();
        org.jsoup.Connection.Response response53 = response41.removeHeader("multipart/form-data");
        httpConnection0.res = response41;
        org.jsoup.Connection connection56 = httpConnection0.maxBodySize(0);
        java.net.URL uRL57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection58 = httpConnection0.url(uRL57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(method17);
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
        org.junit.Assert.assertNotNull(response38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection56);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response6 = response1.header("null=Content-Encoding", "multipart/form-data");
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.cookie("application/x-www-form-urlencoded", "multipart/form-data");
        boolean boolean13 = response1.hasHeaderWithValue("hi!=Content-Encoding", "null=Content-Encoding");
        java.lang.String str14 = response1.statusMessage;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        int int28 = request27.timeout();
        boolean boolean29 = request27.ignoreContentType;
        org.jsoup.Connection.Request request31 = request27.ignoreHttpErrors(false);
        org.jsoup.Connection connection32 = httpConnection0.request((org.jsoup.Connection.Request) request27);
        org.jsoup.Connection connection34 = httpConnection0.maxBodySize(20);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3000 + "'", int28 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser1 = null;
        org.jsoup.Connection connection2 = httpConnection0.parser(parser1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean9 = response8.executed;
        java.net.URL uRL10 = response8.url();
        boolean boolean11 = response8.executed;
        org.jsoup.Connection.Response response13 = response8.removeCookie("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response8.headers();
        org.jsoup.Connection connection15 = httpConnection0.response((org.jsoup.Connection.Response) response8);
        org.jsoup.Connection connection17 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection20 = httpConnection0.header("application/x-www-form-urlencoded=application/x-www-form-urlencoded", "hi!");
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
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request23 = request0.data((org.jsoup.Connection.KeyVal) keyVal22);
        int int24 = request0.timeoutMilliseconds;
        request0.followRedirects = false;
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3000 + "'", int24 == 3000);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        int int15 = request7.timeout();
        request7.validateTSLCertificates = true;
        boolean boolean18 = request7.validateTLSCertificates();
        org.jsoup.Connection.Method method19 = request7.method();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + method19 + "' != '" + org.jsoup.Connection.Method.GET + "'", method19.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        int int13 = response8.statusCode();
        response8.statusCode = (short) 0;
        java.lang.String str17 = response8.cookie("null=null=Content-Encoding");
        java.lang.String str19 = response8.header("null=multipart/form-data");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        java.net.Proxy proxy3 = request0.proxy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.jsoup.parser.Parser parser20 = null;
        org.jsoup.Connection connection21 = httpConnection0.parser(parser20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.data("", "application/x-www-form-urlencoded=null=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
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
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection7 = httpConnection0.cookie("multipart/form-data", "application/x-www-form-urlencoded");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        boolean boolean6 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.lang.String str8 = response1.contentType;
        java.lang.String str10 = response1.header("hi!=Content-Encoding=UTF-8");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        java.lang.String str10 = request0.header("application/x-www-form-urlencoded");
        request0.validateTLSCertificates(false);
        org.jsoup.helper.HttpConnection.Request request14 = request0.timeout((int) (byte) 10);
        java.lang.String str16 = request0.getHeaderCaseInsensitive("hi!=Content-Encoding=UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        boolean boolean26 = request25.ignoreContentType;
        request25.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request30 = request25.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request32 = request25.data((org.jsoup.Connection.KeyVal) keyVal31);
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean34 = request33.ignoreContentType;
        request33.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request39 = request33.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy40 = request39.proxy;
        org.jsoup.helper.HttpConnection.Request request41 = request25.proxy(proxy40);
        org.jsoup.Connection.Request request43 = request41.removeCookie("hi!");
        httpConnection0.req = request43;
        org.jsoup.helper.HttpConnection httpConnection45 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser46 = null;
        org.jsoup.Connection connection47 = httpConnection45.parser(parser46);
        org.jsoup.Connection connection49 = httpConnection45.userAgent("hi!");
        org.jsoup.Connection connection51 = httpConnection45.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response52 = null;
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response52);
        boolean boolean54 = response53.executed;
        java.net.URL uRL55 = response53.url();
        boolean boolean56 = response53.executed;
        httpConnection45.res = response53;
        int int58 = response53.statusCode();
        boolean boolean61 = response53.hasHeaderWithValue("null=null", "application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = response53.headers();
        org.jsoup.Connection connection63 = httpConnection0.cookies(strMap62);
        org.jsoup.Connection connection65 = httpConnection0.timeout(10);
        org.jsoup.helper.HttpConnection.Response response66 = null;
        org.jsoup.helper.HttpConnection.Response response67 = new org.jsoup.helper.HttpConnection.Response(response66);
        boolean boolean68 = response67.executed;
        java.net.URL uRL69 = response67.url();
        boolean boolean70 = response67.executed;
        org.jsoup.Connection.Response response72 = response67.removeCookie("multipart/form-data");
        org.jsoup.Connection.Request request73 = response67.req;
        org.jsoup.Connection.Request request74 = null;
        response67.req = request74;
        org.jsoup.Connection.Response response78 = response67.header("multipart/form-data", "Content-Encoding");
        httpConnection0.res = response67;
        java.util.Map<java.lang.String, java.lang.String> strMap80 = response67.headers();
        response67.contentType = "null=null=Content-Encoding";
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap80);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        org.jsoup.Connection.Request request4 = request0.cookie("null=Content-Encoding", "hi!");
        org.jsoup.Connection.Request request6 = request0.removeHeader("null=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.Connection connection9 = httpConnection7.parser(parser8);
        org.jsoup.Connection connection11 = httpConnection7.referrer("multipart/form-data");
        org.jsoup.Connection connection14 = httpConnection7.cookie("Content-Encoding", "");
        org.jsoup.Connection connection17 = httpConnection7.header("multipart/form-data", "multipart/form-data");
        org.jsoup.Connection connection19 = httpConnection7.maxBodySize(1048576);
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser21 = request20.parser();
        org.jsoup.Connection connection22 = httpConnection7.parser(parser21);
        request0.parser = parser21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.lang.String str2 = request0.cookie("Content-Encoding");
        java.lang.String str3 = request0.postDataCharset();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection4 = request0.data();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8" + "'", str3.equals("UTF-8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValCollection4);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = 1;
        java.net.URL uRL7 = response1.url();
        org.jsoup.Connection.Request request8 = response1.req;
        response1.charset = "";
        java.lang.String str11 = response1.statusMessage;
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response14.numRedirects = '4';
        boolean boolean19 = response14.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean21 = response14.hasCookie("hi!=Content-Encoding=UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(request8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        int int5 = response1.statusCode();
        response1.numRedirects = 0;
        response1.contentType = "null=Content-Encoding";
        java.lang.String str10 = response1.charset();
        java.lang.String str12 = response1.header("null=hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        java.lang.String str6 = response1.header("null=Content-Encoding");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Response response11 = response1.cookie("null=application/x-www-form-urlencoded", "null=application/x-www-form-urlencoded");
        response1.statusMessage = "null=null=Content-Encoding";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        boolean boolean20 = response1.hasHeaderWithValue("UTF-8", "UTF-8");
        java.net.URL uRL21 = response1.url();
        org.jsoup.Connection.Response response23 = response1.removeCookie("application/x-www-form-urlencoded");
        java.lang.String str24 = response1.statusMessage();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        org.jsoup.Connection connection42 = httpConnection0.userAgent("");
        org.jsoup.Connection connection44 = httpConnection0.validateTLSCertificates(false);
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
        org.junit.Assert.assertNotNull(connection42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection44);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.helper.HttpConnection.KeyVal keyVal0 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal0.value = "Content-Encoding";
        java.lang.String str3 = keyVal0.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal0.value("null=Content-Encoding");
        boolean boolean6 = keyVal5.hasInputStream();
        java.lang.String str7 = keyVal5.value;
        java.io.InputStream inputStream8 = keyVal5.inputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("hi!=Content-Encoding=UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Content-Encoding" + "'", str3.equals("Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null=Content-Encoding" + "'", str7.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean7 = request6.ignoreContentType;
        java.lang.String str8 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request6);
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response13 = response10.cookie("null=Content-Encoding", "multipart/form-data");
        int int14 = response10.statusCode();
        boolean boolean17 = response10.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        boolean boolean20 = response19.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response19.cookies();
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str24 = keyVal23.key();
        keyVal23.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal27.value = "Content-Encoding";
        java.lang.String str30 = keyVal27.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal31.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream35 = keyVal34.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream37 = keyVal36.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray38 = new org.jsoup.Connection.KeyVal[] { keyVal23, keyVal27, keyVal31, keyVal34, keyVal36 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList39 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39, keyValArray38);
        org.jsoup.Connection connection41 = httpConnection22.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean43 = request42.ignoreContentType;
        request42.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request47 = request42.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal48 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request49 = request42.data((org.jsoup.Connection.KeyVal) keyVal48);
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean51 = request50.ignoreContentType;
        request50.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request56 = request50.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy57 = request56.proxy;
        org.jsoup.helper.HttpConnection.Request request58 = request42.proxy(proxy57);
        org.jsoup.Connection.Method method59 = request58.method();
        org.jsoup.Connection connection60 = httpConnection22.method(method59);
        org.jsoup.Connection.Response response61 = response19.method(method59);
        org.jsoup.Connection.Response response62 = response10.method(method59);
        org.jsoup.Connection.Request request63 = request6.method(method59);
        org.jsoup.Connection.Request request64 = request0.method(method59);
        java.lang.String str65 = request0.postDataCharset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null=Content-Encoding" + "'", str30.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertTrue("'" + method59 + "' != '" + org.jsoup.Connection.Method.GET + "'", method59.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "multipart/form-data" + "'", str65.equals("multipart/form-data"));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        response1.numRedirects = (short) -1;
        java.net.URL uRL15 = response1.url();
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
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.lang.String str2 = request0.cookie("Content-Encoding");
        org.jsoup.Connection.Request request4 = request0.maxBodySize((int) (byte) 0);
        org.jsoup.parser.Parser parser5 = request0.parser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.net.URL uRL3 = response1.url();
        boolean boolean4 = response1.executed;
        org.jsoup.Connection.Response response6 = response1.removeCookie("multipart/form-data");
        java.lang.String str7 = response1.statusMessage;
        response1.statusCode = (byte) -1;
        java.lang.String str10 = response1.contentType;
        boolean boolean11 = response1.executed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request23 = request0.data((org.jsoup.Connection.KeyVal) keyVal22);
        java.lang.String str24 = keyVal22.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal22.key("null=multipart/form-data");
        boolean boolean27 = keyVal22.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyVal26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        int int15 = request7.timeout();
        request7.validateTSLCertificates = true;
        boolean boolean18 = request7.validateTLSCertificates();
        java.lang.String str19 = request7.postDataCharset;
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UTF-8" + "'", str19.equals("UTF-8"));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.parser(parser8);
        request9.ignoreContentType = false;
        org.jsoup.Connection.Request request13 = request9.removeHeader("UTF-8");
        org.jsoup.Connection.Request request16 = request9.header("null=Content-Encoding", "UTF-8");
        org.jsoup.Connection.Request request18 = request9.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Request request20 = request9.ignoreHttpErrors(false);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = request9.scanHeaders("multipart/form-data");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = '4';
        boolean boolean6 = response1.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str8 = response1.cookie("hi!=Content-Encoding=UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        org.jsoup.Connection connection21 = httpConnection0.timeout((int) (short) 0);
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str25 = keyVal24.key();
        keyVal24.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal28.value = "Content-Encoding";
        java.lang.String str31 = keyVal28.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal32.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream36 = keyVal35.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal37 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream38 = keyVal37.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray39 = new org.jsoup.Connection.KeyVal[] { keyVal24, keyVal28, keyVal32, keyVal35, keyVal37 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList40 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40, keyValArray39);
        org.jsoup.Connection connection42 = httpConnection23.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40);
        request22.data = keyValList40;
        org.jsoup.helper.HttpConnection.Request request44 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean45 = request44.ignoreContentType;
        request44.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request49 = request44.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request51 = request44.data((org.jsoup.Connection.KeyVal) keyVal50);
        org.jsoup.helper.HttpConnection.Request request52 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean53 = request52.ignoreContentType;
        request52.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request58 = request52.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy59 = request58.proxy;
        org.jsoup.helper.HttpConnection.Request request60 = request44.proxy(proxy59);
        org.jsoup.helper.HttpConnection.Request request61 = request22.proxy(proxy59);
        request61.followRedirects = false;
        org.jsoup.parser.Parser parser64 = request61.parser();
        org.jsoup.Connection connection65 = httpConnection0.parser(parser64);
        org.jsoup.Connection connection67 = httpConnection0.maxBodySize(1048576);
        org.jsoup.Connection connection69 = httpConnection0.followRedirects(true);
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
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null=Content-Encoding" + "'", str31.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parser64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection69);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        boolean boolean2 = request0.followRedirects();
        boolean boolean3 = request0.ignoreHttpErrors;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        int int15 = request7.timeout();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = request7.scanHeaders("hi!");
        int int18 = request7.timeout();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = request7.cookies();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strEntry17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.jsoup.Connection connection21 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Response response22 = httpConnection0.response();
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
        org.junit.Assert.assertNotNull(connection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        org.jsoup.Connection.Request request3 = request0.removeHeader("hi!=Content-Encoding");
        java.net.URL uRL4 = request0.url();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3000 + "'", int1 == 3000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser22 = null;
        org.jsoup.Connection connection23 = httpConnection21.parser(parser22);
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        boolean boolean26 = response25.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response25.headers();
        org.jsoup.Connection connection28 = httpConnection21.data(strMap27);
        org.jsoup.Connection connection30 = httpConnection21.ignoreContentType(false);
        org.jsoup.Connection connection32 = httpConnection21.referrer("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        boolean boolean35 = response34.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response34.headers();
        response34.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = response34.cookies();
        org.jsoup.Connection connection40 = httpConnection21.cookies(strMap39);
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
        org.jsoup.helper.HttpConnection.Request request59 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser60 = request59.parser();
        org.jsoup.Connection connection61 = httpConnection41.parser(parser60);
        java.io.InputStream inputStream64 = null;
        org.jsoup.Connection connection65 = httpConnection41.data("hi!", "application/x-www-form-urlencoded", inputStream64);
        org.jsoup.Connection connection67 = httpConnection41.userAgent("hi!");
        org.jsoup.Connection connection70 = httpConnection41.header("application/x-www-form-urlencoded=null=Content-Encoding", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection httpConnection71 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser72 = null;
        org.jsoup.Connection connection73 = httpConnection71.parser(parser72);
        org.jsoup.helper.HttpConnection.Response response74 = null;
        org.jsoup.helper.HttpConnection.Response response75 = new org.jsoup.helper.HttpConnection.Response(response74);
        boolean boolean76 = response75.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap77 = response75.headers();
        org.jsoup.Connection connection78 = httpConnection71.data(strMap77);
        org.jsoup.Connection connection80 = httpConnection71.ignoreContentType(false);
        org.jsoup.Connection connection82 = httpConnection71.referrer("hi!=Content-Encoding");
        java.lang.String[] strArray87 = new java.lang.String[] { "null=Content-Encoding", "", "UTF-8", "null=Content-Encoding" };
        org.jsoup.Connection connection88 = httpConnection71.data(strArray87);
        org.jsoup.Connection connection89 = httpConnection41.data(strArray87);
        org.jsoup.Connection connection90 = httpConnection21.data(strArray87);
        org.jsoup.Connection connection91 = httpConnection0.data(strArray87);
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
        org.junit.Assert.assertNotNull(connection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap39);
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
        org.junit.Assert.assertNotNull(parser60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection91);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        boolean boolean19 = request0.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        boolean boolean20 = request0.ignoreHttpErrors();
        int int21 = request0.maxBodySize();
        request0.validateTSLCertificates = true;
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.cookie("null=Content-Encoding", "multipart/form-data");
        org.jsoup.Connection.Response response6 = response1.removeHeader("null=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.parser.Parser parser8 = null;
        org.jsoup.Connection connection9 = httpConnection7.parser(parser8);
        org.jsoup.Connection connection11 = httpConnection7.userAgent("hi!");
        org.jsoup.Connection connection13 = httpConnection7.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean16 = response15.executed;
        java.net.URL uRL17 = response15.url();
        boolean boolean18 = response15.executed;
        httpConnection7.res = response15;
        org.jsoup.Connection.Method method20 = response15.method();
        org.jsoup.helper.HttpConnection.Request request21 = new org.jsoup.helper.HttpConnection.Request();
        request21.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request25 = request21.ignoreContentType(true);
        java.net.Proxy proxy26 = request21.proxy();
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean28 = request27.ignoreContentType;
        java.lang.String str29 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request27);
        org.jsoup.helper.HttpConnection.Response response30 = null;
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response30);
        org.jsoup.Connection.Response response34 = response31.cookie("null=Content-Encoding", "multipart/form-data");
        int int35 = response31.statusCode();
        boolean boolean38 = response31.hasHeaderWithValue("multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Response response39 = null;
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response39);
        boolean boolean41 = response40.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap42 = response40.cookies();
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal44 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str45 = keyVal44.key();
        keyVal44.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal48 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal48.value = "Content-Encoding";
        java.lang.String str51 = keyVal48.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal52 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal52.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal55 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream56 = keyVal55.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal57 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream58 = keyVal57.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray59 = new org.jsoup.Connection.KeyVal[] { keyVal44, keyVal48, keyVal52, keyVal55, keyVal57 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList60 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList60, keyValArray59);
        org.jsoup.Connection connection62 = httpConnection43.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList60);
        org.jsoup.helper.HttpConnection.Request request63 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean64 = request63.ignoreContentType;
        request63.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request68 = request63.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal69 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request70 = request63.data((org.jsoup.Connection.KeyVal) keyVal69);
        org.jsoup.helper.HttpConnection.Request request71 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean72 = request71.ignoreContentType;
        request71.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request77 = request71.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy78 = request77.proxy;
        org.jsoup.helper.HttpConnection.Request request79 = request63.proxy(proxy78);
        org.jsoup.Connection.Method method80 = request79.method();
        org.jsoup.Connection connection81 = httpConnection43.method(method80);
        org.jsoup.Connection.Response response82 = response40.method(method80);
        org.jsoup.Connection.Response response83 = response31.method(method80);
        org.jsoup.Connection.Request request84 = request27.method(method80);
        org.jsoup.Connection.Request request85 = request21.method(method80);
        org.jsoup.Connection.Response response86 = response15.method(method80);
        org.jsoup.Connection.Response response87 = response1.method(method80);
        org.jsoup.Connection.Response response90 = response1.header("application/x-www-form-urlencoded", "Content-Encoding=hi!");
        java.nio.ByteBuffer byteBuffer91 = null;
        response1.byteData = byteBuffer91;
        boolean boolean93 = response1.executed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uRL17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(method20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null=Content-Encoding" + "'", str51.equals("null=Content-Encoding"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputStream58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyValArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(proxy78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request79);
        org.junit.Assert.assertTrue("'" + method80 + "' != '" + org.jsoup.Connection.Method.GET + "'", method80.equals(org.jsoup.Connection.Method.GET));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(connection81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(request85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }
}

