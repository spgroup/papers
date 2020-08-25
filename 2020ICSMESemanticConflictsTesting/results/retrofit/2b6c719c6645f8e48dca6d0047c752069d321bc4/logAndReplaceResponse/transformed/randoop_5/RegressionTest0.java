import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = retrofit.RestAdapter.IDLE_THREAD_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Retrofit-Idle" + "'", str0.equals("Retrofit-Idle"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        retrofit.RestAdapter.Log log0 = retrofit.RestAdapter.Log.NONE;
        java.lang.Class<?> wildcardClass1 = log0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.RestAdapter.THREAD_PREFIX = "";
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        retrofit.RestAdapter.LogLevel logLevel0 = retrofit.RestAdapter.LogLevel.BASIC;
        java.lang.Class<?> wildcardClass1 = logLevel0.getClass();
        org.junit.Assert.assertTrue("'" + logLevel0 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel0.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.RestAdapter.IDLE_THREAD_NAME = "";
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.RestAdapter.THREAD_PREFIX = "hi!";
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = retrofit.RestAdapter.THREAD_PREFIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hi!" + "'", str0.equals("hi!"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.RestAdapter.IDLE_THREAD_NAME = "hi!";
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.RestAdapter.THREAD_PREFIX = "Retrofit-Idle";
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.getLogLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        java.util.concurrent.Executor executor3 = null;
        java.util.concurrent.Executor executor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setExecutors(executor3, executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        retrofit.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder23 = builder0.setClient(client22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.Server server7 = null;
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.RequestInterceptor requestInterceptor11 = null;
        retrofit.converter.Converter converter12 = null;
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel16 = null;
        retrofit.RestAdapter restAdapter17 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor11, converter12, profiler13, errorHandler14, log15, logLevel16);
        retrofit.Server server18 = null;
        restAdapter17.server = server18;
        retrofit.RestAdapter.Log log20 = restAdapter17.log;
        log20.log("Retrofit-Idle");
        builder0.log = log20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
        retrofit.Server server26 = null;
        retrofit.client.Client.Provider provider27 = null;
        java.util.concurrent.Executor executor28 = null;
        java.util.concurrent.Executor executor29 = null;
        retrofit.RequestInterceptor requestInterceptor30 = null;
        retrofit.converter.Converter converter31 = null;
        retrofit.Profiler profiler32 = null;
        retrofit.ErrorHandler errorHandler33 = null;
        retrofit.Server server34 = null;
        retrofit.client.Client.Provider provider35 = null;
        java.util.concurrent.Executor executor36 = null;
        java.util.concurrent.Executor executor37 = null;
        retrofit.RequestInterceptor requestInterceptor38 = null;
        retrofit.converter.Converter converter39 = null;
        retrofit.Profiler profiler40 = null;
        retrofit.ErrorHandler errorHandler41 = null;
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel43 = null;
        retrofit.RestAdapter restAdapter44 = new retrofit.RestAdapter(server34, provider35, executor36, executor37, requestInterceptor38, converter39, profiler40, errorHandler41, log42, logLevel43);
        retrofit.client.Client.Provider provider45 = restAdapter44.clientProvider;
        retrofit.RestAdapter.Log log46 = restAdapter44.log;
        retrofit.Server server47 = null;
        retrofit.client.Client.Provider provider48 = null;
        java.util.concurrent.Executor executor49 = null;
        java.util.concurrent.Executor executor50 = null;
        retrofit.RequestInterceptor requestInterceptor51 = null;
        retrofit.converter.Converter converter52 = null;
        retrofit.Profiler profiler53 = null;
        retrofit.ErrorHandler errorHandler54 = null;
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel56 = null;
        retrofit.RestAdapter restAdapter57 = new retrofit.RestAdapter(server47, provider48, executor49, executor50, requestInterceptor51, converter52, profiler53, errorHandler54, log55, logLevel56);
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter57.logLevel = logLevel58;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server26, provider27, executor28, executor29, requestInterceptor30, converter31, profiler32, errorHandler33, log46, logLevel58);
        restAdapter25.log = log46;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.RestAdapter restAdapter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.RestHandler restHandler1 = restAdapter0.new RestHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to retrofit.RestAdapter$RestHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.converter.Converter converter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder5 = builder0.setConverter(converter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        retrofit.Server server17 = null;
        restAdapter10.server = server17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        retrofit.RequestInterceptor requestInterceptor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder23 = builder0.setRequestInterceptor(requestInterceptor22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = executor16.getClass();
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
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.FULL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        retrofit.Server server22 = builder21.server;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        builder0.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setExecutors(executor6, executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorHandler5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
        retrofit.Server server20 = null;
        restAdapter10.server = server20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.converter.Converter converter8 = null;
        builder0.converter = converter8;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder11 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler29 = null;
        builder28.errorHandler = errorHandler29;
        retrofit.Server server31 = builder28.server;
        builder28.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler33 = builder28.errorHandler;
        restAdapter10.errorHandler = errorHandler33;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorHandler33);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        java.util.concurrent.Executor executor14 = null;
        restAdapter10.callbackExecutor = executor14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
        retrofit.RequestInterceptor requestInterceptor13 = null;
        restAdapter10.requestInterceptor = requestInterceptor13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
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
        retrofit.client.Client.Provider provider44 = restAdapter43.clientProvider;
        retrofit.RestAdapter.Log log45 = restAdapter43.log;
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
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter56.logLevel = logLevel57;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log45, logLevel57);
        retrofit.RestAdapter.LogLevel logLevel60 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter61 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, converter22, profiler23, errorHandler24, log45, logLevel60);
        restAdapter10.logLevel = logLevel60;
        java.util.concurrent.Executor executor63 = null;
        restAdapter10.callbackExecutor = executor63;
        java.util.concurrent.Executor executor65 = restAdapter10.callbackExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor65);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler10 = null;
        builder9.errorHandler = errorHandler10;
        retrofit.Server server12 = builder9.server;
        builder9.ensureSaneDefaults();
        retrofit.ErrorHandler errorHandler14 = builder9.errorHandler;
        builder0.errorHandler = errorHandler14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorHandler14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        retrofit.client.Response response16 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response18 = restAdapter10.logAndReplaceResponse("Retrofit-Idle", response16, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        retrofit.Server server15 = null;
        restAdapter10.server = server15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        boolean boolean16 = logLevel14.log();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor7 = null;
        builder0.httpExecutor = executor7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder6 = builder0.setClient(provider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        boolean boolean79 = logLevel75.log();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        retrofit.Profiler profiler6 = builder0.profiler;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        retrofit.Server server16 = null;
        restAdapter10.server = server16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.Server server6 = builder0.server;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        java.util.concurrent.Executor executor20 = restAdapter10.httpExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.converter.Converter converter8 = null;
        builder0.converter = converter8;
        retrofit.RestAdapter.Log log10 = builder0.log;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        retrofit.Profiler profiler15 = null;
        restAdapter10.profiler = profiler15;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        retrofit.client.Response response80 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response82 = restAdapter10.logAndReplaceResponse("", response80, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.converter.Converter converter8 = builder0.converter;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable20, "");
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        retrofit.Server server8 = builder0.server;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        retrofit.Server server18 = null;
        retrofit.client.Client.Provider provider19 = null;
        java.util.concurrent.Executor executor20 = null;
        java.util.concurrent.Executor executor21 = null;
        retrofit.RequestInterceptor requestInterceptor22 = null;
        retrofit.converter.Converter converter23 = null;
        retrofit.Profiler profiler24 = null;
        retrofit.ErrorHandler errorHandler25 = null;
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel27 = null;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server18, provider19, executor20, executor21, requestInterceptor22, converter23, profiler24, errorHandler25, log26, logLevel27);
        retrofit.client.Client.Provider provider29 = restAdapter28.clientProvider;
        retrofit.RestAdapter.Log log30 = restAdapter28.log;
        restAdapter10.log = log30;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log30);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
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
        retrofit.client.Client.Provider provider16 = restAdapter15.clientProvider;
        retrofit.converter.Converter converter17 = restAdapter15.converter;
        java.util.concurrent.Executor executor18 = null;
        restAdapter15.httpExecutor = executor18;
        retrofit.ErrorHandler errorHandler20 = null;
        restAdapter15.errorHandler = errorHandler20;
        java.util.concurrent.Executor executor22 = null;
        restAdapter15.callbackExecutor = executor22;
        retrofit.RestAdapter.Log log24 = restAdapter15.log;
        retrofit.RestAdapter.Builder builder25 = builder0.setLog(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        retrofit.client.Client.Provider provider17 = null;
        restAdapter10.clientProvider = provider17;
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
        retrofit.RequestInterceptor requestInterceptor17 = null;
        restAdapter10.requestInterceptor = requestInterceptor17;
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        java.util.concurrent.Executor executor17 = null;
        restAdapter10.httpExecutor = executor17;
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        retrofit.converter.Converter converter15 = restAdapter12.converter;
        retrofit.Server server16 = restAdapter12.server;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + logLevel11 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel11.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server16);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        java.util.concurrent.Executor executor8 = builder0.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder10 = builder0.setRequestInterceptor(requestInterceptor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler5 = null;
        builder0.errorHandler = errorHandler5;
        retrofit.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder8 = builder0.setClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.Server server17 = restAdapter10.server;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        retrofit.RestAdapter.Log log22 = builder21.log;
        java.util.concurrent.Executor executor23 = builder21.callbackExecutor;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        retrofit.Server server20 = null;
        restAdapter10.server = server20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(profiler19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = null;
        builder0.profiler = profiler1;
        retrofit.converter.Converter converter3 = builder0.converter;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.Server server5 = null;
        retrofit.client.Client.Provider provider6 = null;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        retrofit.RequestInterceptor requestInterceptor9 = null;
        retrofit.converter.Converter converter10 = null;
        retrofit.Profiler profiler11 = null;
        retrofit.ErrorHandler errorHandler12 = null;
        retrofit.RestAdapter.Log log13 = retrofit.RestAdapter.Log.NONE;
        log13.log("");
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter restAdapter17 = new retrofit.RestAdapter(server5, provider6, executor7, executor8, requestInterceptor9, converter10, profiler11, errorHandler12, log13, logLevel16);
        retrofit.RestAdapter.Builder builder18 = builder0.setLogLevel(logLevel16);
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler20 = null;
        builder19.profiler = profiler20;
        retrofit.converter.Converter converter22 = builder19.converter;
        retrofit.RestAdapter.Log log23 = builder19.log;
        retrofit.converter.Converter converter24 = builder19.converter;
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
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
        retrofit.client.Client.Provider provider44 = restAdapter43.clientProvider;
        retrofit.RestAdapter.Log log45 = restAdapter43.log;
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
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter56.logLevel = logLevel57;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log45, logLevel57);
        retrofit.RestAdapter.LogLevel logLevel60 = restAdapter59.logLevel;
        retrofit.RestAdapter.Builder builder61 = builder19.setLogLevel(logLevel60);
        builder0.logLevel = logLevel60;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler16 = null;
        builder15.errorHandler = errorHandler16;
        retrofit.Server server18 = builder15.server;
        builder15.ensureSaneDefaults();
        retrofit.Server server20 = null;
        retrofit.client.Client.Provider provider21 = null;
        java.util.concurrent.Executor executor22 = null;
        java.util.concurrent.Executor executor23 = null;
        retrofit.RequestInterceptor requestInterceptor24 = null;
        retrofit.converter.Converter converter25 = null;
        retrofit.Profiler profiler26 = null;
        retrofit.ErrorHandler errorHandler27 = null;
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel29 = null;
        retrofit.RestAdapter restAdapter30 = new retrofit.RestAdapter(server20, provider21, executor22, executor23, requestInterceptor24, converter25, profiler26, errorHandler27, log28, logLevel29);
        retrofit.client.Client.Provider provider31 = restAdapter30.clientProvider;
        retrofit.converter.Converter converter32 = restAdapter30.converter;
        retrofit.RequestInterceptor requestInterceptor33 = null;
        restAdapter30.requestInterceptor = requestInterceptor33;
        retrofit.RestAdapter.LogLevel logLevel35 = restAdapter30.logLevel;
        retrofit.RestAdapter.RestHandler restHandler36 = restAdapter30.new RestHandler();
        retrofit.Server server37 = null;
        retrofit.client.Client.Provider provider38 = null;
        java.util.concurrent.Executor executor39 = null;
        java.util.concurrent.Executor executor40 = null;
        retrofit.RequestInterceptor requestInterceptor41 = null;
        retrofit.converter.Converter converter42 = null;
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.Server server45 = null;
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.RequestInterceptor requestInterceptor49 = null;
        retrofit.converter.Converter converter50 = null;
        retrofit.Profiler profiler51 = null;
        retrofit.ErrorHandler errorHandler52 = null;
        retrofit.Server server53 = null;
        retrofit.client.Client.Provider provider54 = null;
        java.util.concurrent.Executor executor55 = null;
        java.util.concurrent.Executor executor56 = null;
        retrofit.RequestInterceptor requestInterceptor57 = null;
        retrofit.converter.Converter converter58 = null;
        retrofit.Profiler profiler59 = null;
        retrofit.ErrorHandler errorHandler60 = null;
        retrofit.RestAdapter.Log log61 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel62 = null;
        retrofit.RestAdapter restAdapter63 = new retrofit.RestAdapter(server53, provider54, executor55, executor56, requestInterceptor57, converter58, profiler59, errorHandler60, log61, logLevel62);
        retrofit.client.Client.Provider provider64 = restAdapter63.clientProvider;
        retrofit.RestAdapter.Log log65 = restAdapter63.log;
        retrofit.Server server66 = null;
        retrofit.client.Client.Provider provider67 = null;
        java.util.concurrent.Executor executor68 = null;
        java.util.concurrent.Executor executor69 = null;
        retrofit.RequestInterceptor requestInterceptor70 = null;
        retrofit.converter.Converter converter71 = null;
        retrofit.Profiler profiler72 = null;
        retrofit.ErrorHandler errorHandler73 = null;
        retrofit.RestAdapter.Log log74 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.LogLevel logLevel75 = null;
        retrofit.RestAdapter restAdapter76 = new retrofit.RestAdapter(server66, provider67, executor68, executor69, requestInterceptor70, converter71, profiler72, errorHandler73, log74, logLevel75);
        retrofit.RestAdapter.LogLevel logLevel77 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter76.logLevel = logLevel77;
        retrofit.RestAdapter restAdapter79 = new retrofit.RestAdapter(server45, provider46, executor47, executor48, requestInterceptor49, converter50, profiler51, errorHandler52, log65, logLevel77);
        retrofit.RestAdapter.LogLevel logLevel80 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter restAdapter81 = new retrofit.RestAdapter(server37, provider38, executor39, executor40, requestInterceptor41, converter42, profiler43, errorHandler44, log65, logLevel80);
        restAdapter30.logLevel = logLevel80;
        builder15.logLevel = logLevel80;
        restAdapter10.logLevel = logLevel80;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorHandler14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(converter32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logLevel35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(provider64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log74);
        org.junit.Assert.assertTrue("'" + logLevel77 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel77.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel80 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel80.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        retrofit.Profiler profiler21 = null;
        restAdapter10.profiler = profiler21;
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = null;
        builder0.errorHandler = errorHandler1;
        retrofit.Server server3 = builder0.server;
        java.util.concurrent.Executor executor4 = null;
        builder0.httpExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor7 = builder0.httpExecutor;
        retrofit.Server server8 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder9 = builder0.setServer(server8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(server3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestInterceptor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executor7);
    }
}

