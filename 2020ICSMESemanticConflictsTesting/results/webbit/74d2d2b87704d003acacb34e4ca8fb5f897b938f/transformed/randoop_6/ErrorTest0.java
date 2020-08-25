import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.reconnectEvery((long) '4');
        java.util.concurrent.Executor executor4 = webSocketClient3.executor;
        org.webbitserver.WebSocketHandler webSocketHandler5 = webSocketClient3.webSocketHandler;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.webbitserver.netty.WebSocketClient webSocketClient6 = webSocketClient3.start();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        org.webbitserver.WebSocketHandler webSocketHandler2 = webSocketClient0.webSocketHandler;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = webSocketClient0.exceptionHandler;
        byte byte4 = webSocketClient0.randomByte();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.webbitserver.netty.WebSocketClient webSocketClient5 = webSocketClient0.start();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        boolean boolean2 = webSocketClient0.ssl;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.start();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.reconnectEvery((long) '4');
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = webSocketClient3.ioExceptionHandler;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.webbitserver.WebSocket webSocket5 = webSocketClient3.close();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = webSocketClient0.exceptionHandler;
        org.webbitserver.WebSocketHandler webSocketHandler2 = webSocketClient0.webSocketHandler;
        java.lang.String str3 = webSocketClient0.base64Nonce;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.webbitserver.netty.WebSocketClient webSocketClient4 = webSocketClient0.start();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = new org.webbitserver.netty.WebSocketClient();
        org.jboss.netty.handler.codec.http.HttpRequest httpRequest1 = webSocketClient0.request;
        org.webbitserver.netty.WebSocketClient webSocketClient3 = webSocketClient0.reconnectEvery((long) '4');
        org.jboss.netty.bootstrap.ClientBootstrap clientBootstrap4 = webSocketClient3.bootstrap;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = webSocketClient3.exceptionHandler;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.webbitserver.WebSocket webSocket6 = webSocketClient3.close();
    }
}

