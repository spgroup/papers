import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        java.lang.String str3 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString(request2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        java.lang.String str3 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString(request2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection4 = org.jsoup.helper.HttpConnection.Response.createConnection(request2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.referrer("");
        org.jsoup.Connection.Response response5 = httpConnection0.response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document6 = httpConnection0.get();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response4 = httpConnection0.execute();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.Connection.Request request3 = request0.ignoreContentType(false);
        org.jsoup.Connection.Request request5 = request0.removeCookie("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection6 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean6 = request0.hasCookie("null=null");
        java.lang.String str8 = request0.getHeaderCaseInsensitive("null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection9 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection5 = httpConnection0.userAgent("null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response6 = httpConnection0.execute();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        java.lang.String str9 = request7.cookie("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection5 = httpConnection0.ignoreHttpErrors(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document6 = httpConnection0.post();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.referrer("");
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document7 = httpConnection0.post();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.ignoreHttpErrors = false;
        org.jsoup.parser.Parser parser5 = request0.parser;
        org.jsoup.Connection.Request request7 = request0.removeCookie("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        org.jsoup.Connection connection9 = httpConnection0.header("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response10 = httpConnection0.execute();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.referrer("");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response7 = httpConnection0.execute();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        org.jsoup.Connection connection7 = httpConnection4.maxBodySize((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response9 = httpConnection8.response();
        httpConnection4.res = response9;
        httpConnection0.res = response9;
        org.jsoup.Connection connection14 = httpConnection0.header("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document15 = httpConnection0.post();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        boolean boolean8 = request7.ignoreContentType;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request7.headers();
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method11 = request10.method();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request10.headers();
        int int13 = request10.timeout();
        org.jsoup.parser.Parser parser14 = request10.parser();
        org.jsoup.helper.HttpConnection.Request request15 = request7.parser(parser14);
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response17 = httpConnection16.response();
        org.jsoup.Connection connection19 = httpConnection16.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection20.data("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request24 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method25 = request24.method();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = request24.headers();
        int int27 = request24.timeout();
        org.jsoup.parser.Parser parser28 = request24.parser();
        org.jsoup.Connection connection29 = httpConnection20.parser(parser28);
        org.jsoup.Connection connection30 = httpConnection16.parser(parser28);
        request15.parser = parser28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method4 = request3.method();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request3.headers();
        request3.followRedirects = false;
        boolean boolean9 = request3.hasCookie("null=null");
        java.lang.String str11 = request3.getHeaderCaseInsensitive("null=hi!");
        org.jsoup.Connection connection12 = httpConnection0.request((org.jsoup.Connection.Request) request3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response13 = httpConnection0.execute();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request0.headers();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!");
        java.lang.String str8 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.value("hi!");
        java.lang.String str11 = keyVal4.key();
        org.jsoup.helper.HttpConnection.Request request12 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL13 = request12.url();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("");
        java.lang.String str17 = keyVal13.value();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal13);
        int int19 = request18.timeout();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = request18.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = request18.headers();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response6 = httpConnection5.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response8 = httpConnection7.response();
        org.jsoup.Connection connection10 = httpConnection7.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response12 = httpConnection11.response();
        httpConnection7.res = response12;
        httpConnection5.res = response12;
        org.jsoup.Connection connection15 = httpConnection0.response(response12);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method17 = request16.method();
        boolean boolean18 = request16.followRedirects;
        org.jsoup.Connection.Request request20 = request16.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = request16.cookies();
        org.jsoup.Connection connection22 = httpConnection0.cookies(strMap21);
        org.jsoup.helper.HttpConnection.Request request23 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method24 = request23.method();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = request23.headers();
        request23.followRedirects = false;
        boolean boolean28 = request23.ignoreHttpErrors;
        org.jsoup.Connection.Method method29 = request23.method();
        int int30 = request23.maxBodySizeBytes;
        org.jsoup.helper.HttpConnection.Request request31 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method32 = request31.method();
        boolean boolean33 = request31.followRedirects;
        org.jsoup.Connection.Request request35 = request31.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = request31.headers();
        boolean boolean37 = request31.ignoreContentType;
        boolean boolean38 = request31.followRedirects();
        org.jsoup.helper.HttpConnection.Request request39 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method40 = request39.method();
        org.jsoup.Connection.Request request41 = request31.method(method40);
        org.jsoup.Connection.Request request42 = request23.method(method40);
        org.jsoup.Connection connection43 = httpConnection0.method(method40);
        org.jsoup.Connection connection46 = httpConnection0.cookie("null=hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response47 = httpConnection0.execute();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request0.headers();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = new org.jsoup.helper.HttpConnection.KeyVal("null=null", "hi!");
        org.jsoup.helper.HttpConnection.Request request7 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document1 = httpConnection0.get();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        boolean boolean14 = request0.hasHeader("hi!");
        request0.followRedirects = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection17 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.Connection.Request request4 = httpConnection0.req;
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method6 = request5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request5.headers();
        request5.followRedirects = false;
        boolean boolean10 = request5.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request12 = request5.timeout((int) ' ');
        java.lang.String str14 = request12.cookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request12.data();
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response17 = httpConnection0.execute();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("");
        java.lang.String str17 = keyVal13.value();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = request18.scanHeaders("");
        boolean boolean21 = request18.followRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = request18.cookies();
        int int23 = request18.timeoutMilliseconds;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection24 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request18);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method4 = request3.method();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request3.headers();
        request3.followRedirects = false;
        boolean boolean8 = request3.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request10 = request3.timeout((int) ' ');
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = request3.scanHeaders("null=null");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request3.headers();
        org.jsoup.Connection connection14 = httpConnection0.data(strMap13);
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method16 = request15.method();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = request15.headers();
        request15.ignoreHttpErrors = false;
        org.jsoup.parser.Parser parser20 = request15.parser;
        org.jsoup.Connection.Request request22 = request15.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = request15.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = request15.cookies();
        org.jsoup.Connection connection25 = httpConnection0.data(strMap24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response26 = httpConnection0.execute();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document2 = httpConnection0.get();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        java.lang.String[] strArray9 = new java.lang.String[] { "null=null", "null=null" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document11 = httpConnection0.post();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Response response5 = httpConnection0.res;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document6 = httpConnection0.post();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request7.headers();
        org.jsoup.Connection connection9 = httpConnection0.request((org.jsoup.Connection.Request) request7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response10 = httpConnection0.execute();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.maxBodySize((int) (short) 1);
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document7 = httpConnection0.get();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        boolean boolean13 = request0.followRedirects;
        int int14 = request0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response6 = httpConnection5.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response8 = httpConnection7.response();
        org.jsoup.Connection connection10 = httpConnection7.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response12 = httpConnection11.response();
        httpConnection7.res = response12;
        httpConnection5.res = response12;
        org.jsoup.Connection connection15 = httpConnection0.response(response12);
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection19 = httpConnection0.referrer("hi!");
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response21 = httpConnection20.response();
        org.jsoup.Connection connection23 = httpConnection20.followRedirects(false);
        org.jsoup.Connection.Response response24 = httpConnection20.response();
        httpConnection0.res = response24;
        org.jsoup.helper.HttpConnection.Request request26 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method27 = request26.method();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = request26.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = request26.headers();
        org.jsoup.Connection.Method method30 = request26.method();
        org.jsoup.Connection connection31 = httpConnection0.method(method30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response32 = httpConnection0.execute();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        java.lang.String str9 = request7.cookie("hi!");
        org.jsoup.Connection.Request request12 = request7.cookie("null=null", "null=null=null=hi!");
        boolean boolean14 = request7.hasCookie("null=null=null=hi!");
        org.jsoup.Connection.Request request16 = request7.ignoreHttpErrors(false);
        int int17 = request7.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection18 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        java.lang.String str9 = request7.cookie("hi!");
        java.lang.String str11 = request7.header("null=null");
        int int12 = request7.maxBodySize();
        java.lang.String str14 = request7.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = request7.headers();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        boolean boolean8 = request7.ignoreContentType;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        keyVal11.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.key("null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal20.key = "hi!";
        java.lang.String str23 = keyVal20.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal20.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal29.key = "hi!";
        java.lang.String str32 = keyVal29.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str34 = keyVal33.toString();
        keyVal33.value = "";
        keyVal33.value = "null=hi!";
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal39.key = "hi!";
        java.lang.String str42 = keyVal39.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal44 = keyVal39.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str46 = keyVal45.key();
        org.jsoup.Connection.KeyVal[] keyValArray47 = new org.jsoup.Connection.KeyVal[] { keyVal11, keyVal14, keyVal19, keyVal20, keyVal28, keyVal29, keyVal33, keyVal39, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList48 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList48, keyValArray47);
        request7.data = keyValList48;
        int int51 = request7.maxBodySize();
        request7.ignoreHttpErrors = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response6 = httpConnection5.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response8 = httpConnection7.response();
        org.jsoup.Connection connection10 = httpConnection7.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response12 = httpConnection11.response();
        httpConnection7.res = response12;
        httpConnection5.res = response12;
        org.jsoup.Connection connection15 = httpConnection0.response(response12);
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection19 = httpConnection0.referrer("hi!");
        org.jsoup.Connection.Request request20 = httpConnection0.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response21 = httpConnection0.execute();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request5.headers();
        httpConnection0.req = request5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document8 = httpConnection0.post();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method6 = request5.method();
        boolean boolean7 = request5.ignoreHttpErrors();
        org.jsoup.Connection.Request request10 = request5.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method12 = request11.method();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request11.headers();
        request11.followRedirects = false;
        boolean boolean16 = request11.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request18 = request11.timeout((int) ' ');
        java.lang.String str20 = request18.cookie("hi!");
        java.lang.String str22 = request18.header("null=null");
        request18.followRedirects = false;
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method26 = request25.method();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = request25.headers();
        request25.ignoreHttpErrors = false;
        org.jsoup.parser.Parser parser30 = request25.parser;
        request18.parser = parser30;
        org.jsoup.helper.HttpConnection.Request request32 = request5.parser(parser30);
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method34 = request33.method();
        org.jsoup.Connection.Request request35 = request32.method(method34);
        org.jsoup.Connection.Request request36 = request0.method(method34);
        request0.followRedirects = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response39 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document6 = httpConnection0.post();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        org.jsoup.Connection connection5 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection connection7 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection10 = httpConnection0.cookie("null=null", "null=null=null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document11 = httpConnection0.post();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request0.headers();
        java.lang.String str5 = request0.getHeaderCaseInsensitive("null=hi!");
        boolean boolean7 = request0.hasCookie("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("");
        java.lang.String str17 = keyVal13.value();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal13);
        int int19 = request18.timeout();
        request18.maxBodySizeBytes = 3000;
        org.jsoup.Connection.Request request24 = request18.header("hi!", "hi!=null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection25 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("");
        java.lang.String str17 = keyVal13.value();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal13);
        org.jsoup.Connection.Request request21 = request0.cookie("null=hi!", "null=null=null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request21);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.Connection.Request request3 = request0.ignoreContentType(false);
        org.jsoup.Connection.Request request5 = request0.removeCookie("");
        int int6 = request0.maxBodySize();
        org.jsoup.Connection.Request request8 = request0.followRedirects(false);
        java.lang.String str10 = request0.getHeaderCaseInsensitive("null=null=null=hi!");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method12 = request11.method();
        boolean boolean13 = request11.followRedirects;
        org.jsoup.Connection.Request request15 = request11.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request11.headers();
        boolean boolean17 = request11.ignoreContentType;
        request11.maxBodySizeBytes = (short) 100;
        org.jsoup.parser.Parser parser20 = request11.parser;
        org.jsoup.helper.HttpConnection.Request request21 = request0.parser(parser20);
        int int22 = request21.maxBodySize();
        java.net.URL uRL23 = request21.url();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection24 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method4 = request3.method();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request3.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request3.headers();
        org.jsoup.Connection.Method method7 = request3.method();
        org.jsoup.Connection connection8 = httpConnection0.method(method7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document9 = httpConnection0.get();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection4.data("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request8.headers();
        int int11 = request8.timeout();
        org.jsoup.parser.Parser parser12 = request8.parser();
        org.jsoup.Connection connection13 = httpConnection4.parser(parser12);
        org.jsoup.Connection connection14 = httpConnection0.parser(parser12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document15 = httpConnection0.post();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection7 = httpConnection0.referrer("null=hi!");
        org.jsoup.Connection connection10 = httpConnection0.header("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document11 = httpConnection0.get();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.timeout((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document5 = httpConnection0.get();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        java.lang.String str6 = request0.cookie("");
        boolean boolean7 = request0.ignoreContentType();
        java.lang.String str9 = request0.header("hi!=null");
        org.jsoup.Connection.Request request12 = request0.cookie("null=null=null=hi!", "null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection5 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request6.headers();
        request6.followRedirects = false;
        boolean boolean11 = request6.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request13 = request6.timeout((int) ' ');
        boolean boolean14 = request13.ignoreContentType;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        keyVal17.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal23.key("null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal26.key = "hi!";
        java.lang.String str29 = keyVal26.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = keyVal26.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal35.key = "hi!";
        java.lang.String str38 = keyVal35.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str40 = keyVal39.toString();
        keyVal39.value = "";
        keyVal39.value = "null=hi!";
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal45.key = "hi!";
        java.lang.String str48 = keyVal45.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = keyVal45.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal51 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str52 = keyVal51.key();
        org.jsoup.Connection.KeyVal[] keyValArray53 = new org.jsoup.Connection.KeyVal[] { keyVal17, keyVal20, keyVal25, keyVal26, keyVal34, keyVal35, keyVal39, keyVal45, keyVal51 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList54 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54, keyValArray53);
        request13.data = keyValList54;
        org.jsoup.Connection connection57 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54);
        org.jsoup.helper.HttpConnection.Request request58 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method59 = request58.method();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = request58.headers();
        request58.followRedirects = false;
        java.lang.String str64 = request58.cookie("");
        boolean boolean65 = request58.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request66 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method67 = request66.method();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = request66.headers();
        request66.followRedirects = false;
        boolean boolean71 = request66.ignoreHttpErrors;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection72 = request66.data();
        request58.data = keyValCollection72;
        org.jsoup.Connection connection74 = httpConnection0.data(keyValCollection72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response75 = httpConnection0.execute();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection5 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request6.headers();
        request6.followRedirects = false;
        boolean boolean11 = request6.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request13 = request6.timeout((int) ' ');
        boolean boolean14 = request13.ignoreContentType;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        keyVal17.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal23.key("null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal26.key = "hi!";
        java.lang.String str29 = keyVal26.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = keyVal26.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal35.key = "hi!";
        java.lang.String str38 = keyVal35.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str40 = keyVal39.toString();
        keyVal39.value = "";
        keyVal39.value = "null=hi!";
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal45.key = "hi!";
        java.lang.String str48 = keyVal45.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = keyVal45.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal51 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str52 = keyVal51.key();
        org.jsoup.Connection.KeyVal[] keyValArray53 = new org.jsoup.Connection.KeyVal[] { keyVal17, keyVal20, keyVal25, keyVal26, keyVal34, keyVal35, keyVal39, keyVal45, keyVal51 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList54 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54, keyValArray53);
        request13.data = keyValList54;
        org.jsoup.Connection connection57 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54);
        org.jsoup.Connection.Response response58 = httpConnection0.response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response59 = httpConnection0.execute();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.Connection.Request request4 = httpConnection0.req;
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method6 = request5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request5.headers();
        request5.followRedirects = false;
        boolean boolean10 = request5.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request12 = request5.timeout((int) ' ');
        java.lang.String str14 = request12.cookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request12.data();
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        org.jsoup.Connection connection19 = httpConnection0.header("null=null", "hi!");
        org.jsoup.Connection connection21 = httpConnection0.userAgent("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document22 = httpConnection0.get();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.referrer("");
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request7 = httpConnection0.req;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document8 = httpConnection0.post();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        request0.ignoreHttpErrors = true;
        java.net.URL uRL9 = request0.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = request0.scanHeaders("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection12 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        java.lang.String str6 = request0.cookie("");
        boolean boolean7 = request0.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request8.headers();
        request8.followRedirects = false;
        boolean boolean13 = request8.ignoreHttpErrors;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection14 = request8.data();
        request0.data = keyValCollection14;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.key("null=null");
        org.jsoup.helper.HttpConnection.Request request21 = request0.data((org.jsoup.Connection.KeyVal) keyVal20);
        java.lang.String str23 = request0.header("null=null=hi!");
        boolean boolean25 = request0.hasHeader("hi!=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        java.lang.String str6 = request0.cookie("");
        boolean boolean7 = request0.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request8.headers();
        request8.followRedirects = false;
        boolean boolean13 = request8.ignoreHttpErrors;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection14 = request8.data();
        request0.data = keyValCollection14;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.key("null=null");
        org.jsoup.helper.HttpConnection.Request request21 = request0.data((org.jsoup.Connection.KeyVal) keyVal20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection22 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document5 = httpConnection0.post();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.ignoreHttpErrors();
        org.jsoup.Connection.Request request5 = request0.cookie("hi!", "");
        boolean boolean6 = request0.ignoreContentType;
        org.jsoup.Connection.Request request9 = request0.cookie("null=hi!", "hi!");
        org.jsoup.Connection.Request request11 = request0.removeCookie("null=hi!");
        org.jsoup.Connection.Request request13 = request0.maxBodySize(307);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = request0.cookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.Connection.Request request3 = request0.ignoreContentType(false);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = request0.scanHeaders("hi!");
        boolean boolean7 = request0.hasHeader("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.referrer("");
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response7 = httpConnection0.execute();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        java.lang.String str9 = request7.cookie("hi!");
        java.lang.String str11 = request7.header("null=null");
        int int12 = request7.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request13 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method14 = request13.method();
        boolean boolean15 = request13.followRedirects;
        org.jsoup.Connection.Request request17 = request13.followRedirects(true);
        java.lang.String str19 = request13.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method21 = request20.method();
        org.jsoup.Connection.Request request22 = request13.method(method21);
        org.jsoup.Connection.Request request23 = request7.method(method21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        java.lang.String str9 = request7.cookie("hi!");
        java.lang.String str11 = request7.header("null=null");
        int int12 = request7.maxBodySize();
        java.lang.String str14 = request7.header("hi!");
        org.jsoup.parser.Parser parser15 = request7.parser;
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method17 = request16.method();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = request16.headers();
        request16.followRedirects = false;
        boolean boolean21 = request16.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request23 = request16.timeout((int) ' ');
        boolean boolean24 = request23.followRedirects();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = request23.scanHeaders("");
        request23.ignoreContentType = false;
        org.jsoup.Connection.Method method29 = request23.method();
        org.jsoup.Connection.Request request30 = request7.method(method29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response31 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        boolean boolean6 = request0.hasHeader("hi!=null");
        org.jsoup.Connection.Request request8 = request0.ignoreContentType(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.Connection.Request request4 = httpConnection0.req;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document5 = httpConnection0.post();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Response response2 = httpConnection0.res;
        org.jsoup.Connection connection4 = httpConnection0.maxBodySize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response5 = httpConnection0.execute();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response6 = httpConnection5.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response8 = httpConnection7.response();
        org.jsoup.Connection connection10 = httpConnection7.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response12 = httpConnection11.response();
        httpConnection7.res = response12;
        httpConnection5.res = response12;
        org.jsoup.Connection connection15 = httpConnection0.response(response12);
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document18 = httpConnection0.post();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request5.headers();
        httpConnection0.req = request5;
        org.jsoup.Connection.Method method8 = request5.method();
        boolean boolean10 = request5.hasHeader("hi!=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        org.jsoup.Connection connection9 = httpConnection0.header("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document10 = httpConnection0.get();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.lang.String str6 = request0.header("null=hi!");
        org.jsoup.Connection.Request request8 = request0.removeCookie("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.cookies();
        boolean boolean7 = request0.hasCookie("null=null");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = request0.scanHeaders("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request0.data;
        java.lang.String str12 = request0.header("null=null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection13 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.Connection.Request request4 = httpConnection0.req;
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method6 = request5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request5.headers();
        request5.followRedirects = false;
        boolean boolean10 = request5.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request12 = request5.timeout((int) ' ');
        java.lang.String str14 = request12.cookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request12.data();
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        org.jsoup.Connection connection19 = httpConnection0.header("null=null", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document20 = httpConnection0.post();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        boolean boolean4 = request2.followRedirects;
        org.jsoup.Connection.Request request6 = request2.followRedirects(true);
        java.lang.String str8 = request2.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method10 = request9.method();
        org.jsoup.Connection.Request request11 = request2.method(method10);
        org.jsoup.Connection.Request request12 = request0.method(method10);
        boolean boolean14 = request0.hasHeader("hi!");
        org.jsoup.Connection.Request request16 = request0.removeCookie("");
        java.net.URL uRL17 = request0.url();
        org.jsoup.Connection.Request request19 = request0.maxBodySize(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method4 = request3.method();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request3.headers();
        request3.followRedirects = false;
        boolean boolean9 = request3.hasCookie("null=null");
        java.lang.String str11 = request3.getHeaderCaseInsensitive("null=hi!");
        org.jsoup.Connection connection12 = httpConnection0.request((org.jsoup.Connection.Request) request3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str14 = keyVal13.toString();
        keyVal13.value = "";
        keyVal13.value = "null=hi!";
        keyVal13.key = "null=null";
        java.lang.String str21 = keyVal13.toString();
        java.lang.String str22 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal13.key("null=null");
        org.jsoup.helper.HttpConnection.Request request25 = request3.data((org.jsoup.Connection.KeyVal) keyVal24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection26 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request25);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection4.data("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request8.headers();
        int int11 = request8.timeout();
        org.jsoup.parser.Parser parser12 = request8.parser();
        org.jsoup.Connection connection13 = httpConnection4.parser(parser12);
        org.jsoup.Connection connection14 = httpConnection0.parser(parser12);
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method16 = request15.method();
        boolean boolean17 = request15.ignoreHttpErrors();
        org.jsoup.Connection.Request request20 = request15.cookie("hi!", "");
        boolean boolean21 = request15.ignoreContentType;
        org.jsoup.Connection.Request request24 = request15.cookie("null=hi!", "hi!");
        java.lang.String str26 = request15.getHeaderCaseInsensitive("");
        java.lang.String str28 = request15.cookie("");
        request15.ignoreContentType = false;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = request15.cookies();
        org.jsoup.Connection connection32 = httpConnection0.data(strMap31);
        org.jsoup.Connection connection34 = httpConnection0.ignoreHttpErrors(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document35 = httpConnection0.post();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection5 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request6.headers();
        request6.followRedirects = false;
        boolean boolean11 = request6.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request13 = request6.timeout((int) ' ');
        boolean boolean14 = request13.ignoreContentType;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        keyVal17.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal23.key("null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal26.key = "hi!";
        java.lang.String str29 = keyVal26.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = keyVal26.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal35.key = "hi!";
        java.lang.String str38 = keyVal35.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str40 = keyVal39.toString();
        keyVal39.value = "";
        keyVal39.value = "null=hi!";
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal45.key = "hi!";
        java.lang.String str48 = keyVal45.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal50 = keyVal45.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal51 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str52 = keyVal51.key();
        org.jsoup.Connection.KeyVal[] keyValArray53 = new org.jsoup.Connection.KeyVal[] { keyVal17, keyVal20, keyVal25, keyVal26, keyVal34, keyVal35, keyVal39, keyVal45, keyVal51 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList54 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54, keyValArray53);
        request13.data = keyValList54;
        org.jsoup.Connection connection57 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document58 = httpConnection0.get();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request0.headers();
        java.lang.String str5 = request0.getHeaderCaseInsensitive("null=hi!");
        boolean boolean7 = request0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("null=hi!", "null=hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request0.data((org.jsoup.Connection.KeyVal) keyVal10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.Connection.Request request4 = httpConnection0.req;
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method6 = request5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request5.headers();
        request5.followRedirects = false;
        boolean boolean10 = request5.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request12 = request5.timeout((int) ' ');
        java.lang.String str14 = request12.cookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request12.data();
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method18 = request17.method();
        boolean boolean19 = request17.followRedirects;
        org.jsoup.Connection.Request request21 = request17.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = request17.headers();
        request17.timeoutMilliseconds = 307;
        org.jsoup.parser.Parser parser25 = request17.parser();
        org.jsoup.Connection connection26 = httpConnection0.parser(parser25);
        org.jsoup.Connection connection29 = httpConnection0.data("null=null", "null=null");
        org.jsoup.Connection.Request request30 = httpConnection0.request();
        org.jsoup.Connection connection32 = httpConnection0.userAgent("null=null=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response33 = httpConnection0.execute();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        org.jsoup.Connection connection7 = httpConnection4.maxBodySize((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response9 = httpConnection8.response();
        httpConnection4.res = response9;
        httpConnection0.res = response9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document12 = httpConnection0.get();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        java.lang.String str6 = request0.cookie("");
        org.jsoup.Connection.Request request8 = request0.maxBodySize((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection9 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout(1048576);
        boolean boolean5 = request0.ignoreContentType;
        request0.timeoutMilliseconds = (byte) -1;
        org.jsoup.Connection.Request request9 = request0.maxBodySize((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.Connection.Request request4 = httpConnection0.req;
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method6 = request5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request5.headers();
        request5.followRedirects = false;
        boolean boolean10 = request5.ignoreHttpErrors;
        org.jsoup.Connection.Method method11 = request5.method();
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method13 = request12.method();
        boolean boolean14 = request12.followRedirects;
        org.jsoup.Connection.Request request16 = request12.followRedirects(true);
        java.lang.String str18 = request12.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method20 = request19.method();
        org.jsoup.Connection.Request request21 = request12.method(method20);
        org.jsoup.Connection.Request request22 = request5.method(method20);
        org.jsoup.Connection connection23 = httpConnection0.method(method20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response24 = httpConnection0.execute();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        boolean boolean7 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request9 = request0.timeout((int) (byte) 0);
        boolean boolean11 = request9.hasHeader("hi!=null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection12 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response6 = httpConnection5.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response8 = httpConnection7.response();
        org.jsoup.Connection connection10 = httpConnection7.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response12 = httpConnection11.response();
        httpConnection7.res = response12;
        httpConnection5.res = response12;
        org.jsoup.Connection connection15 = httpConnection0.response(response12);
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection19 = httpConnection0.referrer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document20 = httpConnection0.post();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response6 = httpConnection5.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response8 = httpConnection7.response();
        org.jsoup.Connection connection10 = httpConnection7.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response12 = httpConnection11.response();
        httpConnection7.res = response12;
        httpConnection5.res = response12;
        org.jsoup.Connection connection15 = httpConnection0.response(response12);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method17 = request16.method();
        boolean boolean18 = request16.followRedirects;
        org.jsoup.Connection.Request request20 = request16.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = request16.cookies();
        org.jsoup.Connection connection22 = httpConnection0.cookies(strMap21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document23 = httpConnection0.post();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        boolean boolean7 = request0.followRedirects();
        java.net.URL uRL8 = request0.url();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection9 = request0.data;
        java.lang.String str11 = request0.header("hi!=");
        boolean boolean12 = request0.ignoreHttpErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        org.jsoup.Connection.Request request4 = httpConnection0.request();
        org.jsoup.Connection.Response response5 = httpConnection0.res;
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        boolean boolean10 = request8.followRedirects;
        org.jsoup.Connection.Request request12 = request8.followRedirects(true);
        java.lang.String str14 = request8.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method16 = request15.method();
        org.jsoup.Connection.Request request17 = request8.method(method16);
        org.jsoup.Connection.Request request18 = request6.method(method16);
        boolean boolean20 = request6.hasHeader("hi!");
        org.jsoup.Connection.Request request22 = request6.removeCookie("");
        httpConnection0.req = request22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document24 = httpConnection0.get();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.Connection.Method method6 = request0.method();
        java.net.URL uRL7 = request0.url();
        boolean boolean8 = request0.followRedirects;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("hi!");
        java.lang.String str15 = keyVal9.value;
        org.jsoup.helper.HttpConnection.Request request16 = request0.data((org.jsoup.Connection.KeyVal) keyVal9);
        org.jsoup.Connection.Request request19 = request16.header("null=hi!", "null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request0.headers();
        org.jsoup.helper.HttpConnection.Request request5 = request0.timeout((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Response response5 = httpConnection0.res;
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        boolean boolean10 = request8.followRedirects;
        org.jsoup.Connection.Request request12 = request8.followRedirects(true);
        java.lang.String str14 = request8.header("null=hi!");
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method16 = request15.method();
        org.jsoup.Connection.Request request17 = request8.method(method16);
        org.jsoup.Connection.Request request18 = request6.method(method16);
        org.jsoup.parser.Parser parser19 = request6.parser;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response21 = httpConnection0.execute();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection4.data("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request8.headers();
        int int11 = request8.timeout();
        org.jsoup.parser.Parser parser12 = request8.parser();
        org.jsoup.Connection connection13 = httpConnection4.parser(parser12);
        org.jsoup.Connection connection14 = httpConnection0.parser(parser12);
        org.jsoup.Connection connection16 = httpConnection0.userAgent("hi!=null");
        org.jsoup.Connection.Request request17 = httpConnection0.req;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response18 = httpConnection0.execute();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        org.jsoup.Connection.Request request4 = httpConnection0.request();
        org.jsoup.Connection.Response response5 = httpConnection0.res;
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request6.headers();
        request6.followRedirects = false;
        boolean boolean11 = request6.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request13 = request6.timeout((int) ' ');
        boolean boolean14 = request13.followRedirects();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request13.data;
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response17 = httpConnection0.execute();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request5.headers();
        httpConnection0.req = request5;
        org.jsoup.Connection.Request request8 = httpConnection0.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response9 = httpConnection0.execute();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        request0.ignoreHttpErrors = true;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request0.cookies();
        int int10 = request0.maxBodySizeBytes;
        boolean boolean11 = request0.followRedirects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection.Request request3 = httpConnection0.req;
        org.jsoup.Connection.Request request4 = httpConnection0.request();
        org.jsoup.Connection.Response response5 = httpConnection0.res;
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method7 = request6.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request6.headers();
        request6.followRedirects = false;
        boolean boolean11 = request6.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request13 = request6.timeout((int) ' ');
        boolean boolean14 = request13.followRedirects();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request13.data;
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document17 = httpConnection0.post();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        request0.followRedirects = false;
        java.lang.String str10 = request0.header("null=null=null=hi!");
        int int11 = request0.timeoutMilliseconds;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection12 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        request0.ignoreHttpErrors = true;
        java.net.URL uRL9 = request0.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = request0.scanHeaders("hi!");
        java.lang.String str12 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        request0.ignoreContentType = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection15 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.cookies();
        boolean boolean7 = request0.hasCookie("null=null");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = request0.scanHeaders("hi!");
        int int10 = request0.timeoutMilliseconds;
        org.jsoup.Connection.Request request13 = request0.header("null=null=null=hi!=hi!", "null=null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        boolean boolean6 = request0.hasHeader("hi!=null");
        request0.maxBodySizeBytes = 1048576;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.cookies();
        boolean boolean7 = request0.hasCookie("null=null");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = request0.scanHeaders("hi!");
        int int10 = request0.timeoutMilliseconds;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection11 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        boolean boolean8 = request7.ignoreContentType;
        boolean boolean9 = request7.followRedirects();
        org.jsoup.Connection.Request request11 = request7.followRedirects(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        boolean boolean7 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method9 = request8.method();
        org.jsoup.Connection.Request request10 = request0.method(method9);
        boolean boolean11 = request0.followRedirects();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection12 = request0.data();
        request0.maxBodySizeBytes = 3000;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        boolean boolean8 = request7.ignoreContentType;
        boolean boolean9 = request7.followRedirects();
        java.lang.String str11 = request7.cookie("null=null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection12 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        boolean boolean7 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request9 = request0.timeout((int) (byte) 0);
        request0.timeoutMilliseconds = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection12 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        boolean boolean4 = request0.hasCookie("null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection6 = request0.data();
        boolean boolean7 = request0.ignoreHttpErrors;
        request0.ignoreContentType = true;
        java.lang.String str11 = request0.header("hi!=");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request0.cookies();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection13 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        boolean boolean8 = request7.ignoreContentType;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request7.headers();
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method11 = request10.method();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request10.headers();
        int int13 = request10.timeout();
        org.jsoup.parser.Parser parser14 = request10.parser();
        org.jsoup.helper.HttpConnection.Request request15 = request7.parser(parser14);
        boolean boolean16 = request7.ignoreHttpErrors;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection17 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request7.headers();
        org.jsoup.Connection connection9 = httpConnection0.request((org.jsoup.Connection.Request) request7);
        org.jsoup.Connection connection11 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.Request request12 = httpConnection0.req;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection13 = org.jsoup.helper.HttpConnection.Response.createConnection(request12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = request2.headers();
        request2.followRedirects = false;
        boolean boolean7 = request2.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request9 = request2.timeout((int) ' ');
        boolean boolean10 = request9.ignoreContentType;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        keyVal13.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.key("null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal22.key = "hi!";
        java.lang.String str25 = keyVal22.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = keyVal22.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal30 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal31.key = "hi!";
        java.lang.String str34 = keyVal31.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str36 = keyVal35.toString();
        keyVal35.value = "";
        keyVal35.value = "null=hi!";
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal41.key = "hi!";
        java.lang.String str44 = keyVal41.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = keyVal41.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal47 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str48 = keyVal47.key();
        org.jsoup.Connection.KeyVal[] keyValArray49 = new org.jsoup.Connection.KeyVal[] { keyVal13, keyVal16, keyVal21, keyVal22, keyVal30, keyVal31, keyVal35, keyVal41, keyVal47 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList50 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList50, keyValArray49);
        request9.data = keyValList50;
        org.jsoup.helper.HttpConnection.Request request53 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method54 = request53.method();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = request53.headers();
        request53.followRedirects = false;
        java.lang.String str59 = request53.cookie("");
        boolean boolean60 = request53.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request61 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method62 = request61.method();
        java.util.Map<java.lang.String, java.lang.String> strMap63 = request61.headers();
        request61.followRedirects = false;
        boolean boolean66 = request61.ignoreHttpErrors;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection67 = request61.data();
        request53.data = keyValCollection67;
        request9.data = keyValCollection67;
        org.jsoup.Connection connection70 = httpConnection0.data(keyValCollection67);
        org.jsoup.Connection connection72 = httpConnection0.timeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response73 = httpConnection0.execute();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request7.headers();
        org.jsoup.Connection connection9 = httpConnection0.request((org.jsoup.Connection.Request) request7);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = request7.scanHeaders("null=null");
        org.jsoup.Connection.Request request13 = request7.ignoreContentType(false);
        org.jsoup.Connection.Request request15 = request7.removeHeader("null=null=null=hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.cookies();
        boolean boolean7 = request0.hasCookie("");
        int int8 = request0.timeout();
        org.jsoup.Connection.Request request10 = request0.followRedirects(true);
        org.jsoup.parser.Parser parser11 = request0.parser();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request0.cookies();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection13 = request0.data();
        java.lang.String str15 = request0.header("null=null=null=hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        keyVal18.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal18.value("null=null=hi!");
        java.lang.String str23 = keyVal22.key;
        org.jsoup.helper.HttpConnection.Request request24 = request0.data((org.jsoup.Connection.KeyVal) keyVal22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Request request2 = request0.removeHeader("null=hi!=null=null");
        org.jsoup.Connection.Request request4 = request0.maxBodySize(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection5 = org.jsoup.helper.HttpConnection.Response.createConnection(request4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection connection3 = httpConnection0.maxBodySize((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response5 = httpConnection4.response();
        httpConnection0.res = response5;
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) (byte) 1);
        org.jsoup.Connection.Request request9 = httpConnection0.req;
        org.jsoup.Connection connection11 = httpConnection0.ignoreContentType(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Document document12 = httpConnection0.get();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean5 = request0.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request7 = request0.timeout((int) ' ');
        boolean boolean8 = request7.ignoreContentType;
        boolean boolean9 = request7.followRedirects();
        boolean boolean11 = request7.hasCookie("hi!");
        java.net.URL uRL12 = request7.url();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request7.cookies();
        org.jsoup.Connection.Request request15 = request7.followRedirects(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        java.net.URL uRL5 = request0.url();
        int int6 = request0.timeoutMilliseconds;
        org.jsoup.Connection.Request request9 = request0.header("null=null=hi!=null", "hi!=null=hi!=null");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response11 = httpConnection10.response();
        org.jsoup.Connection connection13 = httpConnection10.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response15 = httpConnection14.response();
        httpConnection10.res = response15;
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = request17.headers();
        org.jsoup.Connection connection19 = httpConnection10.request((org.jsoup.Connection.Request) request17);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = request17.scanHeaders("null=null");
        org.jsoup.Connection.Request request23 = request17.ignoreContentType(false);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection24 = request17.data;
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method26 = request25.method();
        org.jsoup.Connection.Request request28 = request25.ignoreContentType(false);
        org.jsoup.Connection.Request request30 = request25.removeCookie("");
        int int31 = request25.maxBodySize();
        org.jsoup.Connection.Request request33 = request25.followRedirects(false);
        java.lang.String str35 = request25.getHeaderCaseInsensitive("null=null=null=hi!");
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method37 = request36.method();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = request36.headers();
        request36.followRedirects = false;
        boolean boolean41 = request36.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request43 = request36.timeout((int) ' ');
        java.lang.String str45 = request43.cookie("hi!");
        java.lang.String str47 = request43.header("null=null");
        request43.followRedirects = false;
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method51 = request50.method();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = request50.headers();
        request50.ignoreHttpErrors = false;
        org.jsoup.parser.Parser parser55 = request50.parser;
        request43.parser = parser55;
        request25.parser = parser55;
        org.jsoup.helper.HttpConnection.Request request58 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method59 = request58.method();
        boolean boolean60 = request58.ignoreHttpErrors();
        org.jsoup.Connection.Request request63 = request58.cookie("hi!", "");
        boolean boolean64 = request58.ignoreContentType;
        org.jsoup.parser.Parser parser65 = request58.parser();
        request25.parser = parser65;
        request17.parser = parser65;
        request0.parser = parser65;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.HttpURLConnection httpURLConnection69 = org.jsoup.helper.HttpConnection.Response.createConnection((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.headers();
        request0.followRedirects = false;
        boolean boolean6 = request0.hasCookie("null=null");
        java.lang.String str8 = request0.getHeaderCaseInsensitive("null=hi!");
        java.lang.String str10 = request0.header("");
        java.lang.String str11 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString((org.jsoup.Connection.Request) request0);
        java.lang.String str13 = request0.header("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method1 = request0.method();
        boolean boolean2 = request0.followRedirects;
        org.jsoup.Connection.Request request4 = request0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = request0.headers();
        boolean boolean6 = request0.ignoreContentType;
        request0.ignoreHttpErrors = true;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request0.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request0.cookies();
        java.lang.String str12 = request0.getHeaderCaseInsensitive("null=null");
        org.jsoup.parser.Parser parser13 = request0.parser;
        org.jsoup.Connection.Request request15 = request0.removeHeader("null=null=hi!");
        org.jsoup.Connection.Request request18 = request0.header("null=null=", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl((org.jsoup.Connection.Request) request0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method3 = request2.method();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = request2.headers();
        request2.followRedirects = false;
        boolean boolean7 = request2.ignoreHttpErrors;
        org.jsoup.helper.HttpConnection.Request request9 = request2.timeout((int) ' ');
        boolean boolean10 = request9.ignoreContentType;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        keyVal13.key = "";
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = new org.jsoup.helper.HttpConnection.KeyVal();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = new org.jsoup.helper.HttpConnection.KeyVal("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.key("null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal22.key = "hi!";
        java.lang.String str25 = keyVal22.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = keyVal22.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal30 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "null=null");
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal31.key = "hi!";
        java.lang.String str34 = keyVal31.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str36 = keyVal35.toString();
        keyVal35.value = "";
        keyVal35.value = "null=hi!";
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = new org.jsoup.helper.HttpConnection.KeyVal();
        keyVal41.key = "hi!";
        java.lang.String str44 = keyVal41.key;
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = keyVal41.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal47 = new org.jsoup.helper.HttpConnection.KeyVal();
        java.lang.String str48 = keyVal47.key();
        org.jsoup.Connection.KeyVal[] keyValArray49 = new org.jsoup.Connection.KeyVal[] { keyVal13, keyVal16, keyVal21, keyVal22, keyVal30, keyVal31, keyVal35, keyVal41, keyVal47 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList50 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList50, keyValArray49);
        request9.data = keyValList50;
        org.jsoup.helper.HttpConnection.Request request53 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method54 = request53.method();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = request53.headers();
        request53.followRedirects = false;
        java.lang.String str59 = request53.cookie("");
        boolean boolean60 = request53.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request61 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.Connection.Method method62 = request61.method();
        java.util.Map<java.lang.String, java.lang.String> strMap63 = request61.headers();
        request61.followRedirects = false;
        boolean boolean66 = request61.ignoreHttpErrors;
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection67 = request61.data();
        request53.data = keyValCollection67;
        request9.data = keyValCollection67;
        org.jsoup.Connection connection70 = httpConnection0.data(keyValCollection67);
        org.jsoup.helper.HttpConnection httpConnection71 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response72 = httpConnection71.response();
        org.jsoup.Connection connection74 = httpConnection71.maxBodySize((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection75 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response76 = httpConnection75.response();
        httpConnection71.res = response76;
        org.jsoup.Connection connection80 = httpConnection71.header("hi!", "");
        java.lang.String[] strArray87 = new java.lang.String[] { "null=null=null=hi!", "null=null=null=hi!", "null=null", "null=hi!", "null=null", "null=null" };
        org.jsoup.Connection connection88 = httpConnection71.data(strArray87);
        org.jsoup.Connection connection89 = httpConnection0.data(strArray87);
        org.jsoup.Connection connection91 = httpConnection0.ignoreContentType(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.Connection.Response response92 = httpConnection0.execute();
    }
}

