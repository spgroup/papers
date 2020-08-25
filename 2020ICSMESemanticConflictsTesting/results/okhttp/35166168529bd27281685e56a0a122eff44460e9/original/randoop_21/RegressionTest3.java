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
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient10.setTransports((java.util.List<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: []");
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
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.ProxySelector proxySelector11 = okHttpClient8.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
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
        org.junit.Assert.assertNull(proxySelector11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        boolean boolean13 = okHttpClient12.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient12.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setHostnameVerifier(hostnameVerifier17);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        boolean boolean8 = okHttpClient2.getFollowProtocolRedirects();
        boolean boolean9 = okHttpClient2.getFollowProtocolRedirects();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient2.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.Proxy proxy9 = okHttpClient5.getProxy();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxy(proxy10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient5.getConnectionPool();
        java.lang.Class<?> wildcardClass13 = okHttpClient5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory7);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setTransports((java.util.List<java.lang.String>) strList11);
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
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setResponseCache(responseCache17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
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
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setProxySelector(proxySelector12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        java.net.ProxySelector proxySelector16 = okHttpClient15.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient15.getHostnameVerifier();
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
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool4 = okHttpClient2.getConnectionPool();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool4);
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
        java.net.ProxySelector proxySelector11 = okHttpClient2.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setHostnameVerifier(hostnameVerifier13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setResponseCache(responseCache17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setProxySelector(proxySelector19);
        javax.net.ssl.HostnameVerifier hostnameVerifier21 = okHttpClient20.getHostnameVerifier();
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
        org.junit.Assert.assertNull(proxySelector11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier21);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.net.ResponseCache responseCache12 = okHttpClient11.getResponseCache();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient12.getConnectionPool();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setProxySelector(proxySelector16);
        java.net.CookieHandler cookieHandler18 = okHttpClient12.getCookieHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler18);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient2.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setHostnameVerifier(hostnameVerifier15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient18.getSslSocketFactory();
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
        org.junit.Assert.assertNull(okAuthenticator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory19);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxySelector(proxySelector9);
        java.net.ResponseCache responseCache11 = okHttpClient2.getResponseCache();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setResponseCache(responseCache12);
        java.lang.Class<?> wildcardClass14 = okHttpClient2.getClass();
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
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setHostnameVerifier(hostnameVerifier15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient16.getHostnameVerifier();
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
        org.junit.Assert.assertNull(hostnameVerifier17);
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
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        java.net.CookieHandler cookieHandler15 = okHttpClient14.getCookieHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        boolean boolean7 = okHttpClient2.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setProxy(proxy8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setHostnameVerifier(hostnameVerifier11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector7 = okHttpClient5.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setAuthenticator(okAuthenticator10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setResponseCache(responseCache12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.net.ProxySelector proxySelector11 = okHttpClient2.getProxySelector();
        java.util.List<java.lang.String> strList12 = okHttpClient2.getTransports();
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
        org.junit.Assert.assertNull(proxySelector11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setHostnameVerifier(hostnameVerifier9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setConnectionPool(connectionPool12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
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
        org.junit.Assert.assertNull(sSLSocketFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
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
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setAuthenticator(okAuthenticator12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient2.setHostnameVerifier(hostnameVerifier14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setFollowProtocolRedirects(false);
        java.net.Proxy proxy18 = okHttpClient17.getProxy();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setProxy(proxy11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient14.setTransports((java.util.List<java.lang.String>) strList19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
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
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setCookieHandler(cookieHandler12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
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
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkAuthenticator okAuthenticator1 = okHttpClient0.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setResponseCache(responseCache8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        java.net.Proxy proxy15 = okHttpClient11.getProxy();
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
        org.junit.Assert.assertNull(sSLSocketFactory14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy15);
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
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient2.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setHostnameVerifier(hostnameVerifier15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setProxySelector(proxySelector19);
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
        org.junit.Assert.assertNull(okAuthenticator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setHostnameVerifier(hostnameVerifier6);
        java.util.List<java.lang.String> strList8 = okHttpClient7.getTransports();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient7.getSslSocketFactory();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxySelector(proxySelector10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient2.getSslSocketFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient14.getHostnameVerifier();
        boolean boolean16 = okHttpClient14.getFollowProtocolRedirects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setFollowProtocolRedirects(true);
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
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.util.List<java.lang.String> strList9 = okHttpClient2.getTransports();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
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
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setConnectionPool(connectionPool10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient13.getHostnameVerifier();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setProxySelector(proxySelector15);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient16.setTransports((java.util.List<java.lang.String>) strList20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!, ]");
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector17 = okHttpClient11.getProxySelector();
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setCookieHandler(cookieHandler18);
        java.net.Proxy proxy20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setProxy(proxy20);
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
        org.junit.Assert.assertNull(sSLSocketFactory14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setTransports((java.util.List<java.lang.String>) strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [, ]");
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
        org.junit.Assert.assertNull(responseCache11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
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
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient4.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setConnectionPool(connectionPool6);
        java.net.ResponseCache responseCache8 = okHttpClient7.getResponseCache();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler17 = okHttpClient11.getCookieHandler();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient11.open(uRL18);
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler17);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient10.getHostnameVerifier();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient10.setTransports((java.util.List<java.lang.String>) strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory14);
        java.net.CookieHandler cookieHandler16 = okHttpClient13.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient13.getAuthenticator();
        java.net.ProxySelector proxySelector18 = okHttpClient13.getProxySelector();
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
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector18);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient12.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setAuthenticator(okAuthenticator14);
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setProxySelector(proxySelector16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory18);
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
        org.junit.Assert.assertNull(okAuthenticator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient11.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setAuthenticator(okAuthenticator14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxySelector(proxySelector7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setAuthenticator(okAuthenticator11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient8.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient9.getSslSocketFactory();
        java.lang.Class<?> wildcardClass11 = okHttpClient9.getClass();
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
        org.junit.Assert.assertNull(sSLSocketFactory10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxySelector(proxySelector9);
        java.net.ProxySelector proxySelector11 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setAuthenticator(okAuthenticator13);
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
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient12.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient12.getConnectionPool();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setProxySelector(proxySelector15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
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
        org.junit.Assert.assertNull(sSLSocketFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        java.net.ProxySelector proxySelector17 = okHttpClient16.getProxySelector();
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
        org.junit.Assert.assertNull(proxySelector17);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setCookieHandler(cookieHandler5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient4.getSslSocketFactory();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setFollowProtocolRedirects(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector19 = okHttpClient14.getProxySelector();
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient14.open(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient12.getConnectionPool();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setProxySelector(proxySelector16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient12.setConnectionPool(connectionPool18);
        java.util.List<java.lang.String> strList20 = okHttpClient12.getTransports();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList20);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setHostnameVerifier(hostnameVerifier6);
        java.util.List<java.lang.String> strList8 = okHttpClient7.getTransports();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient7.getSslSocketFactory();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxySelector(proxySelector10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient7.getSslSocketFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient5.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient5.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ResponseCache responseCache6 = okHttpClient2.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient2.getAuthenticator();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setCookieHandler(cookieHandler10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient2.getHostnameVerifier();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        java.net.Proxy proxy12 = okHttpClient10.getProxy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        java.net.CookieHandler cookieHandler17 = okHttpClient14.getCookieHandler();
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
        org.junit.Assert.assertNull(cookieHandler17);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxySelector(proxySelector9);
        java.util.List<java.lang.String> strList11 = okHttpClient10.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient10.getAuthenticator();
        java.net.Proxy proxy14 = okHttpClient10.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
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
        org.junit.Assert.assertNull(okAuthenticator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkAuthenticator okAuthenticator1 = okHttpClient0.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        com.squareup.okhttp.ConnectionPool connectionPool4 = okHttpClient3.getConnectionPool();
        boolean boolean5 = okHttpClient3.getFollowProtocolRedirects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.ResponseCache responseCache13 = okHttpClient12.getResponseCache();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient12.setTransports((java.util.List<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!, ]");
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
        org.junit.Assert.assertNull(proxySelector6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = okHttpClient12.getResponseCache();
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
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setConnectionPool(connectionPool13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient2.getSslSocketFactory();
        java.net.ProxySelector proxySelector16 = okHttpClient2.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient2.getHostnameVerifier();
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
        org.junit.Assert.assertNull(sSLSocketFactory15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.util.List<java.lang.String> strList12 = okHttpClient11.getTransports();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setTransports((java.util.List<java.lang.String>) strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: []");
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
        org.junit.Assert.assertNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        boolean boolean10 = okHttpClient8.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient8.getSslSocketFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.util.List<java.lang.String> strList7 = okHttpClient6.getTransports();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setResponseCache(responseCache9);
        java.net.CookieHandler cookieHandler11 = okHttpClient10.getCookieHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.ProxySelector proxySelector4 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient2.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache7);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.util.List<java.lang.String> strList7 = okHttpClient6.getTransports();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setResponseCache(responseCache9);
        boolean boolean11 = okHttpClient6.getFollowProtocolRedirects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = okHttpClient9.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient9.getSslSocketFactory();
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setProxy(proxy14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient9.getConnectionPool();
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
        org.junit.Assert.assertNull(proxySelector12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setResponseCache(responseCache12);
        boolean boolean14 = okHttpClient11.getFollowProtocolRedirects();
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
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxy(proxy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache18 = okHttpClient13.getResponseCache();
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
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache18);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.Proxy proxy10 = okHttpClient8.getProxy();
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setResponseCache(responseCache11);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient8.setTransports((java.util.List<java.lang.String>) strList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [, ]");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.ConnectionPool connectionPool1 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient5.getCookieHandler();
        boolean boolean7 = okHttpClient5.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setFollowProtocolRedirects(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient12.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient12.getAuthenticator();
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setProxy(proxy15);
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
        org.junit.Assert.assertNull(hostnameVerifier13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        java.net.Proxy proxy17 = okHttpClient14.getProxy();
        java.util.List<java.lang.String> strList18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setTransports(strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
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
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.Proxy proxy9 = okHttpClient5.getProxy();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxy(proxy10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient5.setAuthenticator(okAuthenticator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setProxy(proxy16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setConnectionPool(connectionPool18);
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient11.setFollowProtocolRedirects(false);
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
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient4.getSslSocketFactory();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setProxySelector(proxySelector10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxySelector(proxySelector14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient15.getConnectionPool();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sSLSocketFactory9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = okHttpClient2.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setConnectionPool(connectionPool11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector3);
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = okHttpClient4.getProxySelector();
        java.net.CookieHandler cookieHandler10 = okHttpClient4.getCookieHandler();
        java.net.ProxySelector proxySelector11 = okHttpClient4.getProxySelector();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setProxySelector(proxySelector20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
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
        org.junit.Assert.assertNull(okAuthenticator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setFollowProtocolRedirects(false);
        boolean boolean10 = okHttpClient5.getFollowProtocolRedirects();
        java.util.List<java.lang.String> strList11 = okHttpClient5.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setHostnameVerifier(hostnameVerifier12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient5.setTransports((java.util.List<java.lang.String>) strList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: []");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setResponseCache(responseCache15);
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
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setResponseCache(responseCache12);
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
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient2.getHostnameVerifier();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxy(proxy9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxy(proxy11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setAuthenticator(okAuthenticator13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        boolean boolean17 = okHttpClient14.getFollowProtocolRedirects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setCookieHandler(cookieHandler10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setResponseCache(responseCache12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
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
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient5.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient5.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setAuthenticator(okAuthenticator11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.util.List<java.lang.String> strList15 = okHttpClient12.getTransports();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        java.util.List<java.lang.String> strList8 = okHttpClient2.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = okHttpClient14.getProxySelector();
        java.net.ResponseCache responseCache16 = okHttpClient14.getResponseCache();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(responseCache16);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setProxy(proxy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(hostnameVerifier15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory3);
        java.net.Proxy proxy5 = okHttpClient0.getProxy();
        java.net.ProxySelector proxySelector6 = okHttpClient0.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setHostnameVerifier(hostnameVerifier7);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(proxySelector6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        boolean boolean8 = okHttpClient2.getFollowProtocolRedirects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        java.util.List<java.lang.String> strList12 = okHttpClient10.getTransports();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setProxySelector(proxySelector15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
    }
}

