import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer11 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer11 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray12);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory17.setDisplayName("");
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30, errorPageArray29);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30);
        org.springframework.boot.context.embedded.Compression compression33 = null;
        undertowEmbeddedServletContainerFactory28.setCompression(compression33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage36 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage36 };
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.net.InetAddress inetAddress44 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress44);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        int int8 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        java.lang.String str17 = undertowEmbeddedServletContainerFactory13.getDisplayName();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory13.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory20.setDocumentRoot(file26);
        boolean boolean28 = undertowEmbeddedServletContainerFactory20.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        java.net.InetAddress inetAddress31 = undertowEmbeddedServletContainerFactory20.getAddress();
        org.springframework.boot.context.embedded.Compression compression32 = null;
        undertowEmbeddedServletContainerFactory20.setCompression(compression32);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory13.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.setPort(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray34);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage17 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray18 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage17 };
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray18);
        undertowEmbeddedServletContainerFactory16.setPort((int) (byte) 0);
        java.net.InetAddress inetAddress22 = undertowEmbeddedServletContainerFactory16.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory24.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory24.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory24.getBuilderCustomizers();
        java.lang.String str30 = undertowEmbeddedServletContainerFactory24.getDisplayName();
        int int31 = undertowEmbeddedServletContainerFactory24.getPort();
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory24.setDocumentRoot(file32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory35.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory35.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection40 = undertowEmbeddedServletContainerFactory35.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory35.setDisplayName("");
        int int43 = undertowEmbeddedServletContainerFactory35.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection44 = undertowEmbeddedServletContainerFactory35.getDeploymentInfoCustomizers();
        java.io.File file45 = undertowEmbeddedServletContainerFactory35.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray46 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer47 = undertowEmbeddedServletContainerFactory35.getEmbeddedServletContainer(servletContextInitializerArray46);
        boolean boolean48 = undertowEmbeddedServletContainerFactory35.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray51 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet52 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52, errorPageArray51);
        undertowEmbeddedServletContainerFactory50.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
        org.springframework.boot.context.embedded.Compression compression55 = null;
        undertowEmbeddedServletContainerFactory50.setCompression(compression55);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage58 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray59 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage58 };
        undertowEmbeddedServletContainerFactory57.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory50.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory24.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray59);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.net.InetAddress inetAddress5 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory7.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory7.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory7.setDisplayName("");
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file15);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer17 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer17 };
        undertowEmbeddedServletContainerFactory7.addBuilderCustomizers(undertowBuilderCustomizerArray18);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray18);
        org.springframework.boot.context.embedded.Ssl ssl21 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory23.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory23.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory23.getBuilderCustomizers();
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory23.setDocumentRoot(file29);
        boolean boolean31 = undertowEmbeddedServletContainerFactory23.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection33 = undertowEmbeddedServletContainerFactory23.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings34 = undertowEmbeddedServletContainerFactory23.getMimeMappings();
        undertowEmbeddedServletContainerFactory23.setUseForwardHeaders(false);
        boolean boolean37 = undertowEmbeddedServletContainerFactory23.isAccessLogEnabled();
        int int38 = undertowEmbeddedServletContainerFactory23.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory42.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory42.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection47 = undertowEmbeddedServletContainerFactory42.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory42.setDisplayName("");
        undertowEmbeddedServletContainerFactory42.setSessionTimeout((int) (byte) 1);
        boolean boolean52 = undertowEmbeddedServletContainerFactory42.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory42.setSessionTimeout((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory58.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory58.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection63 = undertowEmbeddedServletContainerFactory58.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray64 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory58.addInitializers(servletContextInitializerArray64);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer66 = undertowEmbeddedServletContainerFactory56.getEmbeddedServletContainer(servletContextInitializerArray64);
        undertowEmbeddedServletContainerFactory42.addInitializers(servletContextInitializerArray64);
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray64);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer69 = undertowEmbeddedServletContainerFactory23.getEmbeddedServletContainer(servletContextInitializerArray64);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer70 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer69);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 10);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(false);
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory2.getAddress();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory2.setSessionStoreDir(file10);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory2.getAddress();
        java.lang.String str13 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression14 = undertowEmbeddedServletContainerFactory1.getCompression();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression14);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        int int16 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory20.setDisplayName("");
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) (byte) 1);
        boolean boolean30 = undertowEmbeddedServletContainerFactory20.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection41 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray42 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory36.addInitializers(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer44 = undertowEmbeddedServletContainerFactory34.getEmbeddedServletContainer(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer47 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer47);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray17);
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file20);
        java.net.InetAddress inetAddress22 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file13);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress17);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file20 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file20);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.net.InetAddress inetAddress11 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory7.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory7.getBuilderCustomizers();
        java.net.InetAddress inetAddress13 = null;
        undertowEmbeddedServletContainerFactory7.setAddress(inetAddress13);
        undertowEmbeddedServletContainerFactory7.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.JspServlet jspServlet17 = undertowEmbeddedServletContainerFactory7.getJspServlet();
        java.io.File file18 = undertowEmbeddedServletContainerFactory7.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory20.setDisplayName("");
        java.lang.String str28 = undertowEmbeddedServletContainerFactory20.getDisplayName();
        java.io.File file29 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory33.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory33.setDisplayName("");
        undertowEmbeddedServletContainerFactory33.setDisplayName("");
        org.springframework.boot.context.embedded.Compression compression43 = undertowEmbeddedServletContainerFactory33.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory45.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory45.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection50 = undertowEmbeddedServletContainerFactory45.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory45.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory54.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory54.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection59 = undertowEmbeddedServletContainerFactory54.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory54.setDisplayName("");
        java.lang.String str62 = undertowEmbeddedServletContainerFactory54.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory54.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory45.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory33.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory20.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory7.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        int int70 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1800 + "'", int70 == 1800);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory14.setDisplayName("");
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file22);
        java.io.File file24 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray25);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings27 = undertowEmbeddedServletContainerFactory14.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory29.setSessionStoreDir(file30);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray34 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35, errorPageArray34);
        undertowEmbeddedServletContainerFactory33.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        undertowEmbeddedServletContainerFactory29.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader15);
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet10 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader13);
        java.net.InetAddress inetAddress15 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean23 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        int int20 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        org.springframework.boot.context.embedded.Compression compression6 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage9 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage9 };
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray10);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory14.setDisplayName("");
        int int22 = undertowEmbeddedServletContainerFactory14.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection23 = undertowEmbeddedServletContainerFactory14.getDeploymentInfoCustomizers();
        java.io.File file24 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer26 = undertowEmbeddedServletContainerFactory14.getEmbeddedServletContainer(servletContextInitializerArray25);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory29.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory29.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory29.setDisplayName("");
        undertowEmbeddedServletContainerFactory29.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory40.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory40.setDisplayName("");
        int int48 = undertowEmbeddedServletContainerFactory40.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection49 = undertowEmbeddedServletContainerFactory40.getDeploymentInfoCustomizers();
        java.io.File file50 = undertowEmbeddedServletContainerFactory40.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray51 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer52 = undertowEmbeddedServletContainerFactory40.getEmbeddedServletContainer(servletContextInitializerArray51);
        java.net.InetAddress inetAddress53 = undertowEmbeddedServletContainerFactory40.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage55 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray56 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage55 };
        undertowEmbeddedServletContainerFactory54.addErrorPages(errorPageArray56);
        undertowEmbeddedServletContainerFactory40.addErrorPages(errorPageArray56);
        undertowEmbeddedServletContainerFactory29.addErrorPages(errorPageArray56);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray56);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.Compression compression63 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray56);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.lang.String str19 = undertowEmbeddedServletContainerFactory13.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression20 = null;
        undertowEmbeddedServletContainerFactory13.setCompression(compression20);
        org.springframework.boot.context.embedded.JspServlet jspServlet22 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet22);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file26);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet22);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory9.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory9.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory9.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer17 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray15);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer17);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.Ssl ssl20 = undertowEmbeddedServletContainerFactory1.getSsl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl20);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression17);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory21.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.Ssl ssl29 = null;
        undertowEmbeddedServletContainerFactory21.setSsl(ssl29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory32.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection37 = undertowEmbeddedServletContainerFactory32.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory32.setDisplayName("");
        int int40 = undertowEmbeddedServletContainerFactory32.getPort();
        undertowEmbeddedServletContainerFactory32.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory32.setSessionTimeout(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage46 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray47 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage46 };
        undertowEmbeddedServletContainerFactory45.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory32.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.net.InetAddress inetAddress54 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory57.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory57.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader62 = null;
        undertowEmbeddedServletContainerFactory57.setResourceLoader(resourceLoader62);
        undertowEmbeddedServletContainerFactory57.setIoThreads((java.lang.Integer) (-1));
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = undertowEmbeddedServletContainerFactory57.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet66);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet66);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        int int2 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file3 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file4 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory3.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory3.addInitializers(servletContextInitializerArray9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory3.setDocumentRoot(file11);
        boolean boolean13 = undertowEmbeddedServletContainerFactory3.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory15.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory15.setDocumentRoot(file21);
        boolean boolean23 = undertowEmbeddedServletContainerFactory15.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = undertowEmbeddedServletContainerFactory15.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        java.net.InetAddress inetAddress26 = undertowEmbeddedServletContainerFactory15.getAddress();
        org.springframework.boot.context.embedded.Compression compression27 = null;
        undertowEmbeddedServletContainerFactory15.setCompression(compression27);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray29 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory15.addBuilderCustomizers(undertowBuilderCustomizerArray29);
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory15.setAccessLogDirectory(file31);
        org.springframework.boot.context.embedded.JspServlet jspServlet33 = undertowEmbeddedServletContainerFactory15.getJspServlet();
        undertowEmbeddedServletContainerFactory3.setJspServlet(jspServlet33);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet33);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        int int40 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1800 + "'", int40 == 1800);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.Compression compression4 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression4);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader15);
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        boolean boolean22 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet23);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int7 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory10.setDisplayName("");
        java.lang.String str18 = undertowEmbeddedServletContainerFactory10.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file22);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        java.lang.String str26 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.net.InetAddress inetAddress24 = undertowEmbeddedServletContainerFactory13.getAddress();
        org.springframework.boot.context.embedded.Compression compression25 = null;
        undertowEmbeddedServletContainerFactory13.setCompression(compression25);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray27 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory13.addBuilderCustomizers(undertowBuilderCustomizerArray27);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory13.setAccessLogDirectory(file29);
        org.springframework.boot.context.embedded.JspServlet jspServlet31 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet31);
        int int33 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        boolean boolean36 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        org.springframework.boot.context.embedded.Compression compression6 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage9 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage9 };
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray10);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray10);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory15.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory15.setDisplayName("");
        undertowEmbeddedServletContainerFactory15.setDisplayName("");
        org.springframework.boot.context.embedded.Compression compression25 = undertowEmbeddedServletContainerFactory15.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory27.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection32 = undertowEmbeddedServletContainerFactory27.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory27.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection41 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory36.setDisplayName("");
        java.lang.String str44 = undertowEmbeddedServletContainerFactory36.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory36.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        undertowEmbeddedServletContainerFactory27.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray45);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader15);
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Compression compression12 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory18.setDisplayName("");
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet28 = undertowEmbeddedServletContainerFactory18.getJspServlet();
        undertowEmbeddedServletContainerFactory18.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = undertowEmbeddedServletContainerFactory18.getErrorPages();
        undertowEmbeddedServletContainerFactory14.setErrorPages(errorPageSet31);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet31);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer5 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer5 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory14.setDisplayName("");
        java.lang.String str22 = undertowEmbeddedServletContainerFactory14.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.Ssl ssl28 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl28);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file31 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer18 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer18 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray19);
        java.lang.String str21 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory14.setDisplayName("");
        java.lang.String str22 = undertowEmbeddedServletContainerFactory14.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file26);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file12);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.io.File file6 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory18.setDisplayName("");
        int int26 = undertowEmbeddedServletContainerFactory18.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection27 = undertowEmbeddedServletContainerFactory18.getDeploymentInfoCustomizers();
        java.io.File file28 = undertowEmbeddedServletContainerFactory18.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer30 = undertowEmbeddedServletContainerFactory18.getEmbeddedServletContainer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory32.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection37 = undertowEmbeddedServletContainerFactory32.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory32.setDisplayName("");
        int int40 = undertowEmbeddedServletContainerFactory32.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection41 = undertowEmbeddedServletContainerFactory32.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory32.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory47.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory47.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection52 = undertowEmbeddedServletContainerFactory47.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory47.setDisplayName("");
        int int55 = undertowEmbeddedServletContainerFactory47.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection56 = undertowEmbeddedServletContainerFactory47.getDeploymentInfoCustomizers();
        java.io.File file57 = undertowEmbeddedServletContainerFactory47.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer59 = undertowEmbeddedServletContainerFactory47.getEmbeddedServletContainer(servletContextInitializerArray58);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer60 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer60);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory10.setDisplayName("");
        java.lang.String str18 = undertowEmbeddedServletContainerFactory10.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        org.springframework.boot.context.embedded.JspServlet jspServlet22 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet22);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file12);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.lang.String str16 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory5.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        int int18 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 100);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 35);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        java.io.File file13 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory12.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory12.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray18);
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory12.setDocumentRoot(file20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray24 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet25 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet25, errorPageArray24);
        undertowEmbeddedServletContainerFactory23.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet25);
        undertowEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet25);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray32 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet33 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet33, errorPageArray32);
        undertowEmbeddedServletContainerFactory31.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet33);
        int int36 = undertowEmbeddedServletContainerFactory31.getSessionTimeout();
        undertowEmbeddedServletContainerFactory31.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory40.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        java.io.File file46 = null;
        undertowEmbeddedServletContainerFactory40.setDocumentRoot(file46);
        boolean boolean48 = undertowEmbeddedServletContainerFactory40.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet49 = undertowEmbeddedServletContainerFactory40.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection50 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory52.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory52.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection57 = undertowEmbeddedServletContainerFactory52.getBuilderCustomizers();
        java.io.File file58 = null;
        undertowEmbeddedServletContainerFactory52.setDocumentRoot(file58);
        boolean boolean60 = undertowEmbeddedServletContainerFactory52.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet61 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection62 = undertowEmbeddedServletContainerFactory52.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings63 = undertowEmbeddedServletContainerFactory52.getMimeMappings();
        undertowEmbeddedServletContainerFactory40.setMimeMappings(mimeMappings63);
        undertowEmbeddedServletContainerFactory31.setMimeMappings(mimeMappings63);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings63);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 35);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1800 + "'", int36 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings63);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings13 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray16 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet17, errorPageArray16);
        undertowEmbeddedServletContainerFactory15.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet17);
        org.springframework.boot.context.embedded.Compression compression20 = null;
        undertowEmbeddedServletContainerFactory15.setCompression(compression20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage23 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray24 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage23 };
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory28.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory28.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection33 = undertowEmbeddedServletContainerFactory28.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray34);
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory28.setDocumentRoot(file36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray40 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41, errorPageArray40);
        undertowEmbeddedServletContainerFactory39.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        undertowEmbeddedServletContainerFactory15.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        org.springframework.boot.context.embedded.JspServlet jspServlet46 = undertowEmbeddedServletContainerFactory15.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        int int49 = undertowEmbeddedServletContainerFactory48.getPort();
        java.io.File file50 = undertowEmbeddedServletContainerFactory48.getSessionStoreDir();
        java.io.File file51 = undertowEmbeddedServletContainerFactory48.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory53.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory53.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory53.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory53.setDisplayName("");
        int int61 = undertowEmbeddedServletContainerFactory53.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection62 = undertowEmbeddedServletContainerFactory53.getDeploymentInfoCustomizers();
        java.io.File file63 = undertowEmbeddedServletContainerFactory53.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray64 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer65 = undertowEmbeddedServletContainerFactory53.getEmbeddedServletContainer(servletContextInitializerArray64);
        java.net.InetAddress inetAddress66 = undertowEmbeddedServletContainerFactory53.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage68 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray69 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage68 };
        undertowEmbeddedServletContainerFactory67.addErrorPages(errorPageArray69);
        undertowEmbeddedServletContainerFactory53.addErrorPages(errorPageArray69);
        java.io.File file72 = null;
        undertowEmbeddedServletContainerFactory53.setDocumentRoot(file72);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory75.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory75.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory75.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory75.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer84 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray85 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer84 };
        undertowEmbeddedServletContainerFactory75.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        undertowEmbeddedServletContainerFactory53.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        undertowEmbeddedServletContainerFactory48.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        undertowEmbeddedServletContainerFactory15.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        int int91 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.concurrent.TimeUnit timeUnit93 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 10, timeUnit93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 10);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory2.setPort(100);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        org.springframework.boot.context.embedded.Compression compression14 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings20 = undertowEmbeddedServletContainerFactory17.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = undertowEmbeddedServletContainerFactory26.getJspServlet();
        undertowEmbeddedServletContainerFactory22.setJspServlet(jspServlet29);
        undertowEmbeddedServletContainerFactory17.setJspServlet(jspServlet29);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet29);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection33 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection33);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(10);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory6.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory6.getBuilderCustomizers();
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory6.setDocumentRoot(file12);
        boolean boolean14 = undertowEmbeddedServletContainerFactory6.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory6.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        undertowEmbeddedServletContainerFactory6.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory6.setDocumentRoot(file20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer33 = undertowEmbeddedServletContainerFactory23.getEmbeddedServletContainer(servletContextInitializerArray31);
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray31);
        undertowEmbeddedServletContainerFactory4.addInitializers(servletContextInitializerArray31);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray31);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer33);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage1 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage1 };
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray2);
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) 0);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory0.getAddress();
        java.net.InetAddress inetAddress7 = undertowEmbeddedServletContainerFactory0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader13);
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        int int6 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        int int16 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        int int15 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file16 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file16);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 0);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet15 = undertowEmbeddedServletContainerFactory12.getJspServlet();
        java.lang.String str16 = undertowEmbeddedServletContainerFactory12.getDisplayName();
        java.lang.String str17 = undertowEmbeddedServletContainerFactory12.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory19.getBuilderCustomizers();
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory19.setDocumentRoot(file25);
        boolean boolean27 = undertowEmbeddedServletContainerFactory19.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet28 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory19.getBuilderCustomizers();
        java.net.InetAddress inetAddress30 = undertowEmbeddedServletContainerFactory19.getAddress();
        org.springframework.boot.context.embedded.Compression compression31 = null;
        undertowEmbeddedServletContainerFactory19.setCompression(compression31);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory19.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray33);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory12.setSessionStoreDir(file13);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory12.getSsl();
        undertowEmbeddedServletContainerFactory12.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory12.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet18);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage1 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage1 };
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory0.setAccessLogDirectory(file4);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory0.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer11 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer11 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray12);
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        org.springframework.boot.context.embedded.Compression compression23 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression23);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        java.net.InetAddress inetAddress17 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress17);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.Compression compression14 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        java.net.InetAddress inetAddress17 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader17);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory22.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection27 = undertowEmbeddedServletContainerFactory22.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray28);
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory22.setDocumentRoot(file30);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray34 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35, errorPageArray34);
        undertowEmbeddedServletContainerFactory33.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet35);
        java.io.File file40 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file41);
        java.io.File file43 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file40);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file3 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        org.springframework.boot.context.embedded.Compression compression10 = null;
        undertowEmbeddedServletContainerFactory5.setCompression(compression10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage13 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage13 };
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray14);
        undertowEmbeddedServletContainerFactory5.addErrorPages(errorPageArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory18.setDisplayName("");
        int int26 = undertowEmbeddedServletContainerFactory18.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection27 = undertowEmbeddedServletContainerFactory18.getDeploymentInfoCustomizers();
        java.io.File file28 = undertowEmbeddedServletContainerFactory18.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer30 = undertowEmbeddedServletContainerFactory18.getEmbeddedServletContainer(servletContextInitializerArray29);
        undertowEmbeddedServletContainerFactory5.addInitializers(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory33.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory33.setDisplayName("");
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory44.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory44.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection49 = undertowEmbeddedServletContainerFactory44.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory44.setDisplayName("");
        int int52 = undertowEmbeddedServletContainerFactory44.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection53 = undertowEmbeddedServletContainerFactory44.getDeploymentInfoCustomizers();
        java.io.File file54 = undertowEmbeddedServletContainerFactory44.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory44.getEmbeddedServletContainer(servletContextInitializerArray55);
        java.net.InetAddress inetAddress57 = undertowEmbeddedServletContainerFactory44.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage59 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray60 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage59 };
        undertowEmbeddedServletContainerFactory58.addErrorPages(errorPageArray60);
        undertowEmbeddedServletContainerFactory44.addErrorPages(errorPageArray60);
        undertowEmbeddedServletContainerFactory33.addErrorPages(errorPageArray60);
        undertowEmbeddedServletContainerFactory5.addErrorPages(errorPageArray60);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray60);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings66 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.Compression compression67 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings66);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory7.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory7.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory7.setDisplayName("");
        int int15 = undertowEmbeddedServletContainerFactory7.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection16 = undertowEmbeddedServletContainerFactory7.getDeploymentInfoCustomizers();
        java.io.File file17 = undertowEmbeddedServletContainerFactory7.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer19 = undertowEmbeddedServletContainerFactory7.getEmbeddedServletContainer(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory26.setDisplayName("");
        java.lang.String str34 = undertowEmbeddedServletContainerFactory26.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray35 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory38.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory38.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory38.getBuilderCustomizers();
        java.lang.String str44 = undertowEmbeddedServletContainerFactory38.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression45 = null;
        undertowEmbeddedServletContainerFactory38.setCompression(compression45);
        org.springframework.boot.context.embedded.JspServlet jspServlet47 = undertowEmbeddedServletContainerFactory38.getJspServlet();
        undertowEmbeddedServletContainerFactory26.setJspServlet(jspServlet47);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet47);
        org.springframework.core.io.ResourceLoader resourceLoader50 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet47);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Compression compression5 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression5);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer11 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer11 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray12);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory17.setDisplayName("");
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30, errorPageArray29);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30);
        org.springframework.boot.context.embedded.Compression compression33 = null;
        undertowEmbeddedServletContainerFactory28.setCompression(compression33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage36 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage36 };
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.Compression compression44 = undertowEmbeddedServletContainerFactory1.getCompression();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression44);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl4);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file7);
        org.springframework.boot.context.embedded.JspServlet jspServlet9 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet9);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet6 = undertowEmbeddedServletContainerFactory3.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet6);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.JspServlet jspServlet12 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory10.setDisplayName("");
        java.lang.String str18 = undertowEmbeddedServletContainerFactory10.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file22);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory26.setDisplayName("");
        java.lang.String str34 = undertowEmbeddedServletContainerFactory26.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray35 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory38.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory38.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory38.getBuilderCustomizers();
        java.lang.String str44 = undertowEmbeddedServletContainerFactory38.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression45 = null;
        undertowEmbeddedServletContainerFactory38.setCompression(compression45);
        org.springframework.boot.context.embedded.JspServlet jspServlet47 = undertowEmbeddedServletContainerFactory38.getJspServlet();
        undertowEmbeddedServletContainerFactory26.setJspServlet(jspServlet47);
        undertowEmbeddedServletContainerFactory26.setContextPath("");
        boolean boolean51 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        undertowEmbeddedServletContainerFactory26.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory55.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory55.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection60 = undertowEmbeddedServletContainerFactory55.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory55.setDisplayName("");
        undertowEmbeddedServletContainerFactory55.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet65 = undertowEmbeddedServletContainerFactory55.getJspServlet();
        undertowEmbeddedServletContainerFactory55.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet68 = undertowEmbeddedServletContainerFactory55.getErrorPages();
        undertowEmbeddedServletContainerFactory26.setErrorPages(errorPageSet68);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet68);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory17.setDisplayName("");
        int int25 = undertowEmbeddedServletContainerFactory17.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection26 = undertowEmbeddedServletContainerFactory17.getDeploymentInfoCustomizers();
        java.io.File file27 = undertowEmbeddedServletContainerFactory17.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer29 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray28);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer30 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray28);
        org.springframework.boot.context.embedded.Ssl ssl31 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl31);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        undertowEmbeddedServletContainerFactory1.setPort(1800);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory19.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory19.setDisplayName("");
        int int27 = undertowEmbeddedServletContainerFactory19.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection28 = undertowEmbeddedServletContainerFactory19.getDeploymentInfoCustomizers();
        java.io.File file29 = undertowEmbeddedServletContainerFactory19.getDocumentRoot();
        undertowEmbeddedServletContainerFactory19.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory19.getMimeMappings();
        undertowEmbeddedServletContainerFactory19.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection41 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory36.setDisplayName("");
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet46 = undertowEmbeddedServletContainerFactory36.getJspServlet();
        undertowEmbeddedServletContainerFactory36.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet49 = undertowEmbeddedServletContainerFactory36.getErrorPages();
        undertowEmbeddedServletContainerFactory36.setUseForwardHeaders(false);
        org.springframework.core.io.ResourceLoader resourceLoader52 = null;
        undertowEmbeddedServletContainerFactory36.setResourceLoader(resourceLoader52);
        java.io.File file54 = null;
        undertowEmbeddedServletContainerFactory36.setAccessLogDirectory(file54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory57.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory57.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection62 = undertowEmbeddedServletContainerFactory57.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray63 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray63);
        java.io.File file65 = null;
        undertowEmbeddedServletContainerFactory57.setDocumentRoot(file65);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray69 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet70 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet70, errorPageArray69);
        undertowEmbeddedServletContainerFactory68.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet70);
        undertowEmbeddedServletContainerFactory57.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet70);
        undertowEmbeddedServletContainerFactory36.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet70);
        undertowEmbeddedServletContainerFactory19.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet70);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet16, errorPageArray15);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet16);
        org.springframework.boot.context.embedded.Compression compression19 = null;
        undertowEmbeddedServletContainerFactory14.setCompression(compression19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage22 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage22 };
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray23);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory27.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection32 = undertowEmbeddedServletContainerFactory27.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory27.setDisplayName("");
        int int35 = undertowEmbeddedServletContainerFactory27.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection36 = undertowEmbeddedServletContainerFactory27.getDeploymentInfoCustomizers();
        java.io.File file37 = undertowEmbeddedServletContainerFactory27.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray38 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer39 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray38);
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray38);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer39);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet12, errorPageArray11);
        undertowEmbeddedServletContainerFactory10.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet12);
        int int15 = undertowEmbeddedServletContainerFactory10.getSessionTimeout();
        undertowEmbeddedServletContainerFactory10.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory19.getBuilderCustomizers();
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory19.setDocumentRoot(file25);
        boolean boolean27 = undertowEmbeddedServletContainerFactory19.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet28 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory19.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory31.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory31.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory31.getBuilderCustomizers();
        java.io.File file37 = null;
        undertowEmbeddedServletContainerFactory31.setDocumentRoot(file37);
        boolean boolean39 = undertowEmbeddedServletContainerFactory31.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = undertowEmbeddedServletContainerFactory31.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection41 = undertowEmbeddedServletContainerFactory31.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings42 = undertowEmbeddedServletContainerFactory31.getMimeMappings();
        undertowEmbeddedServletContainerFactory19.setMimeMappings(mimeMappings42);
        undertowEmbeddedServletContainerFactory10.setMimeMappings(mimeMappings42);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings42);
        java.io.File file46 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory48.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory48.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection53 = undertowEmbeddedServletContainerFactory48.getBuilderCustomizers();
        java.lang.String str54 = undertowEmbeddedServletContainerFactory48.getDisplayName();
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory48.setAccessLogDirectory(file55);
        undertowEmbeddedServletContainerFactory48.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress59 = undertowEmbeddedServletContainerFactory48.getAddress();
        org.springframework.boot.context.embedded.JspServlet jspServlet60 = undertowEmbeddedServletContainerFactory48.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1800 + "'", int15 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet60);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader13);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory18.setDocumentRoot(file24);
        boolean boolean26 = undertowEmbeddedServletContainerFactory18.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory18.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings29 = undertowEmbeddedServletContainerFactory18.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory31.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory31.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory31.getBuilderCustomizers();
        java.io.File file37 = null;
        undertowEmbeddedServletContainerFactory31.setDocumentRoot(file37);
        boolean boolean39 = undertowEmbeddedServletContainerFactory31.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = undertowEmbeddedServletContainerFactory31.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection41 = undertowEmbeddedServletContainerFactory31.getBuilderCustomizers();
        java.net.InetAddress inetAddress42 = undertowEmbeddedServletContainerFactory31.getAddress();
        org.springframework.boot.context.embedded.Compression compression43 = null;
        undertowEmbeddedServletContainerFactory31.setCompression(compression43);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory31.addBuilderCustomizers(undertowBuilderCustomizerArray45);
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray45);
        boolean boolean48 = undertowEmbeddedServletContainerFactory18.isPersistSession();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings49 = undertowEmbeddedServletContainerFactory18.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings49);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory10.setDisplayName("");
        int int18 = undertowEmbeddedServletContainerFactory10.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection19 = undertowEmbeddedServletContainerFactory10.getDeploymentInfoCustomizers();
        java.io.File file20 = undertowEmbeddedServletContainerFactory10.getSessionStoreDir();
        java.io.File file21 = undertowEmbeddedServletContainerFactory10.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray24 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet25 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet25, errorPageArray24);
        undertowEmbeddedServletContainerFactory23.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet25);
        int int28 = undertowEmbeddedServletContainerFactory23.getSessionTimeout();
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = null;
        undertowEmbeddedServletContainerFactory23.setJspServlet(jspServlet29);
        java.io.File file31 = undertowEmbeddedServletContainerFactory23.getDocumentRoot();
        java.net.InetAddress inetAddress32 = null;
        undertowEmbeddedServletContainerFactory23.setAddress(inetAddress32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory35.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory35.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection40 = undertowEmbeddedServletContainerFactory35.getBuilderCustomizers();
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory35.setDocumentRoot(file41);
        boolean boolean43 = undertowEmbeddedServletContainerFactory35.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet44 = undertowEmbeddedServletContainerFactory35.getErrorPages();
        boolean boolean45 = undertowEmbeddedServletContainerFactory35.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory47.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory47.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection52 = undertowEmbeddedServletContainerFactory47.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory47.setDisplayName("");
        int int55 = undertowEmbeddedServletContainerFactory47.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection56 = undertowEmbeddedServletContainerFactory47.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1800 + "'", int28 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray57);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file17);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray11 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray11);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet22 = undertowEmbeddedServletContainerFactory19.getJspServlet();
        undertowEmbeddedServletContainerFactory17.setJspServlet(jspServlet22);
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory17.setAccessLogDirectory(file24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet29, errorPageArray28);
        undertowEmbeddedServletContainerFactory27.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet29);
        org.springframework.boot.context.embedded.Compression compression32 = null;
        undertowEmbeddedServletContainerFactory27.setCompression(compression32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage35 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray36 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage35 };
        undertowEmbeddedServletContainerFactory34.addErrorPages(errorPageArray36);
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory40.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory40.setDisplayName("");
        int int48 = undertowEmbeddedServletContainerFactory40.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection49 = undertowEmbeddedServletContainerFactory40.getDeploymentInfoCustomizers();
        java.io.File file50 = undertowEmbeddedServletContainerFactory40.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray51 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer52 = undertowEmbeddedServletContainerFactory40.getEmbeddedServletContainer(servletContextInitializerArray51);
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray51);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer54 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray51);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer55 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray51);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer55);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        int int2 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file3 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory5.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 35);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory13.setDisplayName("");
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet23 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet23);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet23);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18, errorPageArray17);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18);
        org.springframework.boot.context.embedded.Compression compression21 = null;
        undertowEmbeddedServletContainerFactory16.setCompression(compression21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage24 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray25 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage24 };
        undertowEmbeddedServletContainerFactory23.addErrorPages(errorPageArray25);
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray25);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory30.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection35 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory30.setDisplayName("");
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory30.setDocumentRoot(file38);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer40 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer40 };
        undertowEmbeddedServletContainerFactory30.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        java.net.InetAddress inetAddress44 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray41);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Compression compression16 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression16);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        int int6 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory10.setDocumentRoot(file16);
        boolean boolean18 = undertowEmbeddedServletContainerFactory10.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings21);
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file23);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        boolean boolean27 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory3.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory3.addInitializers(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer11 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray9);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file13);
        java.lang.Class<?> wildcardClass15 = undertowEmbeddedServletContainerFactory1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        int int8 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setPort(0);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        java.net.InetAddress inetAddress16 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress16);
        int int18 = undertowEmbeddedServletContainerFactory1.getPort();
        int int19 = undertowEmbeddedServletContainerFactory1.getPort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27, errorPageArray26);
        undertowEmbeddedServletContainerFactory25.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        int int30 = undertowEmbeddedServletContainerFactory25.getSessionTimeout();
        undertowEmbeddedServletContainerFactory25.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory25.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.JspServlet jspServlet35 = undertowEmbeddedServletContainerFactory25.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet35);
        org.springframework.boot.context.embedded.Compression compression37 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1800 + "'", int30 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet35);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '#');
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray23);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer25 = undertowEmbeddedServletContainerFactory15.getEmbeddedServletContainer(servletContextInitializerArray23);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray23);
        java.net.InetAddress inetAddress27 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory29.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory29.getBuilderCustomizers();
        java.lang.String str35 = undertowEmbeddedServletContainerFactory29.getDisplayName();
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory29.setAccessLogDirectory(file36);
        undertowEmbeddedServletContainerFactory29.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress40 = undertowEmbeddedServletContainerFactory29.getAddress();
        org.springframework.boot.context.embedded.JspServlet jspServlet41 = undertowEmbeddedServletContainerFactory29.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet41);
        int int43 = undertowEmbeddedServletContainerFactory1.getPort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer11 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer11 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray12);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray17);
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory23.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory23.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory23.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory23.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer32 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer32 };
        undertowEmbeddedServletContainerFactory23.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        org.springframework.boot.context.embedded.Compression compression36 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.Ssl ssl38 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.lang.String str39 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.core.io.ResourceLoader resourceLoader40 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader40);
        java.net.InetAddress inetAddress42 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress42);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection44 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection44);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file13);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress17);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory2.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory2.getBuilderCustomizers();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory2.setDocumentRoot(file8);
        boolean boolean10 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory2.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings13 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory2.setDocumentRoot(file16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory21.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer29 = undertowEmbeddedServletContainerFactory19.getEmbeddedServletContainer(servletContextInitializerArray27);
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray27);
        undertowEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray27);
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer29);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer23 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer23 };
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray24);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray24);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray24);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        int int8 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        java.lang.String str17 = undertowEmbeddedServletContainerFactory13.getDisplayName();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory13.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory20.setDocumentRoot(file26);
        boolean boolean28 = undertowEmbeddedServletContainerFactory20.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        java.net.InetAddress inetAddress31 = undertowEmbeddedServletContainerFactory20.getAddress();
        org.springframework.boot.context.embedded.Compression compression32 = null;
        undertowEmbeddedServletContainerFactory20.setCompression(compression32);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory13.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection38 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection38);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory16.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory16.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory16.setDisplayName("");
        undertowEmbeddedServletContainerFactory16.setSessionTimeout((int) (byte) 1);
        java.lang.String str26 = undertowEmbeddedServletContainerFactory16.getContextPath();
        undertowEmbeddedServletContainerFactory16.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings29 = undertowEmbeddedServletContainerFactory16.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings29);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl15);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory5.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory17.setDisplayName("");
        int int25 = undertowEmbeddedServletContainerFactory17.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection26 = undertowEmbeddedServletContainerFactory17.getDeploymentInfoCustomizers();
        java.io.File file27 = undertowEmbeddedServletContainerFactory17.getSessionStoreDir();
        java.io.File file28 = undertowEmbeddedServletContainerFactory17.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory17.setDisplayName("");
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory17.setSessionStoreDir(file31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory34.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory34.setSessionTimeout((int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet43 = undertowEmbeddedServletContainerFactory40.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory45.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory45.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection50 = undertowEmbeddedServletContainerFactory45.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory45.setDisplayName("");
        int int53 = undertowEmbeddedServletContainerFactory45.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection54 = undertowEmbeddedServletContainerFactory45.getDeploymentInfoCustomizers();
        java.io.File file55 = undertowEmbeddedServletContainerFactory45.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray56 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer57 = undertowEmbeddedServletContainerFactory45.getEmbeddedServletContainer(servletContextInitializerArray56);
        java.net.InetAddress inetAddress58 = undertowEmbeddedServletContainerFactory45.getAddress();
        undertowEmbeddedServletContainerFactory45.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory62.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory62.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection67 = undertowEmbeddedServletContainerFactory62.getBuilderCustomizers();
        java.io.File file68 = null;
        undertowEmbeddedServletContainerFactory62.setDocumentRoot(file68);
        boolean boolean70 = undertowEmbeddedServletContainerFactory62.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet71 = undertowEmbeddedServletContainerFactory62.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection72 = undertowEmbeddedServletContainerFactory62.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings73 = undertowEmbeddedServletContainerFactory62.getMimeMappings();
        undertowEmbeddedServletContainerFactory62.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file76 = null;
        undertowEmbeddedServletContainerFactory62.setDocumentRoot(file76);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory81 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory81.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory81.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection86 = undertowEmbeddedServletContainerFactory81.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray87 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory81.addInitializers(servletContextInitializerArray87);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer89 = undertowEmbeddedServletContainerFactory79.getEmbeddedServletContainer(servletContextInitializerArray87);
        undertowEmbeddedServletContainerFactory62.addInitializers(servletContextInitializerArray87);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer91 = undertowEmbeddedServletContainerFactory45.getEmbeddedServletContainer(servletContextInitializerArray87);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer92 = undertowEmbeddedServletContainerFactory40.getEmbeddedServletContainer(servletContextInitializerArray87);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray87);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer94 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray87);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer95 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer95);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet6 = undertowEmbeddedServletContainerFactory3.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet6);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        boolean boolean23 = undertowEmbeddedServletContainerFactory13.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory25.setDisplayName("");
        int int33 = undertowEmbeddedServletContainerFactory25.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection34 = undertowEmbeddedServletContainerFactory25.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray35 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        undertowEmbeddedServletContainerFactory13.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        org.springframework.boot.context.embedded.JspServlet jspServlet39 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.io.File file40 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file40);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray26);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer28 = undertowEmbeddedServletContainerFactory18.getEmbeddedServletContainer(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file30);
        java.lang.String str32 = undertowEmbeddedServletContainerFactory1.getContextPath();
        boolean boolean33 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection34 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection34);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        org.springframework.boot.context.embedded.Compression compression11 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int7 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray12 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet13 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet13, errorPageArray12);
        undertowEmbeddedServletContainerFactory11.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet13);
        int int16 = undertowEmbeddedServletContainerFactory11.getSessionTimeout();
        undertowEmbeddedServletContainerFactory11.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet25 = undertowEmbeddedServletContainerFactory22.getJspServlet();
        undertowEmbeddedServletContainerFactory20.setJspServlet(jspServlet25);
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory20.setAccessLogDirectory(file27);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setErrorPages(errorPageSet29);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory33.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory33.setDisplayName("");
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) (byte) 1);
        java.io.File file43 = null;
        undertowEmbeddedServletContainerFactory33.setDocumentRoot(file43);
        java.io.File file45 = null;
        undertowEmbeddedServletContainerFactory33.setAccessLogDirectory(file45);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection47 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory49.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory49.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection54 = undertowEmbeddedServletContainerFactory49.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory49.setDisplayName("");
        int int57 = undertowEmbeddedServletContainerFactory49.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection58 = undertowEmbeddedServletContainerFactory49.getDeploymentInfoCustomizers();
        java.io.File file59 = undertowEmbeddedServletContainerFactory49.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray60 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray60);
        java.net.InetAddress inetAddress62 = undertowEmbeddedServletContainerFactory49.getAddress();
        undertowEmbeddedServletContainerFactory49.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory66.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory66.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection71 = undertowEmbeddedServletContainerFactory66.getBuilderCustomizers();
        java.io.File file72 = null;
        undertowEmbeddedServletContainerFactory66.setDocumentRoot(file72);
        boolean boolean74 = undertowEmbeddedServletContainerFactory66.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet75 = undertowEmbeddedServletContainerFactory66.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection76 = undertowEmbeddedServletContainerFactory66.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings77 = undertowEmbeddedServletContainerFactory66.getMimeMappings();
        undertowEmbeddedServletContainerFactory66.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file80 = null;
        undertowEmbeddedServletContainerFactory66.setDocumentRoot(file80);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory83 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory85.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory85.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection90 = undertowEmbeddedServletContainerFactory85.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray91 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory85.addInitializers(servletContextInitializerArray91);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer93 = undertowEmbeddedServletContainerFactory83.getEmbeddedServletContainer(servletContextInitializerArray91);
        undertowEmbeddedServletContainerFactory66.addInitializers(servletContextInitializerArray91);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer95 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray91);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer96 = undertowEmbeddedServletContainerFactory33.getEmbeddedServletContainer(servletContextInitializerArray91);
        org.springframework.boot.context.embedded.JspServlet jspServlet97 = undertowEmbeddedServletContainerFactory33.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1800 + "'", int16 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet97);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer13 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray12);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer15 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer15 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray16);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory11.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory11.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory11.setDocumentRoot(file17);
        boolean boolean19 = undertowEmbeddedServletContainerFactory11.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = undertowEmbeddedServletContainerFactory11.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings22 = undertowEmbeddedServletContainerFactory11.getMimeMappings();
        undertowEmbeddedServletContainerFactory11.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory11.setDocumentRoot(file25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory30.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection35 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray36);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer38 = undertowEmbeddedServletContainerFactory28.getEmbeddedServletContainer(servletContextInitializerArray36);
        undertowEmbeddedServletContainerFactory11.addInitializers(servletContextInitializerArray36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory41.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory41.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection46 = undertowEmbeddedServletContainerFactory41.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory41.setDisplayName("");
        undertowEmbeddedServletContainerFactory41.setDisplayName("");
        org.springframework.boot.context.embedded.Compression compression51 = undertowEmbeddedServletContainerFactory41.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory53.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory53.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory53.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory53.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory62.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory62.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection67 = undertowEmbeddedServletContainerFactory62.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory62.setDisplayName("");
        java.lang.String str70 = undertowEmbeddedServletContainerFactory62.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray71 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory62.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray71);
        undertowEmbeddedServletContainerFactory53.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray71);
        undertowEmbeddedServletContainerFactory41.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray71);
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray71);
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray71);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray71);
        java.io.File file78 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        int int79 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file21);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer11 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer11 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray12);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory17.setDisplayName("");
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30, errorPageArray29);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30);
        org.springframework.boot.context.embedded.Compression compression33 = null;
        undertowEmbeddedServletContainerFactory28.setCompression(compression33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage36 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage36 };
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray37);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet6 = undertowEmbeddedServletContainerFactory3.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory11.getAddress();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory11.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray23);
        org.springframework.boot.context.embedded.Ssl ssl25 = null;
        undertowEmbeddedServletContainerFactory17.setSsl(ssl25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet33 = undertowEmbeddedServletContainerFactory30.getJspServlet();
        undertowEmbeddedServletContainerFactory28.setJspServlet(jspServlet33);
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory28.setAccessLogDirectory(file35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray39 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40, errorPageArray39);
        undertowEmbeddedServletContainerFactory38.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        org.springframework.boot.context.embedded.Compression compression43 = null;
        undertowEmbeddedServletContainerFactory38.setCompression(compression43);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage46 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray47 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage46 };
        undertowEmbeddedServletContainerFactory45.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory38.addErrorPages(errorPageArray47);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory51.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory51.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection56 = undertowEmbeddedServletContainerFactory51.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory51.setDisplayName("");
        int int59 = undertowEmbeddedServletContainerFactory51.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection60 = undertowEmbeddedServletContainerFactory51.getDeploymentInfoCustomizers();
        java.io.File file61 = undertowEmbeddedServletContainerFactory51.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray62 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer63 = undertowEmbeddedServletContainerFactory51.getEmbeddedServletContainer(servletContextInitializerArray62);
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray62);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer65 = undertowEmbeddedServletContainerFactory28.getEmbeddedServletContainer(servletContextInitializerArray62);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer66 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray62);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer67 = undertowEmbeddedServletContainerFactory11.getEmbeddedServletContainer(servletContextInitializerArray62);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer68 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray62);
        java.lang.String str69 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
    }
}

