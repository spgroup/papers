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
        com.zaxxer.hikari.HikariPool hikariPool0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariPool.HouseKeeper houseKeeper1 = hikariPool0.new HouseKeeper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.zaxxer.hikari.HikariPool$HouseKeeper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

