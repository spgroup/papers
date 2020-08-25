import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0.equals("Retrofit-Idle"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        java.lang.Class<?> wildcardClass1 = log0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        retrofit.RestAdapter.THREAD_PREFIX = "";
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.BASIC;
        java.lang.Class<?> wildcardClass1 = logLevel0.getClass();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.client.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request14 = restAdapter10.logAndReplaceRequest(request13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        retrofit.client.Client.Provider provider19 = restAdapter18.clientProvider;
        retrofit.RestAdapter.Log log20 = restAdapter18.log;
        retrofit.Server server21 = null;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        retrofit.converter.Converter converter26 = null;
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Log log29 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel30 = null;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor25, converter26, profiler27, errorHandler28, log29, logLevel30);
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter31.logLevel = logLevel32;
        retrofit.RestAdapter restAdapter34 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log20, logLevel32);
        log20.log("Retrofit-Idle");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.Server server13 = null;
        restAdapter10.server = server13;
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.Server server23 = null;
        retrofit.client.Client.Provider provider24 = null;
        java.util.concurrent.Executor executor25 = null;
        java.util.concurrent.Executor executor26 = null;
        retrofit.RequestInterceptor requestInterceptor27 = null;
        retrofit.converter.Converter converter28 = null;
        retrofit.Profiler profiler29 = null;
        retrofit.ErrorHandler errorHandler30 = null;
        retrofit.Server server31 = null;
        retrofit.client.Client.Provider provider32 = null;
        java.util.concurrent.Executor executor33 = null;
        java.util.concurrent.Executor executor34 = null;
        retrofit.RequestInterceptor requestInterceptor35 = null;
        retrofit.converter.Converter converter36 = null;
        retrofit.Profiler profiler37 = null;
        retrofit.ErrorHandler errorHandler38 = null;
        retrofit.RestAdapter.Log log39 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel40 = null;
        retrofit.RestAdapter restAdapter41 = new retrofit.RestAdapter(server31, provider32, executor33, executor34, requestInterceptor35, converter36, profiler37, errorHandler38, log39, logLevel40);
        retrofit.client.Client.Provider provider42 = restAdapter41.clientProvider;
        retrofit.RestAdapter.Log log43 = restAdapter41.log;
        retrofit.Server server44 = null;
        retrofit.client.Client.Provider provider45 = null;
        java.util.concurrent.Executor executor46 = null;
        java.util.concurrent.Executor executor47 = null;
        retrofit.RequestInterceptor requestInterceptor48 = null;
        retrofit.converter.Converter converter49 = null;
        retrofit.Profiler profiler50 = null;
        retrofit.ErrorHandler errorHandler51 = null;
        retrofit.RestAdapter.Log log52 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel53 = null;
        retrofit.RestAdapter restAdapter54 = new retrofit.RestAdapter(server44, provider45, executor46, executor47, requestInterceptor48, converter49, profiler50, errorHandler51, log52, logLevel53);
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter54.logLevel = logLevel55;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server23, provider24, executor25, executor26, requestInterceptor27, converter28, profiler29, errorHandler30, log43, logLevel55);
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log43, logLevel58);
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log52);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.client.Request request18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = null;
        restAdapter10.callbackExecutor = executor12;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = null;
        restAdapter10.callbackExecutor = executor12;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable15, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        retrofit.RestAdapter.IDLE_THREAD_NAME = "";
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = null;
        restAdapter10.callbackExecutor = executor12;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        retrofit.RestAdapter.THREAD_PREFIX = "hi!";
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.client.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request15 = restAdapter10.logAndReplaceRequest(request14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hi!" + "'", str0.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        retrofit.RestAdapter.IDLE_THREAD_NAME = "hi!";
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.Profiler profiler13 = null;
        restAdapter10.profiler = profiler13;
        java.lang.Class<?> wildcardClass15 = restAdapter10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        restAdapter10.requestInterceptor = requestInterceptor13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Response response18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response20 = restAdapter10.logAndReplaceResponse("Retrofit-Idle", response18, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler19 = null;
        restAdapter10.errorHandler = errorHandler19;
        retrofit.Server server21 = null;
        restAdapter10.server = server21;
        retrofit.client.Request request23 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request24 = restAdapter10.logAndReplaceRequest(request23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler18);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Response response12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response14 = restAdapter10.logAndReplaceResponse("", response12, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        restAdapter10.requestInterceptor = requestInterceptor13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = null;
        restAdapter10.server = server11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        java.lang.Class<?> wildcardClass11 = restAdapter10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = null;
        restAdapter10.server = server11;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel13);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.reflect.Method method15 = null;
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.client.Client.Provider provider28 = restAdapter27.clientProvider;
        retrofit.converter.Converter converter29 = restAdapter27.converter;
        java.util.concurrent.Executor executor30 = null;
        restAdapter27.httpExecutor = executor30;
        retrofit.Server server33 = null;
        retrofit.client.Client.Provider provider34 = null;
        java.util.concurrent.Executor executor35 = null;
        java.util.concurrent.Executor executor36 = null;
        retrofit.RequestInterceptor requestInterceptor37 = null;
        retrofit.converter.Converter converter38 = null;
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel42 = null;
        retrofit.RestAdapter restAdapter43 = new retrofit.RestAdapter(server33, provider34, executor35, executor36, requestInterceptor37, converter38, profiler39, errorHandler40, log41, logLevel42);
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter43.logLevel = logLevel44;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        java.lang.Class<?> wildcardClass47 = log46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 0, executor30, 0.0d, logLevel44, log46, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = restHandler13.invoke((java.lang.Object) '4', method15, objArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        restAdapter10.requestInterceptor = requestInterceptor13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = null;
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.converter.Converter converter22 = null;
        retrofit.Profiler profiler23 = null;
        retrofit.ErrorHandler errorHandler24 = null;
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel26 = null;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log25, logLevel26);
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter27.logLevel = logLevel28;
        retrofit.RestAdapter.Log log30 = restAdapter27.log;
        java.lang.reflect.Method method31 = null;
        retrofit.Server server32 = null;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.RequestInterceptor requestInterceptor36 = null;
        retrofit.converter.Converter converter37 = null;
        retrofit.Profiler profiler38 = null;
        retrofit.ErrorHandler errorHandler39 = null;
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel41 = null;
        retrofit.RestAdapter restAdapter42 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor36, converter37, profiler38, errorHandler39, log40, logLevel41);
        retrofit.client.Client.Provider provider43 = restAdapter42.clientProvider;
        retrofit.Server server44 = restAdapter42.server;
        retrofit.ErrorHandler errorHandler45 = restAdapter42.errorHandler;
        retrofit.Server server46 = null;
        retrofit.client.Client.Provider provider47 = null;
        java.util.concurrent.Executor executor48 = null;
        java.util.concurrent.Executor executor49 = null;
        retrofit.RequestInterceptor requestInterceptor50 = null;
        retrofit.converter.Converter converter51 = null;
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel55 = null;
        retrofit.RestAdapter restAdapter56 = new retrofit.RestAdapter(server46, provider47, executor48, executor49, requestInterceptor50, converter51, profiler52, errorHandler53, log54, logLevel55);
        retrofit.client.Client.Provider provider57 = restAdapter56.clientProvider;
        retrofit.converter.Converter converter58 = restAdapter56.converter;
        java.util.concurrent.Executor executor59 = null;
        restAdapter56.httpExecutor = executor59;
        java.lang.Object[] objArray61 = new java.lang.Object[] { restAdapter42, executor59 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = restHandler16.invoke((java.lang.Object) log30, method31, objArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.Server server13 = null;
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.converter.Converter converter18 = null;
        retrofit.Profiler profiler19 = null;
        retrofit.ErrorHandler errorHandler20 = null;
        retrofit.RestAdapter.Log log21 = retrofit.RestAdapter.Log.NONE;
        log21.log("");
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, converter18, profiler19, errorHandler20, log21, logLevel24);
        restAdapter10.setLogLevel(logLevel24);
        java.util.concurrent.Executor executor27 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.Log log28 = restAdapter10.log;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log28);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler19 = null;
        restAdapter10.errorHandler = errorHandler19;
        java.util.concurrent.Executor executor21 = restAdapter10.callbackExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = null;
        restAdapter10.converter = converter11;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.Log log11 = restAdapter10.log;
        retrofit.converter.Converter converter12 = null;
        restAdapter10.converter = converter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder2 = builder0.setServer(server1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.Profiler profiler12 = null;
        restAdapter10.profiler = profiler12;
        java.util.concurrent.Executor executor14 = null;
        restAdapter10.httpExecutor = executor14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.Server server12 = restAdapter10.server;
        retrofit.client.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request14 = restAdapter10.logAndReplaceRequest(request13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server12);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter3 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.Log log11 = restAdapter10.log;
        java.lang.Class<?> wildcardClass12 = log11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        restAdapter10.requestInterceptor = requestInterceptor13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor13 = null;
        restAdapter10.requestInterceptor = requestInterceptor13;
        java.lang.Class<?> wildcardClass15 = restAdapter10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        retrofit.RestAdapter.THREAD_PREFIX = "Retrofit-Idle";
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = null;
        restAdapter10.server = server11;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.callbackExecutor = executor13;
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        log15.log("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = null;
        restAdapter10.converter = converter11;
        retrofit.ErrorHandler errorHandler13 = null;
        restAdapter10.errorHandler = errorHandler13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        log8.log("");
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel11);
        retrofit.ErrorHandler errorHandler13 = null;
        restAdapter12.errorHandler = errorHandler13;
        java.util.concurrent.Executor executor15 = restAdapter12.httpExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = null;
        restAdapter10.server = server11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        log13.log("Retrofit-Idle");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter15 = null;
        restAdapter10.converter = converter15;
        retrofit.Profiler profiler17 = null;
        restAdapter10.profiler = profiler17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        log16.log("");
        retrofit.Server server21 = null;
        retrofit.client.Client.Provider provider22 = null;
        java.util.concurrent.Executor executor23 = null;
        java.util.concurrent.Executor executor24 = null;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        retrofit.converter.Converter converter26 = null;
        retrofit.Profiler profiler27 = null;
        retrofit.ErrorHandler errorHandler28 = null;
        retrofit.RestAdapter.Log log29 = retrofit.RestAdapter.Log.NONE;
        log29.log("");
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter33 = new retrofit.RestAdapter(server21, provider22, executor23, executor24, requestInterceptor25, converter26, profiler27, errorHandler28, log29, logLevel32);
        retrofit.RestAdapter restAdapter34 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log16, logLevel32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Profiler profiler3 = builder0.profiler;
        retrofit.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setClient(client4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler3);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        retrofit.Server server13 = restAdapter10.server;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server13);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.Profiler profiler13 = null;
        restAdapter10.profiler = profiler13;
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel24 = null;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        retrofit.client.Client.Provider provider26 = restAdapter25.clientProvider;
        retrofit.converter.Converter converter27 = restAdapter25.converter;
        retrofit.RequestInterceptor requestInterceptor28 = null;
        restAdapter25.requestInterceptor = requestInterceptor28;
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter25.logLevel;
        retrofit.RestAdapter.RestHandler restHandler31 = restAdapter25.new RestHandler();
        retrofit.Server server32 = null;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.RequestInterceptor requestInterceptor36 = null;
        retrofit.converter.Converter converter37 = null;
        retrofit.Profiler profiler38 = null;
        retrofit.ErrorHandler errorHandler39 = null;
        retrofit.Server server40 = null;
        retrofit.client.Client.Provider provider41 = null;
        java.util.concurrent.Executor executor42 = null;
        java.util.concurrent.Executor executor43 = null;
        retrofit.RequestInterceptor requestInterceptor44 = null;
        retrofit.converter.Converter converter45 = null;
        retrofit.Profiler profiler46 = null;
        retrofit.ErrorHandler errorHandler47 = null;
        retrofit.Server server48 = null;
        retrofit.client.Client.Provider provider49 = null;
        java.util.concurrent.Executor executor50 = null;
        java.util.concurrent.Executor executor51 = null;
        retrofit.RequestInterceptor requestInterceptor52 = null;
        retrofit.converter.Converter converter53 = null;
        retrofit.Profiler profiler54 = null;
        retrofit.ErrorHandler errorHandler55 = null;
        retrofit.RestAdapter.Log log56 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel57 = null;
        retrofit.RestAdapter restAdapter58 = new retrofit.RestAdapter(server48, provider49, executor50, executor51, requestInterceptor52, converter53, profiler54, errorHandler55, log56, logLevel57);
        retrofit.client.Client.Provider provider59 = restAdapter58.clientProvider;
        retrofit.RestAdapter.Log log60 = restAdapter58.log;
        retrofit.Server server61 = null;
        retrofit.client.Client.Provider provider62 = null;
        java.util.concurrent.Executor executor63 = null;
        java.util.concurrent.Executor executor64 = null;
        retrofit.RequestInterceptor requestInterceptor65 = null;
        retrofit.converter.Converter converter66 = null;
        retrofit.Profiler profiler67 = null;
        retrofit.ErrorHandler errorHandler68 = null;
        retrofit.RestAdapter.Log log69 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel70 = null;
        retrofit.RestAdapter restAdapter71 = new retrofit.RestAdapter(server61, provider62, executor63, executor64, requestInterceptor65, converter66, profiler67, errorHandler68, log69, logLevel70);
        retrofit.RestAdapter.LogLevel logLevel72 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter71.logLevel = logLevel72;
        retrofit.RestAdapter restAdapter74 = new retrofit.RestAdapter(server40, provider41, executor42, executor43, requestInterceptor44, converter45, profiler46, errorHandler47, log60, logLevel72);
        retrofit.RestAdapter.LogLevel logLevel75 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter76 = new retrofit.RestAdapter(server32, provider33, executor34, executor35, requestInterceptor36, converter37, profiler38, errorHandler39, log60, logLevel75);
        restAdapter25.logLevel = logLevel75;
        restAdapter10.logLevel = logLevel75;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log69);
        org.junit.Assert.assertTrue("'" + logLevel72 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel72.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel75 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel75.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        retrofit.Server server19 = null;
        restAdapter18.server = server19;
        java.util.concurrent.Executor executor21 = null;
        restAdapter18.callbackExecutor = executor21;
        retrofit.RestAdapter.Log log23 = restAdapter18.log;
        retrofit.RestAdapter.LogLevel logLevel24 = null;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log23, logLevel24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = null;
        restAdapter10.server = server11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = null;
        restAdapter10.converter = converter11;
        retrofit.client.Response response14 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response16 = restAdapter10.logAndReplaceResponse("", response14, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        retrofit.ErrorHandler errorHandler15 = null;
        restAdapter10.errorHandler = errorHandler15;
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler17);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = null;
        restAdapter10.callbackExecutor = executor12;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel16);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.converter.Converter converter15 = null;
        restAdapter10.converter = converter15;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        retrofit.client.Client.Provider provider19 = restAdapter18.clientProvider;
        retrofit.RestAdapter.Log log20 = restAdapter18.log;
        retrofit.RestAdapter.Builder builder21 = builder0.setLog(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        retrofit.ErrorHandler errorHandler15 = null;
        restAdapter10.errorHandler = errorHandler15;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor18 = null;
        restAdapter10.requestInterceptor = requestInterceptor18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter5);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.Server server12 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.converter.Converter converter3 = null;
        builder0.converter = converter3;
        retrofit.Server server5 = null;
        retrofit.client.Client.Provider provider6 = null;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        retrofit.RequestInterceptor requestInterceptor9 = null;
        retrofit.converter.Converter converter10 = null;
        retrofit.Profiler profiler11 = null;
        retrofit.ErrorHandler errorHandler12 = null;
        retrofit.RestAdapter.Log log13 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        retrofit.RestAdapter restAdapter15 = new retrofit.RestAdapter(server5, provider6, executor7, executor8, requestInterceptor9, converter10, profiler11, errorHandler12, log13, logLevel14);
        retrofit.Server server16 = null;
        restAdapter15.server = server16;
        java.util.concurrent.Executor executor18 = null;
        restAdapter15.callbackExecutor = executor18;
        retrofit.RestAdapter.Log log20 = restAdapter15.log;
        retrofit.RestAdapter.Builder builder21 = builder0.setLog(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.converter.Converter converter4 = builder0.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        log13.log("hi!");
        log13.log("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter10.setLogLevel(logLevel14);
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.FULL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.Profiler profiler12 = null;
        restAdapter10.profiler = profiler12;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = null;
        restAdapter10.callbackExecutor = executor12;
        retrofit.ErrorHandler errorHandler14 = null;
        restAdapter10.errorHandler = errorHandler14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Server server11 = null;
        restAdapter10.server = server11;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.callbackExecutor = executor13;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        builder0.logLevel = logLevel5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.HEADERS));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.client.Client.Provider provider17 = null;
        restAdapter10.clientProvider = provider17;
        retrofit.Server server19 = null;
        restAdapter10.server = server19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.client.Response response19 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response21 = restAdapter10.logAndReplaceResponse("", response19, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.converter.Converter converter4 = builder0.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.ErrorHandler errorHandler4 = null;
        builder0.errorHandler = errorHandler4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setErrorHandler(errorHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.converter.Converter converter8 = builder0.converter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter8);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Profiler profiler3 = builder0.profiler;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.Profiler profiler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setProfiler(profiler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler4);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel11;
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.client.Request request15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = restAdapter10.logAndReplaceRequest(request15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = null;
        restAdapter10.profiler = profiler18;
        retrofit.RestAdapter.Log log20 = restAdapter10.log;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = null;
        restAdapter10.httpExecutor = executor15;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Server server18 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler19 = restAdapter10.errorHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler19);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = null;
        restAdapter10.httpExecutor = executor13;
        retrofit.ErrorHandler errorHandler15 = null;
        restAdapter10.errorHandler = errorHandler15;
        java.util.concurrent.Executor executor17 = null;
        restAdapter10.callbackExecutor = executor17;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler5 = null;
        builder0.errorHandler = errorHandler5;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setExecutors(executor7, executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = null;
        restAdapter10.converter = converter11;
        retrofit.client.Client.Provider provider13 = null;
        restAdapter10.clientProvider = provider13;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log4);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler5 = null;
        builder0.errorHandler = errorHandler5;
        builder0.ensureSaneDefaults();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        builder0.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorHandler5);
    }
}

