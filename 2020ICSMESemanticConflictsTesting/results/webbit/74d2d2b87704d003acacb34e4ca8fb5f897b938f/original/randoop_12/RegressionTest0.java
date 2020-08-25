import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.net.URI uRI0 = null;
        org.webbitserver.WebSocketHandler webSocketHandler1 = null;
        java.util.concurrent.Executor executor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient webSocketClient3 = new org.webbitserver.netty.WebSocketClient(uRI0, webSocketHandler1, executor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.net.URI uRI0 = null;
        org.webbitserver.WebSocketHandler webSocketHandler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient webSocketClient2 = new org.webbitserver.netty.WebSocketClient(uRI0, webSocketHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

