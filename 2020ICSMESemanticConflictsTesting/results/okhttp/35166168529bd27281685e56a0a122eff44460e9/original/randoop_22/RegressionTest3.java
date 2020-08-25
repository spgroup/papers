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
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setAuthenticator(okAuthenticator17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setProxySelector(proxySelector19);
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
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.net.Proxy proxy12 = okHttpClient2.getProxy();
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
        org.junit.Assert.assertNull(proxy12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkAuthenticator okAuthenticator1 = okHttpClient0.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setCookieHandler(cookieHandler4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient0.getAuthenticator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(okAuthenticator6);
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
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setProxy(proxy12);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setAuthenticator(okAuthenticator15);
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
        org.junit.Assert.assertNull(responseCache14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient16);
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setAuthenticator(okAuthenticator9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setCookieHandler(cookieHandler11);
        java.util.List<java.lang.String> strList13 = okHttpClient12.getTransports();
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
        org.junit.Assert.assertNotNull(okHttpClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList13);
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
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient11.getConnectionPool();
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
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool21);
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
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
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
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
        java.net.CookieHandler cookieHandler10 = okHttpClient5.getCookieHandler();
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
        org.junit.Assert.assertNull(proxySelector9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler10);
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
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        boolean boolean12 = okHttpClient8.getFollowProtocolRedirects();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler19 = okHttpClient18.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setHostnameVerifier(hostnameVerifier20);
        java.util.List<java.lang.String> strList22 = okHttpClient21.getTransports();
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
        org.junit.Assert.assertNotNull(okHttpClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(cookieHandler19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList22);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        java.util.List<java.lang.String> strList10 = okHttpClient9.getTransports();
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setConnectionPool(connectionPool11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
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
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient14);
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
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient14.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory19);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool23 = okHttpClient22.getConnectionPool();
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
        org.junit.Assert.assertNull(connectionPool18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(okHttpClient22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(connectionPool23);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setProxySelector(proxySelector17);
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
    }
}

