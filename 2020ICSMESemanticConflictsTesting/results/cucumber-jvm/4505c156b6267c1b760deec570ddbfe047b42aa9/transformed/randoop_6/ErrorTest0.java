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
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage0.begin_scenario();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage0.begin_scenario();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage0.end_scenario();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage0.begin_scenario();
    }
}

