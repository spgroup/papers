/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 17:48:24 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.view.inputmethod.EditorInfo;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import retrofit.ErrorHandler;
import retrofit.Profiler;
import retrofit.RequestBuilder;
import retrofit.RequestInterceptor;
import retrofit.RequestInterceptorTape;
import retrofit.RestAdapter;
import retrofit.RestMethodInfo;
import retrofit.Server;
import retrofit.android.AndroidLog;
import retrofit.client.ApacheClient;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.OkClient;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;
import retrofit.converter.WireConverter;
import retrofit.mime.TypedByteArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RestAdapter_ESTest extends RestAdapter_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "Qfdg'5IH3SsI%lfVb";
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(string0);
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setLog(restAdapter_Log0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder0.setErrorHandler(errorHandler0);
      Profiler<Object> profiler0 = (Profiler<Object>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder2.setProfiler(profiler0);
      RestAdapter restAdapter0 = restAdapter_Builder4.build();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      restAdapter0.setLogLevel(restAdapter_LogLevel0);
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      RestAdapter restAdapter1 = restAdapter_Builder4.build();
      String string1 = "";
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder4.setRequestInterceptor(requestInterceptor0);
      restAdapter_Log0.log(string1);
      RestAdapter.LogLevel restAdapter_LogLevel1 = restAdapter0.getLogLevel();
      boolean boolean0 = restAdapter_LogLevel1.log();
      restAdapter0.setLogLevel(restAdapter_LogLevel1);
      int int0 = 307;
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0);
      long long0 = 20000L;
      System.setCurrentTimeMillis(long0);
      RestAdapter.Builder restAdapter_Builder7 = restAdapter_Builder2.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      boolean boolean1 = restAdapter_LogLevel1.log();
      RestAdapter.LogLevel restAdapter_LogLevel2 = restAdapter1.getLogLevel();
      boolean boolean2 = restAdapter_LogLevel1.log();
      Server server0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setServer(server0);
      } catch(NullPointerException e) {
         //
         // Server may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "";
      AndroidLog androidLog0 = new AndroidLog(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLog(androidLog0);
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient(basicHttpParams0);
      ApacheClient apacheClient0 = new ApacheClient(defaultHttpClient0);
      int int0 = (-326);
      HttpResponseInterceptor httpResponseInterceptor0 = defaultHttpClient0.getResponseInterceptor(int0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setClient((Client) apacheClient0);
      int int1 = 1214;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int1, threadFactory0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      String string1 = "'^oHo6X\"P)J%'Un";
      // Undeclared exception!
      try { 
        androidLog0.log(string1);
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.util.Log", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.FULL;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      String string0 = "lSChcq'<w%_]}\\f R";
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      restAdapter_Log0.log(string0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder0.setLog(restAdapter_Log0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder1.setServer(string0);
      Gson gson0 = null;
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setConverter(gsonConverter0);
      RequestInterceptor requestInterceptor0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder3.setRequestInterceptor(requestInterceptor0);
      } catch(NullPointerException e) {
         //
         // Request interceptor may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = " parameters, was given ";
      String string1 = "*@RHnC[?;~3=oSXT";
      Server server0 = new Server(string0, string1);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      String string2 = "NONE";
      AndroidLog androidLog0 = new AndroidLog(string2);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setLog(androidLog0);
      Executor executor0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder2.setExecutors(executor0, executor0);
      } catch(NullPointerException e) {
         //
         // HTTP executor may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      ErrorHandler errorHandler0 = null;
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.BASIC;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      Converter converter0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setConverter(converter0);
      } catch(NullPointerException e) {
         //
         // Converter may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      ErrorHandler errorHandler0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setErrorHandler(errorHandler0);
      } catch(NullPointerException e) {
         //
         // Error handler may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      String string0 = "";
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setServer(string0);
      } catch(NullPointerException e) {
         //
         // Server may not be blank.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<String> profiler0 = null;
      RestAdapter.Builder restAdapter_Builder1 = new RestAdapter.Builder();
      OkClient okClient0 = new OkClient();
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setClient((Client) okClient0);
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      // Undeclared exception!
      try { 
        restAdapter_Builder2.setProfiler(profiler0);
      } catch(NullPointerException e) {
         //
         // Profiler may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<Object> profiler0 = (Profiler<Object>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setProfiler(profiler0);
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder0.setRequestInterceptor(requestInterceptor0);
      RequestInterceptor requestInterceptor1 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder1.setRequestInterceptor(requestInterceptor1);
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setClient(client_Provider0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder4.setErrorHandler(errorHandler0);
      RequestInterceptor requestInterceptor2 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder0.setRequestInterceptor(requestInterceptor2);
      String string0 = "retrofit.RestAdapter$RestHandler$1";
      String string1 = "_Ng78u";
      Server server0 = new Server(string0, string1);
      RestAdapter.Builder restAdapter_Builder7 = restAdapter_Builder1.setServer(server0);
      String string2 = "transports must not contain null";
      AndroidLog androidLog0 = new AndroidLog(string2);
      RestAdapter.Builder restAdapter_Builder8 = restAdapter_Builder5.setLog(androidLog0);
      RestAdapter restAdapter0 = restAdapter_Builder7.build();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        restAdapter0.create(class0);
      } catch(IllegalArgumentException e) {
         //
         // Only interface endpoint definitions are supported.
         //
         verifyException("retrofit.RestAdapter", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<Header> profiler0 = (Profiler<Header>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setProfiler(profiler0);
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      String string0 = "";
      Client.Provider client_Provider0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setClient(client_Provider0);
      } catch(NullPointerException e) {
         //
         // Client provider may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.FULL;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setRequestInterceptor(requestInterceptor0);
      ApacheClient apacheClient0 = new ApacheClient();
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setClient((Client) apacheClient0);
      // Undeclared exception!
      try { 
        restAdapter_Builder1.build();
      } catch(IllegalArgumentException e) {
         //
         // Server may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      RestAdapter.LogLevel[] restAdapter_LogLevelArray0 = RestAdapter.LogLevel.values();
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkClient okClient0 = new OkClient(okHttpClient0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient((Client) okClient0);
      RestAdapter.Log restAdapter_Log0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setLog(restAdapter_Log0);
      } catch(NullPointerException e) {
         //
         // Log may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.HEADERS;
      boolean boolean0 = restAdapter_LogLevel0.log();
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      String string0 = "z8/lM@ 8";
      restAdapter_Log0.log(string0);
      RestAdapter.LogLevel[] restAdapter_LogLevelArray0 = RestAdapter.LogLevel.values();
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string1 = "37~9Fg";
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(string1);
      Executor executor0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setExecutors(executor0, executor0);
      } catch(NullPointerException e) {
         //
         // HTTP executor may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      String string0 = "18~5LdPDs#;jPXj}";
      restAdapter_Log0.log(string0);
      String string1 = "";
      restAdapter_Log0.log(string1);
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      HttpClient httpClient0 = null;
      ApacheClient apacheClient0 = new ApacheClient(httpClient0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient((Client) apacheClient0);
      Server server0 = new Server(string1, string0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setServer(server0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setLog(restAdapter_Log0);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setLogLevel(restAdapter_LogLevel0);
      RestAdapter restAdapter0 = restAdapter_Builder4.build();
      Class<Runnable> class0 = Runnable.class;
      Runnable runnable0 = restAdapter0.create(class0);
      String string2 = "`s=yi9a0iA.k;z";
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder2.setServer(string2);
      Class<Locale.FilteringMode> class1 = Locale.FilteringMode.class;
      // Undeclared exception!
      try { 
        restAdapter0.create(class1);
      } catch(IllegalArgumentException e) {
         //
         // Only interface endpoint definitions are supported.
         //
         verifyException("retrofit.RestAdapter", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<String> profiler0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setProfiler(profiler0);
      } catch(NullPointerException e) {
         //
         // Profiler may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<Runnable> profiler0 = (Profiler<Runnable>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setProfiler(profiler0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setErrorHandler(errorHandler0);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setLogLevel(restAdapter_LogLevel0);
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      ApacheClient apacheClient0 = new ApacheClient();
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient((Client) apacheClient0);
      Converter converter0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setConverter(converter0);
      } catch(NullPointerException e) {
         //
         // Converter may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "retrofit.RestAdapter$LogLevel";
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(string0);
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setServer(server0);
      RequestInterceptorTape requestInterceptorTape0 = new RequestInterceptorTape();
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setRequestInterceptor(requestInterceptorTape0);
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkClient okClient0 = new OkClient(okHttpClient0);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setClient((Client) okClient0);
      RestAdapter restAdapter0 = restAdapter_Builder4.build();
      Class<TypedByteArray> class0 = TypedByteArray.class;
      // Undeclared exception!
      try { 
        restAdapter0.create(class0);
      } catch(IllegalArgumentException e) {
         //
         // Only interface endpoint definitions are supported.
         //
         verifyException("retrofit.RestAdapter", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "";
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      RestAdapter restAdapter0 = restAdapter_Builder0.build();
      RequestInterceptorTape requestInterceptorTape0 = new RequestInterceptorTape();
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setRequestInterceptor(requestInterceptorTape0);
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkClient okClient0 = new OkClient(okHttpClient0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setClient((Client) okClient0);
      int int0 = 0;
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      boolean boolean0 = false;
      ForkJoinPool forkJoinPool0 = null;
      try {
        forkJoinPool0 = new ForkJoinPool(int0, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ForkJoinPool", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<Object> profiler0 = (Profiler<Object>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setProfiler(profiler0);
      String string0 = "i8,IAMfe`D:";
      Server server0 = new Server(string0, string0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setServer(server0);
      RestAdapter restAdapter0 = restAdapter_Builder2.build();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.FULL;
      restAdapter0.setLogLevel(restAdapter_LogLevel0);
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "";
      AndroidLog androidLog0 = new AndroidLog(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLog(androidLog0);
      String string1 = "android.intent.action.CHOOSER";
      Server server0 = new Server(string0, string1);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setServer(server0);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.HEADERS;
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setLogLevel(restAdapter_LogLevel0);
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setRequestInterceptor(requestInterceptor0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder4.setErrorHandler(errorHandler0);
      Profiler<Integer> profiler0 = (Profiler<Integer>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder5.setProfiler(profiler0);
      RestAdapter.Builder restAdapter_Builder7 = restAdapter_Builder5.setLog(androidLog0);
      RestAdapter.Builder restAdapter_Builder8 = restAdapter_Builder7.setServer(string1);
      RestAdapter restAdapter0 = restAdapter_Builder8.build();
      RestAdapter.LogLevel restAdapter_LogLevel1 = restAdapter0.getLogLevel();
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "Client provider may not be null.";
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setLog(restAdapter_Log0);
      String string1 = "retrofit.RestAdapter$RestHandler";
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setServer(string1);
      Client.Provider client_Provider0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder3.setClient(client_Provider0);
      } catch(NullPointerException e) {
         //
         // Client provider may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setErrorHandler(errorHandler0);
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setClient(client_Provider0);
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.FULL;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      Client client0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setClient(client0);
      } catch(NullPointerException e) {
         //
         // Client may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      RestAdapter.LogLevel[] restAdapter_LogLevelArray0 = RestAdapter.LogLevel.values();
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient(client_Provider0);
      WireConverter wireConverter0 = new WireConverter();
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setConverter(wireConverter0);
      String string0 = "}I";
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setServer(string0);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setLogLevel(restAdapter_LogLevel0);
      ApacheClient apacheClient0 = new ApacheClient();
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder4.setClient((Client) apacheClient0);
      Profiler<String> profiler0 = (Profiler<String>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder5.setProfiler(profiler0);
      boolean boolean0 = restAdapter_LogLevel0.log();
      String string1 = "n";
      AndroidLog androidLog0 = new AndroidLog(string1);
      String string2 = null;
      // Undeclared exception!
      try { 
        androidLog0.log(string2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.android.AndroidLog", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      WireConverter wireConverter0 = new WireConverter();
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setConverter(wireConverter0);
      String string0 = "";
      AndroidLog androidLog0 = new AndroidLog(string0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setLog(androidLog0);
      Server server0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder2.setServer(server0);
      } catch(NullPointerException e) {
         //
         // Server may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "QV.";
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      UrlConnectionClient urlConnectionClient0 = new UrlConnectionClient();
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setClient((Client) urlConnectionClient0);
      int int0 = 0;
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setErrorHandler(errorHandler0);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder0.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      Profiler<Delayed> profiler0 = (Profiler<Delayed>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder4.setClient((Client) urlConnectionClient0);
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder2.setProfiler(profiler0);
      ErrorHandler errorHandler1 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      Profiler<Object> profiler1 = (Profiler<Object>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder7 = restAdapter_Builder0.setProfiler(profiler1);
      RestAdapter.Builder restAdapter_Builder8 = restAdapter_Builder6.setErrorHandler(errorHandler1);
      RestAdapter restAdapter0 = restAdapter_Builder2.build();
      RestAdapter restAdapter1 = restAdapter_Builder8.build();
      Class<EditorInfo> class0 = EditorInfo.class;
      // Undeclared exception!
      try { 
        restAdapter1.create(class0);
      } catch(IllegalArgumentException e) {
         //
         // Only interface endpoint definitions are supported.
         //
         verifyException("retrofit.RestAdapter", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "BIG_DECIMAL";
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      Profiler<String> profiler0 = (Profiler<String>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setProfiler(profiler0);
      int int0 = 248;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0, threadFactory0, threadPoolExecutor_AbortPolicy0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor1 = new ScheduledThreadPoolExecutor(int0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor1);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setErrorHandler(errorHandler0);
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient(basicHttpParams0);
      ApacheClient apacheClient0 = new ApacheClient(defaultHttpClient0);
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder4.setClient((Client) apacheClient0);
      RestAdapter restAdapter0 = restAdapter_Builder5.build();
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      ApacheClient apacheClient0 = new ApacheClient();
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient((Client) apacheClient0);
      String string0 = "";
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setServer(server0);
      Profiler<TypedByteArray> profiler0 = (Profiler<TypedByteArray>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setProfiler(profiler0);
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      restAdapter_Log0.log(server0.DEFAULT_NAME);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setLog(restAdapter_Log0);
      RestAdapter restAdapter0 = restAdapter_Builder3.build();
      Class<Delayed> class0 = Delayed.class;
      RestAdapter restAdapter1 = restAdapter_Builder2.build();
      Delayed delayed0 = restAdapter0.create(class0);
      Request request0 = null;
      // Undeclared exception!
      try { 
        apacheClient0.execute(request0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.client.ApacheClient$GenericHttpRequest", e);
      }
  }
}
