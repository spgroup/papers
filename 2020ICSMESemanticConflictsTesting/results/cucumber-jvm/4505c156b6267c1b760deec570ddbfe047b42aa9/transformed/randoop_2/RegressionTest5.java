import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage12.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory24 = null;
        javaLanguage23.objectFactory = objectFactory24;
        cuke4duke.internal.java.JavaLanguage javaLanguage26 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass27 = javaLanguage26.getClass();
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage23.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin30 = javaLanguage23.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory31 = null;
        javaLanguage23.objectFactory = objectFactory31;
        cuke4duke.internal.java.JavaLanguage javaLanguage33 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory34 = null;
        javaLanguage33.objectFactory = objectFactory34;
        cuke4duke.internal.java.JavaLanguage javaLanguage36 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass37 = javaLanguage36.getClass();
        javaLanguage33.registerStepDefinitionsFor((java.lang.Class) wildcardClass37);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass37);
        cuke4duke.internal.java.ObjectFactory objectFactory40 = null;
        javaLanguage23.objectFactory = objectFactory40;
        cuke4duke.internal.java.ObjectFactory objectFactory42 = javaLanguage23.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage43 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory44 = javaLanguage43.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory45 = javaLanguage43.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage46 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin47 = null;
        javaLanguage46.languageMixin = languageMixin47;
        cuke4duke.internal.java.ObjectFactory objectFactory49 = null;
        javaLanguage46.objectFactory = objectFactory49;
        cuke4duke.internal.java.ObjectFactory objectFactory51 = null;
        javaLanguage46.objectFactory = objectFactory51;
        cuke4duke.internal.java.JavaLanguage javaLanguage53 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory54 = null;
        javaLanguage53.objectFactory = objectFactory54;
        cuke4duke.internal.java.JavaLanguage javaLanguage56 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass57 = javaLanguage56.getClass();
        javaLanguage53.registerStepDefinitionsFor((java.lang.Class) wildcardClass57);
        cuke4duke.internal.java.JavaLanguage javaLanguage59 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin60 = null;
        javaLanguage59.languageMixin = languageMixin60;
        cuke4duke.internal.language.LanguageMixin languageMixin62 = null;
        javaLanguage59.languageMixin = languageMixin62;
        cuke4duke.internal.java.ObjectFactory objectFactory64 = javaLanguage59.objectFactory;
        java.lang.Class<?> wildcardClass65 = javaLanguage59.getClass();
        javaLanguage53.registerStepDefinitionsFor((java.lang.Class) wildcardClass65);
        javaLanguage46.registerStepDefinitionsFor((java.lang.Class) wildcardClass65);
        javaLanguage43.registerStepDefinitionsFor((java.lang.Class) wildcardClass65);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass65);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass65);
        java.lang.reflect.Method method71 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage1.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage1.objectFactory = objectFactory4;
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage6.objectFactory = objectFactory7;
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass10 = javaLanguage9.getClass();
        javaLanguage6.registerStepDefinitionsFor((java.lang.Class) wildcardClass10);
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass10);
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage1.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage14.objectFactory = objectFactory15;
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass18 = javaLanguage17.getClass();
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass18);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage14.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage14.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage14.objectFactory = objectFactory22;
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage24.languageMixin = languageMixin25;
        cuke4duke.internal.java.ObjectFactory objectFactory27 = null;
        javaLanguage24.objectFactory = objectFactory27;
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory30 = null;
        javaLanguage29.objectFactory = objectFactory30;
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass33 = javaLanguage32.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        javaLanguage24.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        cuke4duke.internal.language.LanguageMixin languageMixin37 = javaLanguage14.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory38 = null;
        javaLanguage14.objectFactory = objectFactory38;
        java.lang.Class<?> wildcardClass40 = javaLanguage14.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass40);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass40);
        cuke4duke.internal.java.JavaLanguage javaLanguage43 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass44 = javaLanguage43.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class47 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage18.objectFactory = objectFactory19;
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass22 = javaLanguage21.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.java.ObjectFactory objectFactory24 = javaLanguage18.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = javaLanguage18.languageMixin;
        java.lang.Class<?> wildcardClass26 = javaLanguage18.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass26);
        cuke4duke.internal.language.LanguageMixin languageMixin28 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage0.objectFactory = objectFactory29;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin28);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage3.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage3.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage3.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage16.languageMixin = languageMixin17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage16.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage16.objectFactory;
        java.lang.Class<?> wildcardClass22 = javaLanguage16.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        javaLanguage3.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.language.LanguageMixin languageMixin26 = null;
        javaLanguage0.languageMixin = languageMixin26;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = null;
        javaLanguage0.objectFactory = objectFactory28;
        cuke4duke.internal.java.ObjectFactory objectFactory30 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory31 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class33 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory31);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage14.objectFactory = objectFactory15;
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass18 = javaLanguage17.getClass();
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass18);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage14.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage14.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage14.objectFactory = objectFactory22;
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory25 = null;
        javaLanguage24.objectFactory = objectFactory25;
        cuke4duke.internal.java.JavaLanguage javaLanguage27 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass28 = javaLanguage27.getClass();
        javaLanguage24.registerStepDefinitionsFor((java.lang.Class) wildcardClass28);
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass28);
        cuke4duke.internal.java.ObjectFactory objectFactory31 = javaLanguage14.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory33 = null;
        javaLanguage32.objectFactory = objectFactory33;
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass36 = javaLanguage35.getClass();
        javaLanguage32.registerStepDefinitionsFor((java.lang.Class) wildcardClass36);
        cuke4duke.internal.java.ObjectFactory objectFactory38 = javaLanguage32.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin39 = javaLanguage32.languageMixin;
        java.lang.Class<?> wildcardClass40 = javaLanguage32.getClass();
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass40);
        cuke4duke.internal.language.LanguageMixin languageMixin42 = javaLanguage14.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory43 = null;
        javaLanguage14.objectFactory = objectFactory43;
        java.lang.Class<?> wildcardClass45 = javaLanguage14.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass45);
        cuke4duke.internal.java.ObjectFactory objectFactory47 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory48 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory48);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage3.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage3.objectFactory = objectFactory6;
        java.lang.Class<?> wildcardClass8 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass8);
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage13.objectFactory = objectFactory14;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass17 = javaLanguage16.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass17);
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage13.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage13.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage13.objectFactory = objectFactory21;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.language.LanguageMixin languageMixin36 = javaLanguage13.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory37 = null;
        javaLanguage13.objectFactory = objectFactory37;
        cuke4duke.internal.language.LanguageMixin languageMixin39 = null;
        javaLanguage13.languageMixin = languageMixin39;
        cuke4duke.internal.java.ObjectFactory objectFactory41 = null;
        javaLanguage13.objectFactory = objectFactory41;
        cuke4duke.internal.java.ObjectFactory objectFactory43 = javaLanguage13.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin44 = javaLanguage13.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage45 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin46 = null;
        javaLanguage45.languageMixin = languageMixin46;
        cuke4duke.internal.java.ObjectFactory objectFactory48 = javaLanguage45.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin49 = null;
        javaLanguage45.languageMixin = languageMixin49;
        cuke4duke.internal.language.LanguageMixin languageMixin51 = null;
        javaLanguage45.languageMixin = languageMixin51;
        cuke4duke.internal.language.LanguageMixin languageMixin53 = null;
        javaLanguage45.languageMixin = languageMixin53;
        java.lang.Class<?> wildcardClass55 = javaLanguage45.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass55);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass55);
        java.lang.reflect.Method method58 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage18.objectFactory = objectFactory19;
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass22 = javaLanguage21.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.java.ObjectFactory objectFactory24 = javaLanguage18.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = javaLanguage18.languageMixin;
        java.lang.Class<?> wildcardClass26 = javaLanguage18.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass26);
        cuke4duke.internal.language.LanguageMixin languageMixin28 = null;
        javaLanguage0.languageMixin = languageMixin28;
        cuke4duke.internal.language.LanguageMixin languageMixin30 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin32 = null;
        javaLanguage31.languageMixin = languageMixin32;
        cuke4duke.internal.java.ObjectFactory objectFactory34 = null;
        javaLanguage31.objectFactory = objectFactory34;
        cuke4duke.internal.java.JavaLanguage javaLanguage36 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory37 = null;
        javaLanguage36.objectFactory = objectFactory37;
        cuke4duke.internal.java.JavaLanguage javaLanguage39 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass40 = javaLanguage39.getClass();
        javaLanguage36.registerStepDefinitionsFor((java.lang.Class) wildcardClass40);
        javaLanguage31.registerStepDefinitionsFor((java.lang.Class) wildcardClass40);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass40);
        cuke4duke.internal.java.ObjectFactory objectFactory44 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory45 = null;
        javaLanguage0.objectFactory = objectFactory45;
        cuke4duke.internal.java.ObjectFactory objectFactory47 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin48 = null;
        javaLanguage0.languageMixin = languageMixin48;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class51 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory47);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage18.objectFactory = objectFactory19;
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass22 = javaLanguage21.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage24.languageMixin = languageMixin25;
        cuke4duke.internal.language.LanguageMixin languageMixin27 = null;
        javaLanguage24.languageMixin = languageMixin27;
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage24.objectFactory;
        java.lang.Class<?> wildcardClass30 = javaLanguage24.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        cuke4duke.internal.java.ObjectFactory objectFactory33 = null;
        javaLanguage0.objectFactory = objectFactory33;
        cuke4duke.internal.java.ObjectFactory objectFactory35 = null;
        javaLanguage0.objectFactory = objectFactory35;
        cuke4duke.internal.language.LanguageMixin languageMixin37 = javaLanguage0.languageMixin;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin37);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage7.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage7.objectFactory = objectFactory10;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage12.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage7.languageMixin = languageMixin19;
        java.lang.Class<?> wildcardClass21 = javaLanguage7.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass21);
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage0.objectFactory = objectFactory23;
        cuke4duke.internal.java.ObjectFactory objectFactory25 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = javaLanguage0.objectFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory26);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage12.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage5.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage5.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin21 = null;
        javaLanguage20.languageMixin = languageMixin21;
        cuke4duke.internal.language.LanguageMixin languageMixin23 = null;
        javaLanguage20.languageMixin = languageMixin23;
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin26 = null;
        javaLanguage25.languageMixin = languageMixin26;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = null;
        javaLanguage25.objectFactory = objectFactory28;
        cuke4duke.internal.java.JavaLanguage javaLanguage30 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory31 = null;
        javaLanguage30.objectFactory = objectFactory31;
        cuke4duke.internal.java.JavaLanguage javaLanguage33 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass34 = javaLanguage33.getClass();
        javaLanguage30.registerStepDefinitionsFor((java.lang.Class) wildcardClass34);
        javaLanguage25.registerStepDefinitionsFor((java.lang.Class) wildcardClass34);
        javaLanguage20.registerStepDefinitionsFor((java.lang.Class) wildcardClass34);
        cuke4duke.internal.java.ObjectFactory objectFactory38 = javaLanguage20.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin39 = javaLanguage20.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin40 = null;
        javaLanguage20.languageMixin = languageMixin40;
        java.lang.Class<?> wildcardClass42 = javaLanguage20.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass42);
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage10.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage10.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage15.objectFactory = objectFactory16;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass19 = javaLanguage18.getClass();
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        cuke4duke.internal.language.LanguageMixin languageMixin23 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory24 = null;
        javaLanguage0.objectFactory = objectFactory24;
        cuke4duke.internal.language.LanguageMixin languageMixin26 = null;
        javaLanguage0.languageMixin = languageMixin26;
        cuke4duke.internal.language.LanguageMixin languageMixin28 = null;
        javaLanguage0.languageMixin = languageMixin28;
        cuke4duke.internal.language.LanguageMixin languageMixin30 = null;
        javaLanguage0.languageMixin = languageMixin30;
        cuke4duke.internal.language.LanguageMixin languageMixin32 = null;
        javaLanguage0.languageMixin = languageMixin32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class35 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin23);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage18.objectFactory = objectFactory19;
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass22 = javaLanguage21.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage24.languageMixin = languageMixin25;
        cuke4duke.internal.language.LanguageMixin languageMixin27 = null;
        javaLanguage24.languageMixin = languageMixin27;
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage24.objectFactory;
        java.lang.Class<?> wildcardClass30 = javaLanguage24.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        cuke4duke.internal.java.ObjectFactory objectFactory33 = null;
        javaLanguage0.objectFactory = objectFactory33;
        java.lang.reflect.Method method35 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage15.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage15.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage15.objectFactory = objectFactory20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage15.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.language.LanguageMixin languageMixin37 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage38 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory39 = javaLanguage38.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory40 = javaLanguage38.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage41 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin42 = null;
        javaLanguage41.languageMixin = languageMixin42;
        cuke4duke.internal.java.ObjectFactory objectFactory44 = null;
        javaLanguage41.objectFactory = objectFactory44;
        cuke4duke.internal.java.ObjectFactory objectFactory46 = null;
        javaLanguage41.objectFactory = objectFactory46;
        cuke4duke.internal.java.JavaLanguage javaLanguage48 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory49 = null;
        javaLanguage48.objectFactory = objectFactory49;
        cuke4duke.internal.java.JavaLanguage javaLanguage51 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass52 = javaLanguage51.getClass();
        javaLanguage48.registerStepDefinitionsFor((java.lang.Class) wildcardClass52);
        cuke4duke.internal.java.JavaLanguage javaLanguage54 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin55 = null;
        javaLanguage54.languageMixin = languageMixin55;
        cuke4duke.internal.language.LanguageMixin languageMixin57 = null;
        javaLanguage54.languageMixin = languageMixin57;
        cuke4duke.internal.java.ObjectFactory objectFactory59 = javaLanguage54.objectFactory;
        java.lang.Class<?> wildcardClass60 = javaLanguage54.getClass();
        javaLanguage48.registerStepDefinitionsFor((java.lang.Class) wildcardClass60);
        javaLanguage41.registerStepDefinitionsFor((java.lang.Class) wildcardClass60);
        javaLanguage38.registerStepDefinitionsFor((java.lang.Class) wildcardClass60);
        cuke4duke.internal.language.LanguageMixin languageMixin64 = null;
        javaLanguage38.languageMixin = languageMixin64;
        cuke4duke.internal.java.ObjectFactory objectFactory66 = null;
        javaLanguage38.objectFactory = objectFactory66;
        java.lang.Class<?> wildcardClass68 = javaLanguage38.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method method70 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage5.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage12.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = null;
        javaLanguage0.languageMixin = languageMixin22;
        cuke4duke.internal.language.LanguageMixin languageMixin24 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage0.languageMixin = languageMixin25;
        cuke4duke.internal.java.ObjectFactory objectFactory27 = null;
        javaLanguage0.objectFactory = objectFactory27;
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage0.objectFactory = objectFactory29;
        java.lang.reflect.Method method31 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin24);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage5.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage5.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage10.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage17.objectFactory = objectFactory18;
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass21 = javaLanguage20.getClass();
        javaLanguage17.registerStepDefinitionsFor((java.lang.Class) wildcardClass21);
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass21);
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass21);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass21);
        cuke4duke.internal.language.LanguageMixin languageMixin26 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin27 = null;
        javaLanguage0.languageMixin = languageMixin27;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin26);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage10.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage10.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage15.objectFactory = objectFactory16;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass19 = javaLanguage18.getClass();
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage10.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass24 = javaLanguage23.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass24);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass24);
        cuke4duke.internal.language.LanguageMixin languageMixin27 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin30 = null;
        javaLanguage0.languageMixin = languageMixin30;
        cuke4duke.internal.java.ObjectFactory objectFactory32 = null;
        javaLanguage0.objectFactory = objectFactory32;
        cuke4duke.internal.java.ObjectFactory objectFactory34 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class36 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory34);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage22.objectFactory = objectFactory23;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = javaLanguage22.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin26 = null;
        javaLanguage22.languageMixin = languageMixin26;
        cuke4duke.internal.language.LanguageMixin languageMixin28 = javaLanguage22.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin30 = null;
        javaLanguage29.languageMixin = languageMixin30;
        cuke4duke.internal.java.ObjectFactory objectFactory32 = null;
        javaLanguage29.objectFactory = objectFactory32;
        cuke4duke.internal.java.JavaLanguage javaLanguage34 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory35 = null;
        javaLanguage34.objectFactory = objectFactory35;
        cuke4duke.internal.java.JavaLanguage javaLanguage37 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass38 = javaLanguage37.getClass();
        javaLanguage34.registerStepDefinitionsFor((java.lang.Class) wildcardClass38);
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass38);
        cuke4duke.internal.language.LanguageMixin languageMixin41 = null;
        javaLanguage29.languageMixin = languageMixin41;
        java.lang.Class<?> wildcardClass43 = javaLanguage29.getClass();
        javaLanguage22.registerStepDefinitionsFor((java.lang.Class) wildcardClass43);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass43);
        cuke4duke.internal.language.StepDefinition stepDefinition46 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage7.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage16.languageMixin = languageMixin17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage16.languageMixin = languageMixin19;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = null;
        javaLanguage16.languageMixin = languageMixin21;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage16.objectFactory = objectFactory23;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage16.languageMixin = languageMixin25;
        cuke4duke.internal.language.LanguageMixin languageMixin27 = javaLanguage16.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin28 = null;
        javaLanguage16.languageMixin = languageMixin28;
        java.lang.Class<?> wildcardClass30 = javaLanguage16.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage7.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage5.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage12.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage0.objectFactory = objectFactory22;
        cuke4duke.internal.language.LanguageMixin languageMixin24 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory25 = null;
        javaLanguage0.objectFactory = objectFactory25;
        cuke4duke.internal.language.LanguageMixin languageMixin27 = javaLanguage0.languageMixin;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin27);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage18.objectFactory = objectFactory19;
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass22 = javaLanguage21.getClass();
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.java.ObjectFactory objectFactory24 = javaLanguage18.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = javaLanguage18.languageMixin;
        java.lang.Class<?> wildcardClass26 = javaLanguage18.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass26);
        cuke4duke.internal.language.LanguageMixin languageMixin28 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory30 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList32 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory30);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage13.objectFactory = objectFactory14;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass17 = javaLanguage16.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass17);
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage13.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage13.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage13.objectFactory = objectFactory21;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory24 = null;
        javaLanguage23.objectFactory = objectFactory24;
        cuke4duke.internal.java.JavaLanguage javaLanguage26 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass27 = javaLanguage26.getClass();
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        cuke4duke.internal.java.ObjectFactory objectFactory30 = javaLanguage13.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory32 = null;
        javaLanguage31.objectFactory = objectFactory32;
        cuke4duke.internal.java.JavaLanguage javaLanguage34 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass35 = javaLanguage34.getClass();
        javaLanguage31.registerStepDefinitionsFor((java.lang.Class) wildcardClass35);
        cuke4duke.internal.java.ObjectFactory objectFactory37 = javaLanguage31.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin38 = javaLanguage31.languageMixin;
        java.lang.Class<?> wildcardClass39 = javaLanguage31.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        cuke4duke.internal.java.ObjectFactory objectFactory42 = null;
        javaLanguage0.objectFactory = objectFactory42;
        cuke4duke.internal.language.LanguageMixin languageMixin44 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory45 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory46 = javaLanguage0.objectFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory46);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList23 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage4.objectFactory = objectFactory5;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass8 = javaLanguage7.getClass();
        javaLanguage4.registerStepDefinitionsFor((java.lang.Class) wildcardClass8);
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage4.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage4.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage4.objectFactory = objectFactory12;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage14.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage14.objectFactory = objectFactory17;
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage19.objectFactory = objectFactory20;
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass23 = javaLanguage22.getClass();
        javaLanguage19.registerStepDefinitionsFor((java.lang.Class) wildcardClass23);
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass23);
        javaLanguage4.registerStepDefinitionsFor((java.lang.Class) wildcardClass23);
        cuke4duke.internal.language.LanguageMixin languageMixin27 = javaLanguage4.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = null;
        javaLanguage4.objectFactory = objectFactory28;
        java.lang.Class<?> wildcardClass30 = javaLanguage4.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        cuke4duke.internal.java.ObjectFactory objectFactory32 = null;
        javaLanguage0.objectFactory = objectFactory32;
        cuke4duke.internal.java.ObjectFactory objectFactory34 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory34);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage8.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage8.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage13.objectFactory = objectFactory14;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass17 = javaLanguage16.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass17);
        javaLanguage8.registerStepDefinitionsFor((java.lang.Class) wildcardClass17);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass17);
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory24 = null;
        javaLanguage0.objectFactory = objectFactory24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage0.objectFactory = objectFactory26;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = null;
        javaLanguage0.objectFactory = objectFactory28;
        cuke4duke.internal.java.ObjectFactory objectFactory30 = javaLanguage0.objectFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory30);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage18.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage18.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage18.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage18.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.java.JavaLanguage javaLanguage37 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin38 = null;
        javaLanguage37.languageMixin = languageMixin38;
        cuke4duke.internal.java.ObjectFactory objectFactory40 = null;
        javaLanguage37.objectFactory = objectFactory40;
        cuke4duke.internal.java.JavaLanguage javaLanguage42 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory43 = null;
        javaLanguage42.objectFactory = objectFactory43;
        cuke4duke.internal.java.JavaLanguage javaLanguage45 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass46 = javaLanguage45.getClass();
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass46);
        javaLanguage37.registerStepDefinitionsFor((java.lang.Class) wildcardClass46);
        cuke4duke.internal.java.ObjectFactory objectFactory49 = null;
        javaLanguage37.objectFactory = objectFactory49;
        cuke4duke.internal.java.JavaLanguage javaLanguage51 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory52 = null;
        javaLanguage51.objectFactory = objectFactory52;
        cuke4duke.internal.java.JavaLanguage javaLanguage54 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass55 = javaLanguage54.getClass();
        javaLanguage51.registerStepDefinitionsFor((java.lang.Class) wildcardClass55);
        cuke4duke.internal.language.LanguageMixin languageMixin57 = null;
        javaLanguage51.languageMixin = languageMixin57;
        cuke4duke.internal.language.LanguageMixin languageMixin59 = null;
        javaLanguage51.languageMixin = languageMixin59;
        cuke4duke.internal.java.JavaLanguage javaLanguage61 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin62 = null;
        javaLanguage61.languageMixin = languageMixin62;
        cuke4duke.internal.java.ObjectFactory objectFactory64 = null;
        javaLanguage61.objectFactory = objectFactory64;
        cuke4duke.internal.java.JavaLanguage javaLanguage66 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory67 = null;
        javaLanguage66.objectFactory = objectFactory67;
        cuke4duke.internal.java.JavaLanguage javaLanguage69 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass70 = javaLanguage69.getClass();
        javaLanguage66.registerStepDefinitionsFor((java.lang.Class) wildcardClass70);
        javaLanguage61.registerStepDefinitionsFor((java.lang.Class) wildcardClass70);
        cuke4duke.internal.java.ObjectFactory objectFactory73 = javaLanguage61.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage74 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass75 = javaLanguage74.getClass();
        javaLanguage61.registerStepDefinitionsFor((java.lang.Class) wildcardClass75);
        javaLanguage51.registerStepDefinitionsFor((java.lang.Class) wildcardClass75);
        cuke4duke.internal.java.JavaLanguage javaLanguage78 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory79 = null;
        javaLanguage78.objectFactory = objectFactory79;
        cuke4duke.internal.java.JavaLanguage javaLanguage81 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass82 = javaLanguage81.getClass();
        javaLanguage78.registerStepDefinitionsFor((java.lang.Class) wildcardClass82);
        cuke4duke.internal.language.LanguageMixin languageMixin84 = null;
        javaLanguage78.languageMixin = languageMixin84;
        java.lang.Class<?> wildcardClass86 = javaLanguage78.getClass();
        javaLanguage51.registerStepDefinitionsFor((java.lang.Class) wildcardClass86);
        javaLanguage37.registerStepDefinitionsFor((java.lang.Class) wildcardClass86);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass86);
        cuke4duke.internal.language.LanguageMixin languageMixin90 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin90);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage8.objectFactory = objectFactory9;
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass12 = javaLanguage11.getClass();
        javaLanguage8.registerStepDefinitionsFor((java.lang.Class) wildcardClass12);
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage8.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage8.languageMixin;
        java.lang.Class<?> wildcardClass16 = javaLanguage8.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList20 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage15.objectFactory = objectFactory16;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass19 = javaLanguage18.getClass();
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage15.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage15.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage15.objectFactory = objectFactory23;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = javaLanguage15.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin26 = null;
        javaLanguage15.languageMixin = languageMixin26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin29 = null;
        javaLanguage28.languageMixin = languageMixin29;
        cuke4duke.internal.java.ObjectFactory objectFactory31 = null;
        javaLanguage28.objectFactory = objectFactory31;
        cuke4duke.internal.java.JavaLanguage javaLanguage33 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory34 = null;
        javaLanguage33.objectFactory = objectFactory34;
        cuke4duke.internal.java.JavaLanguage javaLanguage36 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass37 = javaLanguage36.getClass();
        javaLanguage33.registerStepDefinitionsFor((java.lang.Class) wildcardClass37);
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass37);
        cuke4duke.internal.language.LanguageMixin languageMixin40 = null;
        javaLanguage28.languageMixin = languageMixin40;
        cuke4duke.internal.java.JavaLanguage javaLanguage42 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory43 = null;
        javaLanguage42.objectFactory = objectFactory43;
        cuke4duke.internal.java.JavaLanguage javaLanguage45 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass46 = javaLanguage45.getClass();
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass46);
        cuke4duke.internal.java.ObjectFactory objectFactory48 = javaLanguage42.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin49 = javaLanguage42.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory50 = null;
        javaLanguage42.objectFactory = objectFactory50;
        cuke4duke.internal.java.JavaLanguage javaLanguage52 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory53 = null;
        javaLanguage52.objectFactory = objectFactory53;
        cuke4duke.internal.java.JavaLanguage javaLanguage55 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass56 = javaLanguage55.getClass();
        javaLanguage52.registerStepDefinitionsFor((java.lang.Class) wildcardClass56);
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass56);
        cuke4duke.internal.java.ObjectFactory objectFactory59 = javaLanguage42.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage60 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory61 = null;
        javaLanguage60.objectFactory = objectFactory61;
        cuke4duke.internal.java.JavaLanguage javaLanguage63 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass64 = javaLanguage63.getClass();
        javaLanguage60.registerStepDefinitionsFor((java.lang.Class) wildcardClass64);
        cuke4duke.internal.java.ObjectFactory objectFactory66 = javaLanguage60.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin67 = javaLanguage60.languageMixin;
        java.lang.Class<?> wildcardClass68 = javaLanguage60.getClass();
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass68);
        cuke4duke.internal.language.LanguageMixin languageMixin70 = javaLanguage42.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory71 = null;
        javaLanguage42.objectFactory = objectFactory71;
        java.lang.Class<?> wildcardClass73 = javaLanguage42.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass73);
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass73);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass73);
        cuke4duke.internal.java.ObjectFactory objectFactory77 = javaLanguage0.objectFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory77);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage7.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage13.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage13.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage13.objectFactory;
        java.lang.Class<?> wildcardClass19 = javaLanguage13.getClass();
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.java.ObjectFactory objectFactory34 = javaLanguage28.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory36 = null;
        javaLanguage35.objectFactory = objectFactory36;
        cuke4duke.internal.java.JavaLanguage javaLanguage38 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass39 = javaLanguage38.getClass();
        javaLanguage35.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        cuke4duke.internal.java.ObjectFactory objectFactory43 = null;
        javaLanguage23.objectFactory = objectFactory43;
        java.lang.Class<?> wildcardClass45 = javaLanguage23.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass45);
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage5.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage5.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage10.objectFactory = objectFactory11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
        javaLanguage10.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage15.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage15.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage15.objectFactory = objectFactory20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage15.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.java.ObjectFactory objectFactory37 = null;
        javaLanguage0.objectFactory = objectFactory37;
        cuke4duke.internal.java.ObjectFactory objectFactory39 = null;
        javaLanguage0.objectFactory = objectFactory39;
        cuke4duke.internal.java.ObjectFactory objectFactory41 = javaLanguage0.objectFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory41);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage12.objectFactory = objectFactory13;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass16);
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage12.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage19.objectFactory = objectFactory20;
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass23 = javaLanguage22.getClass();
        javaLanguage19.registerStepDefinitionsFor((java.lang.Class) wildcardClass23);
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass23);
        cuke4duke.internal.java.ObjectFactory objectFactory26 = javaLanguage12.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin27 = null;
        javaLanguage12.languageMixin = languageMixin27;
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory30 = null;
        javaLanguage29.objectFactory = objectFactory30;
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass33 = javaLanguage32.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        cuke4duke.internal.java.ObjectFactory objectFactory35 = javaLanguage29.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin36 = javaLanguage29.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory37 = null;
        javaLanguage29.objectFactory = objectFactory37;
        cuke4duke.internal.java.JavaLanguage javaLanguage39 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin40 = null;
        javaLanguage39.languageMixin = languageMixin40;
        cuke4duke.internal.java.ObjectFactory objectFactory42 = null;
        javaLanguage39.objectFactory = objectFactory42;
        cuke4duke.internal.java.JavaLanguage javaLanguage44 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory45 = null;
        javaLanguage44.objectFactory = objectFactory45;
        cuke4duke.internal.java.JavaLanguage javaLanguage47 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass48 = javaLanguage47.getClass();
        javaLanguage44.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        javaLanguage39.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        cuke4duke.internal.java.JavaLanguage javaLanguage52 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory53 = javaLanguage52.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory54 = javaLanguage52.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory55 = javaLanguage52.objectFactory;
        java.lang.Class<?> wildcardClass56 = javaLanguage52.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass56);
        cuke4duke.internal.java.JavaLanguage javaLanguage58 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory59 = null;
        javaLanguage58.objectFactory = objectFactory59;
        cuke4duke.internal.java.JavaLanguage javaLanguage61 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass62 = javaLanguage61.getClass();
        javaLanguage58.registerStepDefinitionsFor((java.lang.Class) wildcardClass62);
        cuke4duke.internal.java.ObjectFactory objectFactory64 = javaLanguage58.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin65 = javaLanguage58.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory66 = null;
        javaLanguage58.objectFactory = objectFactory66;
        cuke4duke.internal.java.JavaLanguage javaLanguage68 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin69 = null;
        javaLanguage68.languageMixin = languageMixin69;
        cuke4duke.internal.java.ObjectFactory objectFactory71 = null;
        javaLanguage68.objectFactory = objectFactory71;
        cuke4duke.internal.java.JavaLanguage javaLanguage73 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory74 = null;
        javaLanguage73.objectFactory = objectFactory74;
        cuke4duke.internal.java.JavaLanguage javaLanguage76 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass77 = javaLanguage76.getClass();
        javaLanguage73.registerStepDefinitionsFor((java.lang.Class) wildcardClass77);
        javaLanguage68.registerStepDefinitionsFor((java.lang.Class) wildcardClass77);
        javaLanguage58.registerStepDefinitionsFor((java.lang.Class) wildcardClass77);
        cuke4duke.internal.language.LanguageMixin languageMixin81 = javaLanguage58.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin82 = javaLanguage58.languageMixin;
        java.lang.Class<?> wildcardClass83 = javaLanguage58.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass83);
        javaLanguage12.registerStepDefinitionsFor((java.lang.Class) wildcardClass83);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        java.lang.Class<?> wildcardClass8 = javaLanguage0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage6.objectFactory = objectFactory7;
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass10 = javaLanguage9.getClass();
        javaLanguage6.registerStepDefinitionsFor((java.lang.Class) wildcardClass10);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage6.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage6.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage6.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage6.languageMixin;
        java.lang.Class<?> wildcardClass18 = javaLanguage6.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass18);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage16.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage16.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage16.languageMixin = languageMixin20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = null;
        javaLanguage16.languageMixin = languageMixin22;
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage16.languageMixin = languageMixin24;
        cuke4duke.internal.language.LanguageMixin languageMixin26 = null;
        javaLanguage16.languageMixin = languageMixin26;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = javaLanguage16.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory30 = null;
        javaLanguage29.objectFactory = objectFactory30;
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass33 = javaLanguage32.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        cuke4duke.internal.java.ObjectFactory objectFactory35 = javaLanguage29.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin36 = javaLanguage29.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory37 = null;
        javaLanguage29.objectFactory = objectFactory37;
        cuke4duke.internal.java.JavaLanguage javaLanguage39 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin40 = null;
        javaLanguage39.languageMixin = languageMixin40;
        cuke4duke.internal.java.ObjectFactory objectFactory42 = null;
        javaLanguage39.objectFactory = objectFactory42;
        cuke4duke.internal.java.JavaLanguage javaLanguage44 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory45 = null;
        javaLanguage44.objectFactory = objectFactory45;
        cuke4duke.internal.java.JavaLanguage javaLanguage47 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass48 = javaLanguage47.getClass();
        javaLanguage44.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        javaLanguage39.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        cuke4duke.internal.language.LanguageMixin languageMixin52 = javaLanguage29.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory53 = null;
        javaLanguage29.objectFactory = objectFactory53;
        cuke4duke.internal.language.LanguageMixin languageMixin55 = null;
        javaLanguage29.languageMixin = languageMixin55;
        cuke4duke.internal.java.ObjectFactory objectFactory57 = null;
        javaLanguage29.objectFactory = objectFactory57;
        cuke4duke.internal.java.ObjectFactory objectFactory59 = javaLanguage29.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin60 = javaLanguage29.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage61 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin62 = null;
        javaLanguage61.languageMixin = languageMixin62;
        cuke4duke.internal.java.ObjectFactory objectFactory64 = javaLanguage61.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin65 = null;
        javaLanguage61.languageMixin = languageMixin65;
        cuke4duke.internal.language.LanguageMixin languageMixin67 = null;
        javaLanguage61.languageMixin = languageMixin67;
        cuke4duke.internal.language.LanguageMixin languageMixin69 = null;
        javaLanguage61.languageMixin = languageMixin69;
        java.lang.Class<?> wildcardClass71 = javaLanguage61.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass71);
        javaLanguage16.registerStepDefinitionsFor((java.lang.Class) wildcardClass71);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage5.objectFactory = objectFactory6;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass9);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage22.objectFactory = objectFactory23;
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass26 = javaLanguage25.getClass();
        javaLanguage22.registerStepDefinitionsFor((java.lang.Class) wildcardClass26);
        cuke4duke.internal.java.ObjectFactory objectFactory28 = javaLanguage22.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin29 = javaLanguage22.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory30 = null;
        javaLanguage22.objectFactory = objectFactory30;
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin33 = null;
        javaLanguage32.languageMixin = languageMixin33;
        cuke4duke.internal.java.ObjectFactory objectFactory35 = null;
        javaLanguage32.objectFactory = objectFactory35;
        cuke4duke.internal.java.JavaLanguage javaLanguage37 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory38 = null;
        javaLanguage37.objectFactory = objectFactory38;
        cuke4duke.internal.java.JavaLanguage javaLanguage40 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass41 = javaLanguage40.getClass();
        javaLanguage37.registerStepDefinitionsFor((java.lang.Class) wildcardClass41);
        javaLanguage32.registerStepDefinitionsFor((java.lang.Class) wildcardClass41);
        javaLanguage22.registerStepDefinitionsFor((java.lang.Class) wildcardClass41);
        cuke4duke.internal.language.LanguageMixin languageMixin45 = javaLanguage22.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory46 = null;
        javaLanguage22.objectFactory = objectFactory46;
        java.lang.Class<?> wildcardClass48 = javaLanguage22.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass48);
        java.lang.reflect.Method method50 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage6.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage6.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage6.objectFactory;
        java.lang.Class<?> wildcardClass12 = javaLanguage6.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass12);
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass4);
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage13.objectFactory = objectFactory14;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass17 = javaLanguage16.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass17);
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage13.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage13.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage13.objectFactory = objectFactory21;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.language.LanguageMixin languageMixin36 = javaLanguage13.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory37 = javaLanguage13.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory38 = null;
        javaLanguage13.objectFactory = objectFactory38;
        cuke4duke.internal.java.ObjectFactory objectFactory40 = null;
        javaLanguage13.objectFactory = objectFactory40;
        cuke4duke.internal.java.JavaLanguage javaLanguage42 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory43 = null;
        javaLanguage42.objectFactory = objectFactory43;
        cuke4duke.internal.java.JavaLanguage javaLanguage45 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass46 = javaLanguage45.getClass();
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass46);
        cuke4duke.internal.java.ObjectFactory objectFactory48 = javaLanguage42.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin49 = javaLanguage42.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory50 = null;
        javaLanguage42.objectFactory = objectFactory50;
        cuke4duke.internal.java.JavaLanguage javaLanguage52 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory53 = null;
        javaLanguage52.objectFactory = objectFactory53;
        cuke4duke.internal.java.JavaLanguage javaLanguage55 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass56 = javaLanguage55.getClass();
        javaLanguage52.registerStepDefinitionsFor((java.lang.Class) wildcardClass56);
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass56);
        cuke4duke.internal.java.ObjectFactory objectFactory59 = javaLanguage42.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage60 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory61 = null;
        javaLanguage60.objectFactory = objectFactory61;
        cuke4duke.internal.java.JavaLanguage javaLanguage63 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass64 = javaLanguage63.getClass();
        javaLanguage60.registerStepDefinitionsFor((java.lang.Class) wildcardClass64);
        cuke4duke.internal.java.ObjectFactory objectFactory66 = javaLanguage60.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin67 = javaLanguage60.languageMixin;
        java.lang.Class<?> wildcardClass68 = javaLanguage60.getClass();
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass68);
        cuke4duke.internal.language.LanguageMixin languageMixin70 = null;
        javaLanguage42.languageMixin = languageMixin70;
        cuke4duke.internal.language.LanguageMixin languageMixin72 = javaLanguage42.languageMixin;
        cuke4duke.internal.java.JavaLanguage javaLanguage73 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin74 = null;
        javaLanguage73.languageMixin = languageMixin74;
        cuke4duke.internal.java.ObjectFactory objectFactory76 = null;
        javaLanguage73.objectFactory = objectFactory76;
        cuke4duke.internal.java.JavaLanguage javaLanguage78 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory79 = null;
        javaLanguage78.objectFactory = objectFactory79;
        cuke4duke.internal.java.JavaLanguage javaLanguage81 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass82 = javaLanguage81.getClass();
        javaLanguage78.registerStepDefinitionsFor((java.lang.Class) wildcardClass82);
        javaLanguage73.registerStepDefinitionsFor((java.lang.Class) wildcardClass82);
        javaLanguage42.registerStepDefinitionsFor((java.lang.Class) wildcardClass82);
        java.lang.Class<?> wildcardClass86 = javaLanguage42.getClass();
        javaLanguage13.registerStepDefinitionsFor((java.lang.Class) wildcardClass86);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass86);
        cuke4duke.internal.language.LanguageMixin languageMixin89 = javaLanguage0.languageMixin;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin89);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage7.objectFactory = objectFactory8;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage13.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage13.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage13.objectFactory;
        java.lang.Class<?> wildcardClass19 = javaLanguage13.getClass();
        javaLanguage7.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass19);
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin24 = null;
        javaLanguage23.languageMixin = languageMixin24;
        cuke4duke.internal.java.ObjectFactory objectFactory26 = null;
        javaLanguage23.objectFactory = objectFactory26;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = null;
        javaLanguage28.objectFactory = objectFactory29;
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass32 = javaLanguage31.getClass();
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass32);
        cuke4duke.internal.java.ObjectFactory objectFactory34 = javaLanguage28.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory36 = null;
        javaLanguage35.objectFactory = objectFactory36;
        cuke4duke.internal.java.JavaLanguage javaLanguage38 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass39 = javaLanguage38.getClass();
        javaLanguage35.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        javaLanguage28.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        javaLanguage23.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        cuke4duke.internal.java.ObjectFactory objectFactory43 = null;
        javaLanguage23.objectFactory = objectFactory43;
        java.lang.Class<?> wildcardClass45 = javaLanguage23.getClass();
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass45);
        cuke4duke.internal.language.LanguageMixin languageMixin47 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin47);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage9.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage9.objectFactory = objectFactory12;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage14.objectFactory = objectFactory15;
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass18 = javaLanguage17.getClass();
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass18);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage14.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage14.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage14.objectFactory = objectFactory22;
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage24.languageMixin = languageMixin25;
        cuke4duke.internal.java.ObjectFactory objectFactory27 = null;
        javaLanguage24.objectFactory = objectFactory27;
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory30 = null;
        javaLanguage29.objectFactory = objectFactory30;
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass33 = javaLanguage32.getClass();
        javaLanguage29.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        javaLanguage24.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass33);
        cuke4duke.internal.language.LanguageMixin languageMixin37 = javaLanguage14.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin38 = javaLanguage14.languageMixin;
        java.lang.Class<?> wildcardClass39 = javaLanguage14.getClass();
        javaLanguage9.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        javaLanguage0.registerStepDefinitionsFor((java.lang.Class) wildcardClass39);
        cuke4duke.internal.java.ObjectFactory objectFactory42 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList44 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(languageMixin38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectFactory42);
    }
}

