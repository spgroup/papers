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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        cuke4duke.internal.language.LanguageMixin languageMixin0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cuke4duke.internal.java.JavaLanguage javaLanguage1 = new cuke4duke.internal.java.JavaLanguage(languageMixin0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing system property: cuke4duke.objectFactory");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }
}

