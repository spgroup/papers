import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTSLCertificates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection7 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        java.lang.String str6 = request0.postDataCharset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection7 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection14 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        request0.parserDefined = true;
        org.jsoup.Connection.Request request6 = request0.header("application/x-www-form-urlencoded", "hi!=Content-Encoding");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str11 = keyVal10.key();
        keyVal10.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal14.value = "Content-Encoding";
        java.lang.String str17 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal18.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream24 = keyVal23.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray25 = new org.jsoup.Connection.KeyVal[] { keyVal10, keyVal14, keyVal18, keyVal21, keyVal23 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList26 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26, keyValArray25);
        org.jsoup.Connection connection28 = httpConnection9.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26);
        request8.data = keyValList26;
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request35 = request30.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request37 = request30.data((org.jsoup.Connection.KeyVal) keyVal36);
        org.jsoup.helper.HttpConnection.Request request38 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean39 = request38.ignoreContentType;
        request38.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request44 = request38.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy45 = request44.proxy;
        org.jsoup.helper.HttpConnection.Request request46 = request30.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request47 = request8.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request48 = request0.proxy(proxy45);
        java.lang.String str50 = request0.getHeaderCaseInsensitive("Content-Encoding");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection51 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        org.jsoup.parser.Parser parser2 = request0.parser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection3 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        java.lang.String str7 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        java.net.Proxy proxy5 = request0.proxy;
        java.lang.String str7 = request0.header("hi!");
        boolean boolean8 = request0.parserDefined;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.postDataCharset = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        boolean boolean6 = request4.hasCookie("application/x-www-form-urlencoded");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection7 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        request7.followRedirects = false;
        boolean boolean10 = request7.validateTSLCertificates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        org.jsoup.Connection.Request request10 = request0.maxBodySize(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection11 = org.jsoup.helper.HttpConnection.Response.createConnection(request10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection18 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document40 = httpConnection0.get();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        boolean boolean6 = request0.followRedirects();
        java.lang.String str8 = request0.header("UTF-8");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection9 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTLSCertificates();
        java.lang.String str9 = request0.cookie("null=null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        java.net.Proxy proxy5 = request0.proxy;
        boolean boolean7 = request0.hasHeader("null=Content-Encoding");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.Connection.Request request9 = request7.removeCookie("null=Content-Encoding");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection48 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request47);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        boolean boolean6 = request0.followRedirects();
        java.lang.String str8 = request0.header("UTF-8");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection5 = request0.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection6 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        boolean boolean8 = request7.parserDefined;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection9 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.lang.String str5 = request0.postDataCharset;
        int int6 = request0.maxBodySize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.validateTLSCertificates();
        request0.parserDefined = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection10 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        org.jsoup.parser.Parser parser2 = request0.parser();
        boolean boolean3 = request0.ignoreHttpErrors;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        boolean boolean7 = request0.ignoreHttpErrors();
        java.lang.String str8 = request0.postDataCharset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request13);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean9 = request8.ignoreContentType;
        request8.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request13 = request8.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request15 = request8.data((org.jsoup.Connection.KeyVal) keyVal14);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean17 = request16.ignoreContentType;
        request16.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request22 = request16.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy23 = request22.proxy;
        org.jsoup.helper.HttpConnection.Request request24 = request8.proxy(proxy23);
        org.jsoup.Connection.Request request26 = request24.removeCookie("hi!");
        java.net.Proxy proxy27 = request24.proxy();
        org.jsoup.helper.HttpConnection.Request request28 = request7.proxy(proxy27);
        request7.ignoreHttpErrors = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(0);
        java.net.Proxy proxy5 = request0.proxy;
        java.lang.String str7 = request0.header("hi!");
        boolean boolean8 = request0.parserDefined;
        org.jsoup.parser.Parser parser9 = request0.parser();
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean11 = request10.ignoreContentType;
        request10.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request15 = request10.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request17 = request10.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean19 = request18.ignoreContentType;
        request18.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request24 = request18.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy25 = request24.proxy;
        org.jsoup.helper.HttpConnection.Request request26 = request10.proxy(proxy25);
        request26.ignoreHttpErrors = true;
        java.net.Proxy proxy29 = request26.proxy;
        org.jsoup.helper.HttpConnection.Request request30 = request0.proxy(proxy29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection31 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request30);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str11 = keyVal10.key();
        keyVal10.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal14.value = "Content-Encoding";
        java.lang.String str17 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal18.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream24 = keyVal23.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray25 = new org.jsoup.Connection.KeyVal[] { keyVal10, keyVal14, keyVal18, keyVal21, keyVal23 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList26 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26, keyValArray25);
        org.jsoup.Connection connection28 = httpConnection9.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26);
        request8.data = keyValList26;
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request35 = request30.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request37 = request30.data((org.jsoup.Connection.KeyVal) keyVal36);
        org.jsoup.helper.HttpConnection.Request request38 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean39 = request38.ignoreContentType;
        request38.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request44 = request38.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy45 = request44.proxy;
        org.jsoup.helper.HttpConnection.Request request46 = request30.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request47 = request8.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request48 = request0.proxy(proxy45);
        boolean boolean49 = request48.validateTLSCertificates();
        request48.timeoutMilliseconds = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection52 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request48);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        java.net.URL uRL22 = request0.url();
        boolean boolean23 = request0.ignoreContentType;
        java.net.URL uRL24 = request0.url();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        boolean boolean6 = request0.followRedirects();
        java.lang.String str8 = request0.header("UTF-8");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request0.headers();
        org.jsoup.Connection.Request request12 = request0.cookie("application/x-www-form-urlencoded", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean14 = request13.ignoreContentType;
        request13.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request18 = request13.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser19 = request13.parser();
        org.jsoup.helper.HttpConnection.Request request20 = request0.parser(parser19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        java.net.Proxy proxy3 = request0.proxy();
        boolean boolean4 = request0.validateTLSCertificates();
        boolean boolean7 = request0.hasHeaderWithValue("null=null", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        java.lang.String str2 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        boolean boolean3 = request0.ignoreContentType;
        org.jsoup.Connection.Request request5 = request0.maxBodySize(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str11 = keyVal10.key();
        keyVal10.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal14.value = "Content-Encoding";
        java.lang.String str17 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal18.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream24 = keyVal23.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray25 = new org.jsoup.Connection.KeyVal[] { keyVal10, keyVal14, keyVal18, keyVal21, keyVal23 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList26 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26, keyValArray25);
        org.jsoup.Connection connection28 = httpConnection9.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26);
        request8.data = keyValList26;
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request35 = request30.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request37 = request30.data((org.jsoup.Connection.KeyVal) keyVal36);
        org.jsoup.helper.HttpConnection.Request request38 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean39 = request38.ignoreContentType;
        request38.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request44 = request38.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy45 = request44.proxy;
        org.jsoup.helper.HttpConnection.Request request46 = request30.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request47 = request8.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request48 = request0.proxy(proxy45);
        boolean boolean49 = request48.validateTLSCertificates();
        request48.timeoutMilliseconds = 'a';
        request48.parserDefined = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response54 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request48);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str11 = keyVal10.key();
        keyVal10.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal14.value = "Content-Encoding";
        java.lang.String str17 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal18.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream24 = keyVal23.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray25 = new org.jsoup.Connection.KeyVal[] { keyVal10, keyVal14, keyVal18, keyVal21, keyVal23 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList26 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26, keyValArray25);
        org.jsoup.Connection connection28 = httpConnection9.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26);
        request8.data = keyValList26;
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request35 = request30.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request37 = request30.data((org.jsoup.Connection.KeyVal) keyVal36);
        org.jsoup.helper.HttpConnection.Request request38 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean39 = request38.ignoreContentType;
        request38.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request44 = request38.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy45 = request44.proxy;
        org.jsoup.helper.HttpConnection.Request request46 = request30.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request47 = request8.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request48 = request0.proxy(proxy45);
        java.lang.String str50 = request0.getHeaderCaseInsensitive("Content-Encoding");
        org.jsoup.Connection.Request request52 = request0.removeHeader("hi!=Content-Encoding");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection53 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        boolean boolean24 = request0.followRedirects;
        java.net.Proxy proxy25 = request0.proxy;
        java.lang.String str26 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean28 = request27.ignoreContentType;
        request27.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request32 = request27.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request34 = request27.data((org.jsoup.Connection.KeyVal) keyVal33);
        org.jsoup.helper.HttpConnection.Request request35 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean36 = request35.ignoreContentType;
        request35.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request41 = request35.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy42 = request41.proxy;
        org.jsoup.helper.HttpConnection.Request request43 = request27.proxy(proxy42);
        boolean boolean46 = request27.hasHeaderWithValue("Content-Encoding", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.KeyVal keyVal49 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request50 = request27.data((org.jsoup.Connection.KeyVal) keyVal49);
        org.jsoup.helper.HttpConnection.Request request51 = request0.data((org.jsoup.Connection.KeyVal) keyVal49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        boolean boolean6 = request0.followRedirects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        int int6 = request0.maxBodySizeBytes;
        boolean boolean8 = request0.hasHeader("multipart/form-data");
        boolean boolean10 = request0.hasHeader("multipart/form-data");
        boolean boolean11 = request0.validateTSLCertificates;
        int int12 = request0.maxBodySizeBytes;
        request0.validateTLSCertificates(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean4 = request3.ignoreContentType;
        request3.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request8 = request3.ignoreHttpErrors(true);
        boolean boolean9 = request3.followRedirects();
        java.lang.String str11 = request3.header("UTF-8");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request3.headers();
        org.jsoup.Connection.Request request15 = request3.cookie("application/x-www-form-urlencoded", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean17 = request16.ignoreContentType;
        request16.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request21 = request16.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser22 = request16.parser();
        org.jsoup.helper.HttpConnection.Request request23 = request3.parser(parser22);
        org.jsoup.Connection connection24 = httpConnection0.request((org.jsoup.Connection.Request) request23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response25 = httpConnection0.execute();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        int int10 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean12 = request11.ignoreContentType;
        request11.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request17 = request11.proxy("hi!", (int) (short) 0);
        request11.validateTSLCertificates = false;
        boolean boolean20 = request11.ignoreContentType;
        org.jsoup.Connection.Request request22 = request11.followRedirects(true);
        org.jsoup.parser.Parser parser23 = request11.parser();
        int int24 = request11.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean26 = request25.ignoreContentType;
        request25.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request31 = request25.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy32 = request31.proxy;
        org.jsoup.helper.HttpConnection.Request request33 = request11.proxy(proxy32);
        request0.proxy = proxy32;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection35 = request0.data();
        request0.postDataCharset = "null=Content-Encoding";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response38 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection6 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        java.lang.String str34 = request32.header("application/x-www-form-urlencoded=null=Content-Encoding");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request32);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        int int5 = request0.timeoutMilliseconds;
        int int6 = request0.maxBodySizeBytes;
        boolean boolean8 = request0.hasHeader("multipart/form-data");
        boolean boolean10 = request0.hasHeader("multipart/form-data");
        boolean boolean11 = request0.validateTSLCertificates;
        int int12 = request0.maxBodySizeBytes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        boolean boolean8 = request0.hasHeaderWithValue("Content-Encoding", "null=Content-Encoding");
        boolean boolean9 = request0.validateTSLCertificates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str11 = keyVal10.key();
        keyVal10.key = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal14.value = "Content-Encoding";
        java.lang.String str17 = keyVal14.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal18.value = "Content-Encoding";
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.io.InputStream inputStream24 = keyVal23.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray25 = new org.jsoup.Connection.KeyVal[] { keyVal10, keyVal14, keyVal18, keyVal21, keyVal23 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList26 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26, keyValArray25);
        org.jsoup.Connection connection28 = httpConnection9.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList26);
        request8.data = keyValList26;
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean31 = request30.ignoreContentType;
        request30.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request35 = request30.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.Request request37 = request30.data((org.jsoup.Connection.KeyVal) keyVal36);
        org.jsoup.helper.HttpConnection.Request request38 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean39 = request38.ignoreContentType;
        request38.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request44 = request38.proxy("hi!", (int) (short) 0);
        java.net.Proxy proxy45 = request44.proxy;
        org.jsoup.helper.HttpConnection.Request request46 = request30.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request47 = request8.proxy(proxy45);
        org.jsoup.helper.HttpConnection.Request request48 = request0.proxy(proxy45);
        java.lang.String str50 = request0.getHeaderCaseInsensitive("Content-Encoding");
        request0.validateTSLCertificates = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response53 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        request0.postDataCharset = "multipart/form-data";
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(true);
        java.net.Proxy proxy5 = request0.proxy();
        org.jsoup.Connection.Method method6 = request0.method();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        org.jsoup.parser.Parser parser6 = request0.parser();
        java.lang.String str8 = request0.header("application/x-www-form-urlencoded");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        int int1 = request0.timeout();
        boolean boolean2 = request0.ignoreContentType;
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(false);
        java.lang.String str5 = org.jsoup.helper.HttpConnection.Response.setOutputContentType((org.jsoup.Connection.Request) request0);
        org.jsoup.Connection.Request request8 = request0.cookie("UTF-8", "multipart/form-data");
        org.jsoup.parser.Parser parser9 = request0.parser();
        boolean boolean10 = request0.ignoreContentType;
        org.jsoup.Connection.Request request12 = request0.ignoreHttpErrors(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection13 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        int int41 = request39.maxBodySizeBytes;
        boolean boolean42 = request39.parserDefined;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response43 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request39);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.Connection.Request request5 = request0.ignoreHttpErrors(true);
        boolean boolean6 = request0.followRedirects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        boolean boolean1 = request0.ignoreContentType;
        request0.maxBodySizeBytes = (byte) -1;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy("hi!", (int) (short) 0);
        request0.validateTSLCertificates = false;
        boolean boolean9 = request0.ignoreContentType;
        org.jsoup.Connection.Request request11 = request0.followRedirects(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.lang.String str2 = request0.cookie("Content-Encoding");
        org.jsoup.Connection.Request request4 = request0.maxBodySize((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }
}

