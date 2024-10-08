/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 02:25:21 GMT 2020
 */

package com.squareup.okhttp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.HttpResponseCache;
import com.squareup.okhttp.OkAuthenticator;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.TunnelRequest;
import com.squareup.okhttp.internal.http.OkResponseCache;
import com.squareup.okhttp.internal.http.RawHeaders;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ResponseCache;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OkHttpClient_ESTest extends OkHttpClient_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = okHttpClient0.copyWithDefaults();
      OkResponseCache okResponseCache0 = okHttpClient1.okResponseCache();
      OkHttpClient okHttpClient2 = okHttpClient0.setResponseCache(okHttpClient1.responseCache);
      HostnameVerifier hostnameVerifier0 = okHttpClient1.getHostnameVerifier();
      ProxySelector proxySelector0 = ProxySelector.getDefault();
      OkHttpClient okHttpClient3 = okHttpClient2.setCookieHandler(okHttpClient1.cookieHandler);
      HostnameVerifier hostnameVerifier1 = okHttpClient2.getHostnameVerifier();
      URL uRL0 = MockURL.getFtpExample();
      OkResponseCache okResponseCache1 = okHttpClient2.okResponseCache();
      // Undeclared exception!
      try { 
        okHttpClient2.open(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // Unexpected protocol: ftp
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      ConnectionPool connectionPool0 = ConnectionPool.getDefault();
      CookieManager cookieManager0 = new CookieManager();
      HostnameVerifier hostnameVerifier0 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "wdfv{o";
      MockFile mockFile0 = new MockFile(string0, string0);
      String string1 = "z";
      MockFile mockFile1 = new MockFile(mockFile0, string1);
      URL uRL0 = mockFile1.toURL();
      OkHttpClient okHttpClient0 = new OkHttpClient();
      // Undeclared exception!
      try { 
        okHttpClient0.open(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // Unexpected protocol: file
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkResponseCache okResponseCache0 = null;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) okHttpClient0.DEFAULT_TRANSPORTS);
      // Undeclared exception!
      try { 
        okHttpClient0.setTransports(list0);
      } catch(IllegalArgumentException e) {
         //
         // transports doesn't contain http/1.1: []
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      SSLSocketFactory sSLSocketFactory0 = HttpsURLConnection.getDefaultSSLSocketFactory();
      OkHttpClient okHttpClient1 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory0);
      List<String> list0 = okHttpClient0.getTransports();
      okHttpClient0.transports = list0;
      ProxySelector proxySelector0 = null;
      OkHttpClient okHttpClient2 = okHttpClient1.setResponseCache(okHttpClient0.responseCache);
      OkHttpClient okHttpClient3 = okHttpClient0.setProxySelector(proxySelector0);
      List<String> list1 = okHttpClient0.getTransports();
      OkHttpClient okHttpClient4 = okHttpClient3.copyWithDefaults();
      OkResponseCache okResponseCache0 = okHttpClient0.okResponseCache();
      OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(okHttpClient4.proxySelector);
      OkHttpClient okHttpClient6 = okHttpClient4.copyWithDefaults();
      OkResponseCache okResponseCache1 = okHttpClient5.okResponseCache();
      Proxy proxy0 = okHttpClient1.getProxy();
      boolean boolean0 = okHttpClient0.getFollowProtocolRedirects();
      OkHttpClient okHttpClient7 = okHttpClient3.copyWithDefaults();
      List<String> list2 = okHttpClient4.getTransports();
      OkHttpClient okHttpClient8 = okHttpClient5.setProxySelector(okHttpClient4.proxySelector);
      ProxySelector proxySelector1 = okHttpClient2.getProxySelector();
      OkHttpClient okHttpClient9 = okHttpClient8.setFollowProtocolRedirects(boolean0);
      List<String> list3 = okHttpClient0.getTransports();
      boolean boolean1 = okHttpClient5.getFollowProtocolRedirects();
      CookieHandler cookieHandler0 = okHttpClient7.getCookieHandler();
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      String string0 = "No response body exists; responseCode=";
      List<String> list0 = OkHttpClient.DEFAULT_TRANSPORTS;
      okHttpClient0.transports = list0;
      int int0 = (-1);
      ConnectionPool connectionPool0 = new ConnectionPool(int0, int0);
      OkHttpClient okHttpClient1 = okHttpClient0.setConnectionPool(connectionPool0);
      ResponseCache responseCache0 = okHttpClient0.getResponseCache();
      OkHttpClient okHttpClient2 = okHttpClient0.setHostnameVerifier(okHttpClient1.hostnameVerifier);
      OkHttpClient okHttpClient3 = okHttpClient2.setTransports(okHttpClient0.transports);
      URL uRL0 = MockURL.getHttpExample();
      String string1 = "_g\\1";
      URL uRL1 = MockURL.URL(uRL0, string1);
      HttpURLConnection httpURLConnection0 = okHttpClient3.open(uRL1);
      OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okHttpClient1.authenticator);
      OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(okHttpClient0.proxySelector);
      boolean boolean0 = true;
      OkHttpClient okHttpClient6 = okHttpClient2.setFollowProtocolRedirects(boolean0);
      Proxy proxy0 = okHttpClient0.getProxy();
      OkHttpClient okHttpClient7 = okHttpClient2.setProxy(okHttpClient3.proxy);
      OkAuthenticator okAuthenticator0 = okHttpClient7.getAuthenticator();
      okHttpClient7.transports = okHttpClient0.DEFAULT_TRANSPORTS;
      OkHttpClient okHttpClient8 = okHttpClient7.setTransports(okHttpClient1.transports);
      Proxy proxy1 = okHttpClient3.getProxy();
      OkHttpClient okHttpClient9 = okHttpClient2.setSSLSocketFactory(okHttpClient6.sslSocketFactory);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      String string0 = "https://";
      URL uRL0 = MockURL.URL(string0);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      HttpURLConnection httpURLConnection0 = okHttpClient0.open(uRL0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = new OkHttpClient(okHttpClient0);
      ProxySelector proxySelector0 = okHttpClient1.getProxySelector();
      boolean boolean0 = false;
      OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(boolean0);
      OkHttpClient okHttpClient3 = okHttpClient1.setCookieHandler(okHttpClient0.cookieHandler);
      OkHttpClient okHttpClient4 = okHttpClient0.copyWithDefaults();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = new OkHttpClient(okHttpClient0);
      ResponseCache responseCache0 = okHttpClient1.getResponseCache();
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      HostnameVerifier hostnameVerifier0 = HttpsURLConnection.getDefaultHostnameVerifier();
      OkHttpClient okHttpClient1 = okHttpClient0.setHostnameVerifier(hostnameVerifier0);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkAuthenticator okAuthenticator0 = okHttpClient0.getAuthenticator();
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      ConnectionPool connectionPool0 = ConnectionPool.getDefault();
      OkHttpClient okHttpClient1 = okHttpClient0.setConnectionPool(connectionPool0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      Proxy proxy0 = Proxy.NO_PROXY;
      OkHttpClient okHttpClient1 = okHttpClient0.setProxy(proxy0);
      OkHttpClient okHttpClient2 = okHttpClient1.setTransports(okHttpClient0.DEFAULT_TRANSPORTS);
      OkHttpClient okHttpClient3 = new OkHttpClient(okHttpClient0);
      OkHttpClient okHttpClient4 = new OkHttpClient(okHttpClient3);
      OkHttpClient okHttpClient5 = okHttpClient4.setProxySelector(okHttpClient1.proxySelector);
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = new OkHttpClient(okHttpClient0);
      HostnameVerifier hostnameVerifier0 = okHttpClient1.getHostnameVerifier();
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = okHttpClient0.copyWithDefaults();
      OkHttpClient okHttpClient2 = okHttpClient1.setAuthenticator(okHttpClient0.authenticator);
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      HostnameVerifier hostnameVerifier0 = okHttpClient0.getHostnameVerifier();
      ConnectionPool connectionPool0 = okHttpClient0.getConnectionPool();
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      OkHttpClient okHttpClient0 = null;
      OkHttpClient okHttpClient1 = null;
      try {
        okHttpClient1 = new OkHttpClient(okHttpClient0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      ResponseCache responseCache0 = ResponseCache.getDefault();
      OkHttpClient okHttpClient1 = okHttpClient0.setResponseCache(responseCache0);
      CookieManager cookieManager0 = new CookieManager();
      CookieHandler cookieHandler0 = CookieHandler.getDefault();
      OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieManager0);
      OkHttpClient okHttpClient3 = okHttpClient2.setResponseCache(okHttpClient0.responseCache);
      boolean boolean0 = okHttpClient0.getFollowProtocolRedirects();
      OkHttpClient okHttpClient4 = okHttpClient0.copyWithDefaults();
      OkHttpClient okHttpClient5 = okHttpClient4.setFollowProtocolRedirects(okHttpClient1.followProtocolRedirects);
      OkResponseCache okResponseCache0 = okHttpClient0.okResponseCache();
      ResponseCache responseCache1 = okHttpClient3.getResponseCache();
      OkHttpClient okHttpClient6 = okHttpClient0.setHostnameVerifier(okHttpClient1.hostnameVerifier);
      OkHttpClient okHttpClient7 = okHttpClient1.setProxy(okHttpClient4.proxy);
      OkHttpClient okHttpClient8 = okHttpClient3.setTransports(okHttpClient6.DEFAULT_TRANSPORTS);
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) okHttpClient0.transports);
      // Undeclared exception!
      try { 
        okHttpClient0.setTransports(list0);
      } catch(IllegalArgumentException e) {
         //
         // transports doesn't contain http/1.1: []
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      List<String> list0 = okHttpClient0.getTransports();
      // Undeclared exception!
      try { 
        okHttpClient0.setTransports(list0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      String string0 = null;
      String string1 = "";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) okHttpClient0.transports);
      // Undeclared exception!
      try { 
        okHttpClient0.setTransports(list0);
      } catch(IllegalArgumentException e) {
         //
         // transports doesn't contain http/1.1: []
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = new OkHttpClient(okHttpClient0);
      CookieHandler cookieHandler0 = okHttpClient1.getCookieHandler();
      Proxy proxy0 = okHttpClient0.getProxy();
      URL uRL0 = MockURL.getFileExample();
      // Undeclared exception!
      try { 
        okHttpClient1.open(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // Unexpected protocol: file
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      ProxySelector proxySelector0 = ProxySelector.getDefault();
      OkHttpClient okHttpClient1 = okHttpClient0.setProxySelector(proxySelector0);
      HostnameVerifier hostnameVerifier0 = okHttpClient1.getHostnameVerifier();
      okHttpClient1.sslSocketFactory = okHttpClient0.sslSocketFactory;
      URL uRL0 = MockURL.getFileExample();
      String string0 = "wm&b2N[";
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, string0, uRLStreamHandler0);
      // Undeclared exception!
      try { 
        okHttpClient0.open(uRL1);
      } catch(IllegalArgumentException e) {
         //
         // Unexpected protocol: file
         //
         verifyException("com.squareup.okhttp.OkHttpClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = new OkHttpClient(okHttpClient0);
      URL uRL0 = MockURL.getHttpExample();
      HttpURLConnection httpURLConnection0 = okHttpClient1.open(uRL0);
      OkHttpClient okHttpClient2 = okHttpClient0.setProxy(okHttpClient1.proxy);
      List<String> list0 = okHttpClient1.getTransports();
      OkResponseCache okResponseCache0 = okHttpClient2.okResponseCache();
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      OkHttpClient okHttpClient1 = new OkHttpClient(okHttpClient0);
      boolean boolean0 = true;
      OkHttpClient okHttpClient2 = okHttpClient1.setFollowProtocolRedirects(boolean0);
      boolean boolean1 = false;
      OkHttpClient okHttpClient3 = okHttpClient2.setFollowProtocolRedirects(boolean1);
      SSLSocketFactory sSLSocketFactory0 = okHttpClient1.getSslSocketFactory();
      OkHttpClient okHttpClient4 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory0);
      OkHttpClient okHttpClient5 = okHttpClient1.setProxy(okHttpClient0.proxy);
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      URL uRL0 = null;
      String string0 = "OtzI)\"";
      int int0 = 0;
      String string1 = ": ";
      TunnelRequest tunnelRequest0 = new TunnelRequest(string0, int0, string1, string1);
      RawHeaders rawHeaders0 = tunnelRequest0.getRequestHeaders();
      RawHeaders rawHeaders1 = RawHeaders.fromNameValueBlock(okHttpClient0.DEFAULT_TRANSPORTS);
      List<String> list0 = rawHeaders0.toNameValueBlock();
      okHttpClient0.transports = list0;
      ProxySelector proxySelector0 = ProxySelector.getDefault();
      OkHttpClient okHttpClient1 = okHttpClient0.setProxySelector(proxySelector0);
      // Undeclared exception!
      try { 
        okHttpClient0.open(uRL0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      String string0 = "https://";
      URL uRL0 = MockURL.URL(string0);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, string0, uRLStreamHandler0);
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      HttpURLConnection httpURLConnection0 = okHttpClient0.open(uRL1);
      OkResponseCache okResponseCache0 = okHttpClient0.okResponseCache();
      HttpURLConnection httpURLConnection1 = okHttpClient0.open(uRL1);
  }
}
