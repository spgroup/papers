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
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient7.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setConnectionPool(connectionPool10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxySelector(proxySelector11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient14.getAuthenticator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setResponseCache(responseCache10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient9.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setResponseCache(responseCache13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList17 = okHttpClient14.getTransports();
        java.net.ResponseCache responseCache18 = okHttpClient14.getResponseCache();
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setProxySelector(proxySelector19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient20.setTransports((java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory17);
        java.net.CookieHandler cookieHandler19 = okHttpClient14.getCookieHandler();
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient14.setProxySelector(proxySelector20);
        java.net.ResponseCache responseCache22 = okHttpClient14.getResponseCache();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache22);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient8.getHostnameVerifier();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxySelector(proxySelector11);
        java.net.ProxySelector proxySelector13 = okHttpClient12.getProxySelector();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector13);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setProxy(proxy12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setAuthenticator(okAuthenticator14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient13.getSslSocketFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxySelector(proxySelector14);
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setProxySelector(proxySelector16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient17.getConnectionPool();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool18);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setFollowProtocolRedirects(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        java.net.ResponseCache responseCache17 = okHttpClient16.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setAuthenticator(okAuthenticator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setConnectionPool(connectionPool8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setResponseCache(responseCache10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = okHttpClient2.getCookieHandler();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxy(proxy9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient10.getConnectionPool();
        java.lang.Class<?> wildcardClass13 = okHttpClient10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        java.util.List<java.lang.String> strList10 = okHttpClient9.getTransports();
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxy(proxy11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setConnectionPool(connectionPool15);
        java.net.ProxySelector proxySelector17 = okHttpClient14.getProxySelector();
        java.net.Proxy proxy18 = okHttpClient14.getProxy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setSSLSocketFactory(sSLSocketFactory8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient9.setTransports((java.util.List<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [, hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient6.getHostnameVerifier();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient11.getConnectionPool();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool12);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setHostnameVerifier(hostnameVerifier5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setHostnameVerifier(hostnameVerifier17);
        java.net.ProxySelector proxySelector19 = okHttpClient10.getProxySelector();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector19);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setProxySelector(proxySelector10);
        java.util.List<java.lang.String> strList12 = okHttpClient11.getTransports();
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxySelector(proxySelector13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient11.getAuthenticator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient2.getAuthenticator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.ConnectionPool connectionPool1 = okHttpClient0.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setAuthenticator(okAuthenticator2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        boolean boolean11 = okHttpClient8.getFollowProtocolRedirects();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient8.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory17);
        java.net.ResponseCache responseCache19 = okHttpClient18.getResponseCache();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        java.net.Proxy proxy14 = okHttpClient11.getProxy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory17);
        java.net.CookieHandler cookieHandler19 = okHttpClient14.getCookieHandler();
        java.net.ProxySelector proxySelector20 = okHttpClient14.getProxySelector();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector20);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        java.lang.Class<?> wildcardClass16 = okHttpClient13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.CookieHandler cookieHandler19 = okHttpClient16.getCookieHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler19);
    }
}

