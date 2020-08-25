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
        boolean boolean2 = webSocketClient0.ssl;
        org.webbitserver.helpers.SslFactory sslFactory3 = webSocketClient0.sslFactory;
        org.webbitserver.netty.WebSocketClient webSocketClient5 = webSocketClient0.reconnectEvery((long) (byte) 45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sslFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        webSocketClient0.remoteAddress = inetSocketAddress2;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        webSocketClient0.remoteAddress = inetSocketAddress4;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest8 = webSocketClient0.createNettyHttpRequest("CO5yNjoB2qESpc6cnpnguw==", "CO5yNjoB2qESpc6cnpnguw==");
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap9 = null;
        webSocketClient0.bootstrap = clientBootstrap9;
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest11 = webSocketClient0.request;
        java.lang.String str12 = webSocketClient0.base64Nonce;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(httpRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "+Qii1hMPO5jB9H5B6DR/8A==" + "'", str12.equals("+Qii1hMPO5jB9H5B6DR/8A=="));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap2 = null;
        webSocketClient0.bootstrap = clientBootstrap2;
        java.util.concurrent.Executor executor4 = webSocketClient0.executor;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler5;
        java.io.InputStream inputStream7 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient9 = webSocketClient0.setupSsl(inputStream7, "hGrJ0dfjJY9QvNCKJYv04Q==");
        java.io.InputStream inputStream10 = null;
        org.webbitserver.netty.WebSocketClient webSocketClient12 = webSocketClient0.setupSsl(inputStream10, "xn+jjdyvKXaovcBq9e4EvA==");
        org.webbitserver.helpers.SslFactory sslFactory13 = webSocketClient12.sslFactory;
        byte byte14 = webSocketClient12.randomByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(httpRequest1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(webSocketClient12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sslFactory13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 71 + "'", byte14 == (byte) 71);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        webSocketClient0.exceptionHandler = uncaughtExceptionHandler2;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = webSocketClient0.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress5 = webSocketClient0.remoteAddress;
        org.webbitserver.helpers.SslFactory sslFactory6 = webSocketClient0.sslFactory;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = webSocketClient0.exceptionHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetSocketAddress5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sslFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        webSocketClient0.remoteAddress = inetSocketAddress2;
        org.webbitserver.WebSocketHandler webSocketHandler4 = webSocketClient0.webSocketHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        webSocketClient0.ioExceptionHandler = uncaughtExceptionHandler5;
        org.jboss.netty.channel.Channel channel7 = null;
        webSocketClient0.channel = channel7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(webSocketHandler4);
    }
}
