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
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        webSocketClient0.remoteAddress = inetSocketAddress2;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler4;
        org.webbitserver.netty.WebSocketClient webSocketClient6 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = webSocketClient6.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        webSocketClient6.remoteAddress = inetSocketAddress8;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        webSocketClient6.remoteAddress = inetSocketAddress10;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest14 = webSocketClient6.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "ewVG4xgskA5UDA3T5UJq8w==");
        java.net.InetSocketAddress inetSocketAddress15 = webSocketClient6.remoteAddress;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest18 = webSocketClient6.createNettyHttpRequest("eqjfmI+2R6pehAU8HVuuUg==", "OQRljbXfpqwAxFTbNhgMRg==");
        webSocketClient0.request = httpRequest18;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler20 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler20;
        boolean boolean22 = webSocketClient0.ssl;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.net.URI uRI0 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient1 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap2 = null;
        webSocketClient1.bootstrap = clientBootstrap2;
        java.net.InetSocketAddress inetSocketAddress4 = webSocketClient1.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory5 = null;
        webSocketClient1.sslFactory = sslFactory5;
        java.lang.String str7 = webSocketClient1.base64Nonce;
        org.webbitserver.netty.WebSocketClient webSocketClient8 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = webSocketClient8.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        webSocketClient8.remoteAddress = inetSocketAddress10;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        webSocketClient8.remoteAddress = inetSocketAddress12;
        org.webbitserver.netty.WebSocketClient webSocketClient14 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest15 = webSocketClient14.request;
        java.io.InputStream inputStream16 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient18 = webSocketClient14.setupSsl(inputStream16, "hi!");
        java.lang.String str19 = webSocketClient14.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory20 = webSocketClient14.sslFactory;
        webSocketClient8.sslFactory = sslFactory20;
        webSocketClient1.sslFactory = sslFactory20;
        org.webbitserver.netty.WebSocketClient webSocketClient24 = webSocketClient1.reconnectEvery(100L);
        webSocketClient24.base64Nonce = "tddgwsv+hepJhmv+qdaMIg==";
        org.webbitserver.WebSocketHandler webSocketHandler27 = webSocketClient24.webSocketHandler;
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient webSocketClient28 = new org.webbitserver.netty.WebSocketClient(uRI0, webSocketHandler27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler27);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = webSocketClient0.exceptionHandler;
        org.jboss.netty.channel.Channel channel5 = webSocketClient0.channel;
        org.webbitserver.netty.WebSocketClient webSocketClient7 = webSocketClient0.reconnectEvery((long) (byte) 46);
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient0.reconnectEvery((long) (byte) -98);
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient9.request;
        java.lang.Class<?> wildcardClass11 = webSocketClient9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest4 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient5 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest6 = webSocketClient5.request;
        java.io.InputStream inputStream7 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient5.setupSsl(inputStream7, "hi!");
        java.lang.String str10 = webSocketClient5.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory11 = webSocketClient5.sslFactory;
        org.jboss.netty.channel.Channel channel12 = webSocketClient5.channel;
        org.webbitserver.helpers.SslFactory sslFactory13 = webSocketClient5.sslFactory;
        webSocketClient0.sslFactory = sslFactory13;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler15 = webSocketClient0.exceptionHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        java.lang.String str5 = webSocketClient0.base64Nonce();
        java.io.InputStream inputStream6 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient8 = webSocketClient0.setupSsl(inputStream6, "tddgwsv+hepJhmv+qdaMIg==");
        java.net.InetSocketAddress inetSocketAddress9 = null;
        webSocketClient0.remoteAddress = inetSocketAddress9;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap11 = webSocketClient0.bootstrap;
        java.util.concurrent.Executor executor12 = null;
        webSocketClient0.executor = executor12;
        org.webbitserver.netty.WebSocketClient webSocketClient15 = webSocketClient0.reconnectEvery((long) (byte) 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hWCbmIC1vH+d31CHZ5iPyA==" + "'", str5.equals("hWCbmIC1vH+d31CHZ5iPyA=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest4 = webSocketClient0.request;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest7 = webSocketClient0.createNettyHttpRequest("", "tKPI5Da3q0YDIjradL1w3g==");
        byte byte8 = webSocketClient0.randomByte();
        java.util.concurrent.Executor executor9 = webSocketClient0.executor;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient0.request;
        webSocketClient0.base64Nonce = "EBX0WWauX1kOOPo0Qawuug==";
        org.webbitserver.helpers.SslFactory sslFactory13 = webSocketClient0.sslFactory;
        org.jboss.netty.channel.Channel channel14 = webSocketClient0.channel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -104 + "'", byte8 == (byte) -104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sslFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel14);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap1 = null;
        webSocketClient0.bootstrap = clientBootstrap1;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap3 = webSocketClient0.bootstrap;
        java.io.InputStream inputStream4 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient6 = webSocketClient0.setupSsl(inputStream4, "");
        org.webbitserver.WebSocketHandler webSocketHandler7 = webSocketClient6.webSocketHandler;
        org.webbitserver.helpers.SslFactory sslFactory8 = webSocketClient6.sslFactory;
        org.webbitserver.helpers.SslFactory sslFactory9 = webSocketClient6.sslFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory9);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap2 = null;
        webSocketClient0.bootstrap = clientBootstrap2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler5;
        java.net.InetSocketAddress inetSocketAddress7 = webSocketClient0.remoteAddress;
        byte byte8 = webSocketClient0.randomByte();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler9;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap11 = webSocketClient0.bootstrap;
        org.webbitserver.netty.WebSocketClient webSocketClient13 = webSocketClient0.reconnectEvery((long) (byte) 88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -43 + "'", byte8 == (byte) -43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap2 = null;
        webSocketClient0.bootstrap = clientBootstrap2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest5 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient6 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest7 = webSocketClient6.request;
        java.io.InputStream inputStream8 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient10 = webSocketClient6.setupSsl(inputStream8, "hi!");
        java.lang.String str11 = webSocketClient6.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory12 = null;
        webSocketClient6.sslFactory = sslFactory12;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest16 = webSocketClient6.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        org.webbitserver.netty.WebSocketClient webSocketClient18 = webSocketClient6.reconnectEvery((long) (byte) -86);
        byte byte19 = webSocketClient18.randomByte();
        org.webbitserver.netty.WebSocketClient webSocketClient20 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest21 = webSocketClient20.request;
        java.io.InputStream inputStream22 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient24 = webSocketClient20.setupSsl(inputStream22, "hi!");
        java.lang.String str25 = webSocketClient20.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory26 = null;
        webSocketClient20.sslFactory = sslFactory26;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest30 = webSocketClient20.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler31 = null;
        webSocketClient20.ioExceptionHandler = uncaughtExceptionHandler31;
        org.webbitserver.netty.WebSocketClient webSocketClient33 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest34 = webSocketClient33.request;
        org.webbitserver.netty.WebSocketClient webSocketClient36 = webSocketClient33.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler37 = null;
        webSocketClient36.ioExceptionHandler = uncaughtExceptionHandler37;
        org.webbitserver.WebSocketHandler webSocketHandler39 = webSocketClient36.webSocketHandler;
        webSocketClient20.webSocketHandler = webSocketHandler39;
        webSocketClient18.webSocketHandler = webSocketHandler39;
        webSocketClient0.webSocketHandler = webSocketHandler39;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 16 + "'", byte19 == (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler39);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap2 = null;
        webSocketClient0.bootstrap = clientBootstrap2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        org.webbitserver.helpers.SslFactory sslFactory5 = webSocketClient0.sslFactory;
        org.webbitserver.netty.WebSocketClient webSocketClient6 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap7 = null;
        webSocketClient6.bootstrap = clientBootstrap7;
        java.net.InetSocketAddress inetSocketAddress9 = webSocketClient6.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory10 = null;
        webSocketClient6.sslFactory = sslFactory10;
        java.lang.String str12 = webSocketClient6.base64Nonce;
        org.webbitserver.WebSocketHandler webSocketHandler13 = webSocketClient6.webSocketHandler;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap14 = webSocketClient6.bootstrap;
        org.jboss.netty.channel.Channel channel15 = webSocketClient6.channel;
        org.webbitserver.WebSocketHandler webSocketHandler16 = webSocketClient6.webSocketHandler;
        org.webbitserver.netty.WebSocketClient webSocketClient18 = webSocketClient6.reconnectEvery((long) (byte) -62);
        org.webbitserver.netty.WebSocketClient webSocketClient20 = webSocketClient6.reconnectEvery((long) (byte) 69);
        webSocketClient20.base64Nonce = "dV066VQyI/HQZUNn2YPFjQ==";
        org.webbitserver.WebSocketHandler webSocketHandler23 = webSocketClient20.webSocketHandler;
        org.webbitserver.WebSocketHandler webSocketHandler24 = webSocketClient20.webSocketHandler;
        webSocketClient0.webSocketHandler = webSocketHandler24;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sslFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler24);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        webSocketClient0.remoteAddress = inetSocketAddress4;
        byte byte6 = webSocketClient0.randomByte();
        java.lang.String str7 = webSocketClient0.base64Nonce();
        java.util.concurrent.Executor executor8 = webSocketClient0.executor;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient9.request;
        java.io.InputStream inputStream11 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient13 = webSocketClient9.setupSsl(inputStream11, "hi!");
        org.webbitserver.netty.WebSocketClient webSocketClient14 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest15 = webSocketClient14.request;
        java.io.InputStream inputStream16 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient18 = webSocketClient14.setupSsl(inputStream16, "hi!");
        java.lang.String str19 = webSocketClient14.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory20 = null;
        webSocketClient14.sslFactory = sslFactory20;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest24 = webSocketClient14.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        webSocketClient13.request = httpRequest24;
        webSocketClient0.request = httpRequest24;
        java.lang.String str27 = webSocketClient0.base64Nonce;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 15 + "'", byte6 == (byte) 15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "C+C8a5B9fQ/ldmp4OaVL/g==" + "'", str7.equals("C+C8a5B9fQ/ldmp4OaVL/g=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory6 = null;
        webSocketClient0.sslFactory = sslFactory6;
        org.webbitserver.netty.WebSocketClient webSocketClient8 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = webSocketClient8.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        webSocketClient8.remoteAddress = inetSocketAddress10;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        webSocketClient8.remoteAddress = inetSocketAddress12;
        org.webbitserver.netty.WebSocketClient webSocketClient15 = webSocketClient8.reconnectEvery((long) (short) 0);
        java.io.InputStream inputStream16 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient18 = webSocketClient8.setupSsl(inputStream16, "hi!");
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap19 = webSocketClient8.bootstrap;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap20 = null;
        webSocketClient8.bootstrap = clientBootstrap20;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler22 = null;
        webSocketClient8.exceptionHandler = uncaughtExceptionHandler22;
        org.webbitserver.netty.WebSocketClient webSocketClient24 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest25 = webSocketClient24.request;
        org.webbitserver.netty.WebSocketClient webSocketClient27 = webSocketClient24.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler28 = null;
        webSocketClient27.ioExceptionHandler = uncaughtExceptionHandler28;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler30 = webSocketClient27.ioExceptionHandler;
        org.webbitserver.WebSocketHandler webSocketHandler31 = webSocketClient27.webSocketHandler;
        java.io.InputStream inputStream32 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient34 = webSocketClient27.setupSsl(inputStream32, "sHRklWFxuUvioBvMvC3SMA==");
        java.io.InputStream inputStream35 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient37 = webSocketClient27.setupSsl(inputStream35, "Xkt0/1HcBiIPEnte9llbiA==");
        org.webbitserver.netty.WebSocketClient webSocketClient38 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest39 = webSocketClient38.request;
        java.io.InputStream inputStream40 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient42 = webSocketClient38.setupSsl(inputStream40, "hi!");
        org.webbitserver.netty.WebSocketClient webSocketClient43 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler44 = webSocketClient43.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        webSocketClient43.remoteAddress = inetSocketAddress45;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        webSocketClient43.remoteAddress = inetSocketAddress47;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler49 = webSocketClient43.ioExceptionHandler;
        byte byte50 = webSocketClient43.randomByte();
        webSocketClient43.base64Nonce = "OQRljbXfpqwAxFTbNhgMRg==";
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest55 = webSocketClient43.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        webSocketClient38.request = httpRequest55;
        org.webbitserver.netty.WebSocketClient webSocketClient57 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest58 = webSocketClient57.request;
        java.io.InputStream inputStream59 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient61 = webSocketClient57.setupSsl(inputStream59, "hi!");
        org.webbitserver.netty.WebSocketClient webSocketClient62 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest63 = webSocketClient62.request;
        java.io.InputStream inputStream64 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient66 = webSocketClient62.setupSsl(inputStream64, "hi!");
        java.lang.String str67 = webSocketClient62.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory68 = null;
        webSocketClient62.sslFactory = sslFactory68;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest72 = webSocketClient62.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        webSocketClient61.request = httpRequest72;
        org.webbitserver.helpers.SslFactory sslFactory74 = webSocketClient61.sslFactory;
        webSocketClient38.sslFactory = sslFactory74;
        webSocketClient27.sslFactory = sslFactory74;
        webSocketClient8.sslFactory = sslFactory74;
        webSocketClient0.sslFactory = sslFactory74;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -108 + "'", byte50 == (byte) -108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory74);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory6 = null;
        webSocketClient0.sslFactory = sslFactory6;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient0.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        org.webbitserver.netty.WebSocketClient webSocketClient12 = webSocketClient0.reconnectEvery((long) (byte) -86);
        boolean boolean13 = webSocketClient0.ssl;
        org.jboss.netty.channel.Channel channel14 = null;
        webSocketClient0.channel = channel14;
        org.jboss.netty.channel.Channel channel16 = null;
        webSocketClient0.channel = channel16;
        webSocketClient0.base64Nonce = "+LMjhbEl0FQrEIFMVBIYVQ==";
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler20 = webSocketClient0.exceptionHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler20);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        webSocketClient3.ioExceptionHandler = uncaughtExceptionHandler4;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = webSocketClient3.ioExceptionHandler;
        org.webbitserver.WebSocketHandler webSocketHandler7 = webSocketClient3.webSocketHandler;
        java.io.InputStream inputStream8 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient10 = webSocketClient3.setupSsl(inputStream8, "sHRklWFxuUvioBvMvC3SMA==");
        java.util.concurrent.Executor executor11 = webSocketClient10.executor;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler12 = webSocketClient10.ioExceptionHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        org.webbitserver.netty.WebSocketClient webSocketClient5 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest6 = webSocketClient5.request;
        java.io.InputStream inputStream7 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient5.setupSsl(inputStream7, "hi!");
        java.lang.String str10 = webSocketClient5.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory11 = null;
        webSocketClient5.sslFactory = sslFactory11;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest15 = webSocketClient5.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        webSocketClient4.request = httpRequest15;
        org.webbitserver.helpers.SslFactory sslFactory17 = webSocketClient4.sslFactory;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap18 = null;
        webSocketClient4.bootstrap = clientBootstrap18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory17);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        webSocketClient0.remoteAddress = inetSocketAddress5;
        java.io.InputStream inputStream7 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient0.setupSsl(inputStream7, "FyeCBohRJKxN9QawrWaebw==");
        org.jboss.netty.channel.Channel channel10 = webSocketClient9.channel;
        java.lang.String str11 = webSocketClient9.base64Nonce;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest14 = webSocketClient9.createNettyHttpRequest("B4ZCRC4yuIMMWfFiTA/5gA==", "xPP1ksiopLRV3f0SNOXimw==");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory6 = null;
        webSocketClient0.sslFactory = sslFactory6;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient0.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler11 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler11;
        webSocketClient0.base64Nonce = "9AbtWmPNl+HbFS7MeIGVfA==";
        org.jboss.netty.channel.Channel channel15 = webSocketClient0.channel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.webbitserver.netty.WebSocketClient.ACCEPT_GUID = "wMOr8RgJd+5RIhgW7odnOw==";
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler4;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler6;
        org.jboss.netty.channel.Channel channel8 = null;
        webSocketClient0.channel = channel8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient3);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = webSocketClient0.exceptionHandler;
        org.jboss.netty.channel.Channel channel5 = webSocketClient0.channel;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler6;
        byte byte8 = webSocketClient0.randomByte();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler9;
        webSocketClient0.ssl = true;
        java.io.InputStream inputStream13 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient15 = webSocketClient0.setupSsl(inputStream13, "Auf9GOCjUuOt67Gsn7BeUg==");
        org.webbitserver.netty.WebSocketClient webSocketClient17 = webSocketClient0.reconnectEvery((long) (byte) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 80 + "'", byte8 == (byte) 80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient17);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap1 = null;
        webSocketClient0.bootstrap = clientBootstrap1;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap3 = webSocketClient0.bootstrap;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest6 = webSocketClient0.createNettyHttpRequest("hi!", "ewVG4xgskA5UDA3T5UJq8w==");
        org.webbitserver.netty.WebSocketClient webSocketClient7 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap8 = null;
        webSocketClient7.bootstrap = clientBootstrap8;
        java.net.InetSocketAddress inetSocketAddress10 = webSocketClient7.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory11 = null;
        webSocketClient7.sslFactory = sslFactory11;
        java.lang.String str13 = webSocketClient7.base64Nonce;
        org.webbitserver.netty.WebSocketClient webSocketClient14 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler15 = webSocketClient14.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        webSocketClient14.remoteAddress = inetSocketAddress16;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        webSocketClient14.remoteAddress = inetSocketAddress18;
        org.webbitserver.netty.WebSocketClient webSocketClient20 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest21 = webSocketClient20.request;
        java.io.InputStream inputStream22 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient24 = webSocketClient20.setupSsl(inputStream22, "hi!");
        java.lang.String str25 = webSocketClient20.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory26 = webSocketClient20.sslFactory;
        webSocketClient14.sslFactory = sslFactory26;
        webSocketClient7.sslFactory = sslFactory26;
        java.util.concurrent.Executor executor29 = null;
        webSocketClient7.executor = executor29;
        org.webbitserver.netty.WebSocketClient webSocketClient31 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest32 = webSocketClient31.request;
        java.io.InputStream inputStream33 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient35 = webSocketClient31.setupSsl(inputStream33, "hi!");
        java.lang.String str36 = webSocketClient31.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory37 = webSocketClient31.sslFactory;
        webSocketClient7.sslFactory = sslFactory37;
        webSocketClient0.sslFactory = sslFactory37;
        org.webbitserver.helpers.SslFactory sslFactory40 = webSocketClient0.sslFactory;
        java.lang.String str41 = webSocketClient0.base64Nonce;
        java.io.InputStream inputStream42 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient44 = webSocketClient0.setupSsl(inputStream42, "ddkPt9Vcl2k4yz1YdC9pXQ==");
        java.util.concurrent.Executor executor45 = null;
        webSocketClient0.executor = executor45;
        org.webbitserver.helpers.SslFactory sslFactory47 = webSocketClient0.sslFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory40);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str41 + "' != '" + "BIjwlH/FFHKH+dp9md8x/A==" + "'", str41.equals("BIjwlH/FFHKH+dp9md8x/A=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory47);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.jboss.netty.channel.Channel channel6 = webSocketClient0.channel;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = webSocketClient0.ioExceptionHandler;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        webSocketClient0.remoteAddress = inetSocketAddress8;
        java.io.InputStream inputStream10 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient12 = webSocketClient0.setupSsl(inputStream10, "/WsKtszWTSP81UJmXwDjkw==");
        org.webbitserver.netty.WebSocketClient webSocketClient13 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap14 = null;
        webSocketClient13.bootstrap = clientBootstrap14;
        java.net.InetSocketAddress inetSocketAddress16 = webSocketClient13.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory17 = null;
        webSocketClient13.sslFactory = sslFactory17;
        java.lang.String str19 = webSocketClient13.base64Nonce;
        org.webbitserver.netty.WebSocketClient webSocketClient20 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler21 = webSocketClient20.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        webSocketClient20.remoteAddress = inetSocketAddress22;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        webSocketClient20.remoteAddress = inetSocketAddress24;
        org.webbitserver.netty.WebSocketClient webSocketClient26 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest27 = webSocketClient26.request;
        java.io.InputStream inputStream28 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient30 = webSocketClient26.setupSsl(inputStream28, "hi!");
        java.lang.String str31 = webSocketClient26.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory32 = webSocketClient26.sslFactory;
        webSocketClient20.sslFactory = sslFactory32;
        webSocketClient13.sslFactory = sslFactory32;
        java.util.concurrent.Executor executor35 = null;
        webSocketClient13.executor = executor35;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest39 = webSocketClient13.createNettyHttpRequest("", "");
        java.io.InputStream inputStream40 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient42 = webSocketClient13.setupSsl(inputStream40, "");
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap43 = null;
        webSocketClient42.bootstrap = clientBootstrap43;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap45 = null;
        webSocketClient42.bootstrap = clientBootstrap45;
        org.webbitserver.helpers.SslFactory sslFactory47 = webSocketClient42.sslFactory;
        byte byte48 = webSocketClient42.randomByte();
        org.webbitserver.netty.WebSocketClient webSocketClient49 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest50 = webSocketClient49.request;
        java.io.InputStream inputStream51 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient53 = webSocketClient49.setupSsl(inputStream51, "hi!");
        java.lang.String str54 = webSocketClient49.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory55 = null;
        webSocketClient49.sslFactory = sslFactory55;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest59 = webSocketClient49.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler60 = null;
        webSocketClient49.ioExceptionHandler = uncaughtExceptionHandler60;
        org.webbitserver.netty.WebSocketClient webSocketClient62 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest63 = webSocketClient62.request;
        org.webbitserver.netty.WebSocketClient webSocketClient65 = webSocketClient62.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler66 = null;
        webSocketClient65.ioExceptionHandler = uncaughtExceptionHandler66;
        org.webbitserver.WebSocketHandler webSocketHandler68 = webSocketClient65.webSocketHandler;
        webSocketClient49.webSocketHandler = webSocketHandler68;
        webSocketClient42.webSocketHandler = webSocketHandler68;
        webSocketClient0.webSocketHandler = webSocketHandler68;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 21 + "'", byte48 == (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler68);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        webSocketClient0.remoteAddress = inetSocketAddress2;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        webSocketClient0.remoteAddress = inetSocketAddress4;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = webSocketClient0.ioExceptionHandler;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap7 = webSocketClient0.bootstrap;
        boolean boolean8 = webSocketClient0.ssl;
        org.webbitserver.netty.WebSocketClient webSocketClient10 = webSocketClient0.reconnectEvery((long) (byte) 53);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler11 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler11;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        webSocketClient0.remoteAddress = inetSocketAddress13;
        boolean boolean15 = webSocketClient0.ssl;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap1 = null;
        webSocketClient0.bootstrap = clientBootstrap1;
        java.net.InetSocketAddress inetSocketAddress3 = webSocketClient0.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory4 = null;
        webSocketClient0.sslFactory = sslFactory4;
        java.lang.String str6 = webSocketClient0.base64Nonce;
        org.webbitserver.netty.WebSocketClient webSocketClient7 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = webSocketClient7.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        webSocketClient7.remoteAddress = inetSocketAddress9;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        webSocketClient7.remoteAddress = inetSocketAddress11;
        org.webbitserver.netty.WebSocketClient webSocketClient13 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest14 = webSocketClient13.request;
        java.io.InputStream inputStream15 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient17 = webSocketClient13.setupSsl(inputStream15, "hi!");
        java.lang.String str18 = webSocketClient13.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory19 = webSocketClient13.sslFactory;
        webSocketClient7.sslFactory = sslFactory19;
        webSocketClient0.sslFactory = sslFactory19;
        org.webbitserver.netty.WebSocketClient webSocketClient23 = webSocketClient0.reconnectEvery(100L);
        webSocketClient23.base64Nonce = "tddgwsv+hepJhmv+qdaMIg==";
        org.webbitserver.WebSocketHandler webSocketHandler26 = webSocketClient23.webSocketHandler;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap27 = webSocketClient23.bootstrap;
        org.webbitserver.netty.WebSocketClient webSocketClient28 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest29 = webSocketClient28.request;
        org.webbitserver.netty.WebSocketClient webSocketClient31 = webSocketClient28.reconnectEvery((long) (short) 10);
        java.util.concurrent.Executor executor32 = webSocketClient31.executor;
        org.webbitserver.WebSocketHandler webSocketHandler33 = webSocketClient31.webSocketHandler;
        webSocketClient23.webSocketHandler = webSocketHandler33;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler33);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.reconnectEvery((long) (short) 10);
        org.webbitserver.netty.WebSocketClient webSocketClient4 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = webSocketClient4.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        webSocketClient4.remoteAddress = inetSocketAddress6;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        webSocketClient4.remoteAddress = inetSocketAddress8;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler10 = webSocketClient4.ioExceptionHandler;
        byte byte11 = webSocketClient4.randomByte();
        webSocketClient4.base64Nonce = "OQRljbXfpqwAxFTbNhgMRg==";
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest16 = webSocketClient4.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        webSocketClient0.request = httpRequest16;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap18 = webSocketClient0.bootstrap;
        org.webbitserver.netty.WebSocketClient webSocketClient19 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler20 = webSocketClient19.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        webSocketClient19.remoteAddress = inetSocketAddress21;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        webSocketClient19.remoteAddress = inetSocketAddress23;
        boolean boolean25 = webSocketClient19.ssl;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        webSocketClient19.remoteAddress = inetSocketAddress26;
        org.webbitserver.netty.WebSocketClient webSocketClient28 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest29 = webSocketClient28.request;
        org.webbitserver.netty.WebSocketClient webSocketClient31 = webSocketClient28.reconnectEvery((long) (short) 10);
        java.util.concurrent.Executor executor32 = webSocketClient31.executor;
        org.webbitserver.WebSocketHandler webSocketHandler33 = webSocketClient31.webSocketHandler;
        webSocketClient19.webSocketHandler = webSocketHandler33;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler35 = webSocketClient19.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler36 = webSocketClient19.ioExceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler37 = webSocketClient19.exceptionHandler;
        org.webbitserver.netty.WebSocketClient webSocketClient38 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest39 = webSocketClient38.request;
        java.io.InputStream inputStream40 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient42 = webSocketClient38.setupSsl(inputStream40, "hi!");
        java.lang.String str43 = webSocketClient38.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory44 = null;
        webSocketClient38.sslFactory = sslFactory44;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest48 = webSocketClient38.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler49 = null;
        webSocketClient38.ioExceptionHandler = uncaughtExceptionHandler49;
        org.webbitserver.netty.WebSocketClient webSocketClient51 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest52 = webSocketClient51.request;
        org.webbitserver.netty.WebSocketClient webSocketClient54 = webSocketClient51.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler55 = null;
        webSocketClient54.ioExceptionHandler = uncaughtExceptionHandler55;
        org.webbitserver.WebSocketHandler webSocketHandler57 = webSocketClient54.webSocketHandler;
        webSocketClient38.webSocketHandler = webSocketHandler57;
        webSocketClient19.webSocketHandler = webSocketHandler57;
        webSocketClient0.webSocketHandler = webSocketHandler57;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 101 + "'", byte11 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler57);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap1 = null;
        webSocketClient0.bootstrap = clientBootstrap1;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = webSocketClient3.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        webSocketClient3.remoteAddress = inetSocketAddress5;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        webSocketClient3.remoteAddress = inetSocketAddress7;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest11 = webSocketClient3.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "ewVG4xgskA5UDA3T5UJq8w==");
        webSocketClient0.request = httpRequest11;
        java.util.concurrent.Executor executor13 = webSocketClient0.executor;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest14 = webSocketClient0.request;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler15 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler15;
        byte byte17 = webSocketClient0.randomByte();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler18 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -29 + "'", byte17 == (byte) -29);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory6 = null;
        webSocketClient0.sslFactory = sslFactory6;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient0.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        org.webbitserver.netty.WebSocketClient webSocketClient12 = webSocketClient0.reconnectEvery((long) (byte) -86);
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap13 = webSocketClient0.bootstrap;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler14 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler14;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap16 = webSocketClient0.bootstrap;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap16);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap2 = null;
        webSocketClient0.bootstrap = clientBootstrap2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler5;
        java.io.InputStream inputStream7 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient0.setupSsl(inputStream7, "sHRklWFxuUvioBvMvC3SMA==");
        java.io.InputStream inputStream10 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient12 = webSocketClient0.setupSsl(inputStream10, "vt2roa2EYfofikPObkbJ1A==");
        org.jboss.netty.channel.Channel channel13 = null;
        webSocketClient0.channel = channel13;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest17 = webSocketClient0.createNettyHttpRequest("jEHpMuNaCEjwjXnxE1CRvg==", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        webSocketClient0.remoteAddress = inetSocketAddress2;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        webSocketClient0.remoteAddress = inetSocketAddress4;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest6 = webSocketClient0.request;
        java.io.InputStream inputStream7 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient0.setupSsl(inputStream7, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        java.lang.String str10 = webSocketClient9.base64Nonce;
        java.lang.String str11 = webSocketClient9.base64Nonce();
        java.io.InputStream inputStream12 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient14 = webSocketClient9.setupSsl(inputStream12, "vfAYDIhs3BN6mF8fzWLmRQ==");
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap15 = webSocketClient14.bootstrap;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str11 + "' != '" + "C8MiSmtooeRobUVVJgkLbw==" + "'", str11.equals("C8MiSmtooeRobUVVJgkLbw=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap15);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap1 = null;
        webSocketClient0.bootstrap = clientBootstrap1;
        java.net.InetSocketAddress inetSocketAddress3 = webSocketClient0.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory4 = null;
        webSocketClient0.sslFactory = sslFactory4;
        java.lang.String str6 = webSocketClient0.base64Nonce;
        org.webbitserver.netty.WebSocketClient webSocketClient7 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = webSocketClient7.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        webSocketClient7.remoteAddress = inetSocketAddress9;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        webSocketClient7.remoteAddress = inetSocketAddress11;
        org.webbitserver.netty.WebSocketClient webSocketClient13 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest14 = webSocketClient13.request;
        java.io.InputStream inputStream15 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient17 = webSocketClient13.setupSsl(inputStream15, "hi!");
        java.lang.String str18 = webSocketClient13.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory19 = webSocketClient13.sslFactory;
        webSocketClient7.sslFactory = sslFactory19;
        webSocketClient0.sslFactory = sslFactory19;
        java.util.concurrent.Executor executor22 = null;
        webSocketClient0.executor = executor22;
        org.webbitserver.WebSocketHandler webSocketHandler24 = webSocketClient0.webSocketHandler;
        java.lang.String str25 = webSocketClient0.base64Nonce();
        java.util.concurrent.Executor executor26 = webSocketClient0.executor;
        org.webbitserver.netty.WebSocketClient webSocketClient27 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler28 = webSocketClient27.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        webSocketClient27.remoteAddress = inetSocketAddress29;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        webSocketClient27.remoteAddress = inetSocketAddress31;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler33 = webSocketClient27.ioExceptionHandler;
        byte byte34 = webSocketClient27.randomByte();
        webSocketClient27.base64Nonce = "OQRljbXfpqwAxFTbNhgMRg==";
        org.webbitserver.netty.WebSocketClient webSocketClient37 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler38 = webSocketClient37.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler39 = null;
        webSocketClient37.exceptionHandler = uncaughtExceptionHandler39;
        java.util.concurrent.Executor executor41 = webSocketClient37.executor;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        webSocketClient37.remoteAddress = inetSocketAddress42;
        java.io.InputStream inputStream44 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient46 = webSocketClient37.setupSsl(inputStream44, "FyeCBohRJKxN9QawrWaebw==");
        org.webbitserver.netty.WebSocketClient webSocketClient47 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest48 = webSocketClient47.request;
        org.webbitserver.netty.WebSocketClient webSocketClient50 = webSocketClient47.reconnectEvery((long) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler51 = null;
        webSocketClient50.ioExceptionHandler = uncaughtExceptionHandler51;
        org.webbitserver.WebSocketHandler webSocketHandler53 = webSocketClient50.webSocketHandler;
        webSocketClient46.webSocketHandler = webSocketHandler53;
        webSocketClient27.webSocketHandler = webSocketHandler53;
        webSocketClient0.webSocketHandler = webSocketHandler53;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str25 + "' != '" + "zW8lDlea+vDaA2UC0ZBQFw==" + "'", str25.equals("zW8lDlea+vDaA2UC0ZBQFw=="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler33);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -31 + "'", byte34 == (byte) -31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketHandler53);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory6 = null;
        webSocketClient0.sslFactory = sslFactory6;
        org.webbitserver.WebSocketHandler webSocketHandler8 = webSocketClient0.webSocketHandler;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap9 = webSocketClient0.bootstrap;
        java.net.InetSocketAddress inetSocketAddress10 = webSocketClient0.remoteAddress;
        org.webbitserver.netty.WebSocketClient webSocketClient11 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap12 = null;
        webSocketClient11.bootstrap = clientBootstrap12;
        java.net.InetSocketAddress inetSocketAddress14 = webSocketClient11.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory15 = null;
        webSocketClient11.sslFactory = sslFactory15;
        java.lang.String str17 = webSocketClient11.base64Nonce;
        org.webbitserver.WebSocketHandler webSocketHandler18 = webSocketClient11.webSocketHandler;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap19 = webSocketClient11.bootstrap;
        org.jboss.netty.channel.Channel channel20 = webSocketClient11.channel;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap21 = webSocketClient11.bootstrap;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest24 = webSocketClient11.createNettyHttpRequest("SxEZSSfp6KMj++PFHflafQ==", "OQRljbXfpqwAxFTbNhgMRg==");
        webSocketClient0.request = httpRequest24;
        org.webbitserver.netty.WebSocketClient webSocketClient26 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest27 = webSocketClient26.request;
        java.io.InputStream inputStream28 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient30 = webSocketClient26.setupSsl(inputStream28, "hi!");
        java.lang.String str31 = webSocketClient26.base64Nonce;
        org.webbitserver.netty.WebSocketClient webSocketClient32 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler33 = webSocketClient32.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        webSocketClient32.remoteAddress = inetSocketAddress34;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        webSocketClient32.remoteAddress = inetSocketAddress36;
        org.webbitserver.netty.WebSocketClient webSocketClient38 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest39 = webSocketClient38.request;
        java.io.InputStream inputStream40 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient42 = webSocketClient38.setupSsl(inputStream40, "hi!");
        java.lang.String str43 = webSocketClient38.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory44 = webSocketClient38.sslFactory;
        webSocketClient32.sslFactory = sslFactory44;
        webSocketClient26.sslFactory = sslFactory44;
        org.webbitserver.netty.WebSocketClient webSocketClient47 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest48 = webSocketClient47.request;
        java.io.InputStream inputStream49 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient51 = webSocketClient47.setupSsl(inputStream49, "hi!");
        java.lang.String str52 = webSocketClient47.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory53 = webSocketClient47.sslFactory;
        webSocketClient26.sslFactory = sslFactory53;
        webSocketClient0.sslFactory = sslFactory53;
        webSocketClient0.base64Nonce = "J6QAmU54EhhkqGmZsRPiQA==";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory53);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        java.io.InputStream inputStream2 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.setupSsl(inputStream2, "hi!");
        java.lang.String str5 = webSocketClient0.base64Nonce;
        org.webbitserver.helpers.SslFactory sslFactory6 = null;
        webSocketClient0.sslFactory = sslFactory6;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest10 = webSocketClient0.createNettyHttpRequest("ewVG4xgskA5UDA3T5UJq8w==", "tddgwsv+hepJhmv+qdaMIg==");
        org.webbitserver.netty.WebSocketClient webSocketClient12 = webSocketClient0.reconnectEvery((long) (byte) -86);
        java.io.InputStream inputStream13 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient15 = webSocketClient12.setupSsl(inputStream13, "");
        java.util.concurrent.Executor executor16 = null;
        webSocketClient12.executor = executor16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient15);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap1 = null;
        webSocketClient0.bootstrap = clientBootstrap1;
        java.net.InetSocketAddress inetSocketAddress3 = webSocketClient0.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory4 = null;
        webSocketClient0.sslFactory = sslFactory4;
        java.lang.String str6 = webSocketClient0.base64Nonce;
        org.webbitserver.WebSocketHandler webSocketHandler7 = webSocketClient0.webSocketHandler;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap8 = webSocketClient0.bootstrap;
        org.jboss.netty.channel.Channel channel9 = webSocketClient0.channel;
        org.webbitserver.WebSocketHandler webSocketHandler10 = webSocketClient0.webSocketHandler;
        org.jboss.netty.channel.Channel channel11 = webSocketClient0.channel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(clientBootstrap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(channel11);
    }
}
